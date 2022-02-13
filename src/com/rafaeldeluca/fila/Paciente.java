package com.rafaeldeluca.fila;

public class Paciente implements Comparable<Paciente>{

	
	private String nome;
	private int idade; //dar prioridade na fila quem tem mais idade e depois a ordem
	
	public Paciente() {
		
	}
	
	
	
	public Paciente(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	

	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public int compareTo(Paciente objeto) {
		
		if(this.idade > objeto.getIdade()) {
			return -1;
		} else if (this.idade < objeto.getIdade()) {
			return 1;
		}
		
		return 0; //caso tiver a mesma idade;
	}



	@Override
	public String toString() {
		return "Paciente [nome=" + nome + ", idade=" + idade + "]";
	}
	
	
	
	
	

}
