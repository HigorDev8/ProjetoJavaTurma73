package vetor_matriz;

import java.util.Scanner;

public class Exercicio1Vetor {

	public static void main(String[] args) {
		
		int vetor[] = {3, 8, 9, 5, 7, 6, 2, 10, 4, 1};
		
		int local = -1, valor;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o número que você deseja encontrar: ");
		valor = leia.nextInt();
		
		for (int indice = 0; indice < vetor.length; indice++) {
			
			if (vetor[indice] == valor) {
				local = indice;
			}
		}
		
		if (local >= 0) {
			System.out.println("\nO número " + valor + " está localizado na posição " + local);
		}else {
			System.out.println("\nO número " + valor + "não foi encontado!");
		}
		
				
				
			}
		
		
		
		
		
		
	}


