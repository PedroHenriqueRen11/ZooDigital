package br.edu.atitus.pedro_henrique_renosto.zoo_digital.animais;

import br.edu.atitus.pedro_henrique_renosto.zoo_digital.comportamentos.nadador;

public class tartaruga extends reptil implements nadador { 
    public tartaruga(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public void emitir_som() {
        System.out.println("A Tartaruga solta um chiado suave.");
    }
    @Override
    public void nadar() {
        System.out.println("A Tartaruga marinha está deslizando lentamente pelo oceano.");
    }
}