package com.fatec.biblioteca.model;

public class Professor extends Usuario {
    private String departamento;
    private String titulacao;

    public Professor(String departamento, String titulacao, String email, int idUsuario, String nome) {
        super(email, idUsuario, nome);
        this.departamento = departamento;
        this.titulacao = titulacao;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    


}
