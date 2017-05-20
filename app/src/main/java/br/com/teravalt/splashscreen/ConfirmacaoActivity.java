package br.com.teravalt.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class ConfirmacaoActivity extends AppCompatActivity {


    private TextView tvConfirmacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacao);

        tvConfirmacao = (TextView) findViewById(R.id.tv_confirmacao);

        if (getIntent() != null) {
            String nome = getIntent().getStringExtra("NOME");
            String idade = getIntent().getStringExtra("IDADE");
            String time = getIntent().getStringExtra("TIME");

            tvConfirmacao.setText(
                    getString(
                            R.string.confirmacao_cadastro,
                            nome,
                            time)
            );

        }


    }

    public void voltar(View view) {
        Intent intentVoltar = new Intent(this, MenuActivity.class);
        startActivity(intentVoltar);
    }
}
