package ListaEncadeada;

import javax.swing.JOptionPane;

public class ListaEx26Main {
	public static ListaSE_Ex26 lista = new ListaSE_Ex26();
	public static String sIO, sTitle;
	public static String[] sSN = { "Sim", "Não" };
	public static int iSN;
	public static String[] sOpcao = { "Inserir Elemento", "Retirar Elemento", "Mostrar Ponteiro", "Mostrar Lista", "Apagar Lista", "Sair" };
	public static int iOpcao;

	public static void main(String Args[]) {
		sTitle = "ALGED-Ex26-2°.Semestre";
		sIO = "Listas Singularmente Encadeadas";
		JOptionPane.showMessageDialog(null, sIO, sTitle, JOptionPane.PLAIN_MESSAGE);

		do {
			lista.inicializarNo();
			sIO = "Selecione o botão da opção desejada:";
			iOpcao = JOptionPane.showOptionDialog(null, sIO, sTitle, 1, JOptionPane.QUESTION_MESSAGE, null, sOpcao,
					null);
			switch (iOpcao) {
			case 0:
				inserirFrase();
				break;
			case 1:
				retirarCaracter();
				break;
			case 2:
				mostrarFront();
				break;
			case 3:
				getList();
				break;
			case 4:
				apagarLista();
				break;
			case 5:
				sIO = "Deseja realmente sair?";
				iSN = JOptionPane.showOptionDialog(null, sIO, sTitle, 1, JOptionPane.QUESTION_MESSAGE, null, sSN, null);
				if (iSN == 1)
					iOpcao = -1;
				break;
			}
		} while (iOpcao != 5);

		System.exit(0);
	}

	public static void inserirFrase() {
		sIO = "Digite uma frase qualquer";
		
		String frase = JOptionPane.showInputDialog(null, sIO, sTitle, JOptionPane.QUESTION_MESSAGE);
		boolean isOk= false;
		
		for(int i=0; i< frase.length(); i++ ){  
	        char c = frase.charAt(i);  
	        System.out.println("char at "+ i +" index is: "+c);  
	        lista.inserirFinal(c);
	        
	        if(i == (frase.length() - 1)) {
	        	isOk = true;
	        	System.out.println("Caracter " + c );
	        }
		} 
		
		if (isOk && frase.length() > 0)
			sIO = "Inserção na Lista com sucesso!";
		else
			sIO = "Problemas na Inserção na Lista";
		JOptionPane.showMessageDialog(null, sIO, sTitle, JOptionPane.PLAIN_MESSAGE);
	}

	public static void retirarCaracter() {
		sIO = "Digite o caracter que deseja tirar da frase.";
		char caracter = JOptionPane.showInputDialog(null, sIO, sTitle, JOptionPane.QUESTION_MESSAGE).charAt(0);
		if (lista.ehVazia())
			sIO = "Lista Vazia!";
		else
			sIO = "Caracter" + lista.removerNo(caracter) + "removido com sucesso!";
		JOptionPane.showMessageDialog(null, sIO, sTitle, JOptionPane.PLAIN_MESSAGE);
	}
	
	public static void mostrarFront() {
		if (lista.ehVazia())
			sIO = "Lista Vazia!";
		else 
			sIO = "Mostrar - " + lista.apresentarNo();
		JOptionPane.showMessageDialog(null, sIO, sTitle, JOptionPane.PLAIN_MESSAGE);
	}
	
	public static void apagarLista() {
		if (lista.ehVazia())
			sIO = "Lista já está vazia não tem como apagar!";
		else 
			lista.apagarLista();
			sIO = "Lista deletada com sucesso!";
		JOptionPane.showMessageDialog(null, sIO, sTitle, JOptionPane.PLAIN_MESSAGE);
	}
	
	public static void getList() {
		if (lista.ehVazia())
			sIO = "Lista vazia!";
		else 
			sIO =  lista.getList();
		JOptionPane.showMessageDialog(null, sIO, sTitle, JOptionPane.PLAIN_MESSAGE);
	}
}
