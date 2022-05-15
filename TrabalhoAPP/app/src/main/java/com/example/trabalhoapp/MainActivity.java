package com.example.trabalhoapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageButton bt_logoo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_logoo = (ImageButton) findViewById(R.id.bt_logoo);

        bt_logoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent logo = new Intent(getApplicationContext(), SegundaTela.class);
                startActivity(logo);
            }
        });

    }
}
