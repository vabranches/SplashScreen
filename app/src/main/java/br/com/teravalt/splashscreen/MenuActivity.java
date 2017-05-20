package br.com.teravalt.splashscreen;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

public class MenuActivity extends AppCompatActivity {

    private TextInputLayout tilNome;
    private TextInputLayout tilIdade;
    private Spinner spTimes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        tilNome = (TextInputLayout) findViewById(R.id.til_nome);
        tilIdade = (TextInputLayout) findViewById(R.id.til_idade);
        spTimes = (Spinner) findViewById(R.id.sp_times);


    }

    public void cadastrar(View view) {
        Intent intentConfirmacao = new Intent(this, ConfirmacaoActivity.class);

        intentConfirmacao.putExtra("NOME", tilNome.getEditText().getText().toString());
        intentConfirmacao.putExtra("IDADE", tilIdade.getEditText().toString());
        intentConfirmacao.putExtra("TIME", spTimes.getSelectedItem().toString());

        startActivity(intentConfirmacao);
    }


}
