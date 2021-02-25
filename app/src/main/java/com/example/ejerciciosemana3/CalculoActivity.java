package com.example.ejerciciosemana3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalculoActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText proyecto1Edit, proyecto2Edit, quicesEdit, parcial1Edit, parcial2Edit, ejerciciosEdit;
    private Button calcularBoton;

    private int parcial1, parcial2, quices, proyecto1, proyecto2, ejercicios, resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo);

        proyecto1Edit = findViewById(R.id.proyecto1Edit);
        proyecto2Edit = findViewById(R.id.proyecto2Edit);
        quicesEdit = findViewById(R.id.quicesEdit);
        parcial1Edit = findViewById(R.id.parcial1Edit);
        parcial2Edit = findViewById(R.id.parcial2Edit);
        ejerciciosEdit = findViewById(R.id.ejerciciosEdit);

        calcularBoton = findViewById(R.id.calcularBoton);

        calcularBoton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.calcularBoton:

                proyecto1 = Integer.parseInt(proyecto1Edit.getText().toString());
                proyecto2 = Integer.parseInt(proyecto2Edit.getText().toString());
                quices = Integer.parseInt(quicesEdit.getText().toString());
                parcial1 = Integer.parseInt(parcial1Edit.getText().toString());
                parcial2 = Integer.parseInt(parcial2Edit.getText().toString());
                ejercicios = Integer.parseInt(ejerciciosEdit.getText().toString());

                resultado = (int) ((parcial1 * 0.15) + (parcial2 * 0.15) + (quices*0.15) + (proyecto1 * 0.25) + (proyecto2 * 0.25) + (ejercicios * 0.05));

                Intent i = new Intent(this, ResultActivity.class);
                i.putExtra("resultado", resultado);

                startActivity(i);
                finish();
                break;
        }
    }
}