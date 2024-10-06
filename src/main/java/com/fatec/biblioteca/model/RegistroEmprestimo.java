package com.fatec.biblioteca.model;

import java.time.LocalDate;

public class RegistroEmprestimo {

    private int idEmprestimo;
    private Usuario usuario;
    private Livro livro; 
    private LocalDate dataEmprestimo; 
    private LocalDate dataDevolucao;


    public RegistroEmprestimo(int idEmprestimo, Livro livro, Usuario usuario) {
        this.dataDevolucao = null;
        this.dataEmprestimo = LocalDate.now();
        this.idEmprestimo = idEmprestimo;
        this.livro = livro;
        this.usuario = usuario;
    }

    public int getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
  
    

}
