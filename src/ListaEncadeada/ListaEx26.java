package ListaEncadeada;

public interface ListaEx26 {

	public void apagarLista(); // Apaga a lista

	public void inicializarNo(); // Inicializa nó;

	public char apresentarNo(); // Retorna char a ser apresentado da Lista;

	public boolean inserirNoAoFinal(char cO); // Retorna sucesso ou fracasso de inserir um nó no final da lista;

	public char removerNo(char cO); // Remove o no especificado da lista;

	public boolean ehVazia(); // Retorna flag informando se lista está ou não vazia;
	
	public String getList(); //Retorna a lista

}
