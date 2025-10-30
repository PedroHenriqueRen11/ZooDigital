package br.edu.atitus.PedroHenriqueRenosto.zoo_digital.animais;

import br.edu.atitus.PedroHenriqueRenosto.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.PedroHenriqueRenosto.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.PedroHenriqueRenosto.zoo_digital.comportamentos.Predador;

public class Jacare extends Reptil implements Nadador, Corredor, Predador { 
    public Jacare(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public void emitirSom() {
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