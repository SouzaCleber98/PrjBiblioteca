package com.fatec.biblioteca.model;

public abstract class Usuario {


private int idUsuario;
private String nome;
private String email;

    public Usuario(String email, int idUsuario, String nome) {
        this.email = email;
        this.idUsuario = idUsuario;
        this.nome = nome;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    



}
