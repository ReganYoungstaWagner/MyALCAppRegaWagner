package com.example.mydroidapp;
import android.app.ActionBar;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.ImageView;

public class ActivityC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        ImageView myPic = findViewById(R.id.pic_cont);
        myPic.setImageResource(R.drawable.prof_pic);

        assert getSupportActionBar() != null;   //null check
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);   //show back button

        }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
        }
    }


