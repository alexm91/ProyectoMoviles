package com.example.alebu.proyectomoviles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        final Button rutas = (Button) findViewById(R.id.buttonRutasTodas);
        final Button rutasGuardadas = (Button) findViewById(R.id.buttonRutasGuardadas);
        final Button mapa = (Button) findViewById(R.id.buttonMapa);
        rutas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRutas = new Intent(getApplicationContext(),ListaRutas.class);
                startActivity(intentRutas);
            }
        });

        rutasGuardadas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRutasGuardadas = new Intent(getApplicationContext(),ListaFavoritos.class);
                startActivity(intentRutasGuardadas);
            }
        });

        mapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMapa = new Intent(getApplicationContext(),MapaRuta.class);
                startActivity(intentMapa);
            }
        });
    }
}
