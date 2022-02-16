package com.rafaeldeluca.fila.labs;

public class Document {
	
	private String name;
	private int pageNumbers;
	
	public Document(String name, int pageNumbers) {
		super();
		this.name = name;
		this.pageNumbers = pageNumbers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPageNumbers() {
		return pageNumbers;
	}

	public void setPageNumbers(int pageNumbers) {
		this.pageNumbers = pageNumbers;
	}

	@Override
	public String toString() {
		return "Documents [name=" + name + ", pageNumbers=" + pageNumbers + "]";
	}
	
	
	
	
	

}
