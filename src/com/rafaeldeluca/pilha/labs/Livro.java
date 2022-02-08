package com.rafaeldeluca.pilha.labs;

public class Livro {
	
	private String isbn;
	private String título;
	private int anoEdicao;
	private String autor;
	
	public Livro () {
		
	}

	public Livro(String isbn, String título, int anoEdicao, String autor) {
		super();
		this.isbn = isbn;
		this.título = título;
		this.anoEdicao = anoEdicao;
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTítulo() {
		return título;
	}

	public void setTítulo(String título) {
		this.título = título;
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
		return "Livro [isbn=" + isbn + ", título=" + título + ", anoEdicao=" + anoEdicao + ", autor=" + autor + "]";
	}

	
	
	
	
}
