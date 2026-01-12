package com.example.RazanPro5;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.RazanPro5.fragment.TaskFragment;
import com.example.RazanPro5.model.Task;
import com.example.RazanPro5.model.TaskData;
import com.google.android.material.button.MaterialButton;

import org.w3c.dom.Text;

import java.text.BreakIterator;
import java.util.Calendar;

public class addTaskActivity2 extends AppCompatActivity {

    MaterialButton btnEasy,btnMedium,btnHard;
    Button   saveToTaskFragment ;
    EditText etStartDate, etTaskName , etEndDate;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_task2);


         etTaskName = findViewById(R.id.etTaskName);
         btnEasy = findViewById(R.id.btnEasy);
         btnMedium = findViewById(R.id.btnMedium);
         btnHard = findViewById(R.id.btnHard);
         saveToTaskFragment = findViewById(R.id.btnSaveTask);
         etStartDate = findViewById(R.id.etStartDate);
         etEndDate = findViewById(R.id.etEndDate);




        saveToTaskFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

        etTaskName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



        etStartDate.setOnClickListener(v -> {
            Calendar calendar = Calendar.getInstance();
            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH);
            int day = calendar.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog dialog = new DatePickerDialog(
                    this,
                    (view, y, m, d) -> {
                        String date = d + "/" + (m + 1) + "/" + y;
                        etStartDate.setText(date);
                    },
                    year, month, day
            );
            dialog.show();
        });


        etEndDate.setOnClickListener(v -> {
            Calendar calendar = Calendar.getInstance();
            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH);
            int day = calendar.get(Calendar.DAY_OF_MONTH);

            DatePickerDialog dialog = new DatePickerDialog(
                    this,
                    (view, y, m, d) -> {
                        String date = d + "/" + (m + 1) + "/" + y;
                        etEndDate.setText(date);
                    },
                    year, month, day
            );
            dialog.show();
        });




        btnEasy.setOnClickListener(v -> {
            btnEasy.setSelected(true);
            btnMedium.setSelected(false);
            btnHard.setSelected(false);
        });

        btnMedium.setOnClickListener(v -> {
            btnEasy.setSelected(false);
            btnMedium.setSelected(true);
            btnHard.setSelected(false);
        });

        btnHard.setOnClickListener(v -> {
            btnEasy.setSelected(false);
            btnMedium.setSelected(false);
            btnHard.setSelected(true);
        });


    }
}