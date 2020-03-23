package exCalvetti;

import javax.swing.JOptionPane;

public class BuscaBinariaIterativaEx42 {

	public static int searchElement(char vetor[], char busca) {

		int baixo = 0;
		int alto = vetor.length - 1;

		while (baixo <= alto) {
			int meio = (baixo + alto) / 2;
			if (busca < vetor[meio])
				alto = meio - 1;
			else if (busca > vetor[meio])
				baixo = meio + 1;
			else
				return meio;
		}
		return -1;
	}

	public static void main(String[] args) {

		char vetor[] = new char[10];
		JOptionPane.showMessageDialog(null, "Digite os caracteres em ordem crescente.\nSerão 10 no total.");
		for (int i = 0; i < vetor.length; i++) {
		vetor[i] = JOptionPane.showInputDialog("Digite 1 caracter").charAt(0);
		}
		char key = JOptionPane.showInputDialog("Digite o caracter que deseja buscar").charAt(0);

		int resultado = searchElement(vetor, key);
		if (resultado != -1) {

			JOptionPane.showMessageDialog(null, "O caracter está na posição: \n   " + resultado);
		} else {
			JOptionPane.showMessageDialog(null, "O caracter não foi encontrado \n Tente novamente! \n " + resultado);

		}

	}

}

