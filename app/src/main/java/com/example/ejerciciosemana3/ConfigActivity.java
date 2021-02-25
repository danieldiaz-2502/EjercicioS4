package com.example.ejerciciosemana3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class ConfigActivity extends AppCompatActivity {
    private Button azulBoton, blancoBoton, negroBoton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);

        azulBoton = findViewById(R.id.azulBoton);
        blancoBoton = findViewById(R.id.blancoBoton);
        negroBoton = findViewById(R.id.negroBoton);

    }
}