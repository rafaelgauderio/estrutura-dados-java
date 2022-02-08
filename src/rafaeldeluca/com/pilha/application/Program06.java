package rafaeldeluca.com.pilha.application;

import java.util.Stack;

import com.rafaeldeluca.pilha.Pilha;

public class Program06 {

	public static void main(String[] args) {

		System.out.println("API java Stack");
		
		Pilha<Integer> pilhaPropria = new Pilha <Integer>();
		
		Stack<Integer> pilha = new Stack <Integer>();
		
		System.out.println("Pilha está vazia? " + pilha.isEmpty());
		
		pilha.add(15);
		pilha.add(7);
		pilha.add(33);
		pilha.add(22);
		
		System.out.println("Pilha está vazia? " + pilha.isEmpty());
		System.out.println("Tamanho da pilha: " +pilha.size());
		System.out.println(pilha);
		System.out.println("Espinado o topo: " + pilha.peek());
		System.out.println("Removendo o elemento do topo: " + pilha.pop());
		System.out.println("Adicionando elemento no topo:" + pilha.push(51));
		
		System.out.println("Pilha após as operações");
		System.out.println(pilha);
		
		
		
		
		
		
		

	}

}
