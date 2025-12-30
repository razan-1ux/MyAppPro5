package com.example.RazanPro5;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import com.example.RazanPro5.fragment.HomeFragment;
import com.example.RazanPro5.fragment.TaskFragment;
import com.example.RazanPro5.fragment.phoneFragment;
import com.example.RazanPro5.fragment.profileFragment;
import com.example.RazanPro5.fragment.settingFragment;

public class StartActivity2 extends AppCompatActivity {

     BottomNavigationView btm;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_start2);

        changeFragment(new HomeFragment());

        btm=findViewById(R.id.btm) ;


        btm.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

               if(menuItem.getItemId()==R.id.home)
               {
                   changeFragment(new HomeFragment());
               }

                if(menuItem.getItemId()==R.id.profile)
                {
                    changeFragment(new profileFragment());
                }

                if(menuItem.getItemId()==R.id.setting)
                {
                    changeFragment(new settingFragment());
                }

                if(menuItem.getItemId()==R.id.phone)
                {
                    changeFragment(new phoneFragment());
                }

                if(menuItem.getItemId()==R.id.task)
                {
                  changeFragment(new TaskFragment());
                }



             return true;
            }
        });



    }

    public void  changeFragment(Fragment fragment)
    {
        FragmentManager frm = getSupportFragmentManager();
        FragmentTransaction ftm = frm.beginTransaction();
        ftm.replace(R.id.ff,fragment);
        ftm.commit();


    }


}