package lacos_repeticao;

import java.util.Scanner;

public class ExerlacoRepeticaoWhile3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade;
		int totalMenorque21 = 0;
		int totalMaiorque50 = 0;
		
		System.out.println("Digite as idades das pessoas (digite uma idade negativa para sair): ");
		
		idade = leia.nextInt();
		
		while (idade >= 0) {
			if (idade < 21) {
				
		totalMenorque21++;
			}else if (idade > 50) {
				
				totalMaiorque50++;
			}
			
			idade = leia.nextInt();
			
			System.out.println("Total de pessoas com idade menor que 21 anos: " + totalMenorque21);
			
			System.out.println("Total de pessoas com idade maior que 50 anos: " + totalMaiorque50);
			
			
			}
		}

	}


