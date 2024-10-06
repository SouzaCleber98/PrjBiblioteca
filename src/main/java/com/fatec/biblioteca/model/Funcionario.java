package com.fatec.biblioteca.model;

public class Funcionario extends Usuario {
    private String cargo;
    private String setor;


    public Funcionario(String email, int idUsuario, String nome, String cargo, String setor) {
        super(email, idUsuario, nome);
        this.cargo = cargo;
        this.setor = setor;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    

}
