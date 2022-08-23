package com.example.aula2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TextView TextInicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextInicio = findViewById(R.id.TextInicio);
        TextInicio.setText(getIntent().getStringExtra("Passando_Nome"));

        ArrayList<CharSequence> arl = getIntent().getCharSequenceArrayListExtra("DADOS");


    }
}