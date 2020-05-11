package exCalvetti;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class FilaCircularEx19 {
	public static int iTam = 10;
	public static int cFila[] = new int[iTam];
	public static int iSPos = 10;
	public static int iRPos = 10;
	public static boolean bQueueFull = false;
	public static String sIO, sTitle;
	public static String[] sSN = { "Sim", "Não" };
	public static int iSN;
	public static String[] sOpcao = { "Inserir Elemento", "Consultar Elemento", "Retirar Elemento", "Sair" };
	public static int iOpcao;

	public static void main(String Args[]) {
		sTitle = "ALGED-Ex19-2°Semestre";
		sIO = "Filas Circulares - Implementação Baseada em Vetor (Conceitual)";
		JOptionPane.showMessageDialog(null, sIO, sTitle, JOptionPane.PLAIN_MESSAGE);

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
		System.exit(0);
	}

	public static void inserir_elemento() {
		String sDigitado;
		if (isOver())
			sIO = "Fila Circular Cheia!";
		else {
			sIO = "Digite o número a ser colocado na Fila Circular:";
			sDigitado = JOptionPane.showInputDialog(null, sIO, sTitle, JOptionPane.QUESTION_MESSAGE);
			enQueueC(Integer.parseInt(sDigitado));
			sIO = "Número(s) colocado(s) na Fila Circular com sucesso!";
		}
		JOptionPane.showMessageDialog(null, sIO, sTitle, JOptionPane.PLAIN_MESSAGE);
		System.out.println("Array(inserir) -->" + Arrays.toString(cFila));
	}

	public static void consultar_elemento() {
		int iTamanho;
		iTamanho = size();
		if (iTamanho == 0)
			sIO = "Fila Circular Vazia!";
		else
			sIO = "Tamanho da Fila Circular: " + iTamanho + " caractere(s)\nCaractere na Frente da Fila Circular: "
					+ front();
		JOptionPane.showMessageDialog(null, sIO, sTitle, JOptionPane.PLAIN_MESSAGE);
		System.out.println("Array(consultar) -->" + Arrays.toString(cFila));
	}

	public static void retirar_elemento() {
		int iTamanho;
		iTamanho = size();
		if (iTamanho == 0)
			sIO = "Fila Circular Vazia!";
		else
			sIO = "Caractere retirado da Fila Circular: " + deQueueC();
		JOptionPane.showMessageDialog(null, sIO, sTitle, JOptionPane.PLAIN_MESSAGE);
		System.out.println("Array(retirar) -->" + Arrays.toString(cFila));
	}

	public static void enQueueC(int cC) {

		cFila[--iSPos] = cC;
		if (iSPos == 4)
			Operacao(iSPos);

	}

	private static void Operacao(int posi) {
		
		int aux = 0, glbResult = 0;
		String op;
		for (int i = 0; i < 4; i++) {

			op = JOptionPane.showInputDialog(null, "Qual operação deseja(+,  -,  /,  * )?");

			switch (op) {
			case "+":
				if (i == 0) {
					aux++;
					glbResult = cFila[posi] + cFila[posi + 1];
					cFila[posi - aux] = glbResult;
				} else {
					glbResult += cFila[posi + (aux += 1)];
					cFila[posi - aux] = glbResult;
				}
				--iSPos;
				verifyPosition(iSPos);
				JOptionPane.showMessageDialog(null, Arrays.toString(cFila));
				continue;

			case "-":
				if (i == 0) {
					aux++;
					glbResult = cFila[posi] - cFila[posi + 1];
					cFila[posi - aux] = glbResult;
				} else {
					glbResult -= cFila[posi + (aux += 1)];
					cFila[posi - aux] = glbResult;
				}
				--iSPos;
				verifyPosition(iSPos);
				JOptionPane.showMessageDialog(null, Arrays.toString(cFila));
				continue;

			case "*":
				if (i == 0) {
					aux++;
					glbResult = cFila[posi] * cFila[posi + 1];
					cFila[posi - aux] = glbResult;
				} else {

					glbResult *= cFila[posi + (aux += 1)];
					cFila[posi - aux] = glbResult;

				}
				--iSPos;
				verifyPosition(iSPos);
				JOptionPane.showMessageDialog(null, Arrays.toString(cFila));
				continue;

			case "/":
				if (i == 0) {
					aux++;
					glbResult = cFila[posi] / cFila[posi + 1];
					cFila[posi - aux] = glbResult;
				} else {
					glbResult /= cFila[posi + (aux += 1)];
					cFila[posi - aux] = glbResult;

				}
				--iSPos;
				verifyPosition(iSPos);
				JOptionPane.showMessageDialog(null, Arrays.toString(cFila));
				continue;
			}

		}

	}
	
	private static void verifyPosition(int pos) {
		
		if(pos == 0 ) iSPos = 10;
		
		if (iSPos == iRPos) bQueueFull = true;
		
	}

	public static int deQueueC() {
		int iIndice = --iRPos;
		if (iRPos <= 0)
			iRPos = 10;
		bQueueFull = false;
		return cFila[iIndice];
	}

	public static int front() {

		return cFila[iRPos - 1];
	}

	public static int size() {
		if (iSPos <= iRPos && !bQueueFull)
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
