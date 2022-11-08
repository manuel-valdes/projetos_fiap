package fiap_shift;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Greeting {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		String nome = leitor.next();
		System.out.println("Bem vindo, " + nome);
		JOptionPane.showInputDialog(null, nome);
		leitor.close();

	}
}
