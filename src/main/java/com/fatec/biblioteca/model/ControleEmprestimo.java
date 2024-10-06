package com.fatec.biblioteca.model;

import java.time.LocalDate;

public class ControleEmprestimo {
    
    
        public static String registraEmprestimo(int id,Usuario usuario,Livro livro)
{
    if (!livro.isDisponivel()) 
        {
         return "Livro não disponível para empréstimo.";
        }
    
        RegistroEmprestimo registrar=new RegistroEmprestimo(id, livro, usuario);
        livro.setDisponivel(false);
        
        
        return "Empréstimo registrado para: " + usuario.getNome() + 
        "\nLivro: " + livro.getTitulo() + 
        "\nData do Empréstimo: " + registrar.getDataEmprestimo()+"\n";
}

        public static String registraDevolucao(int id,Usuario usuario,Livro livro) 
        {
            RegistroEmprestimo registrar=new RegistroEmprestimo(id, livro, usuario);
            livro.setDisponivel(true);
            registrar.setDataDevolucao(LocalDate.now());
            return "Devolução registrada para: " + usuario.getNome() + 
            "\nLivro: " + livro.getTitulo() + 
            "\nData da Devolução: " + registrar.getDataDevolucao()+"\n";  
        }


}
