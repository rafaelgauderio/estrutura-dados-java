package com.rafaeldeluca.pilha.labs;

public class Livro {
	
	private String isbn;
	private String t�tulo;
	private int anoEdicao;
	private String autor;
	
	public Livro () {
		
	}

	public Livro(String isbn, String t�tulo, int anoEdicao, String autor) {
		super();
		this.isbn = isbn;
		this.t�tulo = t�tulo;
		this.anoEdicao = anoEdicao;
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getT�tulo() {
		return t�tulo;
	}

	public void setT�tulo(String t�tulo) {
		this.t�tulo = t�tulo;
	}

	public int getAnoEdicao() {
		return anoEdicao;
	}

	public void setAnoEdicao(int anoEdicao) {
		this.anoEdicao = anoEdicao;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Livro [isbn=" + isbn + ", t�tulo=" + t�tulo + ", anoEdicao=" + anoEdicao + ", autor=" + autor + "]";
	}

	
	
	
	
}
