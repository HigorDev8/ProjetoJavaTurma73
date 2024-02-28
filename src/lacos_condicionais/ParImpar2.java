package lacos_condicionais;

import java.util.Scanner;

public class ParImpar2 {

	public static void main(String[] args) {
		
		int n1;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira um Número: ");
		n1 = leia.nextInt();
		
		if (n1 % 2 == 0) {
			System.out.println(n1 + " É um número par.");
		}else { 
			System.out.println(n1 + " É um número ímpar");
		}
		 
		if (n1 > 0) {
			System.out.println(n1 + " É um número positivo.");
			
		}else if (n1 < 0) {
			System.out.println(n1 + " É um número negativo.");
			
		}else {
			System.out.println(n1 + " É zero.");
			
		}

	}

}
