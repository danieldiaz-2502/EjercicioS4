package com.example.ejerciciosemana3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button configBoton, continuarBoton;
    private EditText nombreEdit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombreEdit = findViewById(R.id.nombreEdit);
        configBoton = findViewById(R.id.configBoton);
        continuarBoton = findViewById(R.id.continuarBoton);

        continuarBoton.setOnClickListener(this);
        configBoton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.continuarBoton:

                String usuario = nombreEdit.getText().toString();
                SharedPreferences preferences = getSharedPreferences("usuario",MODE_PRIVATE);
                preferences.edit().putString("usuario", usuario).apply();

                Intent i = new Intent(this, CalculoActivity.class);
                startActivity(i);
                break;
            case R.id.configBoton:

                Intent c = new Intent(this, ConfigActivity.class);
                startActivity(c);

                break;
        }

    }
}