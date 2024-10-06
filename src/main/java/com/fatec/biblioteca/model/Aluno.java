package com.fatec.biblioteca.model;

public class Aluno extends Usuario {

private String matricula;
private String curso;


public Aluno(String email, int idUsuario, String nome, String matricula, String curso) {
    super(email, idUsuario, nome);
    this.matricula = matricula;
    this.curso = curso;
}

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }



}
