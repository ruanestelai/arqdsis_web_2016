package victor.br.sicm_mobile.controller;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import victor.br.sicm_mobile.R;
import victor.br.sicm_mobile.model.DataCurso;

public class ListaCursosActivity extends AppCompatActivity {

    ArrayList<String> lista;
    Activity atividade;
    public static final String CURSO = "victor.br.sicm_mobile.curso";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_cursos);
        atividade = this;

        Intent intent = getIntent();
        String chave = intent.getStringExtra(MainActivity.CHAVE);

        DataCurso dtCurso = new DataCurso();
        lista = dtCurso.geraListaCurso();

        //Criar o adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, lista);

        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent1 = new Intent(atividade, MatricularAlunoActivity.class);
                intent1.putExtra(CURSO, lista.get(i));

                startActivity(intent1);
            }
        });
    }
}
