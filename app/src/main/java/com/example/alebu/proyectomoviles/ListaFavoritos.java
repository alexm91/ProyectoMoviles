package com.example.alebu.proyectomoviles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.Toast;

import modelo.Ruta;

public class ListaFavoritos extends AppCompatActivity {

    ListView listaRutas;
    ArrayAdapter<Ruta> adapter;
    Ruta [] infoRuta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_favoritos);
        listaRutas = (ListView) findViewById(R.id.listRutasGuardadas);
        loadListaRutas();
        adapter = new ArrayAdapter<Ruta>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item, infoRuta);
        listaRutas.setAdapter(adapter);

        listaRutas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int selecion, long l) {
                abrirPopUp(view, infoRuta[selecion]);
                Log.i("Objeto",infoRuta[selecion].toString());
            }
        });

    }

    public void abrirPopUp(View view, final Ruta objRuta){
        PopupMenu popupInicio = new PopupMenu(this, view);
        popupInicio.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.mapaF:
                        Intent popUpMapa = new Intent(getApplicationContext(), MapaRuta.class);
                        startActivity(popUpMapa);
                        return true;
                    case R.id.favorito:
                        Toast.makeText(getApplicationContext(),"Ruta Eliminada",Toast.LENGTH_LONG).show();
                        return true;
                    case R.id.infoF:
                        envioObjeto(objRuta);
                        return true;
                        default: return false;
                }
            }
        });
        popupInicio.inflate(R.menu.menu_favoritos);
        popupInicio.show();
    }

    private void loadListaRutas(){
        infoRuta = new Ruta[]{new Ruta("Carapungo - El Ejido","Transporsel","San Juan","El Ejido","15 minutos"),
                new Ruta("Colinas del Valle - Terminal de Carcelen","Calderon","Colinas del Valle","Terminal de Carcelen","12 minutos"),
                new Ruta("Carapungo - El Ejido","Semgylfor","Ciudad Bicentenario","El Ejido","18 minutos"),
                new Ruta("Carapungo - Ecovia","Quitenio Libre","Carapungo","Ecovia Rio Coca","15 minutos"),
        };
    }

    public void envioObjeto(Ruta objRuta){
        Intent intent = new Intent(getApplicationContext(), InfoRuta.class);
        intent.putExtra("ruta", objRuta);
        startActivity(intent);
    }
}
