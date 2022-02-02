package rafaeldeluca.com.pilha.application;

import com.rafaeldeluca.pilha.Pilha;

public class Program01 {

	public static void main(String[] args) {
	
		//Senão espeficicar o tamanho, instanciado com tamanho 15 definido no construtor
		Pilha<Integer> pilha = new Pilha<Integer>();

		System.out.println(pilha);
		System.out.println(pilha.tamanho());

	}

}
