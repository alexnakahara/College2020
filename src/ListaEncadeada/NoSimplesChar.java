package ListaEncadeada;

public class NoSimplesChar {
	private char cElemento;
	private NoSimplesChar nsProximo;

	public NoSimplesChar() {
		cElemento = '\0';
		nsProximo = null;
	}

	public NoSimplesChar(char cE, NoSimplesChar nsN) {
		cElemento = cE;
		nsProximo = nsN;
	}

	void setNext(NoSimplesChar nsN) {
		nsProximo = nsN;
	}

	char getElement() {
		return cElemento;
	}

	NoSimplesChar getNext() {
		return nsProximo;
	}
}
