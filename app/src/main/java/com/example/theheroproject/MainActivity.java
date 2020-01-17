package com.example.theheroproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buscarHeroe(View view ){
        final TextView busqueda = (TextView) findViewById(R.id.txtBusquedaH);
        Intent Resultados = new Intent(getBaseContext(), Resultados.class);
        Resultados.putExtra("idheroe", busqueda.getText().toString());
        startActivity(Resultados);
    }
}
