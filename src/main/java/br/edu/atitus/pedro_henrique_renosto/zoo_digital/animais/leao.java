package br.edu.atitus.pedro_henrique_renosto.zoo_digital.animais;

import br.edu.atitus.pedro_henrique_renosto.zoo_digital.comportamentos.corredor;
import br.edu.atitus.pedro_henrique_renosto.zoo_digital.comportamentos.predador;

public class leao extends mamifero implements corredor, predador { 
    
    public leao(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitir_som() {
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