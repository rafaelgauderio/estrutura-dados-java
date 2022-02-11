package com.rafaeldeluca.pilha.labs;

import java.util.Stack;

public class Exercicio07 {

	//Conveter de Decimal para binário
	//Conveter a partir de qualquer base, desde que até a base hexadecimal

	public static void main(String [] args ) {

		imprimeBinario(2);
		imprimeBinario(10);
		imprimeBinario(153);
		imprimeBinario(900);
		
		imprimeEmQualquerBase(900,16);
		imprimeEmQualquerBase(715,16);
		imprimeEmQualquerBase(500,8);
		imprimeEmQualquerBase(25,8);





	}

	public static void imprimeBinario(int numeroDecimal) {
		System.out.println(numeroDecimal + " convertido em binário: " + decimalParaBinario(numeroDecimal));

	}
	
	public static void imprimeEmQualquerBase(int numeroDecimal, int base) {
		System.out.println(numeroDecimal + " convertido na base " + base +  " é: " + decimalParaQualqueBase(numeroDecimal,base));

	}


	public static String decimalParaBinario(int numeroDecimal) {



		Stack<Integer> pilha = new Stack<Integer>();
		String numeroBinario = "";
		int restoDivisao;

		while(numeroDecimal >0) {
			restoDivisao = numeroDecimal %2;
			pilha.push(restoDivisao);
			numeroDecimal=numeroDecimal/2;

		}

		while(pilha.isEmpty()==false) {
			//desimpilhando para formar o binário
			numeroBinario += pilha.pop();
		}	


		return numeroBinario;


	}

	public static String decimalParaQualqueBase(int numeroDecimal,int base) {

		if (base > 16) {
			throw new IllegalArgumentException();
		}

		Stack<Integer> pilha = new Stack<Integer>();
		String numeroBase = "";
		int restoDivisao;
		String bases = "0123456789ABCDEF";

		while(numeroDecimal >0) {
			restoDivisao = numeroDecimal%base;
			pilha.push(restoDivisao);
			numeroDecimal=numeroDecimal/base;

		}

		while(pilha.isEmpty()==false) {
			//desimpilhando para formar o binário
			numeroBase = numeroBase + bases.charAt(pilha.pop());
		}	


		return numeroBase;


	}

}
