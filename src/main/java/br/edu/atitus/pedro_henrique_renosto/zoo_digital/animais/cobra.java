package br.edu.atitus.pedro_henrique_renosto.zoo_digital.animais;

import br.edu.atitus.pedro_henrique_renosto.zoo_digital.comportamentos.corredor;
import br.edu.atitus.pedro_henrique_renosto.zoo_digital.comportamentos.predador;

public class cobra extends reptil implements corredor, predador { 
    public cobra(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public void emitir_som() {
        System.out.println("A Cobra sibilou: Ssssssss!");
    }
    @Override
    public void correr() {
        System.out.println("A Cobra rasteja rapidamente pelo chão.");
    }
    @Override
    public void cacar() {
        System.out.println("A Cobra está de tocaia, esperando a presa se aproximar.");
    }
}