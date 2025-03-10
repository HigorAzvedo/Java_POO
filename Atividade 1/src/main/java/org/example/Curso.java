package org.example;

public class Curso {
    private int idCurso;
    public int qtdSemestre;
    private String nomeCurso;

    public Curso(){}
    public Curso(int idCurso, String nomeCurso, int qtdSemestre) {
        this.nomeCurso = nomeCurso;
        this.idCurso = idCurso;
        this.qtdSemestre = qtdSemestre;
    }

    public int getIdCurso() {
        return idCurso;
    }
    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }
    public String getNomeCurso() {
        return nomeCurso;
    }
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
}



