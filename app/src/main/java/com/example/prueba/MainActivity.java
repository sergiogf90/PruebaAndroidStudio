package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    String[] saludos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(this::onClick);
        saludos = getResources().getStringArray(R.array.saludos);
    }


    public void onClick(View v) {
        Toast.makeText(this,"Botón de prueba",Toast.LENGTH_LONG).show();

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_activity_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.op1:
                Toast.makeText(this,"Has elegido opcion 1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.op2:
                Toast.makeText(this,"Has elegido opcion 2",Toast.LENGTH_LONG).show();
                break;
            case R.id.op3:
                Toast.makeText(this,"Has elegido opcion 3",Toast.LENGTH_LONG).show();
                break;

        }
        return true;
    }
    public void itemClick(MenuItem item){
        Toast.makeText(this,"Has elegido opcion 3.1",Toast.LENGTH_LONG).show();
    }
}