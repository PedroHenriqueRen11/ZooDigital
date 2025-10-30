package br.edu.atitus.PedroHenriqueRenosto.zoo_digital.animais;

import br.edu.atitus.PedroHenriqueRenosto.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.PedroHenriqueRenosto.zoo_digital.comportamentos.Predador;

public class Tubarao extends Peixe implements Nadador, Predador { 
    public Tubarao(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public void emitirSom() {
        System.out.println("O Tubarão não emite som, mas a água treme.");
    }
    @Override
    public void nadar() {
        System.out.println("O Tubarão nada em alta velocidade usando sua cauda poderosa.");
    }
    @Override
    public void cacar() {
        System.out.println("O Tubarão localiza a presa pelo olfato a longa distância.");
    }
}