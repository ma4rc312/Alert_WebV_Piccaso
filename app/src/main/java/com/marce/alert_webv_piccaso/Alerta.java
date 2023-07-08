package com.marce.alert_webv_piccaso;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import cn.pedant.SweetAlert.SweetAlertDialog;

public class Alerta extends AppCompatActivity {
    Button btnCortaDurac, btnLargaDurac, btnOk, btnCancOk, btnMasAlert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alerta);

        btnCortaDurac = findViewById(R.id.btnCortaDurac);
        btnLargaDurac = findViewById(R.id.btnLargaDurac);
        btnOk = findViewById(R.id.btnOk);
        btnCancOk = findViewById(R.id.btnCancOk);
        btnMasAlert = findViewById(R.id.btnMasAlert);

        btnMasAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ir = new Intent(Alerta.this, AlertSweet.class);
                startActivity(ir);
            }
        });

        btnCortaDurac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new SweetAlertDialog(Alerta.this);
                crearAlertDialog();
            }
        });

        btnLargaDurac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                crearAlertD2();
            }
        });

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                crearAlertD3();
            }
        });

        btnCancOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                crearAlertD4();
            }
        });
    }

    public void crearAlertDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Primer Alert");
        builder.setMessage("Este es un alert de corta duracion");
        builder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(Alerta.this, "Corta duracion", Toast.LENGTH_SHORT).show();
            }
        });
        builder.show();

    }

    public void crearAlertD2(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Segundo Alert");
        builder.setMessage("Este es un alert de larga duracion");
        builder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(Alerta.this, "Larga duracion", Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
    }

    public void crearAlertD3(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Tecrcer Alert");
        builder.setMessage("Este es un aler boton ok");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(Alerta.this, "has presionado ok", Toast.LENGTH_SHORT).show();
            }
        });
        builder.show();
    }

    public void crearAlertD4(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Cuarto Alert");
        builder.setMessage("alert con bdos botones");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(Alerta.this, "ha presionado ok", Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton("CANCELAR", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(Alerta.this, "has cancelado", Toast.LENGTH_SHORT).show();
            }
        });
        builder.show();

    }
}

