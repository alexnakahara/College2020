package exCalvetti;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class OrdenacaoBubbleEx60 {

	public static void main(String[] args) {
		
		int length = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de n�meros que deseja ver?" ));
		int vetor[]= new int[length];
		JOptionPane.showMessageDialog(null, "Digite um n�mero de cada vez. \nSer�o " + length + " ao total!");
		
		for (int i = 0; i < vetor.length; i++) {

			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog( (i == 0) ? "Digite 1 n�mero." :
				"Digite 1 n�mero. Restam apenas " + (vetor.length - i) + "\n" + "Valores digitados: " + Arrays.toString(vetor)));

		}

		JOptionPane.showMessageDialog(null, "Valores digitados: " + Arrays.toString(vetor) +  
											"\nOrdenado com o Bubble Sort: " + Arrays.toString(BubbleSort(vetor)));
		
	}

	public static int[] BubbleSort(int vetor[]) {

		int aux;
		for (int i = 0; i < vetor.length; i++) {
			
			// (vetor.length - 1) para garantir que nunca acesse um indice a mais que n�o tenha no vetor. (Acontece no if)
			for(int j = 0; j < (vetor.length - 1); j++) {
				
				if (vetor[j] > vetor[j + 1]) {
					
					aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
					
				}
			}
			
		}
		
		return vetor;
	}

}
