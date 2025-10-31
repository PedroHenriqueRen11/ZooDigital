package br.edu.atitus.pedro_henrique_renosto.zoo_digital.animais;

import br.edu.atitus.pedro_henrique_renosto.zoo_digital.comportamentos.corredor;
import br.edu.atitus.pedro_henrique_renosto.zoo_digital.comportamentos.predador;

public class urso extends mamifero implements corredor, predador { 
    public urso(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public void emitir_som() {
        System.out.println("O Urso bufou: Hrrruaa!");
    }
    @Override
    public void correr() {
        System.out.println("O Urso corre em busca de comida.");
    }
    @Override
    public void cacar() {
        System.out.println("O Urso está pescando no rio ou procurando mel.");
    }
}