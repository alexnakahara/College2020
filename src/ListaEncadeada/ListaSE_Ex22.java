package ListaEncadeada;

public class ListaSE_Ex22 implements ListaEx22
{
	private	NoSimplesInt	nsInicio;
	private	NoSimplesInt 	nsFim;
	private	int				iTamanho;
	
	public	ListaSE_Ex22()
	{
		nsInicio=null;
		nsFim=null;
		iTamanho=0;
	}
	
	public	boolean	inserirAoFinal(int iI)
	{
		NoSimplesInt	nsNovo = new NoSimplesInt(iI, null);
		if(iTamanho==0)
		{
			nsInicio=nsNovo;
			nsFim=nsNovo;
		}
		else
		{
			nsFim.setNext(nsNovo);
			nsFim=nsNovo;
		}
		iTamanho++;
		return	true;
	}
	
	public	int	removerDoFinal()
	{
		int	iI;
		
		if(ehVazia())	return	-1;
		iI = nsFim.getElement();
		if(iTamanho==1)
		{
			nsInicio=null;
			nsFim=null;
			iTamanho--;
			return	iI;
		}
		else
		{
			NoSimplesInt	nsAux = new	NoSimplesInt();
			nsAux=nsInicio;
			while(nsAux.getNext()!= nsFim)	nsAux=nsAux.getNext();
			nsFim=nsAux;
			nsAux.setNext(null);
			iTamanho--;
			return	iI;
		}
	}
	
	public	boolean	ehVazia()
	{
		if(iTamanho==0)	return	true;
		else	return	false;
	}
}