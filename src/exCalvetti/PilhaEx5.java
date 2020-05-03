package exCalvetti;

import javax.swing.*;
import java.util.Arrays;

public class PilhaEx5 {
	public static int iTAM = 9;
	public static int cPilha[] = new int[iTAM];
	public static int iPos = 0;
	public static String sIO, sTitle;
	public static String[] sSN = { "Sim", "Não" };
	public static int iSN;
	public static String[] sOpcao = { "Inserir Elemento", "Consultar Elemento", "Retirar Elemento", "Sair" };
	public static int iOpcao;

	public static void main(String Args[]) {
		// Tela inicial
		sTitle = "ALGED-Ex05-2°.Semestre";
		sIO = "Pilhas - Stack";
		JOptionPane.showMessageDialog(null, sIO, sTitle, JOptionPane.PLAIN_MESSAGE);
		// Tela de menu
		do {
			sIO = "Selecione o botão da opção desejada:";
			iOpcao = JOptionPane.showOptionDialog(null, sIO, sTitle, 1, JOptionPane.QUESTION_MESSAGE, null, sOpcao,
					null);
			switch (iOpcao) {
			case 0:
				InserirNumero();
				break;
			case 1:
				ConsultarNumero();
				break;
			case 2:
				RetirarNumero();
				break;
			case 3:
				sIO = "Deseja realmente sair?";
				iSN = JOptionPane.showOptionDialog(null, sIO, sTitle, 1, JOptionPane.QUESTION_MESSAGE, null, sSN, null);
				if (iSN == 1)
					iOpcao = -1;
				break;
			}
		} while (iOpcao != 3);
		// Termina execução
		System.exit(0);
	}

	private static void InserirNumero() {

		sIO = "Digite um número para ser colocado na Pilha:";
		int sDigitado = Integer.parseInt(JOptionPane.showInputDialog(null, sIO, sTitle, JOptionPane.QUESTION_MESSAGE));
		if (Push(sDigitado) == cPilha.length - 1)
			sIO = "Pilha Cheia. Número não colocado na Pilha!";
		else
			sIO = "Número colocado na Pilha com sucesso!";
		JOptionPane.showMessageDialog(null, sIO, sTitle, JOptionPane.PLAIN_MESSAGE);
		System.out.println("Array --- " + Arrays.toString(cPilha));
	}

	public static void ConsultarNumero() {
		int iTamanho;
		int number;
		iTamanho = Size();
		if (iTamanho == 0)
			sIO = "Pilha Vazia!";
		else {
			number = Top();
			sIO = "Tamanho da Pilha: " + iTamanho + "\nTopo da Pilha: " + number;
		}
		JOptionPane.showMessageDialog(null, sIO, sTitle, JOptionPane.PLAIN_MESSAGE);
	}

	public static void RetirarNumero() {
		int number;
		number = Pop();
		if (number == 0)
			sIO = "Pilha Vazia!";
		else
			sIO = "Numero retirado da Pilha: " + number;
		JOptionPane.showMessageDialog(null, sIO, sTitle, JOptionPane.PLAIN_MESSAGE);
	}

	private static void Operacao(int posi) {

		int aux = 0;
		int glbResult = 0, cont = 0;
		String op;
		for (int i = 0; i < 4; i++) {

			op = JOptionPane.showInputDialog(null, "Qual operação deseja(+,    -,   /,    *)?");

			switch (op) {
			case "+":
				if (i == 0) {
					aux++;
					glbResult = cPilha[posi] + cPilha[posi - 1];
					cPilha[posi + aux] = glbResult;
				} else {
					cont = glbResult += cPilha[posi - (aux += 1)];
					System.out.println("ta valendo -- no mais" + aux);
					cPilha[posi + aux] = cont;
				}
				iPos++;
				JOptionPane.showMessageDialog(null, Arrays.toString(cPilha));
				continue;

			case "-":
				if (i == 0) {
					aux++;
					glbResult = cPilha[posi] - cPilha[posi - 1];
					cPilha[posi + aux] = glbResult;
				} else {
					cont = glbResult -= cPilha[posi - (aux += 1)];
					System.out.println("ta valendo -- no menos " + aux);
					cPilha[posi + aux] = cont;
				}
				iPos++;
				JOptionPane.showMessageDialog(null, Arrays.toString(cPilha));
				continue;

			case "*":
				if (i == 0) {
					aux++;
					glbResult = cPilha[posi] * cPilha[posi - 1];
					cPilha[posi + aux] = glbResult;
				} else {
					System.out.println("global no *" + glbResult);
					cont = glbResult *= cPilha[posi - (aux += 1)];
					System.out.println("ta valendo -- no menos " + aux);
					cPilha[posi + aux] = cont;

				}
				iPos++;
				JOptionPane.showMessageDialog(null, Arrays.toString(cPilha));
				continue;

			case "/":
				if (i == 0) {
					aux++;
					glbResult = cPilha[posi] / cPilha[posi - 1];
					cPilha[posi + aux] = glbResult;
				} else {
					cont = glbResult /= cPilha[posi - (aux += 1)];
					System.out.println("ta valendo -- no menos " + aux);
					cPilha[posi + aux] = cont;

				}
				iPos++;
				JOptionPane.showMessageDialog(null, Arrays.toString(cPilha));
				continue;
			}

		}

	}

	private static int Push(int iC) {
		if (iPos >= iTAM)
			return 0;

		int posi = iPos++;

		System.out.println("position -> " + (iPos - 1));
		int result = cPilha[posi] = iC;

		if (iPos == 5)
			Operacao(posi);

		return result;
	}

	public static int Pop() {
		if (iPos == 0)
			return 0;
		return cPilha[--iPos];
	}

	public String toString() {
		return "sString";
	}

	public static int Size() {
		return iPos;
	}

	public static int Top() {
		return cPilha[iPos - 1];
	}
}
