package com.example.internalfiles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    EditText eT;
    TextView tV;
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        tV=(TextView)findViewById(R.id.tV);
        eT=(EditText)findViewById(R.id.eT);
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
