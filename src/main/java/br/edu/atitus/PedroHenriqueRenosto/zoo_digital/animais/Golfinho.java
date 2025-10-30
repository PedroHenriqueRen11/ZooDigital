package br.edu.atitus.PedroHenriqueRenosto.zoo_digital.animais;

import br.edu.atitus.PedroHenriqueRenosto.zoo_digital.comportamentos.Nadador;

public class Golfinho extends Mamifero implements Nadador { 
    public Golfinho(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public void emitirSom() {
        System.out.println("O Golfinho emitiu um clique e um assobio.");
    }
    @Override
    public void nadar() {
        System.out.println("O Golfinho está saltando e nadando em alta velocidade.");
    }
}