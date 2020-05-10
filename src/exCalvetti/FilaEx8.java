package exCalvetti;

import javax.swing.*;

public class FilaEx8 {

//Declaração das variáveis globais
	public static int iTam = 10;
	public static char cFila[] = new char[iTam];
	public static int iSPos = 0;
	public static int iRPos = 0;
	public static String sIO, sTitle;
	public static String[] sSN = { "Sim", "Não" };
	public static int iSN;
	public static String[] sOpcao = { "Inserir Elemento", "Consultar Elemento", "Retirar Elemento", "Sair" };
	public static int iOpcao;

	public static void main(String Args[]) {
//Tela inicial
		sTitle = "ALGED-Ex08-2o.Semestre";
		sIO = "Filas - Implementação Baseada em Vetor (Conceitual)";
		JOptionPane.showMessageDialog(null, sIO, sTitle, JOptionPane.PLAIN_MESSAGE);
//Tela de menu
		do {
			sIO = "Selecione o botão da opção desejada:";
			iOpcao = JOptionPane.showOptionDialog(null, sIO, sTitle, 1, JOptionPane.QUESTION_MESSAGE, null, sOpcao,
					null);
			switch (iOpcao) {
			case 0:
				inserir_elemento();
				break;
			case 1:
				consultar_elemento();
				break;
			case 2:
				retirar_elemento();
				break;
			case 3:
				sIO = "Deseja realmente sair?";
				iSN = JOptionPane.showOptionDialog(null, sIO, sTitle, 1, JOptionPane.QUESTION_MESSAGE, null, sSN, null);
				if (iSN == 1)
					iOpcao = -1;
				break;
			}
		} while (iOpcao != 3);
//Termina execução
		System.exit(0);
	}

	public static void inserir_elemento() {
		String sDigitado;
		int iTamanho;
		if (isOver())
			sIO = "Fila Cheia!";
		else {
			iTamanho = size();
			sIO = "Digite o caractere a ser colocado na Fila:";
			sDigitado = JOptionPane.showInputDialog(null, sIO, sTitle, JOptionPane.QUESTION_MESSAGE);
			enQueue(sDigitado.charAt(sDigitado.length() - 1));
			sIO = "Este foi o " + (iTamanho + 1) + "o. caractere colocado na Fila com sucesso!";
		}
		JOptionPane.showMessageDialog(null, sIO, sTitle, JOptionPane.PLAIN_MESSAGE);
	}

	public static void consultar_elemento() {
		int iTamanho;
		iTamanho = size();
		if (iTamanho == 0)
			sIO = "Fila Vazia!";
		else
			sIO = "Tamanho da Fila: " + iTamanho + " caractere(s)\nCaractere na Frente da Fila: " + front();
		JOptionPane.showMessageDialog(null, sIO, sTitle, JOptionPane.PLAIN_MESSAGE);
	}

	public static void retirar_elemento() {
		int iTamanho;
		iTamanho = size();
		if (iTamanho == 0)
			sIO = "Fila Vazia!";
		else
			sIO = "Caractere retirado da Fila: " + deQueue();
		JOptionPane.showMessageDialog(null, sIO, sTitle, JOptionPane.PLAIN_MESSAGE);
	}

	public static void enQueue(char cC) {
		cFila[iSPos++] = cC;
	}

	public static char deQueue() {
		return cFila[iRPos++];
	}

	public static char front() {
		return cFila[iRPos];
	}

	public static int size() {
		return iSPos - iRPos;
	}

	public static boolean isOver() {
		if (iSPos >= cFila.length)
			return true;
		return false;
	}
}