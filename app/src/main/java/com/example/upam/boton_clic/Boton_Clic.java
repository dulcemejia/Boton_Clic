package com.example.upam.boton_clic;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class Boton_Clic extends AppCompatActivity implements View.OnClickListener {
    Button boton, botonimg1, botonimg2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boton__clic);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        boton = (Button) findViewById(R.id.boton2);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Boton_Clic.this, "segunda forma onclick", Toast.LENGTH_SHORT).show();
            }
        });
        botonimg1 = (Button)findViewById(R.id.imageButton1);
        botonimg1.setOnClickListener(this);

        botonimg2 = (Button) findViewById(R.id.imageButton2);
        botonimg2.setOnClickListener(this);
    }


    public void Pulzar(View v) {
        Toast.makeText(this, "LOCOTE....", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imageButton1) {
            Toast.makeText(this, "botonimg1", Toast.LENGTH_SHORT).show();
        }
        if (v.getId() == R.id.imageButton2) {
            Toast.makeText(this, "botonimg1", Toast.LENGTH_SHORT).show();
        }
    }
}





   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_boton__clic, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}*/
