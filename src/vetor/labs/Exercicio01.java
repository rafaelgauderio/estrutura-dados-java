package vetor.labs;

import com.rafaeldeluca.vetor.Lista;

public class Exercicio01 {
	
	public static void main (String [] args) {
		
		Lista<String> lista = new Lista<String>(10);
		
		lista.adiciona("Rafael");
		lista.adiciona("De Luca");
		lista.adiciona("Atena");
		
		
		System.out.println(lista.contem("Juliana"));
		System.out.println(lista.contem("Rafael"));
		System.out.println(lista.contem("Atena"));
		
	}

}
