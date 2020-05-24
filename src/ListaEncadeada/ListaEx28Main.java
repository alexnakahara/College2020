package ListaEncadeada;

import javax.swing.*;

public class ListaEx28Main {

	public static ListaDE_Ex28 lista = new ListaDE_Ex28();

	public static String sIO, sTitle;
	public static String[] sSN = { "Sim", "N�o" };
	public static int iSN;
	public static String[] sOpcao = { "Inicializar Lista", "Pr�ximo N�", "N� Anterior", "Inserir N�", "Eliminar N�",
			"Sair" };
	public static int iOpcao;

	public static void main(String Args[]) {
		sTitle = "ALGED-Ex28-2�Semestre";
		sIO = "Listas Duplamente Encadeadas";
		JOptionPane.showMessageDialog(null, sIO, sTitle, JOptionPane.PLAIN_MESSAGE);

		do {
			sIO = "Selecione o bot�o da op��o desejada:";
			iOpcao = JOptionPane.showOptionDialog(null, sIO, sTitle, 1, JOptionPane.QUESTION_MESSAGE, null, sOpcao,
					null);
			switch (iOpcao) {
			case 0:
				inicializar_lista();
				break;
			case 1:
				proximo_no();
				break;
			case 2:
				no_anterior();
				break;
			case 3:
				inserir_corrente();
				break;
			case 4:
				eliminar_ultimo();
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

	public static void inicializar_lista() {
		if (lista.ehVazia())
			sIO = "Lista Vazia!";
		else {
			lista.inicializarLista();
			sIO = "Lista inicializada!";
		}
		JOptionPane.showMessageDialog(null, sIO, sTitle, JOptionPane.PLAIN_MESSAGE);
	}

	public static void proximo_no() {
		Object oO;

		sIO = "";
		if (lista.ehVazia())
			sIO = "Lista Vazia!";
		else {
			oO = lista.proximoNo();
			if (oO == null)
				sIO += "Lista Encerrada!";
			else {
				sIO += oO;
				if (lista.ehUltimo())
					sIO += "\n�ltimo N� da Lista!";
			}
		}
		JOptionPane.showMessageDialog(null, sIO, sTitle, JOptionPane.PLAIN_MESSAGE);
	}

	public static void no_anterior() {
		Object oO;

		sIO = "";
		if (lista.ehVazia())
			sIO = "Lista Vazia!";
		else {
			oO = lista.noAnterior();
			if (oO == null)
				sIO += "Lista Encerrada!";
			else {
				sIO += oO;
				if (lista.ehPrimeiro())
					sIO += "\nPrimeiro N� da Lista!";
			}
		}
		JOptionPane.showMessageDialog(null, sIO, sTitle, JOptionPane.PLAIN_MESSAGE);
	}

	public static void inserir_corrente() {
		String sS;
        sIO="Digite a String a ser inserida na Lista:";
		sS = JOptionPane.showInputDialog(null, sIO, sTitle, JOptionPane.QUESTION_MESSAGE);
		if (lista.inserirCorrente(sS))
			sIO = "Inser��o na Lista com Sucesso!";
		else
			sIO = "Problemas na Inser��o na Lista";
		JOptionPane.showMessageDialog(null, sIO, sTitle, JOptionPane.PLAIN_MESSAGE);
	}

	public static void eliminar_ultimo() {
		Object oO;

		sIO = "";
		if (lista.ehVazia())
			sIO = "Lista Vazia!";
		else {
			oO = lista.removerUltimo();
			if (oO == null)
				sIO = "N�o h� n� a ser eliminado";
			else {
				sIO += oO + "\nEliminado da Lista";
				lista.inicializarLista();
			}
		}
		JOptionPane.showMessageDialog(null, sIO, sTitle, JOptionPane.PLAIN_MESSAGE);
	}

}
