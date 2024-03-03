package colletions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioEstruturadeDados1 {

	public static void main(String[] args) {
		
		Queue<String>
		filaClientes = new LinkedList<>();
		
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		do {
			
			System.out.println("\n Menu: ");
			
			System.out.println("0 - Sair");
			
			System.out.println("1 - Adicionar cliente na fila");
			
			System.out.println("2 - Listar todos os clientes na fila");
			
			System.out.println("3 - Chamar próximo cliente da fila");
			
			System.out.println("Escolha uma opção: ");
			
			opcao = leia.nextInt();
			
			leia.nextLine();
			
			switch (opcao) {
			case 0:
				
				System.out.println("Programa finalizado.");
				
				break;
			case 1:
				
				System.out.println("Digite o nome do cliente: ");
				
				String nomeCliente = leia.nextLine();
				
				filaClientes.add(nomeCliente);
				
				System.out.println("Cliente " + nomeCliente + "adicionado á fila.");
				
				break;
			case 2:
				if (filaClientes.isEmpty()) {
					
					System.out.println("A fila está vazia.");
					
				}else {
					
					System.out.println("Clientes na fila: ");
					
					for (String cliente : filaClientes) {
						
						System.out.println(cliente);
					}
				}
				
				break;
			case 3:
				if (filaClientes.isEmpty()) {
					
					System.out.println("A fila está vazia. Não há clientes para chamar.");
					
				}else {
					String proximoCliente = filaClientes.poll();
					
					System.out.println("Cliente chamado : " + proximoCliente);
					
				}
				
				break;
				default:
				
				System.out.println("Opção inválida. Tente novamente.");
				
				break;
				}
		} while (opcao != 0);
		
		leia.close();

	}

}
