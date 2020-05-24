package ListaEncadeada;

public class NoDuplaInt
{	
	private	int			iElemento;
	private	NoDuplaInt	nsAnterior;
	private	NoDuplaInt	nsProximo;

	public	NoDuplaInt()
	{
		iElemento=0;
		nsAnterior=null;
		nsProximo=null;
	}
	
	public	NoDuplaInt(int iE, NoDuplaInt nsA, NoDuplaInt nsP)
	{
		iElemento=iE;
		nsAnterior=nsA;
		nsProximo=nsP;
	}
	
	void		setPrevious(NoDuplaInt	nsA)
	{
		nsAnterior=nsA;
	}

	void		setNext(NoDuplaInt	nsP)
	{
		nsProximo=nsP;
	}
	
	int		getElement()
	{
		return	iElemento;
	}
	
	NoDuplaInt	getPrevious()
	{
		return	nsAnterior;
	}

	NoDuplaInt	getNext()
	{
		return	nsProximo;
	}
}
