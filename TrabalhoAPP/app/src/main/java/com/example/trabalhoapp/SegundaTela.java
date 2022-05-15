package com.example.trabalhoapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SegundaTela extends AppCompatActivity {

    private Button bt_cadastro;
    private Button bt_entrar;
    private EditText emailEt;
    private EditText senhaEt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);

        bt_cadastro = (Button) findViewById(R.id.bt_cadastro);
        bt_entrar = (Button) findViewById(R.id.bt_entrar);

        bt_cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent cadastro = new Intent(getApplicationContext(), terceira_tela.class);
                startActivity(cadastro);
            }
        });

        bt_entrar.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {

                BDCore BDCore = new BDCore(getApplicationContext());

                Usuario usuario = new Usuario(getApplicationContext());

                emailEt = (EditText) findViewById(R.id.emailEt);
                String email = emailEt.getText().toString();

                senhaEt = (EditText) findViewById(R.id.senhaEt);
                String senha = senhaEt.getText().toString();


                usuario.setEmail(email);
                usuario.setSenha(senha);

                boolean statusCliente = BDCore.validarUsuario(usuario);


                if (statusCliente){
                    Toast.makeText(getApplicationContext(), "Login efetuado com sucesso", Toast.LENGTH_SHORT).show();
                    Intent login = new Intent(getApplicationContext(), inicioo_tela.class);
                    startActivity(login);
                }else{
                    Toast.makeText(getApplicationContext(), "Email ou senha inválidos!", Toast.LENGTH_SHORT).show();
                }


            }
        });

    }
}
