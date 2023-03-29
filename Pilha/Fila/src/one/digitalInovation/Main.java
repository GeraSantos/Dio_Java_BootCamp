package one.digitalInovation;

public class Main {

	public static void main(String[] args) {
		
		Fila minhaFila = new Fila();
		
		minhaFila.enqueue(new No("Primeiro"));
		minhaFila.enqueue(new No("Segundo"));
		minhaFila.enqueue(new No("Terceiro"));
		minhaFila.enqueue(new No("Quarto"));
		minhaFila.enqueue(new No("Quinto"));
		minhaFila.enqueue(new No("Sexto"));
		
		System.out.println(minhaFila);
		
		System.out.println(minhaFila.dequeue());
		
		minhaFila.enqueue(new No("Ultimo"));
		
		System.out.println(minhaFila);
		
		System.out.println(minhaFila.first());
		
		System.out.println(minhaFila);
		
	}

}
