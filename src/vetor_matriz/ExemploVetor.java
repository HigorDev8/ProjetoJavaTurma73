package vetor_matriz;

import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {
		
		//Vetor
		String cachorros[] = new String[3];
		// int numeros[] = new int[5];
		
		Scanner leia = new Scanner(System.in);
		int indice;
		
		// 0["Laika"] - 1["Sandy"] - 2["Spike"]
		for (indice = 0; indice < 3; indice++) {
			
			//sysout, ctrl + espaço
			System.out.println("Digite o " + (indice + 1) + "º nome: ");
			cachorros[indice] = leia.nextLine();
		}
		
		//cachorros.lenght = 3
		
		//lista os nomes
		for(indice = 0; indice < cachorros.length; indice++) {
		System.out.println("cachorros [" + indice + "]: " + cachorros[indice]);
	}

	}
}	
