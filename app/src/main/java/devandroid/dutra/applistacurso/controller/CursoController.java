package devandroid.dutra.applistacurso.controller;

import java.util.ArrayList;
import java.util.List;

import devandroid.dutra.applistacurso.model.Curso;

public class CursoController {

    private List listCurso;

    public List getListaDeCurso(){

        listCurso = new ArrayList<Curso>();

        listCurso.add(new Curso("Java"));
        listCurso.add(new Curso("HTML"));
        listCurso.add(new Curso("C#"));
        listCurso.add(new Curso("Python"));
        listCurso.add(new Curso("PHP"));
        listCurso.add(new Curso("Java EE"));
        listCurso.add(new Curso("Flutter"));
        listCurso.add(new Curso("Dart"));

        return listCurso;
    }

    public ArrayList<String> dadosParaSpinner(){

        ArrayList<String> dados = new ArrayList<>();

        for (int i = 0; i < getListaDeCurso().size(); i++) {

            Curso objeto = (Curso) getListaDeCurso().get(i);
            dados.add(objeto.getNomeDoCursoDesejado());
        }

        return dados;
    }

}
