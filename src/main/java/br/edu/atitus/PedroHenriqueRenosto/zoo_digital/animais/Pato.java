package br.edu.atitus.PedroHenriqueRenosto.zoo_digital.animais;

import br.edu.atitus.PedroHenriqueRenosto.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.PedroHenriqueRenosto.zoo_digital.comportamentos.Nadador;

public class Pato extends Ave implements Nadador, Corredor { 
    public Pato(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public void emitirSom() {
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