package com.rafaeldeluca.vetor;

import java.lang.reflect.Array;

//<> operador diamante
//generics - definir com qual tipo de classe que desejamos que o vetor utilize já na declaração
//T é a simbologia de tipo
public class Lista<T> {	
	
	
	private T[] elements;
	private int size;	

	public Lista() {

	}
	
	@SuppressWarnings("unchecked")
	public Lista (int capacity) {
		
		this.elements = (T[]) new Object[capacity];
		this.size=0;
	}
	
	
	
	
	@SuppressWarnings("unchecked")
	public Lista (int capacity, Class<T> classType) {
		this.elements= (T[]) Array.newInstance(classType, capacity);
		this.size=0;

	}
	
	public int getSize() {
		return this.size;
	}


	public Object[] getElements() {
		return elements;
	}

	public void setElements(T[] elements) {
		this.elements = elements;
	}
	
	public boolean adiciona(T element)  {
		this.increaseCapacity();
		if (this.size < this.elements.length) {
			this.elements[this.size] = element;
			this.size++;
			return true;
		}
		return false;	
	}

	public boolean adiciona(int position, T element) {
		
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
	
	
	private void increaseCapacity() {
		if (this.size == this.elements.length) {
			@SuppressWarnings("unchecked")
			T[]newElements = (T[])new Object [this.elements.length*2];
			for (int i=0 ; i<this.elements.length; i++) {
				newElements[i]= this.elements[i];
			}
			this.elements= newElements;
		}
	}
	
	public void remove(int position) {
		if(position < 0 || position > this.size) {
			throw new IllegalArgumentException("Posição informada é inválida");
			}
		
		for (int i=position; i<this.size-1; i++) {
			this.elements[i]=this.elements[i+1];
		}
		this.size--;
	}
	
	// primeiro ve se o elemento existe no vetor e depois remove
	public void remove(T element) {
		int pos = this.busca(element);
		if (pos>-1) {
			this.remove(pos);
		}
	}
	
	public void limpar() {
		
		//opcao 1
		for(int i=0; i<this.size; i++) {
			this.elements[i]=null;
		}
		this.size=0;
		
		//opcao 2
		//this.elements = (T[]) new Object[this.elements.length];
		
		
		//opcao 3
		//this.size=0;
	}
	
	
	public T obtem(int position) {
		
		return this.search(position);
		
	}
	
	
	public T search(int position) {			

		if (!(position >=0 && position < size )) {
			throw new IllegalArgumentException("Informaste uma posição inválida. Posição informada menor que zero ou maior que o tamanho do vetor!");
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
	
	public boolean contem(T element) {
		int position = busca(element);
		if (position >= 0) {
			return true;			
		}		
		return false;
	
	}
	
	//iterar de trás pra frente porque quer a ultima vez que o elemento aparece na lista
	public int ultimoIndiceDe(T element) {
		
		for(int i=this.size-1; i>=0; i--) {
			if(this.elements[i].equals(element)){
				return i;
			}
		}
		return -1;
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
