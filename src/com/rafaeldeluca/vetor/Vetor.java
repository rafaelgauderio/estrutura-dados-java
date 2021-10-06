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
				//Parar de executar o c�digo quando encontrar a primeira posi��o nula e n�o percorrer todo o vetor
				break;
			}
		}
	}
	 */

	//Para n�o precisar percorrer todo o vetor atr�s da primeiro posi��o nula eu atribuo um tamanho para o vetor
	public boolean adiciona(String element)  {

		//verificar se o tamanho � menor que a capacity de elementos do vetor
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

	//Usu�rio nao deve setar o tamano do vetor
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
		//range de posi��es inv�liadas
		//(position < 0 || position >= size)

		if (!(position >=0 && position < size )) {
			throw new IllegalArgumentException("Informaste uma posi��o inv�lida. Posi��o informada menor que zero ou maior que o tamanho do vetor!");
		}
		else {
			return this.elements[position];
		}		

	}

	//por ser string ter que usar o equal para comparar e n�o operador ==
	//buscar se o elemento existe

	public String busca(String element) {
		for (int i=0; i<this.size; i++) {
			if(this.elements[i].equalsIgnoreCase(element)) {
				return "O elemento existe na posicao " + (i+1) ;
			}
		}
		return "o Elemento N�O existe";

	}





	//Fazer um toString que imprima apenas os elementos do vetor preenchidos, nao imprimir as posi��es null
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
