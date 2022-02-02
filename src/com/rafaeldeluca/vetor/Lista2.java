package com.rafaeldeluca.vetor;

import com.rafaeldeluca.base.EstruturaEstatica;

public class Lista2<T> extends EstruturaEstatica<T> {

	public Lista2(int capacidade) {
		super(capacidade);
	}

	public Lista2() {
		super();
	}

	public boolean adiciona(T element) {
		return super.adiciona(element);
	}

	public boolean adiciona(int posicao, T element){
		return super.adiciona(posicao, element);
	}

	public void remove(int posicao){
		super.remove(posicao);
	}

	public T search(int position) {			

		if (!(position >=0 && position < size )) {
			throw new IllegalArgumentException("Informaste uma posição inválida. Posição informada menor que zero ou maior que o tamanho do estrutura!");
		}
		else {
			return this.elements[position];
		}		

	}

	public int busca(T element) {
		for (int i=0; i<this.size; i++) {
			if(this.elements[i].equals(element)) {
				return i ;
			}
		}
		return -1;

	}




}
