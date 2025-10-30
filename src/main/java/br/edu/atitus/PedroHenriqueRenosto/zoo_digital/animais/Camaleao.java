package br.edu.atitus.PedroHenriqueRenosto.zoo_digital.animais;

import br.edu.atitus.PedroHenriqueRenosto.zoo_digital.comportamentos.Corredor;

public class Camaleao extends Reptil implements Corredor { 
    public Camaleao(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public void emitirSom() {
        System.out.println("O Camaleão não emite som audível.");
    }
    @Override
    public void correr() {
        System.out.println("O Camaleão se move devagar, balançando de um lado para o outro.");
    }
}