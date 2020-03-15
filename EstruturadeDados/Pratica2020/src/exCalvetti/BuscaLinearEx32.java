package exCalvetti;

import javax.swing.*;

public class BuscaLinearEx32 {

	public static int getKey(int vetor[], int key) {
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == key)
				return i;
		}

		return -1;
	}

	public static void main(String args[]) {

		int i = 0;
		int vetor[] = new int[15];
		while (i < vetor.length) {

			vetor[i] = Integer.parseInt(
					JOptionPane.showInputDialog("Digite 1 n�mero. Faltam "
												+ (vetor.length - i) + " n�meros"));
			i++;
		}

		for (int b = 0; b < vetor.length; b++) {
			JOptionPane.showMessageDialog(null, "Indice - [" + b + "] valor: " + vetor[b]);
		}

		int key = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero que deseja buscar"));
		int resultado = getKey(vetor, key);
		if (resultado != -1) {

			JOptionPane.showMessageDialog(null, "O valor que voc� busca est� no indice: " + resultado);
		} else {
			JOptionPane.showMessageDialog(null,
					resultado + "\n" + "O valor n�o foi encontrado." + "\n" + "Tente novamente.");
		}

	}
}
