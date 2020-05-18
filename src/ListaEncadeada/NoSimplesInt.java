package ListaEncadeada;

public class NoSimplesInt {
	private int iElemento;
	private NoSimplesInt nsProximo;

	public NoSimplesInt() {
		iElemento = 0;
		nsProximo = null;
	}

	public NoSimplesInt(int iE, NoSimplesInt nsN) {
		iElemento = iE;
		nsProximo = nsN;
	}

	void setNext(NoSimplesInt nsN) {
		nsProximo = nsN;
	}

	int getElement() {
		return iElemento;
	}

	NoSimplesInt getNext() {
		return nsProximo;
	}
}