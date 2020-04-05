package exCalvetti;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class OrdQuickSortBuscaEx78 {

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

			JOptionPane.showMessageDialog(null, "O caracter está no indice: " + resultado);
		} else {
			JOptionPane.showMessageDialog(null, "O caracter não foi encontrado \n Tente novamente!\n " + resultado);

		}

	}

	public static int BinarySearch(char vetor[], int iB, int iA, int key) {
		
		char newVetor[] = quickSort(vetor, 0, vetor.length - 1);
		System.out.println("Novo vetor ordenado" + Arrays.toString(newVetor));
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

	private static char[] quickSort(char[] v, int iBaixo, int iAlto) {
		
		int iP, iA, iB;
		char iPivot = v[iBaixo];
		iA = iAlto;
		iB = iBaixo;
		
		while(iBaixo < iAlto) {
			
			while(v[iAlto] >= iPivot && iBaixo < iAlto) iAlto--;
			
			if(iBaixo != iAlto) {
				v[iBaixo] = v[iAlto];
				iBaixo++;
			}
			
			while(v[iBaixo] <= iPivot && iBaixo< iAlto)iBaixo++;
			if(iBaixo != iAlto) {
				v[iAlto] = v[iBaixo];
				iAlto--;
			}
		}
		v[iBaixo] = iPivot;
		iP = iBaixo;
		iBaixo = iB;
		iAlto = iA;
		if(iBaixo < iP) quickSort(v, iBaixo, iP-1);
		if(iAlto > iP) quickSort(v, iP+1, iAlto);
		return v;
		
	}

}
