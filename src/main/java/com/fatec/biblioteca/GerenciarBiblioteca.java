package com.fatec.biblioteca;

import com.fatec.biblioteca.model.Aluno;
import com.fatec.biblioteca.model.ControleEmprestimo;
import com.fatec.biblioteca.model.Funcionario;
import com.fatec.biblioteca.model.Livro;
import com.fatec.biblioteca.model.Professor;

public class GerenciarBiblioteca {
    public static void main(String[] args) {
        

        // Instanciando usuários
      
        
        Aluno aluno = new Aluno("maria.silva@email.com", 1, "Maria Silva", "2023001", "Engenharia");
        Professor professor = new Professor("Departamento de Física", "Doutor", "joao.pereira@email.com", 2, "João Pereira");
        Funcionario funcionario = new Funcionario("carlos.oliveira@email.com", 3, "Carlos Oliveira", "Assistente", "Recursos Humanos");

        // Instanciando livros
        Livro livro1 = new Livro("Autor A", 101, "Java para Iniciantes");
        Livro livro2 = new Livro("Autor B", 102, "Programação em C");
        Livro livro3 = new Livro("Autor C", 103, "Estruturas de Dados");

        // Registrando empréstimos
        System.out.println(ControleEmprestimo.registraEmprestimo(1, aluno, livro1));
        System.out.println(ControleEmprestimo.registraEmprestimo(2, professor, livro2));
        System.out.println(ControleEmprestimo.registraEmprestimo(3, funcionario, livro3));

        // Registrando devoluções
        System.out.println(ControleEmprestimo.registraDevolucao(1, aluno, livro1));
        System.out.println(ControleEmprestimo.registraDevolucao(2, professor, livro2));
        System.out.println(ControleEmprestimo.registraDevolucao(3, funcionario, livro3));
    }
}





    
