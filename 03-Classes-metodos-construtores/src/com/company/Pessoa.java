package com.company;

public class Pessoa {
    private int id;
    private String nome;
    private int idade;
    private int altura;

    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    public Pessoa(int id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    public void mostrarPessoa() {
        System.out.println(id+" "+nome+" "+idade);
    }
}
