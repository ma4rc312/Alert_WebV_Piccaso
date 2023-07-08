package com.marce.alert_webv_piccaso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnalert, btnweb, btnpicasso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnalert = findViewById(R.id.btnalert);
        btnweb = findViewById(R.id.btnweb);
        btnpicasso = findViewById(R.id.btnpicasso);

        btnalert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Alerta.class);
                startActivity(intent);
            }
        });

        btnweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,WebV.class);
                startActivity(intent);
            }
        });

        btnpicasso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Picass.class);
                startActivity(intent);
            }
        });
    }
}