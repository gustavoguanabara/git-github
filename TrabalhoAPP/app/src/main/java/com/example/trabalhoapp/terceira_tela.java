package com.example.trabalhoapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class terceira_tela extends AppCompatActivity {

    private Usuario usuario = new Usuario(this);
    private ImageButton bt_voltar_login;
    private Button bt_salvar_usuario;
    private EditText cadastroNome;
    private EditText cadastroEmail;
    private EditText cadastroSenha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira_tela);

        bt_voltar_login = (ImageButton) findViewById(R.id.bt_voltar_login);
        bt_salvar_usuario = (Button) findViewById(R.id.bt_salvar_usuario);
        cadastroNome = (EditText) findViewById(R.id.cadastroNome);
        cadastroEmail = (EditText) findViewById(R.id.cadastroEmail);
        cadastroSenha = (EditText) findViewById(R.id.cadastroSenha);

        Intent intent = getIntent();
        if (intent != null) {
            Bundle bundle = intent.getExtras();
            if (bundle != null) {
                usuario.setNome(bundle.getString("nome"));
                usuario.setEmail(bundle.getString("email"));
                usuario.setSenha(bundle.getString("senha"));

                cadastroNome.setText(usuario.getNome());
                cadastroEmail.setText(usuario.getEmail());

                cadastroSenha.setVisibility(View.GONE);
                bt_voltar_login.setVisibility(View.GONE);
                bt_salvar_usuario.setVisibility(View.VISIBLE);

            }
        }

    }

    public void bt_voltar_login(View view){
        Intent voltarLogin = new Intent(getApplicationContext(), SegundaTela.class);
        startActivity(voltarLogin);
    }

    public void saveUser(View view){
        usuario.setNome(cadastroNome.getText().toString());
        usuario.setEmail(cadastroEmail.getText().toString());
        usuario.setSenha(cadastroSenha.getText().toString());

        BD bd = new BD(this);
        bd.inserir(usuario);
        Toast.makeText(this, "Usuário cadastrado com sucesso!", Toast.LENGTH_SHORT).show();

    }
}
