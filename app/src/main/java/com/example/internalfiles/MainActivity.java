package com.example.internalfiles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void save(View view)
    {

    }

    public void reset(View view)
    {

    }

    public void exit(View view)
    {
        save(view);
        finish();
    }
}
