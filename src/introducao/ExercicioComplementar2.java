package introducao;

import java.util.Scanner;

public class ExercicioComplementar2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double pi = 3.14159;
		double raio;
		double area;
		
		System.out.print("Raio: ");
		raio = leia.nextDouble();
		
		area = pi * (raio * raio);
		System.out.print("Area: " + area);
		System.out.printf("Area: %.4f", area);
		
		leia.close();

	}

}
