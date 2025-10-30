package br.edu.atitus.PedroHenriqueRenosto.zoo_digital.animais;

import br.edu.atitus.PedroHenriqueRenosto.zoo_digital.comportamentos.Nadador;

public class Tartaruga extends Reptil implements Nadador { 
    public Tartaruga(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public void emitirSom() {
        System.out.println("A Tartaruga solta um chiado suave.");
    }
    @Override
    public void nadar() {
        System.out.println("A Tartaruga marinha está deslizando lentamente pelo oceano.");
    }
}