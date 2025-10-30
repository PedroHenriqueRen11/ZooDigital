package br.edu.atitus.PedroHenriqueRenosto.zoo_digital.animais;

public abstract class Reptil extends Animal {
    
    public Reptil(String nome, int idade) {
        super(nome, idade); 
    }

    @Override
    public void comer() {
        System.out.println("O réptil está mastigando lentamente e digerindo.");
    }
}