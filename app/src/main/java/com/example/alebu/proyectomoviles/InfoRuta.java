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

        nombreRuta = (TextView) findViewById(R.id.textView4);
        cooperativa = (TextView) findViewById(R.id.textView5);
        salida = (TextView) findViewById(R.id.textView6);
        llegada = (TextView) findViewById(R.id.textView7);
        tiempoBus = (TextView) findViewById(R.id.textView8);


        Ruta objRuta = (Ruta) getIntent().getExtras().getSerializable("ruta");
        nombreRuta.setText(objRuta.getNombreRuta());
        cooperativa.setText(objRuta.getNombreRuta());
        nombreRuta.setText(objRuta.getNombreRuta());
        nombreRuta.setText(objRuta.getNombreRuta());
        nombreRuta.setText(objRuta.getNombreRuta());


    }
}
