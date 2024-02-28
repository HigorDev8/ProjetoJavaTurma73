package lacos_condicionais;

import java.util.Scanner;

public class LacoCondicional1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		int a = leia.nextInt();
		
		System.out.println("Digite o valor de B: ");
		int b = leia.nextInt();
		
		System.out.println("Digite o valor de C: ");
		int c = leia.nextInt();
		
		int soma = a + b;
		
		System.out.println("A soma de A + B é: " + soma);
		
		
		if (soma > c) {
			System.out.println("A soma de a e b é maior que c. ");
		} else if (soma < c) {
			System.out.println("A soma de a e b é menor que c.");
		} else {
			System.out.println("A soma de a e b é igual a c.");
			
			leia.close();
			
		}
		

	}

}
