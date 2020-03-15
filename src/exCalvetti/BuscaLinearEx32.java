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
					JOptionPane.showInputDialog("Digite 1 número. Faltam "
												+ (vetor.length - i) + " números"));
			i++;
		}

		for (int b = 0; b < vetor.length; b++) {
			JOptionPane.showMessageDialog(null, "Indice - [" + b + "] valor: " + vetor[b]);
		}

		int key = Integer.parseInt(JOptionPane.showInputDialog("Digite o número que deseja buscar"));
		int resultado = getKey(vetor, key);
		if (resultado != -1) {

			JOptionPane.showMessageDialog(null, "O valor que você busca está no indice: " + resultado);
		} else {
			JOptionPane.showMessageDialog(null,
					resultado + "\n" + "O valor não foi encontrado." + "\n" + "Tente novamente.");
		}

	}
}
