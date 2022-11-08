package fiap_shift;

import java.util.Scanner;

public class Kilometragem{

	public static void main(String args[]){
	
	    int km;
	    int horas;
	    double media;
	  
	    Scanner leitor = new Scanner(System.in);
	    System.out.println("Bem vindo à calculadora de quilometragem! ");
	    System.out.println("Digite quantos quilômetros você percorreu hoje: ");
	    km = leitor.nextInt();
	    System.out.println("Agora informa por quantos horas você dirigiu: ");
	    horas = leitor.nextInt();
	    leitor.close();
	
	    media = km / horas;
	    System.out.println("Sua média foi de " + media + " km/h");
	    
	}
}