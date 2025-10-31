package br.edu.atitus.pedro_henrique_renosto.zoo_digital.animais;

import br.edu.atitus.pedro_henrique_renosto.zoo_digital.comportamentos.corredor;
import br.edu.atitus.pedro_henrique_renosto.zoo_digital.comportamentos.nadador;

public class pato extends ave implements nadador, corredor { 
    public pato(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public void emitir_som() {
        System.out.println("O Pato grasnou: Quack! Quack!");
    }
    @Override
    public void nadar() {
        System.out.println("O Pato está remando com os pés para se locomover na água.");
    }
    @Override
    public void correr() {
        System.out.println("O Pato corre desajeitadamente.");
    }
}