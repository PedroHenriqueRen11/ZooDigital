package br.edu.atitus.PedroHenriqueRenosto.zoo_digital.animais;

import br.edu.atitus.PedroHenriqueRenosto.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.PedroHenriqueRenosto.zoo_digital.comportamentos.Predador;

public class Leao extends Mamifero implements Corredor, Predador { 
    
    public Leao(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O Leão rugiu: ROARRR!");
    }

    @Override
    public void correr() {
        System.out.println("O Leão corre a 80 km/h para pegar a caça.");
    }

    @Override
    public void cacar() {
        System.out.println("O Leão está emboscando o alvo.");
    }
}