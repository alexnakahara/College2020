package exCalvetti;

import java.util.Arrays;

import javax.swing.*;

public class PilhaEx3Inversa {
	public static int iTAM = 10;
	public static char cPilha[] = new char[iTAM];
	public static int iPos = 10;
	public static String sIO, sTitle;
	public static String[] sSN = { "Sim", "Não" };
	public static int iSN;
	public static String[] sOpcao = { "Inserir Elemento", "Consultar Elemento", "Retirar Elemento", "Sair" };
	public static int iOpcao;

	public static void main(String Args[]) {
		// Tela inicial
		sTitle = "ALGED-Ex03-2°Semestre";
		sIO = "Pilhas - Stack";
		JOptionPane.showMessageDialog(null, sIO, sTitle, JOptionPane.PLAIN_MESSAGE);
		// Tela de menu
		do {
			sIO = "Selecione o botão da opção desejada:";
			iOpcao = JOptionPane.showOptionDialog(null, sIO, sTitle, 1, JOptionPane.QUESTION_MESSAGE, null, sOpcao,
					null);
			switch (iOpcao) {
			case 0:
				Inserir_Elemento();
				break;
			case 1:
				Consultar_Elemento();
				break;
			case 2:
				Retirar_Elemento();
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

	public static void Inserir_Elemento() {
		String sDigitado;
		char cCaractere;
		sIO = "Digite o caractere a ser colocado na Pilha:";
		sDigitado = JOptionPane.showInputDialog(null, sIO, sTitle, JOptionPane.QUESTION_MESSAGE);
		cCaractere = sDigitado.charAt(sDigitado.length() - 1);
		if (Push(cCaractere) == 0)
			sIO = "Pilha Cheia. Caractere não colocado na Pilha!";
		else
			sIO = "Caractere colocado na Pilha com sucesso!";
		System.out.println("Array --- " + Arrays.toString(cPilha));
		JOptionPane.showMessageDialog(null, sIO, sTitle, JOptionPane.PLAIN_MESSAGE);
	}

	public static void Consultar_Elemento() {
		int iTamanho;
		char cCaractere;
		iTamanho = Size();
		if (iTamanho == 10)
			sIO = "Pilha Vazia!";
		else {
			cCaractere = Top();
			sIO = "Tamanho da Pilha: " + iTamanho + "\nTopo da Pilha: " + cCaractere;
		}
		JOptionPane.showMessageDialog(null, sIO, sTitle, JOptionPane.PLAIN_MESSAGE);
	}

	public static void Retirar_Elemento() {
		char cCaractere;
		cCaractere = Pop();
		if (cCaractere == 10)
			sIO = "Pilha Vazia!";
		else
			sIO = "Caractere retirado da Pilha: " + cCaractere;
		JOptionPane.showMessageDialog(null, sIO, sTitle, JOptionPane.PLAIN_MESSAGE);
	}

	public static char Push(char cC) {
		if (iPos <= 0)
			return 0;
		return cPilha[--iPos] = cC;
	}

	public static char Pop() {
		if (iPos == 10)
			return 0;

		return cPilha[++iPos];
	}

	public static int Size() {
		return iPos;
	}

	public static char Top() {
		return cPilha[iPos];
	}
}
