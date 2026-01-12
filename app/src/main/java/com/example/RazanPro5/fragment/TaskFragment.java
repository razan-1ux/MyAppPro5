package com.example.RazanPro5.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.RazanPro5.R;
import com.example.RazanPro5.addTaskActivity2;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class TaskFragment extends Fragment {
     View v;
    FloatingActionButton btnAddTask;
     View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view= inflater.inflate(R.layout.fragment_task, container, false);

        btnAddTask = view.findViewById(R.id.btnAddTask);

        btnAddTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), addTaskActivity2.class);
                startActivity(intent);


            }



        });
















        return view;
    }
}