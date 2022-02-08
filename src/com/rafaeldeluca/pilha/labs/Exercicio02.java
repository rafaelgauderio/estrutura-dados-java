package com.rafaeldeluca.pilha.labs;

import java.util.Scanner;

import com.rafaeldeluca.pilha.Pilha;

public class Exercicio02 {

	public static void main(String [] args)  {

		//Dar entrada em 10 números. empilhar na pilha de par se par. empilhar na pilha de impar de for impar.
		//Desempilhas das duas pilhas se for ZERO.
		//Depois esvaziar as duas pilhas e verificar se estão vazias mesmo

		Pilha <Integer> pilhaPar = new Pilha<Integer>();
		Pilha <Integer> pilhaImpar = new Pilha<Integer>();

		Scanner scan = new Scanner(System.in);
		System.out.println("Informe 8 números inteiros");
		int num=0;
		for (int i=1; i<=8; i++) {
			try {
				System.out.print("Informe um número:");
				String entrada = scan.nextLine();			
				num = Integer.parseInt(entrada);
			} catch (Exception erro) { 

				System.out.println("Entrada inválida. Informe um número inteiro.");
			}
			if(num==0) {

				//pilha par
				Integer numDesempilhado = pilhaPar.desempilha();
				if (numDesempilhado==null) {
					System.out.println("A pilha par está vazia");
				} else {
					System.out.println("Desempilhando da pilha PAR: " + numDesempilhado);
				}

				//pilha impar
				numDesempilhado = pilhaImpar.desempilha();
				if (numDesempilhado==null) {
					System.out.println("A pilha impar está vazia");
				} else {
					System.out.println("Desempilhando da pilha ÍMPAR: " + numDesempilhado);
				} 


			} else if(num% 2 ==0) {
				System.out.println("Número informado é par, empilha na pilha PAR " +num );
				pilhaPar.empilha(num);
			} else {
				System.out.println("Número informado é ímpar, empilha na pilha ÍMPAR: " +num );
				pilhaImpar.empilha(num);
			}


		}


		while(!pilhaPar.estaVazia()) {
			System.out.println("Desempilhar da pilhar PAR: " + pilhaPar.desempilha());
		}

		while(!pilhaImpar.estaVazia()) {
			System.out.println("Desempilhar da pilha ÍMPAR: " + pilhaImpar.desempilha());
		}
		
		System.out.println("Pilha PAR está vazia? " + pilhaPar.estaVazia());
		System.out.println("Pilha ÍMPAR está vazia? " + pilhaImpar.estaVazia());


		scan.close();

	}


}
