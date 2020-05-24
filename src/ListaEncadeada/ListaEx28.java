package ListaEncadeada;

public interface ListaEx28 {
	public void inicializarLista(); // Inicializa n�;

	public Object proximoNo(); // Retorna o objeto a ser apresentado da Lista;

	public Object noAnterior(); // Retorna o objeto anterior ao que ser� apresentado da Lista;

	public boolean inserirCorrente(Object oO);// Retorna sucesso ou fracasso de inserir um n� na lista;

	public Object removerUltimo(); // Retorna o objeto removido da lista;

	public boolean ehVazia(); // Retorna flag informando se lista est� ou n�o vazia;

	public boolean ehPrimeiro(); // Retorna flag informando se � ou n�o primeiro da lista;

	public boolean ehUltimo(); // Retorna flag informando se � ou n�o �ltimo da lista;
}
