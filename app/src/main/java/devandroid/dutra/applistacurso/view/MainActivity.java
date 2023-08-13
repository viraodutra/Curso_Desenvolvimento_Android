package devandroid.dutra.applistacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import devandroid.dutra.applistacurso.R;
import devandroid.dutra.applistacurso.controller.PessoaController;
import devandroid.dutra.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    PessoaController controller;

    EditText editPrimeiroNome;
    EditText editSobreNome;
    EditText editNomeDoCurso;
    EditText editTelefoneDeContato;

    Button btnFinalizar;
    Button btnSalvar;
    Button btnLimpar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        controller = new PessoaController();
        controller.toString();
        pessoa = new Pessoa();
        pessoa.setPrimeiroNome("Victor");
        pessoa.setSobreNome("Antonio");
        pessoa.setCursoDesejado("Android");
        pessoa.setTelefoneContato("77988441546");

        Log.i("POOAndroid", pessoa.toString());

        editPrimeiroNome = findViewById(R.id.editPrimeiroNome);
        editSobreNome = findViewById(R.id.editSobreNome);
        editNomeDoCurso = findViewById(R.id.editNomeDoCurso);
        editTelefoneDeContato = findViewById(R.id.editTelefoneDeContato);

        btnFinalizar = findViewById(R.id.btnFinalizar);
        btnLimpar = findViewById(R.id.btnLimpar);
        btnSalvar = findViewById(R.id.btnSalvar);

        editPrimeiroNome.setText(pessoa.getPrimeiroNome());
        editSobreNome.setText(pessoa.getSobreNome());
        editNomeDoCurso.setText(pessoa.getCursoDesejado());
        editTelefoneDeContato.setText(pessoa.getTelefoneContato());

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editPrimeiroNome.setText("");
                editSobreNome.setText("");
                editNomeDoCurso.setText("");
                editTelefoneDeContato.setText("");
            }
        });

        btnFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Volte sempre!", Toast.LENGTH_LONG).show();
                finish();
            }
        });

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pessoa.setPrimeiroNome(editPrimeiroNome.getText().toString());
                pessoa.setSobreNome(editSobreNome.getText().toString());
                pessoa.setCursoDesejado(editNomeDoCurso.getText().toString());
                pessoa.setTelefoneContato(editTelefoneDeContato.getText().toString());


                Toast.makeText(MainActivity.this, "Salvo!" + pessoa.toString(), Toast.LENGTH_LONG).show();

                controller.salvar(pessoa);


            }
        });


    }
}