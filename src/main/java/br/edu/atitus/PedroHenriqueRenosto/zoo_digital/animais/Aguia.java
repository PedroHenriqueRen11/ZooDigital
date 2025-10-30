package br.edu.atitus.PedroHenriqueRenosto.zoo_digital.animais;

import br.edu.atitus.PedroHenriqueRenosto.zoo_digital.comportamentos.Predador;
import br.edu.atitus.PedroHenriqueRenosto.zoo_digital.comportamentos.Voador;

public class Aguia extends Ave implements Voador, Predador { 
    public Aguia(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public void emitirSom() {
        System.out.println("A Águia gritou: Skreeee!");
    }
    @Override
    public void voar() {
        System.out.println("A Águia está planando nas correntes de ar.");
    }
    @Override
    public void cacar() {
        System.out.println("A Águia está atacando a presa em um mergulho de alta velocidade.");
    }
}