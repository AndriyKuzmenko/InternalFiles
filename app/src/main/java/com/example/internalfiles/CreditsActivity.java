package com.example.internalfiles;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;

public class CreditsActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);
    }

    /**
     * @param menu  - the menu
     * @return      creates a menu with two options - credits and main activity
     */

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.main, menu);

        return true;
    }

    /**
     *
     * @param item - the item that was selected
     * @return     After the user pressed on the main activity option, this method
     *             goes back to main activity
     */

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        if (item.getItemId()==R.id.menuCredits)
        {
            finish();
        }

        return true;
    }
}
