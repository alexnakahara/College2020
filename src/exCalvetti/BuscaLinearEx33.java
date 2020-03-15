package exCalvetti;

import javax.swing.JOptionPane;

public class BuscaLinearEx33 {

	public static int getChar(char vetor[], char busca) {

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == busca)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		char vetor[] = new char[15];
		String minhaString = JOptionPane.showInputDialog("Digite uma palavra com até 15 caracters").toUpperCase();

		for (int i = 0; i < minhaString.length(); i++) {
			
			if (minhaString.length() > 14) {
				JOptionPane.showMessageDialog(null, "Palavra excede o número de caracteres permitido!");
				return;
			}
			
			vetor[i] = minhaString.charAt(i);

		}

		char busca = JOptionPane.showInputDialog("Com base no vetor" + "\n" + "Qual o caracter que deseja buscar").toUpperCase().charAt(0);
		
		int resultado = getChar(vetor, busca);
		if (resultado != -1) {

			JOptionPane.showMessageDialog(null, "O valor que você busca está no indice: " + resultado);
		} else {
			JOptionPane.showMessageDialog(null,
					resultado + "\n" + "O valor não foi encontrado." + "\n" + "Tente novamente.");
		}

	}
}