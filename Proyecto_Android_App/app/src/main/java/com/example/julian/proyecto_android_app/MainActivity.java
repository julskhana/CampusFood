package com.example.julian.proyecto_android_app;

import android.app.AlertDialog;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    AlertDialog.Builder alerta;
    EditText tfNombre;
    EditText tfUbicacion;
    EditText tfDescripcion;
    EditText tfCapacidad;
    EditText tfHorario;
    EditText tfPuntos;
    Button btIngresar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tfNombre = (EditText) findViewById(R.id.tfNombre);
        tfUbicacion = (EditText) findViewById(R.id.tfUbicacion);
        tfDescripcion = (EditText) findViewById(R.id.tfDescripcion);
        tfCapacidad = (EditText) findViewById(R.id.tfCapacidad);
        tfHorario = (EditText) findViewById(R.id.tfHorario);
        tfPuntos = (EditText) findViewById(R.id.tfPuntos);

        btIngresar = (Button) findViewById(R.id.btIgresar);
        btIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = tfNombre.getText().toString();
                String ubicacion = tfUbicacion.getText().toString();
                String descripcion = tfDescripcion.getText().toString();
                int capacidad = Integer.parseInt(String.valueOf(tfCapacidad.getText()));
                String horario = tfHorario.getText().toString();
                int puntos = Integer.parseInt(String.valueOf(tfPuntos.getText()));

                Restaurante res = new Restaurante(nombre, ubicacion, descripcion, capacidad, horario, puntos);

                Cliente_HTTP cli = new Cliente_HTTP(MainActivity.this);
                cli.execute(res);
            }
        });
    }
}