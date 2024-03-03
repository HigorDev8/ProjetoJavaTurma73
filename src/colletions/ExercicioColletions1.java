package colletions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExercicioColletions1 {

	public static void main(String[] args) {
		
		ArrayList<String>
		
		cores = new ArrayList<>();
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite cinco cores: ");
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Cor " + (i + 1) + ": ");
			
			String cor = leia.nextLine();
			cores.add(cor);
		}
		
		System.out.println("\nTodas as cores adicionadas: ");
		for (String cor: cores) {
			
			System.out.println(cor);
		}
		
		Collections.sort(cores);
		
		System.out.println("\nCores ordenadas em ordem crescente: ");
		for (String cor: cores) {
			
			System.out.println(cor);
		}
		
		leia.close();
	}

}
