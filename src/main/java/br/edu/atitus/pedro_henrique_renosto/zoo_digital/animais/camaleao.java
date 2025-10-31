package br.edu.atitus.pedro_henrique_renosto.zoo_digital.animais;

import br.edu.atitus.pedro_henrique_renosto.zoo_digital.comportamentos.corredor;

public class camaleao extends reptil implements corredor { 
    public camaleao(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public void emitir_som() {
        System.out.println("O Camaleão não emite som audível.");
    }
    @Override
    public void correr() {
        System.out.println("O Camaleão se move devagar, balançando de um lado para o outro.");
    }
}