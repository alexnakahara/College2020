package exCalvetti;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class OrdMergeSortEx80 {

	public static void main(String[] args) {
		int length = Integer.parseInt(JOptionPane.showInputDialog("Quantos números deseja ordenar"));
		int v[] = new int[length];
		JOptionPane.showMessageDialog(null,
				"Digite um número de cada vez desordenadamente. \nSerão " + length + " ao total ");

		for (int i = 0; i < v.length; i++) {

			v[i] = Integer.parseInt(JOptionPane.showInputDialog((i == 0) ? "Digite 1 número."
					: "Digite 1 número. Restam apenas " + (v.length - i) + "\n" + "Valores digitados: "
							+ Arrays.toString(v)));
		}

		
		mergeSort(v);
		System.out.println(Arrays.toString(v));
	}

	private static void mergeSort(int v[]) {
		if (v.length > 1) {
			int half = v.length / 2;
			int end = v.length - half;
			int v1[] = new int[half];
			int v2[] = new int[end];

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
		

	}

	private static void merge(int[] v, int[] v1, int[] v2) {

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
