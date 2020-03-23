package exCalvetti;

import javax.swing.JOptionPane;

public class BuscaBinariaRecursivaEx49 {

	public static int search(int vetor[], int iB, int iA, int key) {

		int meio = (iB + iA) / 2;
		if (iB <= iA) {

			if (key < vetor[meio]) {
				return search(vetor, iB, meio - 1, key);
			} else if (key > vetor[meio]) {
				return search(vetor, meio + 1, iA, key);
			} else {
				return meio;
			}
		}

		return -1;
	}

	public static void main(String[] args) {

		int vetor[] = new int[10];

		JOptionPane.showMessageDialog(null, "Digite os n�meros inteiros em ordem crescente.\nSer�o 10 no total.");
		for (int i = 0; i < vetor.length; i++) {

			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 n�mero "));

		}

		int key = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero que deseja buscar"));

		int resultado = search(vetor, 0, vetor.length - 1, key);

		if (resultado != -1) {

			JOptionPane.showMessageDialog(null, "O n�mero est� na posi��o: \n" + resultado);
		} else {
			JOptionPane.showMessageDialog(null, "O n�mero n�o foi encontrado \n Tente novamente! \n" + resultado);

		}
	}
}
