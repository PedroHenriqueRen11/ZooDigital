package br.edu.atitus.pedro_henrique_renosto.zoo_digital.animais;

public abstract class reptil extends animal {
    
    public reptil(String nome, int idade) {
        super(nome, idade); 
    }

    @Override
    public void comer() {
        System.out.println("O réptil está mastigando lentamente e digerindo.");
    }
}