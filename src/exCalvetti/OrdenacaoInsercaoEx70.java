package exCalvetti;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class OrdenacaoInsercaoEx70 {

	public static void main(String[] args) {
		int length = Integer.parseInt(JOptionPane.showInputDialog("Quantos n�meros deseja ordenar"));
		int []v = new int[length];
		JOptionPane.showMessageDialog(null, "Digite um n�mero de cada vez desordenadamente. \nSer�o "+ length +" ao total ");

		for (int i = 0; i < v.length; i++) {

			v[i] = Integer.parseInt(JOptionPane.showInputDialog( (i == 0) ? "Digite 1 n�mero." :
				"Digite 1 n�mero. Restam apenas " + (v.length - i) + "\n" + "Valores digitados: " + Arrays.toString(v)));
		}
		
		JOptionPane.showMessageDialog(null, Arrays.toString(insertSort(v)));
	}

	public static int[] insertSort(int v[]) {
		int x, j;

		for (int i = 1; i < v.length; i++) {
			x = v[i];
			j = i - 1;
			while (j >= 0 && x < v[j]) {
				v[j + 1] = v[j];
				j--;
			}
			v[j + 1] = x;
		}

		return v;
	}

}
