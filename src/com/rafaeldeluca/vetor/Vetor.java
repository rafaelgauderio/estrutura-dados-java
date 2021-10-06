package com.rafaeldeluca.vetor;

import java.util.Arrays;

public class Vetor {

	private String [] elements;
	private int size;	

	public Vetor() {

	}

	public Vetor (int capacity) {
		this.elements= new String[capacity];
		this.size=0;// inicializa o vetor com tamanho zero

	}	

	/*
	public void adiciona(String element ) {
		for (int i=0; i< this.elements.length; i ++) {
			if(this.elements[i]==null) {
				this.elements[i] = element;
				//Parar de executar o código quando encontrar a primeira posição nula e não percorrer todo o vetor
				break;
			}
		}
	}
	 */

	//Para não precisar percorrer todo o vetor atrás da primeiro posição nula eu atribuo um tamanho para o vetor
	public boolean adiciona(String element)  {

		//verificar se o tamanho é menor que a capacity de elementos do vetor
		if (this.size < this.elements.length) {

			this.elements[this.size] = element;
			this.size++;
			return true;
		}
		else {
			return false;
		}		

	}

	public int getSize() {
		return this.size;
	}

	//Usuário nao deve setar o tamano do vetor
	/*
	public void setSize(int size) {
		this.size = size;
	}	*/

	public String[] getElements() {
		return elements;
	}

	public void setElements(String[] elements) {
		this.elements = elements;
	}


	public String search(int position) {	
		//range de posições inváliadas
		//(position < 0 || position >= size)

		if (!(position >=0 && position < size )) {
			throw new IllegalArgumentException("Informaste uma posição inválida. Posição informada menor que zero ou maior que o tamanho do vetor!");
		}
		else {
			return this.elements[position];
		}		

	}

	//por ser string ter que usar o equal para comparar e não operador ==
	//buscar se o elemento existe

	public String busca(String element) {
		for (int i=0; i<this.size; i++) {
			if(this.elements[i].equalsIgnoreCase(element)) {
				return "O elemento existe na posicao " + (i+1) ;
			}
		}
		return "o Elemento NÃO existe";

	}





	//Fazer um toString que imprima apenas os elementos do vetor preenchidos, nao imprimir as posições null
	@Override
	public String toString() {

		StringBuilder string = new StringBuilder();
		string.append("[");

		for (int i=0; i<this.size-1; i++) {
			string.append(this.elements[i]);
			string.append(", ");
		}

		if (this.size>0) {
			string.append(this.elements[this.size=1]);
		}

		string.append("]");

		return string.toString();
	}





}
