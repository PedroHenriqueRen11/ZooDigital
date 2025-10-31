package br.edu.atitus.pedro_henrique_renosto.zoo_digital.animais;

import br.edu.atitus.pedro_henrique_renosto.zoo_digital.comportamentos.nadador;

public class golfinho extends mamifero implements nadador { 
    public golfinho(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public void emitir_som() {
        System.out.println("O Golfinho emitiu um clique e um assobio.");
    }
    @Override
    public void nadar() {
        System.out.println("O Golfinho está saltando e nadando em alta velocidade.");
    }
}