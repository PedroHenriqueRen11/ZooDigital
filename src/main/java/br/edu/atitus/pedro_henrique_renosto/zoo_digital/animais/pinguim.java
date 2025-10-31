package br.edu.atitus.pedro_henrique_renosto.zoo_digital.animais;

import br.edu.atitus.pedro_henrique_renosto.zoo_digital.comportamentos.corredor;
import br.edu.atitus.pedro_henrique_renosto.zoo_digital.comportamentos.nadador;

public class pinguim extends ave implements nadador, corredor { 
    
    public pinguim(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitir_som() {
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