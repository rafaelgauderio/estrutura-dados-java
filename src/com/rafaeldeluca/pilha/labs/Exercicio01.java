package com.rafaeldeluca.pilha.labs;

import com.rafaeldeluca.pilha.Pilha;

public class Exercicio01 {


	public static void main(String [] args) {

		//ler 10 n�mero de um vetor. Se for para empilhar, se for impar, desempilhar. 
		// mensagem se a pilha estiver vazia. Desempilhar todos os elementos se a pilha n�o estiver fazia

		int [] vetorInteiro = {1,2,3,4,6,12,14,13,16,20};

		Pilha<Integer> pilha = new Pilha<Integer>(1);

		for (int i=0; i<vetorInteiro.length; i++) { 
			System.out.println(vetorInteiro[i]);
		}
		
		System.out.println(pilha);


		for (int i=0; i<vetorInteiro.length; i++) {			

			if(vetorInteiro[i]%2==0) {
				System.out.println("N�mero lido � par. Empilhando n�mero par " + vetorInteiro[i]);
				pilha.empilha(vetorInteiro[i]);

			} else  {
				Integer numDesempilhado = pilha.topo();
				if(numDesempilhado == null) {
					System.out.println("A pilha est� vazia!");
				} else  {
					System.out.println("N�mero lido � impar. Desempilhando o elemento : " + pilha.desempilha());
				}
			} 

		}

		System.out.print("Pilha restante");
		System.out.println(pilha);

		
		System.out.println("\nDesempilhando toda a pilha restante.");
		while(!pilha.estaVazia()) {
			System.out.println("Desempilhando elemento: " + pilha.desempilha());
		}

		System.out.println("Agora a pilha est� vazia? " + pilha.estaVazia());



	}



}