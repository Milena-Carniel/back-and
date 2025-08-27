package com.mycompany.poo.aula10;

public class App {
    public static void main(String[] args) {
        Pessoa pessoa  = new Pessoa();
        pessoa.nome = "Milena";
        pessoa.idade = 16;
        // pessoa.salario = 5000; atributos privados não são visíveis
    
        // Instanciando classes que estão declaradas em outros arquivos
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
    
        pessoa1.nome = "Milena";
        pessoa1.idade = 16;
        pessoa1.altura = 1.58;

        pessoa2.nome = "Ygor";
        pessoa2.idade = 18;
        pessoa2.altura = 1.75;


        pessoa1.exibirDados();
        pessoa2.exibirDados();

        pessoa1.atribuirSalario (5000, 300);
        pessoa2.atribuirSalario (5000);

        
        /*System.out.println("--- Dados da pessoa ---");
        System.out.println("Nome: " + pessoa1.nome);
        System.out.println("Idade: " + pessoa1.idade);
        System.out.println("Altura (m):" + pessoa1.altura);

        System.out.println("--- Dados da pessoa ---");
        System.out.println("Nome: " + pessoa2.nome);
        System.out.println(" Idade: " + pessoa2.idade);
        System.out.println("Altura (m):" + pessoa2.altura);*/
    }

}
