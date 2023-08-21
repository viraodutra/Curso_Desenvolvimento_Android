package devandroid.dutra.applistacurso.controller;

import android.util.Log;

import androidx.annotation.NonNull;

import devandroid.dutra.applistacurso.model.Pessoa;

public class PessoaController {


    @NonNull
    @Override
    public String toString() {

        Log.d("MVC Controller", "Controller iniciada...");

        return super.toString();
    }

    public void salvar(Pessoa pessoa) {
        Log.d("MVC Controller", "Salvo: "+pessoa.toString());

    }
}
