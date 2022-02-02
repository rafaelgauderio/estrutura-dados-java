package rafaeldeluca.com.pilha.application;

import com.rafaeldeluca.pilha.Pilha;

public class Program02 {

	public static void main(String[] args) {
		
		Pilha<Integer> pilha = new Pilha <Integer>();
		
		for(int i=10; i<25; i++) {
			pilha.empilha(i);
		}
		
		System.out.println(pilha);
		System.out.println("Tamanho da pilha: " +pilha.tamanho());
		
		

	}

}
