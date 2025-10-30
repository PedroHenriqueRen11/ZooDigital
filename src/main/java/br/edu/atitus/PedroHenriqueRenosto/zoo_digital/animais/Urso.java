package br.edu.atitus.PedroHenriqueRenosto.zoo_digital.animais;

import br.edu.atitus.PedroHenriqueRenosto.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.PedroHenriqueRenosto.zoo_digital.comportamentos.Predador;

public class Urso extends Mamifero implements Corredor, Predador { 
    public Urso(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public void emitirSom() {
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