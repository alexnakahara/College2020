package ListaEncadeada;

public class ListaDE_Ex28 implements ListaEx28 {
	private NoDuplaString nsCabeca;
	private NoDuplaString nsNoProx;
	private NoDuplaString nsNoAnt;

	public ListaDE_Ex28() {
		nsCabeca = null;	
		nsNoProx = null;
		nsNoAnt = null;
	}

	public void inicializarLista() {
		nsNoProx = nsCabeca;
		nsNoAnt = null;
	}

	public Object proximoNo() {
		Object oO = new Object();

		if (nsNoProx == null)
			return null;
		oO = nsNoProx.getElement();
		nsNoAnt = nsNoProx;
		nsNoProx = nsNoProx.getNext();
		return oO;
	}

	public Object noAnterior() {
		Object oO = new Object();

		if (nsNoAnt == null)
			return null;
		oO = nsNoAnt.getElement();
		nsNoProx = nsNoAnt;
		nsNoAnt = nsNoAnt.getPrevious();
		return oO;
	}

	public boolean inserirCorrente(Object oO) {
		NoDuplaString nsNovo = new NoDuplaString(oO, null, null);

		if (nsCabeca == null) {
			nsNovo.setNext(null);
			nsNovo.setPrevious(null);
			nsNoProx = nsNovo;
			nsNoAnt = null;
			nsCabeca = nsNovo;
		} else {
			if (nsNoProx != null) {
				if (nsNoProx == nsCabeca) {
					nsNovo.setNext(nsNoProx);
					nsNovo.setPrevious(null);
					nsNoProx.setPrevious(nsNovo);
					nsNoProx = nsNovo;
					nsNoAnt = null;
					nsCabeca = nsNovo;
				} else {
					nsNovo.setNext(nsNoProx);
					nsNovo.setPrevious(nsNoAnt);
					nsNoProx.setPrevious(nsNovo);
					nsNoAnt.setNext(nsNovo);
					nsNoProx = nsNovo;
				}
			} else {
				nsNovo.setNext(null);
				nsNovo.setPrevious(nsNoAnt);
				nsNoAnt.setNext(nsNovo);
				nsNoProx = nsNovo;
			}
		}
		return true;
	}

	public Object removerUltimo() {
		Object oO = new Object();
		NoDuplaString nsRasc;

		if (nsNoAnt == null)
			return null;
		else {
			nsRasc = nsNoAnt.getPrevious();
			if (nsRasc == null) {
				if (nsNoProx != null)
					nsNoProx.setPrevious(null);
				nsCabeca = nsNoProx;
			} else {
				nsRasc.setNext(nsNoProx);
				if (nsNoProx != null)
					nsNoProx.setPrevious(nsRasc);
			}
			oO = nsNoAnt.getElement();
			nsNoAnt.setNext(null);
			nsNoAnt.setPrevious(null);
			nsNoAnt = nsRasc;
			return oO;
		}
	}

	public boolean ehVazia() {
		if (nsCabeca == null)
			return true;
		else
			return false;
	}

	public boolean ehPrimeiro() {
		if (nsNoAnt == null)
			return true;
		else
			return false;
	}

	public boolean ehUltimo() {
		if (nsNoProx == null)
			return true;
		else
			return false;
	}
}
