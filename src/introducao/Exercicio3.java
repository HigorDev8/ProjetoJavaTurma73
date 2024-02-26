package introducao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		float salBruto;
		float adNoturno;
		float horasExtras;
		float descontos;
		float salLiquido;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor do salário bruto: ");
		salBruto = leia.nextFloat();
		
		System.out.println("Digite o valor do adicional noturno: ");
		adNoturno = leia.nextFloat();
		
		System.out.println("Digite o número de horas extras trabalhadas: ");
		horasExtras = leia.nextFloat();
		
		System.out.println("Digite o valor total dos descontos: ");
		descontos = leia.nextFloat();
		
        salLiquido = salBruto + adNoturno + (horasExtras * 5) - descontos;
        
        System.out.println("O salário líquido do colaborador é: " + salLiquido);
        
        leia.close();
		
 	}

}
