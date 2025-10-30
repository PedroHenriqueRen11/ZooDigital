package br.edu.atitus.PedroHenriqueRenosto.zoo_digital.animais;

import br.edu.atitus.PedroHenriqueRenosto.zoo_digital.comportamentos.Nadador;

public class Salmao extends Peixe implements Nadador { 
    public Salmao(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public void emitirSom() {
        System.out.println("O Salmão faz pequenas bolhas.");
    }
    @Override
    public void nadar() {
        System.out.println("O Salmão está nadando contra a corrente para desovar.");
    }
}