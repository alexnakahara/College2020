package ListaEncadeada;

public class ListaSE_Ex26 {

	private NoSimplesChar nsCabeca;
	private NoSimplesChar nsCauda;
	private NoSimplesChar nsPonteiro;

	public	ListaSE_Ex26()
		{
			nsCabeca=null;
			nsCauda=null;
			nsPonteiro=null;
		}

	public void apagarLista() {
		NoSimplesChar nsProx;

		do {
			nsProx = nsCabeca.getNext();
			nsCabeca.setNext(null);
			nsCabeca = nsProx;
		} while (nsCabeca != null);
	}

	public void inicializarNo() {
		nsPonteiro = nsCabeca;
	}

	public char apresentarNo() {
		char cO;

		if (nsPonteiro == null)
			return '\0';
		cO = nsPonteiro.getElement();
		nsPonteiro = nsPonteiro.getNext();
		return cO;
	}

	public boolean inserirFinal(char cO) {
		NoSimplesChar nsNovo = new NoSimplesChar(cO, null);

		if (nsCabeca == null) {
			nsCabeca = nsNovo;
			nsCauda = nsNovo;
		} else {
			nsCauda.setNext(nsNovo);
			nsCauda = nsNovo;
		}
		return true;
	}

	public char removerNo(char cO) {
		NoSimplesChar nsAtual;
		NoSimplesChar nsAnterior;
		NoSimplesChar nsPosterior;
		char cRasc = '\0';

		nsAnterior = null;
		nsAtual = nsCabeca;
		while (nsAtual != null) {
			if (nsAtual.getElement() == cO) {
				nsPosterior = nsAtual.getNext();
				nsAtual.setNext(null);
				nsAtual = null;
				if (nsAnterior == null)
					nsCabeca = nsPosterior;
				else
					nsAnterior.setNext(nsPosterior);
				nsAtual = nsPosterior;
				cRasc = cO;
			} else {
				nsAnterior = nsAtual;
				nsAtual = nsAtual.getNext();
			}
		}
		return cRasc;
	}

	public boolean ehVazia() {
		if (nsCabeca == null)
			return true;
		else
			return false;
	}
	
	public String getList() {
		
		 char cab = nsCabeca.getElement();
		 char pont = nsPonteiro.getElement();
		 char cald = nsCauda.getElement();
		 
		 return "Lista: " + cab  + " " + pont+ " " + cald;
	}

}
