package lacos_condicionais;

import java.util.Scanner;

public class LacoCondicionalSwitch6 {

	public static void main(String[] args) {
		 
		int codigoCargo;
		float salario, novoSalario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o nome do colaborador: ");
		String nomeColaborador = leia.nextLine();
		
		System.out.println("Digite o código do cargo do colaborador (1 a 6): ");
		
		codigoCargo = leia.nextInt();
		
		System.out.println("Digite o salário do colaborador: ");
		salario = leia.nextFloat();
		
		novoSalario = 0;
		String cargo = "";
		switch (codigoCargo) {
case 1:
			
			novoSalario = salario * 1.10f;
			cargo = "Gerente";
			break;
			
case 2:
			
			novoSalario = salario * 1.7f;
			cargo = "Vendedor";
			break;
			
case 3:
	
	novoSalario = salario * 1.09f;
	cargo = "Supervisor";
	break;
	
case 4:
	
	novoSalario = salario * 1.06f;
	cargo = "Motorista";
	break;
	
case 5:
	
	novoSalario = salario * 1.05f;
	cargo = "Estoquista";
	break;
	
case 6:
	
	novoSalario = salario * 1.08f;
	cargo = "Técnico de TI";
	break;
	default:
		
		System.out.println("Código de cargo inválido.");
		
		return;
		
		}
		System.out.println("Nome do colaborador: " + nomeColaborador);
		System.out.println("Cargo: " + cargo);
		System.out.println("Novo Salário: R$" + novoSalario);
		
		

	}

}
