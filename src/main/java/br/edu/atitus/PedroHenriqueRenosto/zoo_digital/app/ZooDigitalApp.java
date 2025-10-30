package br.edu.atitus.PedroHenriqueRenosto.zoo_digital.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.atitus.PedroHenriqueRenosto.zoo_digital.animais.Aguia;
import br.edu.atitus.PedroHenriqueRenosto.zoo_digital.animais.Animal;
import br.edu.atitus.PedroHenriqueRenosto.zoo_digital.animais.Camaleao;
import br.edu.atitus.PedroHenriqueRenosto.zoo_digital.animais.Cobra;
import br.edu.atitus.PedroHenriqueRenosto.zoo_digital.animais.Golfinho;
import br.edu.atitus.PedroHenriqueRenosto.zoo_digital.animais.Jacare;
import br.edu.atitus.PedroHenriqueRenosto.zoo_digital.animais.Leao;
import br.edu.atitus.PedroHenriqueRenosto.zoo_digital.animais.Pato;
import br.edu.atitus.PedroHenriqueRenosto.zoo_digital.animais.Pinguim;
import br.edu.atitus.PedroHenriqueRenosto.zoo_digital.animais.Salmao;
import br.edu.atitus.PedroHenriqueRenosto.zoo_digital.animais.Tartaruga;
import br.edu.atitus.PedroHenriqueRenosto.zoo_digital.animais.Tubarao;
import br.edu.atitus.PedroHenriqueRenosto.zoo_digital.animais.Urso;
import br.edu.atitus.PedroHenriqueRenosto.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.PedroHenriqueRenosto.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.PedroHenriqueRenosto.zoo_digital.comportamentos.Predador;
import br.edu.atitus.PedroHenriqueRenosto.zoo_digital.comportamentos.Voador;

public class ZooDigitalApp {
    
    private static List<Animal> animais = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in); 

    public static void main(String[] args) {
        animais.add(new Leao("Simba", 5));
        animais.add(new Pinguim("Picolino", 2));
        animais.add(new Jacare("Crocodilo", 15));
        animais.add(new Aguia("Misty", 4));
        
        boolean rodando = true;
        
        while (rodando) {
            exibirMenu();
            int opcao = lerOpcao();
            
            switch (opcao) {
                case 1:
                    cadastrarAnimal(); 
                    break;
                case 2:
                    listarTodosAnimais(); 
                    break;
                case 3:
                    listarPorComportamento(Corredor.class, "Corredor"); 
                    break;
                case 4:
                    listarPorComportamento(Nadador.class, "Nadador"); 
                    break;
                case 5:
                    listarPorComportamento(Voador.class, "Voador"); 
                    break;
                case 6:
                    listarPorComportamento(Predador.class, "Predador");
                    break;
                case 7:
                    exibirTotalAnimais(); 
                    break;
                case 8: 
                    rodando = false;
                    System.out.println("Encerrando o Zoo Digital. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Digite um número de 1 a 8.");
            }
        }
        scanner.close(); 
    }
    
    private static void exibirMenu() {
        System.out.println("\n--- Zoo Digital CLI ---");
        System.out.println("1. Cadastrar Animal (Leao, Cobra, etc.)");
        System.out.println("2. Listar Todos Animais (Polimorfismo)");
        System.out.println("3. Listar Animais Corredores");
        System.out.println("4. Listar Animais Nadadores");
        System.out.println("5. Listar Animais Voadores");
        System.out.println("6. Listar Animais Predadores");
        System.out.println("7. Exibir Total de Animais");
        System.out.println("8. Sair");
        System.out.print("Escolha uma opção: ");
    }
    
    private static int lerOpcao() {
        try {
            String linha = scanner.nextLine();
            return Integer.parseInt(linha);
        } catch (NumberFormatException e) {
            return -1; 
        }
    }
   
    private static void cadastrarAnimal() {
        System.out.println("\n--- Cadastro ---");
        System.out.println("Tipo de animal para cadastro (ex: Leao, Cobra, Tubarao, Aguia):");
        String tipo = scanner.nextLine();
        
        System.out.print("Nome do Animal: ");
        String nome = scanner.nextLine();
        
        System.out.print("Idade do Animal: ");
        int idade = lerOpcao(); 
        
        Animal novoAnimal = null;
        
        if (tipo.equalsIgnoreCase("Leao")) {
            novoAnimal = new Leao(nome, idade);
        } else if (tipo.equalsIgnoreCase("Urso")) {
            novoAnimal = new Urso(nome, idade);
        } else if (tipo.equalsIgnoreCase("Golfinho")) {
            novoAnimal = new Golfinho(nome, idade);
        } else if (tipo.equalsIgnoreCase("Aguia")) {
            novoAnimal = new Aguia(nome, idade);
        } else if (tipo.equalsIgnoreCase("Pato")) {
            novoAnimal = new Pato(nome, idade);
        } else if (tipo.equalsIgnoreCase("Pinguim")) {
            novoAnimal = new Pinguim(nome, idade);
        } else if (tipo.equalsIgnoreCase("Tubarao")) {
            novoAnimal = new Tubarao(nome, idade);
        } else if (tipo.equalsIgnoreCase("Salmao")) {
            novoAnimal = new Salmao(nome, idade);
        } else if (tipo.equalsIgnoreCase("Cobra")) {
            novoAnimal = new Cobra(nome, idade);
        } else if (tipo.equalsIgnoreCase("Jacare")) {
            novoAnimal = new Jacare(nome, idade);
        } else if (tipo.equalsIgnoreCase("Tartaruga")) {
            novoAnimal = new Tartaruga(nome, idade);
        } else if (tipo.equalsIgnoreCase("Camaleao")) {
            novoAnimal = new Camaleao(nome, idade);
        } else {
            System.out.println("Tipo de animal inválido ou não suportado.");
            return;
        }
        
        animais.add(novoAnimal);
        System.out.println("Animal " + nome + " cadastrado com sucesso!");
    }

    private static void listarTodosAnimais() {
        System.out.println("\n--- Lista Completa de Animais ---");
        if (animais.isEmpty()) {
            System.out.println("Nenhum animal cadastrado.");
            return;
        }
        
        for (Animal a : animais) {
            a.exibirDetalhes(); 
            a.emitirSom();     
            a.comer();         
            System.out.println("--------------------");
        }
    }

    private static void listarPorComportamento(Class<?> interfaceTipo, String tipoComportamento) {
        System.out.println("\n--- Lista de Animais " + tipoComportamento + "es ---");
        boolean encontrado = false;
        
        for (Animal a : animais) {
            
            if (interfaceTipo.isInstance(a)) {
                a.exibirDetalhes();
                
                if (a instanceof Corredor) {
                    ((Corredor) a).correr();
                } 
                if (a instanceof Nadador) {
                    ((Nadador) a).nadar();
                } 
                if (a instanceof Voador) {
                    ((Voador) a).voar();
                } 
                if (a instanceof Predador) {
                    ((Predador) a).cacar();
                }
                System.out.println("--------------------");
                encontrado = true;
            }
        }
        
        if (!encontrado) {
            System.out.println("Nenhum animal com o comportamento " + tipoComportamento + " encontrado.");
        }
    }

    private static void exibirTotalAnimais() {
        System.out.println("\n--- Total de Animais Cadastrados ---");
        System.out.println("Total: " + Animal.getContador()); 
    }
}
