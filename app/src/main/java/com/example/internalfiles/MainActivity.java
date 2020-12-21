package com.example.internalfiles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity
{
    EditText eT;
    TextView tV;
    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tV=(TextView)findViewById(R.id.tV);
        eT=(EditText)findViewById(R.id.eT);

        text="";

        try
        {

            FileInputStream fis= openFileInput("test.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            text = br.readLine();
            tV.setText(text);
            isr.close();
        }
        catch(Exception IO)
        {

        }
    }

    public void save(View view)
    {
        text+=eT.getText();
        tV.setText(text);
        try
        {
            FileOutputStream fos = openFileOutput("test.txt", MODE_PRIVATE);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);
            bw.write(text);
            bw.close();
        }
        catch(Exception IO)
        {

        }

    }

    public void reset(View view)
    {
        eT.setText("");
        tV.setText("");
    }

    public void exit(View view)
    {
        save(view);
        finish();
    }
}
