package exCalvetti;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class OrdenacaoBubbleEx60 {

	public static void main(String[] args) {
		
		int length = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de números que deseja ver?" ));
		int vetor[]= new int[length];
		JOptionPane.showMessageDialog(null, "Digite um número de cada vez. \nSerão " + length + " ao total!");
		
		for (int i = 0; i < vetor.length; i++) {

			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog( (i == 0) ? "Digite 1 número." :
				"Digite 1 número. Restam apenas " + (vetor.length - i) + "\n" + "Valores digitados: " + Arrays.toString(vetor)));

		}

		JOptionPane.showMessageDialog(null, "Valores digitados: " + Arrays.toString(vetor) +  
											"\nOrdenado com o Bubble Sort: " + Arrays.toString(BubbleSort(vetor)));
		
	}

	public static int[] BubbleSort(int vetor[]) {

		int aux;
		for (int i = 1; i < vetor.length; i++) {
			
			for(int j = vetor.length - 1; j >= i; j--) {
				
				if (vetor[j - 1] > vetor[j]) {
					
					aux = vetor[j - 1];
					vetor[j - 1] = vetor[j];
					vetor[j] = aux;
					
					
				}
			}
			
		}
		
		return vetor;
	}

}
