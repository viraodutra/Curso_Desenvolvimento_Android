package devandroid.dutra.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.dutra.applistacurso.R;
import devandroid.dutra.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
        pessoa.setPrimeiroNome("Victor");
        pessoa.setSobreNome("Antonio");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneContato("77988441546");



    }
}