package br.edu.atitus.PedroHenriqueRenosto.zoo_digital.animais;

import br.edu.atitus.PedroHenriqueRenosto.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.PedroHenriqueRenosto.zoo_digital.comportamentos.Predador;

public class Cobra extends Reptil implements Corredor, Predador { 
    public Cobra(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public void emitirSom() {
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