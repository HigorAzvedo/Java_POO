package org.example;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setNomeCurso("Engenharia da Computação");
        curso1.setIdCurso(5);

        Aluno aluno1 = new Aluno("Higor", 1001, 12345678901L, 8, 7);
        aluno1.setCurso(curso1);
        Aluno aluno2 = new Aluno("Zé", 1002, 98765432100L, 9, 8);
        Aluno aluno3 = new Aluno("João", 1003, 11122233344L, 7, 6);

        Disciplina disciplina = new Disciplina();
        disciplina.setNomeDisciplina("Orientada a Objetos");
        disciplina.setIdDisciplina(1);
        disciplina.setCargaHoraria(89);

        System.out.println("===== Alunos =====");
        System.out.println("Nome: " + aluno1.nome + " | Matrícula: " + aluno1.getMatricula() +
                " | Curso: " + aluno1.getCurso().getNomeCurso() + " | CPF: " + aluno1.getCpf() + " | Média: " + aluno1.media());

        System.out.println("Nome: " + aluno2.nome + " | Matrícula: " + aluno2.getMatricula() +
                        " | Curso: " + aluno1.getCurso().getNomeCurso() + " | CPF: " + aluno2.getCpf() + " | Média: " + aluno2.media());

        System.out.println("Nome: " + aluno3.nome + " | Matrícula: " + aluno3.getMatricula() +
                        " | Curso: " + aluno1.getCurso().getNomeCurso() + " | CPF: " + aluno3.getCpf() + " | Média: " + aluno3.media());

        Professor professor1 = new Professor("Jean", 2001);
        Professor professor2 = new Professor("Alex", 2002);
        Professor professor3 = new Professor("Zé", 2003);
        professor1.setDisciplina(disciplina);

        System.out.println("\n===== Professores =====");
        System.out.println("Nome: " + professor1.nome + " | Matrícula: " + professor1.getMatricula() +
                " | Disciplina Lecionada: " + professor1.getDisciplina().getNomeDisciplina());
        professor1.avaliar();
        professor1.prova();

        System.out.println("\nNome: " + professor2.nome + " | Matrícula: " + professor2.getMatricula() +
                " | Disciplina Lecionada: " + professor1.getDisciplina().getNomeDisciplina());
        professor2.avaliar();
        professor2.prova();

        System.out.println("\nNome: " + professor3.nome + " | Matrícula: " + professor3.getMatricula() +
                " | Disciplina Lecionada: " + professor1.getDisciplina().getNomeDisciplina());
        professor3.avaliar();
        professor3.prova();
    }
}
