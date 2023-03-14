package br.edu.application.loop;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tabuada: ");
		int tabuada = sc.nextInt();
		
		
		System.out.println("tabuada de " + tabuada);
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(tabuada + " x " + i + " = " + (tabuada*i));
		}
		
		sc.close();
	}

}
