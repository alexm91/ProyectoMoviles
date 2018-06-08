package com.example.alebu.proyectomoviles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import modelo.Ruta;

public class InfoRuta extends AppCompatActivity {
    TextView nombreRuta;
    TextView cooperativa;
    TextView salida;
    TextView llegada;
    TextView tiempoBus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_ruta);

        nombreRuta = (TextView) findViewById(R.id.textViewNombreRuta);
        cooperativa = (TextView) findViewById(R.id.textViewCooperativa);
        salida = (TextView) findViewById(R.id.textViewSalida);
        llegada = (TextView) findViewById(R.id.textViewLlegada);
        tiempoBus = (TextView) findViewById(R.id.textViewTiempo);


        Ruta objRuta = (Ruta) getIntent().getExtras().getSerializable("ruta");
        nombreRuta.setText(objRuta.getNombreRuta());
        cooperativa.setText(objRuta.getNombreRuta());
        nombreRuta.setText(objRuta.getNombreRuta());
        nombreRuta.setText(objRuta.getNombreRuta());
        nombreRuta.setText(objRuta.getNombreRuta());


    }
}
