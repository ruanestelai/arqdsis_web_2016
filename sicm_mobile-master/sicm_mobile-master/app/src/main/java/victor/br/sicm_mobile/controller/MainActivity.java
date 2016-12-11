package victor.br.sicm_mobile.controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import victor.br.sicm_mobile.R;

public class MainActivity extends AppCompatActivity {

    private EditText cpf;
    public static final String CHAVE =  "victor.br.sicm_mobile.chave";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cpf = (EditText) findViewById( R.id.busca_cpf );

    }

    public void buscarAluno(View view){

        Intent intent = new Intent(this, ListaCursosActivity.class);

        String chave = cpf.getText().toString();

        intent.putExtra(CHAVE, chave);

        startActivity(intent);

    }
}
