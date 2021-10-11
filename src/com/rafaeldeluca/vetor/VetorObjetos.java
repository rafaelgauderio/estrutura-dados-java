package com.rafaeldeluca.vetor;

public class VetorObjetos {
	private Object [] elements;
	private int size;	

	public VetorObjetos() {

	}

	public VetorObjetos (int capacity) {
		this.elements= new Object[capacity];
		this.size=0;

	}	
	
	public int getSize() {
		return this.size;
	}


	public Object[] getElements() {
		return elements;
	}

	public void setElements(Object[] elements) {
		this.elements = elements;
	}
	
	public boolean adiciona(Object element)  {
		this.increaseCapacity();
		if (this.size < this.elements.length) {
			this.elements[this.size] = element;
			this.size++;
			return true;
		}
		return false;	
	}

	public boolean adiciona(int position, Object element) {
		
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
			Object [] newElements = new Object [this.elements.length*2];
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
		
		for (int i=position; i<this.size; i++) {
			this.elements[i]=this.elements[i+1];
		}
		this.size--;
	}
	
	
	public Object search(int position) {			

		if (!(position >=0 && position < size )) {
			throw new IllegalArgumentException("Informaste uma posição inválida. Posição informada menor que zero ou maior que o tamanho do vetor!");
		}
		else {
			return this.elements[position];
		}		

	}

	public int busca(Object element) {
		for (int i=0; i<this.size; i++) {
			if(this.elements[i].equals(element)) {
				return i ;
			}
		}
		return -1;

	}
	
	



	@Override
	public String toString() {

		StringBuilder string = new StringBuilder();
		string.append("\n");

		for (int i=0; i<this.size-1; i++) {
			string.append(this.elements[i]);
			string.append("\n");
		}

		if (this.size>0) {
			string.append(this.elements[this.size-1]);
		}

		
		return string.toString();
	}


}
