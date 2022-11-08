package fiap_shift;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o primeiro valor: ");
		float valor1 = leitor.nextFloat();
		System.out.println("Digite o segundo valor: ");
		float valor2 = leitor.nextFloat();
		leitor.close();

		float soma = valor1 + valor2;
		float sub = valor1 - valor2;
		float multiplicacao = valor1 * valor2;
		float divisao = valor1 / valor2;

		System.out.println("Soma: " + soma);
		System.out.println("Subtração: " + sub);
		System.out.println("Multiplicação : " + multiplicacao);
		System.out.println("Divisão: " + divisao);
		
	}
	
}
