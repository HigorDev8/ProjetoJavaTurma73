package lacos_repeticao;

import java.util.Scanner;

public class ExerlacoRepeticaoDoWhile5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		int somaPositivos = 0;
		
		
		
		do {
			
			System.out.println("Digite um número (digite 0 para encerrar)");
			
			numero = leia.nextInt();
			
			if (numero != 0)
				
			if (numero > 0 ) {
				
				somaPositivos += numero;
			}
		 } while (numero != 0);
		 
		 System.out.println("A soma dos números positivos digitados é: " + somaPositivos);
			
			
		}

	}



