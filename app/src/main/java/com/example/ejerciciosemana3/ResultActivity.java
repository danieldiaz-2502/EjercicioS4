package com.example.ejerciciosemana3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity implements View.OnClickListener {

    private Button otraVezBoton;

    private TextView resultText;
    private TextView notaFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        otraVezBoton = findViewById(R.id.otraVezBoton);

        resultText = findViewById(R.id.resultText);
        notaFinal = findViewById(R.id.notaFinal);

        otraVezBoton.setOnClickListener(this);

        String usuario = getSharedPreferences("usuario", MODE_PRIVATE).getString("usuario", "NO_USER");

        resultText.setText("Hola "+usuario+", su nota final es de:");

        int resultadoFinal = getIntent().getExtras().getInt("resultado");

        notaFinal.setText(""+resultadoFinal);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.otraVezBoton:

                Intent i = new Intent(this, MainActivity.class);
                startActivity(i);
                finish();

                break;
        }

    }
}