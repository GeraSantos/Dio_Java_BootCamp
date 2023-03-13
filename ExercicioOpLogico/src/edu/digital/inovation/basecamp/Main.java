package edu.digital.inovation.basecamp;

public class Main {

	public static void main(String[] args) {
		
		boolean a = true;
		boolean b = false;
		
		System.out.println("a == b " + (a == b));
		System.out.println("a != b " + (a != b));
		//System.out.println("a >= b " + (a >= b)); não compila pela comparação de tamanho
		System.out.println("a == b  && a != b " + (a == b && a != b)); //conjunção && 
		System.out.println("a == b || a != b " + (a == b || a != b)); //Disjunção ||
		System.out.println("a == b ^ a != b " + (a == b ^ a != b)); // Disjunção exclusiva ^
		
		System.out.println(!b);

	}

}
