package ListaEncadeada;

/*
 * ALGED - Lista Ex - 2o Sem - Ex27
 *
 *	Listas Duplamente Encadeadas
 */
public class ListaDE_Ex27 implements ListaEx27
{
	private	NoDuplaInt	nsInicio;
	private	NoDuplaInt 	nsFim;
	private	NoDuplaInt	nsPonteiro;
	private	int			iTamanho;
	
	public	ListaDE_Ex27()
	{
		nsInicio=null;
		nsFim=null;
		nsPonteiro=null;
		iTamanho=0;
	}
	
	public	boolean	inserirAoFinal(int iI)
	{
		NoDuplaInt	nsNovo = new NoDuplaInt(iI, null, null);
		if(iTamanho==0)
		{
			nsInicio=nsNovo;
			nsFim=nsNovo;
			nsPonteiro=nsNovo;
		}
		else
		{
			nsFim.setNext(nsNovo);
			nsNovo.setPrevious(nsFim);
			nsFim=nsNovo;
			nsPonteiro=nsInicio;
		}
		iTamanho++;
		return	true;
	}
	
	public	int	removerDoFinal()
	{
		int	iI;
		
		iI = nsFim.getElement();
		if(iTamanho==1)
		{
			nsInicio=null;
			nsFim=null;
			nsPonteiro=null;
			iTamanho--;
			return	iI;
		}
		else
		{
			nsFim=nsFim.getPrevious();
			nsFim.setNext(null);
			nsPonteiro=nsInicio;
			iTamanho--;
			return	iI;
		}
	}
	
	public	boolean	ehVazia()
	{
		if(iTamanho==0)	return	true;
		else	return	false;
	}

	public	boolean	ehPrimeiro()
	{
		if(nsPonteiro.getPrevious()==null)	return	true;
		else	return	false;
	}

	public	boolean	ehUltimo()
	{
		if(nsPonteiro.getNext()==null)	return	true;
		else	return	false;
	}


	public	int	apresentarAtual()
	{
		return	nsPonteiro.getElement();
	}

	public	int	apresentarProximo()
	{
		nsPonteiro=nsPonteiro.getNext();
		return	nsPonteiro.getElement();
	}
	
	public	int	apresentarAnterior()
	{
		nsPonteiro=nsPonteiro.getPrevious();
		return	nsPonteiro.getElement();
	}
}
