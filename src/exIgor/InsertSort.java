package exIgor;

import java.util.Arrays;

public class InsertSort {

	public static void main(String args[]) {
		
		int []v = {9, 3, 1, 5, 4, 0, 3, 21};
		
		insertSort(v);
		
	}
	
	private static void insertSort(int v[]) {
		int x, j;

		for (int i = 1; i < v.length; i++) {
			x = v[i];
			j = i - 1;
			System.out.println("Chave: " + v[i] + "\nEstado Atual: " + Arrays.toString(v).replace(",", "|"));
			while (j >= 0 && x < v[j]) {
				v[j + 1] = v[j];
				System.out.println(Arrays.toString(v).replace(",", "|"));
				j--;
			}
			v[j + 1] = x;
			System.out.println(Arrays.toString(v).replace(",", "|") + "\n");
		}

		System.out.println("Resultado final: " + Arrays.toString(v).replace(",", "|"));
	}
	

	
}
