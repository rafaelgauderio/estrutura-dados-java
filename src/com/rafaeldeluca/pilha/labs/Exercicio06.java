package com.rafaeldeluca.pilha.labs;

import java.util.Stack;

import com.rafaeldeluca.pilha.Pilha;

public class Exercicio06 {


	//fazer um programa que verifica se uma equação está balanceada, ou seja, todos os parentes que foram abertos foram fechados.
	//empilhar e desempilhar todos os operadores abertos devem ser fechados

	public final static String ABRE ="([{";
	public final static String FECHA =")]}";

	public static void main(String [] args) {

		imprimeVerificacao(")A + B + C -D");
		imprimeVerificacao("X + Y}");
		imprimeVerificacao("(X + Y)");
		imprimeVerificacao(")X + Y");
		imprimeVerificacao("()[]{}");
		imprimeVerificacao("(X * 2 )+ {Y}");
		imprimeVerificacao("}");
		imprimeVerificacao("{[()]}[](){()}");
		imprimeVerificacao("{[(]}[](){()}");


	}
	
	
	
	public static void imprimeVerificacao(String equacao) {
		
		
		System.out.println(equacao + " está balaceada? " + verificaBalancementoSimbolos(equacao));
	}

	

	public static boolean verificaBalancementoSimbolos(String equacao) {

		Stack<Character> pilha = new Stack <Character>();
		int indice = 0;
		char sinal, topo;

		while(indice < equacao.length()) {

			sinal = equacao.charAt(indice);

			if (ABRE.indexOf(sinal) > -1) {
				pilha.push(sinal);
			} else if(FECHA.indexOf(sinal) > -1) {

				if(pilha.isEmpty()==true) {
					return false;
				} else {
					topo = pilha.pop();

					if (ABRE.indexOf(topo) != FECHA.indexOf(sinal)) {
						return false;
					}
				}
			}
			indice++;
			
		}

		return true;

	}	



}
