package rafaeldeluca.com.pilha.application;

import com.rafaeldeluca.pilha.Pilha;

public class Program05 {
	
	public static void main(String [] args) {
		
		Pilha<Object> pilha = new Pilha<>(20);
		
		pilha.empilha("Rafael");
		pilha.empilha(17);
		pilha.empilha(12);
		pilha.empilha(false);
		pilha.empilha('X');
		pilha.empilha(24.19);
		pilha.empilha("AC-DC");
		
		System.out.println(pilha);
		System.out.println("pilha é LIFO (Last In, First Out).\nÚltimo elemento a entrar no topo é o primeiro a sair na pilha.");		
		
		System.out.println("\nDesempilhando elemento do topo da pilha " + pilha.desempilha());
		
		System.out.println(pilha);
		
		
		
		
	}

}
