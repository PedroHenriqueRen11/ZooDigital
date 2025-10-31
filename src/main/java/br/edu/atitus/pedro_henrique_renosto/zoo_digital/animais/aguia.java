package br.edu.atitus.pedro_henrique_renosto.zoo_digital.animais;

import br.edu.atitus.pedro_henrique_renosto.zoo_digital.comportamentos.predador;
import br.edu.atitus.pedro_henrique_renosto.zoo_digital.comportamentos.voador;

public class aguia extends ave implements voador, predador {
	public aguia(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public void emitir_som() {
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