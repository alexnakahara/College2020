package ListaEncadeada;

public interface ListaEx27 {
	public boolean inserirAoFinal(int iI); // Retorna sucesso ou fracasso de inserir um nó ao final da lista;

	public int removerDoFinal(); // Retorna elemento removido do final da lista;

	public boolean ehVazia(); // Retorna flag informando se lista está ou não vazia;

	public boolean ehPrimeiro(); // Retorna flag informando se é o primeiro nó da lista;

	public boolean ehUltimo(); // Retorna flag informando se é o último nó da lista;

	public int apresentarAtual(); // Retorna o elemento do nó corrente da lista;

	public int apresentarProximo(); // Retorna o elemento do próximo nó da lista;

	public int apresentarAnterior(); // Retorna o elemento do nó anterior da lista;
}
