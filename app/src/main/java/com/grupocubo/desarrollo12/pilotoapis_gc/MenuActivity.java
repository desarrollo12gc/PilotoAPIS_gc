package com.grupocubo.desarrollo12.pilotoapis_gc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    private Button btn_grillas;
    private Button btn_picasso;
    private Button btn_camara;
    private Button btn_archivos;
    private Button btn_gps;
    private Button btn_mapa;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        // Set up the login form.


        btn_grillas = (Button) findViewById(R.id.btn_grillas);
        btn_picasso = (Button) findViewById(R.id.btn_picasso);
        btn_camara  = (Button) findViewById(R.id.btn_camara);
        btn_archivos = (Button) findViewById(R.id.btn_archivos);
        btn_gps = (Button) findViewById(R.id.btn_gps);
        btn_mapa = (Button) findViewById(R.id.btn_mapa);


        btn_grillas.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent ListSong = new Intent(MenuActivity.this, GrillasActivity.class);
                startActivity(ListSong);
            }

        });


        btn_picasso.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent ListSong = new Intent(MenuActivity.this, PicassoActivity.class);
                startActivity(ListSong);
            }

        });

        btn_camara.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent ListSong = new Intent(MenuActivity.this, CamaraActivity.class);
                startActivity(ListSong);
            }

        });

        btn_archivos.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent ListSong = new Intent(MenuActivity.this, ArchivosActivity.class);
                startActivity(ListSong);
            }

        });

        btn_gps.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent ListSong = new Intent(MenuActivity.this, GpsActivity.class);
                startActivity(ListSong);
            }

        });

        btn_mapa.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent ListSong = new Intent(MenuActivity.this, MapaActivity.class);
                startActivity(ListSong);
            }

        });



    }

}
