package exCalvetti;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class FilaCircularEx21 {
	public static int iTam = 10;
	public static String cFila[] = new String[iTam];
	public static int iSPos = 0;
	public static int iRPos = 0;
	public static boolean bQueueFull = false;
	public static String sIO, sTitle;
	public static String[] sSN = { "Sim", "Não" };
	public static int iSN;
	public static String[] sOpcao = { "Inserir Elemento", "Consultar Elemento", "Retirar Elemento", "Sair" };
	public static int iOpcao;

	public static void main(String Args[]) {
		sTitle = "ALGED-Ex21-2°Semestre";
		sIO = "Filas Circulares - Implementação Baseada em Vetor (Conceitual)";
		JOptionPane.showMessageDialog(null, sIO, sTitle, JOptionPane.PLAIN_MESSAGE);

		do {
			sIO = "Selecione o botão da opção desejada:";
			iOpcao = JOptionPane.showOptionDialog(null, sIO, sTitle, 1, JOptionPane.QUESTION_MESSAGE, null, sOpcao,
					null);
			switch (iOpcao) {
			case 0:
				inserirNome();
				break;
			case 1:
				consultarNome();
				break;
			case 2:
				retirarNome();
				break;
			case 3:
				sIO = "Deseja realmente sair?";
				iSN = JOptionPane.showOptionDialog(null, sIO, sTitle, 1, JOptionPane.QUESTION_MESSAGE, null, sSN, null);
				if (iSN == 1)
					iOpcao = -1;
				break;
			}
		} while (iOpcao != 3);
		System.exit(0);
	}

	public static void inserirNome() {
		String sDigitado;
		if (isOver())
			sIO = "Fila Circular Cheia!";
		else {
			sIO = "Digite o nome a ser colocado na Fila Circular:";
			sDigitado = JOptionPane.showInputDialog(null, sIO, sTitle, JOptionPane.QUESTION_MESSAGE);
			enQueueC(sDigitado);
			sIO = "Nome colocado na Fila Circular com sucesso!";
		}
		System.out.println(Arrays.toString(cFila));
		JOptionPane.showMessageDialog(null, sIO, sTitle, JOptionPane.PLAIN_MESSAGE);
	}

	public static void consultarNome() {
		int iTamanho;
		iTamanho = size();
		if (iTamanho == 0)
			sIO = "Fila Circular Vazia!";
		else
			sIO = "Tamanho da Fila Circular: " + iTamanho + " nomes(s)\nNome na Frente da Fila Circular: "
					+ front();
		JOptionPane.showMessageDialog(null, sIO, sTitle, JOptionPane.PLAIN_MESSAGE);
	}

	public static void retirarNome() {
		int iTamanho;
		iTamanho = size();
		if (iTamanho == 0)
			sIO = "Fila Circular Vazia!";
		else
			sIO = "Caractere retirado da Fila Circular: " + deQueueC();
		JOptionPane.showMessageDialog(null, sIO, sTitle, JOptionPane.PLAIN_MESSAGE);
	}

	public static void enQueueC(String cC) {
		cFila[iSPos++] = cC;
		if (iSPos >= cFila.length)
			iSPos = 0;
		if (iSPos == iRPos)
			bQueueFull = true;
	}

	public static String deQueueC() {
		int iIndice = iRPos++;
		if (iRPos >= cFila.length)
			iRPos = 0;
		bQueueFull = false;
		return cFila[iIndice];
	}

	public static String front() {
		return cFila[iRPos];
	}

	public static int size() {
		if (iSPos >= iRPos && !bQueueFull)
			return iSPos - iRPos;
		else
			return iSPos + cFila.length - iRPos;
	}

	public static boolean isOver() {
		if (iSPos == iRPos && bQueueFull)
			return true;
		return false;
	}
}
