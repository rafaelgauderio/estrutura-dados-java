package com.rafaeldeluca.pilha.labs;

import java.util.Arrays;
import java.util.Stack;

public class Exercicio04 {

	//criando um Stack de livros

	public static void main (String [] args) {

		Stack<Livro> pilha = new Stack <Livro>();


		System.out.println("Class Stack n�o usa um vetor. Implementa uma pilha usando um lista ligada (LinkedList), ou lista encadeada.\n"
				+ ",ou seja, aumenta o tamanho da pilha dinamicamente, n�o precisa instanciar um tamanho da pilha com a class Stack.\n");


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

		System.out.println("Pilha de livros est� vazia? " + pilha.isEmpty());
		pilha.push(livro1);
		pilha.push(livro2);

		System.out.println("Pilha de livros est� vazia? " + pilha.isEmpty());
		System.out.println("Imprimindo a pilha de livros");
		System.out.println(Arrays.asList(pilha));
		System.out.println("Espiando o topo da pilha de livros: " + pilha.peek());
		
		
		System.out.println("Desempilhando a pilha de livros. Removendo a partir do topo!");

		while(pilha.isEmpty()==false) {

			System.out.println("Removendo da pilha: " + pilha.pop().getT�tulo());

		}

		System.out.println("Pilha de livros est� vazia? " + pilha.isEmpty());	



	}

}
