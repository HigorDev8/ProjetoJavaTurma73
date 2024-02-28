package lacos_condicionais;

import java.util.Scanner;

public class LacoCondicionalSwitch5 {

	public static void main(String[] args) {
		
		int codProdut, quantidade;
		double valortotal;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o código do produto (1 a 6): ");
		codProdut  = leia.nextInt();
		
		System.out.println("Digite a quantidade comprada do produto: ");
		quantidade = leia.nextInt();
		
		valortotal = 0;
		String nomeProduto = "";
		
		switch (codProdut) {
		case 1:
			valortotal = quantidade * 10;
			
		nomeProduto = "Cachorro-Quente";
		break;
		
		case 2:
			valortotal = quantidade * 15;
			
		nomeProduto = "X-Salada";
		break;
		
		case 3:
			valortotal = quantidade * 18;
			
		nomeProduto = "X-Bacon";
		break;
		
		case 4:
			valortotal = quantidade * 12;
			
		nomeProduto = "Bauru";
		break;
		
		case 5:
			valortotal = quantidade * 8;
			
		nomeProduto = "Refrigerante";
		break;
		
		case 6:
			valortotal = quantidade * 13;
			
		nomeProduto = "Suco de Laranja";
		break;
		
		default:
			
			System.out.println("Código de Produto inválido.");
			
			return;
		}
		
		System.out.println("O valor total da conta é: R$" + valortotal);
		System.out.println("Produto coomprado: " + nomeProduto);
		
		leia.close();
	}

}
