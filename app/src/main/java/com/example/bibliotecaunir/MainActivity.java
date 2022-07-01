package com.example.bibliotecaunir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private Button btnCadastrar;
    private Button btnPesquisar;
    private RadioGroup rd_grupo;
    private EditText edt_pesquisar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCadastrar = findViewById(R.id.btn_cadastrar);
        btnPesquisar = findViewById(R.id.btn_pesquisar);
        rd_grupo = findViewById(R.id.rd_grupo);
        edt_pesquisar = findViewById(R.id.edt_pesquisar);

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Cadastro.class);
                startActivity(intent);
            }
        });

        btnPesquisar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Pesquisa.class);
                int id = rd_grupo.getCheckedRadioButtonId();
                String busca = edt_pesquisar.getText().toString();
                intent.putExtra("tipo", id);
                intent.putExtra("busca", busca);
                startActivity(intent);

            }
        });

    }
}