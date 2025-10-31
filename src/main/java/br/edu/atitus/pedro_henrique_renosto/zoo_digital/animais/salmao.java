package br.edu.atitus.pedro_henrique_renosto.zoo_digital.animais;

import br.edu.atitus.pedro_henrique_renosto.zoo_digital.comportamentos.nadador;

public class salmao extends peixe implements nadador { 
    public salmao(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public void emitir_som() {
        System.out.println("O Salmão faz pequenas bolhas.");
    }
    @Override
    public void nadar() {
        System.out.println("O Salmão está nadando contra a corrente para desovar.");
    }
}