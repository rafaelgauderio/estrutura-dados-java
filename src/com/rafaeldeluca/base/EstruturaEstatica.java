package com.rafaeldeluca.base;

public class EstruturaEstatica<T> {

	protected T[] elements;
	protected int size;

	@SuppressWarnings("unchecked")
	public EstruturaEstatica(int capacity){
		this.elements = (T[]) new Object[capacity]; 
		this.size = 0;
	}

	public EstruturaEstatica() {
		//senão declarar o tamanho da estrutura. Inicializa com tamanho 15
		this(15);

	}
	
	public int tamanho() {
		return this.size;
	}

	public boolean estaVazia() {
		if(this.size==0) {
			return true;
		} else {
			return false;
		}
	}
	//protected vai ficar visível apenas para a classe e para as classes filhos
	protected boolean adiciona(T element)  {
		this.increaseCapacity();
		if (this.size < this.elements.length) {
			this.elements[this.size] = element;
			this.size++;
			return true;
		}
		return false;	
	}

	protected boolean adiciona(int position, T element) {

		if(!(position >=0 && position <= size) ) {
			throw new IllegalArgumentException("Posição informada é inválida");
		}

		this.increaseCapacity();

		for (int i=this.size-1; i>=position; i--) {
			this.elements[i+1]=this.elements[i];
		}
		this.elements[position]=element;
		this.size++;			
		return false;	
	}

	@SuppressWarnings("unchecked")
	private void increaseCapacity() {
		if (this.size == this.elements.length) {

			T[]newElements = (T[])new Object [this.elements.length*2];
			for (int i=0 ; i<this.elements.length; i++) {
				newElements[i]= this.elements[i];
			}
			this.elements= newElements;
		}
	}	
	
	protected void remove(int position) {
		if(position < 0 || position > this.size) {
			throw new IllegalArgumentException("Posição informada é inválida");
			}
		
		for (int i=position; i<this.size-1; i++) {
			this.elements[i]=this.elements[i+1];
		}
		this.size--;
	}




	@Override
	public String toString() {

		int i=0;
		StringBuilder string = new StringBuilder();
		string.append("\n");

		for (i=0; i<this.size-1; i++) {
			string.append(this.elements[i]);
			string.append("\n");
		}

		if (this.size>0) {
			string.append(this.elements[this.size-1]);
		}

		if(this.elements[i]==null) {
			return "[vazio]";
		}


		return string.toString();
	}


}
