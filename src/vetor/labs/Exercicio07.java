package vetor.labs;

import java.util.ArrayList;
import java.util.Scanner;


import com.rafaeldeluca.vetor.application.Contact;


//CRTL + F = find replace
//trocar ArrayList por ArrayList

public class Exercicio07 extends Exercicio06 {

	public static void main(String[] args) {

		// Criar um vetor com a capacidade para 25 contatos
		// criar 20 contatos no vetor via um loop
		// criar um menu

		Scanner sc = new Scanner(System.in);

		ArrayList<Contact> ArrayList = new ArrayList<Contact>(25);

		criarContatosDinamicamente(5,ArrayList);		

		int option=1;		

		while(option!=0) {

			option = obterOpcaoMenu(sc);

			switch (option) {

			case 1:
				adicionarContatoFinal(sc, ArrayList);
				break;
				
			case 2:
				adicionarContatoPosition(sc, ArrayList);
				break;
				
			case 3:
				obtemContatoDePosicaoEspeficica(sc, ArrayList);
				break;
			case 4:
				obtemContato(sc, ArrayList);
				break;	
			case 5:
				pesquisarUltimoIndide(sc, ArrayList);
				break;
			case 6:
				pesquisarContatoExiste(sc, ArrayList);
				break;
			case 7:
				excluirContatoPorPosicao(sc, ArrayList);
				break;
			case 8:
				excluirContato(sc, ArrayList);
				break;
			case 9:
				imprimeTamanhoVetor(ArrayList);
				break;
			case 10:
				limparVetor(ArrayList);
			case 11:
				imprimirVetor(ArrayList);

			}

		}		

		System.out.println("\n---PROGRAM CLOSE--");




	}

	
	
	public static void imprimeTamanhoVetor(ArrayList<Contact> ArrayList) {
		
		System.out.println("Size of vector of contacts is " + ArrayList.size());
		
	}



	public static void imprimirVetor(ArrayList<Contact> ArrayList) {
		System.out.println(ArrayList);
	}


	public static void limparVetor(ArrayList<Contact> ArrayList) {

		ArrayList.clear();
		System.out.println("Delete all data from vector");

	}
	

	public static void excluirContatoPorPosicao(Scanner sc, ArrayList<Contact> ArrayList) {

		int pos = lerInformacaoInt("Enter the position to be delete", sc);

		try {

			Contact contact = ArrayList.get(pos);
			ArrayList.remove(pos);

			System.out.println("Contact DELETE");



		} catch (Exception error) {
			System.out.println("Invalid position");
		}

	}




	public static void excluirContato(Scanner sc, ArrayList<Contact> ArrayList) {

		int pos = lerInformacaoInt("Enter the position to be delete", sc);

		try {

			Contact contact = ArrayList.get(pos);
			ArrayList.remove(contact);

			System.out.println("Contact DELETE");



		} catch (Exception error) {
			System.out.println("Invalid position");
		}

	}


	public static void pesquisarContatoExiste(Scanner sc, ArrayList<Contact> ArrayList) {


		int position = lerInformacaoInt("Enter the postion to be search", sc);


		try {

			Contact contact = ArrayList.get(position);

			boolean exist = ArrayList.contains(contact);

			if(exist==true) {
				System.out.println("Contact existe, printing contact information");
				System.out.println(contact);
			}

			else {
				System.out.println("Contact does NOT EXIST");
			}			


		} catch (Exception error) {
			System.out.println("Invalid position");
		}


	}

	public static void pesquisarUltimoIndide(Scanner sc, ArrayList<Contact> ArrayList) {

		int position = lerInformacaoInt("Enter the postion to be search", sc);


		try {

			Contact contact = ArrayList.get(position);

			System.out.println("Contact existe, printing contact information");
			System.out.println(contact);

			System.out.println("Searching last index of contact found");
			position = ArrayList.lastIndexOf(contact);

			System.out.println("Contact found in the position:" + position);

		} catch (Exception error) {
			System.out.println("Invalid position");
		}





	}


	public static void obtemContato(Scanner sc, ArrayList<Contact> ArrayList) {

		int position = lerInformacaoInt("Enter the postion to be search", sc);


		try {

			Contact contact = ArrayList.get(position);

			System.out.println("Contact exist, printing contact information");
			System.out.println(contact);

			System.out.println("Searching contact found");
			position = ArrayList.indexOf(contact);

			System.out.println("Contact found in the position:" + position);

		} catch (Exception error) {
			System.out.println("Invalid position");
		}

	}

	public static void obtemContatoDePosicaoEspeficica(Scanner sc, ArrayList<Contact> ArrayList) {

		int position = lerInformacaoInt("Enter the postion to be search", sc);


		try {

			Contact contact = ArrayList.get(position);

			System.out.println("Contact existe, printing contact information");
			System.out.println(contact);			

		} catch (Exception error) {
			System.out.println("Invalid position");
		}

	}


	public static void adicionarContatoPosition(Scanner sc, ArrayList<Contact> ArrayList) {

		System.out.println("Creating a contact, enter the information");
		String name = lerInformacao("Enter the name", sc);
		String phone = lerInformacao("Enter the phone", sc);
		String email = lerInformacao("Enter the email", sc);
		String address = lerInformacao("Enter the address: street and number", sc);

		Contact contact = new Contact(name, phone, email, address);

		int pos = lerInformacaoInt("Enter the POSTION to add contact", sc);

		try {

			ArrayList.add(contact);
			System.out.println("Contact created successfully");
			System.out.println(contact);

		} catch (Exception error) {
			System.out.println("Invalid position, contact NOT ADD");
		}



	}




	public static void adicionarContatoFinal(Scanner sc, ArrayList<Contact> ArrayList) {

		System.out.println("Creating a contact, enter the information");
		String name = lerInformacao("Enter the name", sc);
		String phone = lerInformacao("Enter the phone", sc);
		String email = lerInformacao("Enter the email", sc);
		String address = lerInformacao("Enter the address: street and number", sc);

		Contact contact = new Contact(name, phone, email, address);

		ArrayList.add(contact);

		System.out.println("Contact created successfully");
		System.out.println(contact);


	}


	protected static void criarContatosDinamicamente(int quantity, ArrayList<Contact> ArrayList) {

		//boa pratica não criar varias variáveis dentro de loops
		Contact contact;

		for(int i=1; i<=quantity; i++) {
			contact = new Contact();
			contact.setName("Contato: " +i);
			contact.setPhone("9999999"+i);
			contact.setEmail("contact" + i+"@gmail.com");
			contact.setAddress("Street " + i +", number: " +i);

			ArrayList.add(contact);
		}



	}



}
