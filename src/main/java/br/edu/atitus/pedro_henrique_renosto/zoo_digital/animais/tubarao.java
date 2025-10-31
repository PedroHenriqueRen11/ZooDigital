package br.edu.atitus.pedro_henrique_renosto.zoo_digital.animais;

import br.edu.atitus.pedro_henrique_renosto.zoo_digital.comportamentos.nadador;
import br.edu.atitus.pedro_henrique_renosto.zoo_digital.comportamentos.predador;

public class tubarao extends peixe implements nadador, predador { 
    public tubarao(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public void emitir_som() {
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