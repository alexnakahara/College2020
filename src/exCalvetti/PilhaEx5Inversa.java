package exCalvetti;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class PilhaEx5Inversa {

	public static int iTAM = 9;
	public static int cPilha[] = new int[iTAM];
	public static int iPos = 9;
	public static String sIO, sTitle;
	public static String[] sSN = { "Sim", "Não" };
	public static int iSN;
	public static String[] sOpcao = { "Inserir Elemento", "Consultar Elemento", "Retirar Elemento", "Sair" };
	public static int iOpcao;

	public static void main(String Args[]) {
		sTitle = "ALGED-Ex05-2°Semestre";

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
		System.exit(0);
	}

	private static void InserirNumero() {

		sIO = "Digite um número para ser colocado na Pilha:";
		int sDigitado = Integer.parseInt(JOptionPane.showInputDialog(null, sIO, sTitle, JOptionPane.QUESTION_MESSAGE));
		if (Push(sDigitado) <= 0)
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
		if (iTamanho == 9)
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
		if (number == 9)
			sIO = "Pilha Vazia!";
		else
			sIO = "Numero retirado da Pilha: " + number;
		JOptionPane.showMessageDialog(null, sIO, sTitle, JOptionPane.PLAIN_MESSAGE);
	}

	private static void Operacao(int posi) {

		int glbResult = 0, aux = 0 ;
		String op;
		for (int i = 0; i < 4; i++) {

			op = JOptionPane.showInputDialog(null, "Qual operção deseja(+,  -,  /,  * )?");

			switch (op) {
			case "+":
				if (i == 0) {
					aux++;
					glbResult = cPilha[posi] + cPilha[posi + 1];
					cPilha[posi - aux] = glbResult;
				} else {
					glbResult += cPilha[posi + (aux += 1)];
					cPilha[posi - aux] = glbResult;
				}
				--iPos;
				JOptionPane.showMessageDialog(null, Arrays.toString(cPilha));
				continue;

			case "-":
				if (i == 0) {
					aux++;
					glbResult = cPilha[posi] - cPilha[posi + 1];
					cPilha[posi - aux] = glbResult;
				} else {
					glbResult -= cPilha[posi + (aux += 1)];
					cPilha[posi - aux] = glbResult;
				}
				--iPos;
				JOptionPane.showMessageDialog(null, Arrays.toString(cPilha));
				continue;

			case "*":
				if (i == 0) {
					aux++;
					glbResult = cPilha[posi] * cPilha[posi + 1];
					cPilha[posi - aux] = glbResult;
				} else {
					glbResult *= cPilha[posi + (aux += 1)];
					cPilha[posi - aux] = glbResult;
				}
				--iPos;
				JOptionPane.showMessageDialog(null, Arrays.toString(cPilha));
				continue;

			case "/":
				if (i == 0) {
					aux++;
					glbResult = cPilha[posi] / cPilha[posi + 1];
					cPilha[posi - aux] = glbResult;
				} else {
					glbResult /= cPilha[posi + (aux += 1)];
					cPilha[posi - aux] = glbResult;
				}
				--iPos;
				JOptionPane.showMessageDialog(null, Arrays.toString(cPilha));
				continue;
			}

		}

	}

	private static int Push(int iC) {
		
		if (iPos == 0) return 0;
		
		int posi = --iPos;
		int result = cPilha[posi] = iC;

		if (iPos == 4) Operacao(posi);

		return result;
	}

	public static int Pop() {
		if (iPos == 9)
			return 9;
		return cPilha[iPos++];
	}

	public static int Size() {
		return iPos;
	}

	public static int Top() {
		return cPilha[iPos];
	}

}
