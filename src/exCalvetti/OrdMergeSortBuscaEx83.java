package exCalvetti;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class OrdMergeSortBuscaEx83 {

	public static void main(String args[]) {

		char vetor[] = new char[10];

		JOptionPane.showMessageDialog(null, "Digite um caracter de cada vez. \nSerão 10 ao total ");

		for (int i = 0; i < vetor.length; i++) {

			vetor[i] = JOptionPane.showInputDialog((i == 0) ? "Digite um caracter"
					: "Digite um caracter. Restam " + (vetor.length - i) + "\nDigitadas: " + Arrays.toString(vetor))
					.charAt(0);

		}

		char key = JOptionPane.showInputDialog("Digite o caracter que deseja buscar").charAt(0);

		// iB = indice baixo, iA = indice alto
		int resultado = BinarySearch(vetor, 0, vetor.length - 1, key);

		if (resultado != -1) {

			JOptionPane.showMessageDialog(null, "O caracter está no indice:\n" + resultado);
		} else {
			JOptionPane.showMessageDialog(null, "O caracter não foi encontrado \n Tente novamente!\n " + resultado);

		}

	}

	public static int BinarySearch(char vetor[], int iB, int iA, int key) {
		
		char newVetor[] = mergeSort(vetor);
		int meio = (iB + iA) / 2;
		if (iB <= iA) {

			if (key < newVetor[meio]) {
				return BinarySearch(newVetor, iB, meio - 1, key);
			} else if (key > newVetor[meio]) {
				return BinarySearch(newVetor, meio + 1, iA, key);
			} else {
				return meio;
			}
		}

		return -1;
	}

	private static char[] mergeSort(char v[]) {
		if (v.length > 1) {
			int half = v.length / 2;
			int end = v.length - half;
			char v1[] = new char[half];
			char v2[] = new char[end];

			for (int i = 0; i < half; i++) {
				v1[i] = v[i];
			}

			for (int i = half; i < (half + end); i++) {
				v2[i - half] = v[i];
			}

			mergeSort(v1);
			mergeSort(v2);
			merge(v, v1, v2);

		}
		return v;

	}

	private static void merge(char[] v, char[] v1, char[] v2) {

		int i = 0, j = 0, k = 0;
		
		while(v1.length != j && v2.length != k) {
			if(v1[j] <= v2[k]) {
				v[i] = v1[j];
				i++;
				j++;
			} else {
				v[i] = v2[k];
				i++;
				k++;
			}
		}
		while(v1.length != j) {
			v[i] = v1[j];
			i++;
			j++;
		}
		while(v2.length != k) {
			v[i] = v2[k];
			i++;
			k++;
		}
		

	}
	
}
