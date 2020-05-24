package ListaEncadeada;

public interface ListaEx28 {
	public void inicializarLista(); // Inicializa nó;

	public Object proximoNo(); // Retorna o objeto a ser apresentado da Lista;

	public Object noAnterior(); // Retorna o objeto anterior ao que será apresentado da Lista;

	public boolean inserirCorrente(Object oO);// Retorna sucesso ou fracasso de inserir um nó na lista;

	public Object removerUltimo(); // Retorna o objeto removido da lista;

	public boolean ehVazia(); // Retorna flag informando se lista está ou não vazia;

	public boolean ehPrimeiro(); // Retorna flag informando se é ou não primeiro da lista;

	public boolean ehUltimo(); // Retorna flag informando se é ou não último da lista;
}
