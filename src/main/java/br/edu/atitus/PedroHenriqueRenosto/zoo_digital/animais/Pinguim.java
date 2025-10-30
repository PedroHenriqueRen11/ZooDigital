package br.edu.atitus.PedroHenriqueRenosto.zoo_digital.animais;

import br.edu.atitus.PedroHenriqueRenosto.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.PedroHenriqueRenosto.zoo_digital.comportamentos.Nadador;

public class Pinguim extends Ave implements Nadador, Corredor { 
    
    public Pinguim(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O Pinguim grasnou: Aaaark!");
    }
    
    @Override
    public void nadar() {
        System.out.println("O Pinguim está nadando rapidamente (voando) debaixo d'água.");
    }
    
    @Override
    public void correr() {
        System.out.println("O Pinguim está se locomovendo cambaleando rapidamente.");
    }
}