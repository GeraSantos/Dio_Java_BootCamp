package one.digitalInovation;

public class Pilha {

    No refNoEntradaPilha = null;

	//Push
    
	public void push(No novoNo) {
		No refAuxiliar = refNoEntradaPilha;
		refNoEntradaPilha = novoNo;
		refNoEntradaPilha.setRefNo(refAuxiliar);
	}

	//Pop
	public No pop() {
		if(!isEmpty()) {
			No noPoped = refNoEntradaPilha.getRefNo();
			return noPoped;
		}
		return null;
	}
	/*
	public No top() {
		return refNoEntradaPilha;
	}
	*/
	//IsEmpty
	public boolean isEmpty() {
		return refNoEntradaPilha == null ? true : false;						
	}
     
	@Override
	public String toString() {
		
		String stringRetorno = "------------\n";
		stringRetorno += "    Pilha   \n";
		stringRetorno += "------------\n";
		No noAuxiliar = refNoEntradaPilha;
		while (true) {
			if (noAuxiliar != null) {
				stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
				noAuxiliar = noAuxiliar.getRefNo();
			}else {
				break;
			}
		}
		stringRetorno += "============\n";
		return stringRetorno;
	}
		
}
