package entities;

import java.util.Locale;
import java.util.Scanner;

public class trabalho2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
		
		String nome;
		double salario;
		double taxa;
		
		System.out.println("Digite o seu nome: ");
		nome = sc.next();
        System.out.println("Digite o seu salario: ");
		salario = sc.nextDouble();
		System.out.println("Digite a taxa: ");
		taxa = sc.nextDouble();
		
		sc.close();

	}

}
