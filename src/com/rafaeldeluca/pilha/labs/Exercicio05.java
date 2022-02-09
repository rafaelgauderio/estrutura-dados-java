package com.rafaeldeluca.pilha.labs;

import java.util.Stack;

public class Exercicio05 {

	//Verificar se a palavra informada é uma String

	public static void main(String [] args) {
		
		imprimirVerificacao("ADA");
		imprimirVerificacao("aDa");
		imprimirVerificacao("Rafael");
		imprimirVerificacao("ANA");
		imprimirVerificacao("Juliana");
		imprimirVerificacao("mirim");
		imprimirVerificacao("reviver");


	}

	public static boolean verificarPalindromo(String palavra) {

		Stack<Character> pilha = new Stack<>();

		for (int i=0; i<palavra.length(); i++) {

			pilha.push(palavra.charAt(i));

		}

		String palavraInvertida = "";

		while(pilha.isEmpty()==false) {
			palavraInvertida = palavraInvertida + pilha.pop();
		}
		//comparar se a palavra invertida é igual a original
		if (palavraInvertida.equalsIgnoreCase(palavra)) {
			return true;
		} else {
			return false;
		}



	}

	public static void imprimirVerificacao(String palavra) {

		String resposta = "";
		boolean verificacao = verificarPalindromo(palavra);
		if(verificacao==true) {
			resposta="Sim";
		} else {
			resposta="Não";
		}
		
		System.out.println(palavra + " é um palindromo? " + resposta.toUpperCase());

	}
}
