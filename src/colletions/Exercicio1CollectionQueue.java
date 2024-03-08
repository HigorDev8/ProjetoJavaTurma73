package colletions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class StringY {
	String name;


public StringY(String name) {
	this.name = name;
}

public String getName() {
	return name;
}
public class Exercicio1CollectionQueue {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Queue<StringY> fila = new LinkedList<>();
		
		int opcao;
		do {
			
			System.out.println("\nMenu: ");
			System.out.println("1. Adicionar um novo cliente na fila");
			System.out.println("2. Listar todos os clientes na fila");
			System.out.println("3. Chamar e retirar uma pessoa da fila");
			System.out.println("0. Sair do programa");
			System.out.println("Escolha uma opção: ");
			opcao = leia.nextInt();
			
			switch (opcao) {
			case 1:
				
				leia.nextLine();
				
				System.out.println("Digite o nome do cliente: ");
				
				String nomeCliente = leia.nextLine();
				fila.add(new StringY(nomeCliente));
				
				System.out.println("Cliente adicionado á fila.");
				
				break;
			case 2:
				if (fila.isEmpty())
					
				{
			
			System.out.println("A fila está vazia.");
		}else {
			System.out.println("Clientes na fila:");
			
			for (StringY cliente : fila) {
				
				System.out.println(cliente.getName());
			              }
		}
		
		break;
			case 3:
				if (fila.isEmpty())
				{
					
					System.out.println("A fila está vazia.");
				}else {
					StringY
					clienteChamado = fila.poll();
					
					System.out.println("Cliente chamado e retirado da fila: " + clienteChamado.getName());
				}
				
				break;
			case 0:
				
				System.out.println("Programa encerrado.");
				
				break;
				default:
					
					System.out.println("Opção inválida. Por favor, esclha uma opção válida.");
	}
			
		} while (opcao != 0);
		
		leia.close();

} 
}
}

