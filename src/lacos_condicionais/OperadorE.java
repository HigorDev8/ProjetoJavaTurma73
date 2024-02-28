package lacos_condicionais;

import java.util.Scanner;

public class OperadorE {

	public static void main(String[] args) {
		
//		int idade;
//		boolean carteiraM;
//		
//		Scanner leia = new Scanner(System.in);
//		
//		System.out.println("Digite sua idade: ");
//		idade = leia.nextInt();
//		
//		System.out.println("Você possui carteira de habilitação?: (true/false) ");
//		carteiraM = leia.nextBoolean();
//		
//		if (idade >= 18 && carteiraM == true) {
//			System.out.println("Você pode dirigir!");
//			
//		}else {
//			System.out.println("Você não pode dirigir!");
//		}
		
	// -------------- EXEMPLO 2 ------------
		
		
		
		Scanner leia = new Scanner(System.in);
		
		//Media para passar é 6
		//Entre 5 é exame
		//Menor que 5 é reprovado
		
		float nota1, nota2, media;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = leia.nextFloat();
		
		media = (nota1 + nota2) /2;
		
		if (media >= 6 ) {
			System.out.println("Parabéns, Aprovado!");
		}
		else if (media >= 5)
			System.out.println("Está de recuperação!");
	
		else {
			System.out.println("Está Reprovado!");
		}
		
		leia.close();
	}

}
