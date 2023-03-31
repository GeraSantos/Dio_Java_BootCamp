package one.digitalInovation;

public class ListaDuplamenteEncadeada<T> {

	private NoDuplo<T> primeiroNo;
	private NoDuplo<T> ultimoNo;
	
	private int tamanhoLista;
	
	public ListaDuplamenteEncadeada() {
		this.primeiroNo = null;
		this.ultimoNo = null;
		this.tamanhoLista = 0;
	}
	
	//método get
	public T get(int index) {
		return this.getNo(index).getConteudo();
	}
	
	//método getNo será utilizado em outros métodos
	private  NoDuplo<T> getNo(int index){
		NoDuplo<T> noAuxiliar = primeiroNo;
		for(int i = 0; (i < index)&& (noAuxiliar != null); i++) {
			noAuxiliar = noAuxiliar.getNoProximo();
		}
		return noAuxiliar;	
	}
	
	public int size(){
		return tamanhoLista;
	}
	
}
