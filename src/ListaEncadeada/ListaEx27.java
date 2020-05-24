package ListaEncadeada;

public interface ListaEx27 {
	public boolean inserirAoFinal(int iI); // Retorna sucesso ou fracasso de inserir um n� ao final da lista;

	public int removerDoFinal(); // Retorna elemento removido do final da lista;

	public boolean ehVazia(); // Retorna flag informando se lista est� ou n�o vazia;

	public boolean ehPrimeiro(); // Retorna flag informando se � o primeiro n� da lista;

	public boolean ehUltimo(); // Retorna flag informando se � o �ltimo n� da lista;

	public int apresentarAtual(); // Retorna o elemento do n� corrente da lista;

	public int apresentarProximo(); // Retorna o elemento do pr�ximo n� da lista;

	public int apresentarAnterior(); // Retorna o elemento do n� anterior da lista;
}
