package exCalvetti;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class OrdSelecaoEx64 {

	public static void main(String args[]) {

		char v[] = new char[5];

		for (int i = 0; i < v.length; i++) {

			v[i] = JOptionPane.showInputDialog((i == 0) ? "Digite um caracter"
					: "Digite um caracter. Restam " + (v.length - i) + "\nDigitadas: " + Arrays.toString(v))
					.charAt(0);
		}

		JOptionPane.showMessageDialog(null, "Valores digitados: " +
		Arrays.toString(v) +"\nValores com Selection-Sort: " +Arrays.toString(selectionSort(v)));

	}

	
	public static char[] selectionSort(char v[]) {
		
		char aux;
		
		for(int i = 0; i < v.length; i++) {
		
			aux = v[i];
			int j = i;
			
			for(int x= i + 1; x < v.length; x++) {
				
				if(v[x] < aux) {
					j = x;
					aux = v[x];
				}
			}
			
			v[j] = v[i];
			v[i]  = aux;
		
		}
		
		
		return v;
	}

}
