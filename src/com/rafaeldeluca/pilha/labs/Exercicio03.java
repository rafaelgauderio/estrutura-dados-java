package com.rafaeldeluca.pilha.labs;

import com.rafaeldeluca.pilha.Pilha;

public class Exercicio03 {
	
	// criando uma pilha de Classe livro
	
	public static void main(String [] args) {
		
		Pilha<Livro> pilha = new Pilha <Livro>();
		
		Livro livro1 = new Livro();
		livro1.setAutor("Frederick P. Brooks Jr.");
		livro1.setAnoEdicao(2018);
		livro1.setT�tulo("O m�tico homem-m�s: ensaios sobre engenharia de software");
		livro1.setIsbn("8550802530");
		
		Livro livro2 = new Livro();
		livro2.setAutor("Richard Dawkins");
		livro2.setAnoEdicao(2007);
		livro2.setT�tulo("Deus um del�rio");
		livro2.setIsbn("9788535910704");
		
		System.out.println("Pilha de livros est� vazia? " + pilha.estaVazia());
		pilha.empilha(livro1);
		pilha.empilha(livro2);
		
		System.out.println("Pilha de livros est� vazia? " + pilha.estaVazia());
		System.out.println("Imprimindo a pilha de livros");
		System.out.println(pilha);
		System.out.println("Espiando o topo da pilha de livros: " + pilha.topo());
		System.out.println("Desempilhando a pilha de livros. Removendo a partir do topo");
		
		while(pilha.estaVazia()==false) {
			
			System.out.println("Removendo da pilha: " + pilha.desempilha().getT�tulo());
			
		}
		
		System.out.println("Pilha de livros est� vazia? " + pilha.estaVazia());		
			
				
		
		
	}

}
