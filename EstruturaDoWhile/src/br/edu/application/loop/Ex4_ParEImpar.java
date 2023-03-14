package br.edu.application.loop;

import java.util.Scanner;

public class Ex4_ParEImpar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int quantNumero;
		int numero;
		int quantPares = 0, quantImpares = 0;
		
		System.out.println("Quantidade de números: ");
		quantNumero = sc.nextInt();
		
		int count = 0;
		
		do {
			System.out.println("Numero: ");
			numero = sc.nextInt();
			
			if (numero % 2 == 0) quantPares++;
			else quantImpares++;
			
			count++;
		}while(count < quantNumero);
		
		
		System.out.println("Quantidade Par: " + quantPares);
		System.out.println("Quantidade Impar: " + quantImpares);
		
		
		
		sc.close();

	}

}
