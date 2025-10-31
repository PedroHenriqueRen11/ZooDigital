package br.edu.atitus.pedro_henrique_renosto.zoo_digital.animais;

import br.edu.atitus.pedro_henrique_renosto.zoo_digital.comportamentos.corredor;
import br.edu.atitus.pedro_henrique_renosto.zoo_digital.comportamentos.nadador;
import br.edu.atitus.pedro_henrique_renosto.zoo_digital.comportamentos.predador;

public class jacare extends reptil implements nadador, corredor, predador { 
    public jacare(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public void emitir_som() {
        System.out.println("O Jacaré fez um rugido gutural (Croc!).");
    }
    @Override
    public void nadar() {
        System.out.println("O Jacaré está nadando silenciosamente com os olhos para fora da água.");
    }
    @Override
    public void correr() {
        System.out.println("O Jacaré corre em disparada por uma curta distância.");
    }
    @Override
    public void cacar() {
        System.out.println("O Jacaré ataca com a 'morte em espiral'.");
    }
}