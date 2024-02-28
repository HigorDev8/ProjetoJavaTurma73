package lacos_repeticao;

import java.util.Scanner;

public class ExerLacoRepeticaoFor1 {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int numero1 = leia.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int numero2 = leia.nextInt();
		
		if (numero1 >= numero2) {
			
			System.out.println("Intervalo inválido, o primeiro número deve ser menor que o segundo: ");
			
			System.exit(0);
			
			System.out.println("Os múltiplos de 3 e 5 no intervalo [" + numero1 +  ", " + numero2 + "] são:");
			for (int i = numero1; i <= numero2; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					
				if (i % 3 == 0 && i % 5 == 0) {	
					
					System.out.println(i + "É multiplo de 3 e 5");
				}
			}
			
			leia.close();
			
			
			
		}
		
		
		
		
	}

	}
}
