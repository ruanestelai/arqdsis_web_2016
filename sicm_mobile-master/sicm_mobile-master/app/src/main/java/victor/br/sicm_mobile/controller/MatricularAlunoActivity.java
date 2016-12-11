package victor.br.sicm_mobile.controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import victor.br.sicm_mobile.R;

public class MatricularAlunoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matricular_aluno);

        Intent intent = getIntent();
        String nome = intent.getStringExtra(ListaCursosActivity.CURSO);
        TextView textview = (TextView) findViewById(R.id.nome_curso);
        textview.setText(nome);
    }
}
