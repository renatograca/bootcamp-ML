package com.company;

public class Main {

    public static void main(String[] args) {
        Pessoa renato = new Pessoa(1, "Renato");
        Pessoa eliana = new Pessoa(2, "Eliana", 26);

        renato.mostrarPessoa();
        eliana.mostrarPessoa();
    }
}
