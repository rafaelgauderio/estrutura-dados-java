package rafaeldeluca.com.pilha.application;

import com.rafaeldeluca.pilha.Pilha;

public class Program03 {
	
	public static void main(String [] args) {
		
		Pilha<String> pilha = new Pilha<String>();
		Pilha<Integer> pilhaVazia = new Pilha<Integer>();
		
		System.out.println(pilhaVazia.estaVazia());
		
		pilha.empilha("Rafael");
		pilha.empilha("De Luca");
	
		System.out.println(pilha);
		System.out.println(pilha.estaVazia());
		
	}

}
