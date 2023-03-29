package edu.dio.inovation.arrays;

public class Ex1_OrdemInversa {

	public static void main(String[] args) {
		
		/* crie um vetor de 6 elementos inteiros
		 * e mostre-os na ordem inversa
		 */
		int[] vetor = {-5, -6, 15, 58, 8, 4};
		
		System.out.print("Vetor: ");
		
		//forma utilizada para mostrar os elementos do array.
		//length mostra o tamanho do array
		int count = 0;
		while(count < (vetor.length)) {
			System.out.print(vetor[count] + " ");
			count++;
		}
		
		//mostra o array de forma decrescente.
		System.out.print("\nVetor: ");
		for (int i = (vetor.length) - 1; i >= 0; i--) {
			System.out.print(vetor[i] + " ");
			
		}
		
	}
}
