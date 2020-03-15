package exCalvetti;

import javax.swing.JOptionPane;

public class BuscaLinearRecursivaEx39 {

	public static int getNumber(int array[], int indice, int busca) {

		if (indice < array.length && array[indice] != busca) {

			return getNumber(array, indice + 1, busca);

		} else if( indice % 2 == 0 && array[indice] == busca) {
			
			return getNumber(array, indice + 1, busca);
			
		} else if(indice % 2 != 0 && array[indice] == busca){
			
			return indice;
		}
		return -1;
		
	}

	public static void main(String args[]) {
		int vetor[] = new int[10];
		// 7 3 4 5 8 4 7 8 9 4
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		}

		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}

		int busca = Integer
				.parseInt(JOptionPane.showInputDialog("Com base no vetor" + 
														"\n" + "Qual número você deseja procurar"));
		
		int resultado = getNumber(vetor, 0, busca);
		if (resultado != -1) {

			JOptionPane.showMessageDialog(null, "O valor que você busca está no indice: " + resultado);
		} else {
			JOptionPane.showMessageDialog(null,
					resultado + "\n" + "O valor não foi encontrado." 
							+"\n" + "Tente novamente.");
		}

	}

}
