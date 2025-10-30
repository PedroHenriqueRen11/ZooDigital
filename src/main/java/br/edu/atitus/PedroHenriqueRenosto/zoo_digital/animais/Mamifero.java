package br.edu.atitus.PedroHenriqueRenosto.zoo_digital.animais;

public abstract class Mamifero extends Animal {
    
    public Mamifero(String nome, int idade) {
        super(nome, idade); 
    }

    @Override
    public void comer() {
    	System.out.println("O mamífero está mastigando sua comida.");
    }
}