package introducao;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//Variavel
		float n1,n2,n3,n4, diferenca;
		
		//Entrada de Dados
		System.out.println("Digite seu primeiro número");
		n1 = leia.nextFloat();
		
		System.out.println("Digite seu segundo número");
		n2 = leia.nextFloat();
		
		System.out.println("Digite seu terceiro número");
		n3 = leia.nextFloat();
		
		System.out.println("Digite seu quarto número");
		n4 = leia.nextFloat();
		
		//Lógica
		diferenca = (n1*n2) - (n3*n4);
		
		//Saída de Dados
		System.out.printf("A diferença entre o produto do n1 e o n2 pelo produto entre n3 e n4 é: " + diferenca);

	}

}
