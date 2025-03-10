package org.example;

public class Professor {

    private int matricula;
    private Disciplina disciplina;
    public String nome;

    public Professor(){}
    public Professor( String nome, int matricula) {
        this.matricula = matricula;
        this.nome = nome;

    }

    void avaliar(){
        System.out.println("O professor avaliou os resultados");
    }

    void prova(){
        System.out.println("O professor aplicou uma prova");
    }

    public int getMatricula(){
        return matricula;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
}
