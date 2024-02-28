package lacos_repeticao;

import java.util.Scanner;

public class ExemploFor {

	public static void main(String[] args) {

		String nome;
		int contador;
		Scanner ler = new Scanner(System.in);
		
		//contador++ = contador = contador = 0 + 1
		// 0
		// 1
		// 2
		// 3 = Não é executado

		for(contador = 0; contador <= 2; contador++) {
			
			System.out.println("Digite o " + (contador + 1) + "º nome: ");
			nome = ler.nextLine();
			System.out.println("O "+ (contador + 1) + " nome é: " + nome + "\n");
		}
		
		System.out.println("Saí do loop");
		
		ler.close();
        
	}

}
