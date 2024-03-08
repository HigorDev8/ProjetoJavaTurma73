package metodos_Exemplo;

import metodos_Exemplo.ExemploMetodo02;

public class ExemploMetodo01 {

	public static void main(String[] args) {
		
		int resultado = somar(2,5); // resultado = 7
		
		
		System.out.println("O primeiro resultado é: " + resultado );
		System.out.println("O segundo resultado é: " + somar(8,3));
		
		ExemploMetodo02.mensagem();
		
		ExemploMetodo02.saudacao("Oi, sei lá kkkkkkk");
		ExemploMetodo02.saudacao("Bom dia");
		
		
    }
	
	// valor1 + valor2 = resultado
	public static int somar(int num1, int num2) {
		return num1 + num2;
	}
	

}