package com.example.aula2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CriarContaActivity extends AppCompatActivity {

    private Button buttonCadastrar;
    private EditText editNome;
    private EditText editSobrenome;
    private EditText editEmail;
    private EditText editSenha;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criarconta);

        buttonCadastrar = findViewById(R.id.buttonCadastrar);
        editNome = findViewById(R.id.editNome);
        editSobrenome = findViewById(R.id.editSobrenome);
        editEmail = findViewById(R.id.editEmail);
        editSenha = findViewById(R.id.editSenha);

        buttonCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(editNome.getText().toString().isEmpty()
                        && editSobrenome.getText().toString().isEmpty()
                        && editEmail.getText().toString().isEmpty()
                        && editSenha.getText().toString().isEmpty())){

                    ArrayList<CharSequence> dados = new ArrayList<CharSequence>();

                    dados.add(editSobrenome.getText().toString());
                    dados.add(editSobrenome.getText().toString());
                    dados.add(editSobrenome.getText().toString());
                    dados.add(editSobrenome.getText().toString());


                    Intent it = new Intent(CriarContaActivity.this, MainActivity.class);
                it.putCharSequenceArrayListExtra("DADOS", dados);
                    startActivity(it);
                }else{
                    Toast.makeText(CriarContaActivity.this,
                            "Todos os campos são obrigatorios", Toast.LENGTH_LONG);
                }
            }
        });
    }



}
