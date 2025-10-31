package br.edu.atitus.pedro_henrique_renosto.zoo_digital.animais;

public abstract class mamifero extends animal {
    
    public mamifero(String nome, int idade) {
        super(nome, idade); 
    }

    @Override
    public void comer() {
    	System.out.println("O mamífero está mastigando sua comida.");
    }
}