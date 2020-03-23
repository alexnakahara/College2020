package exCalvetti;

import javax.swing.JOptionPane;

public class BuscaBinariaRecursivaEx50 {
	//c d a b k a f g a w
	public static int search(char vetor[], int iB, int iA, char key) {

		int meio = (iB + iA) / 2;
		if (iB <= iA) {

			if (key < vetor[meio]) {
				return search(vetor, iB, meio + 1, key);
			} else if (key > vetor[meio]) {
				return search(vetor, meio - 1, iA, key);
			} else {
				return meio;
			}
		}

		return -1;
	}

	public static void main(String[] args) {

		char vetor[] = new char[10];

		JOptionPane.showMessageDialog(null, "Digite os caracteres em ordem decrescente.\nSerão 10 no total.");
		for (int i = 0; i < vetor.length; i++) {

			vetor[i] = JOptionPane.showInputDialog("Digite 1 caracter ").charAt(0);

		}

		char key = JOptionPane.showInputDialog("Digite o caracter que deseja buscar").charAt(0);

		int resultado = search(vetor, 0, vetor.length -1, key);

		if (resultado != -1) {

			JOptionPane.showMessageDialog(null, "O caracter está na posição: \n   " + resultado);
		} else {
			JOptionPane.showMessageDialog(null, "O caracter não foi encontrado \n Tente novamente! \n " + resultado);

		}

	}

}
