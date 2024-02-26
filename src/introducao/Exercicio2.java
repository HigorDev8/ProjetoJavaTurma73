package introducao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		float nota1;
		float nota2;
		float nota3;
		float nota4;
		float media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira a primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Insira a segunda nota: ");
		nota2 = leia.nextFloat();
		
		System.out.println("Insira a terceira nota: ");
		nota3 = leia.nextFloat();
		
		System.out.println("Insira a quarta nota: ");
		nota4 = leia.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4) /4;
		
		System.out.printf("A média final do aluno é: %.1f " , media);
		
		leia.close();
	}

}
