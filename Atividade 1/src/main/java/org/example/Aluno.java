package org.example;

public class Aluno {

    private int matricula;
    private long cpf;
    public int nota1;
    public int nota2;
    public String nome;
    private Curso curso;

    int Soma() {
        return nota1 + nota2;
    }
    double media(){
        return Soma() /2;
    }

    public Aluno(){}
    public Aluno(String nome, int matricula, long cpf, int nota1, int nota2) {
        this.nome = nome;
        this.matricula = matricula;
        this.cpf = cpf;
        this.nota1 = nota1;
        this.nota2 = nota2;


    }

    public long getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}