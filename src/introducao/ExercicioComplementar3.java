package introducao;

import java.util.Scanner;

public class ExercicioComplementar3 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int segundos, minutos, horas;
		
		System.out.println("Digite o valor");
		segundos = read.nextInt();
		
		horas = segundos/3600;
		segundos %= 3600;
		
		minutos = segundos/60;
		segundos %= 60;
		
		System.out.printf("Valor formatado: %d:%d;%d", horas, minutos, segundos);
		read.close();
		
		

	}

}
