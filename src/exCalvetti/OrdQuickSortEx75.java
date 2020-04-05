package exCalvetti;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class OrdQuickSortEx75 {

	public static void main(String args[]) {
		
		int length = Integer.parseInt(JOptionPane.showInputDialog("Quantos números deseja ordenar"));
		int v[] = new int[length];
		JOptionPane.showMessageDialog(null, "Digite um número de cada vez desordenadamente. \nSerão "+ length +" ao total ");

		for (int i = 0; i < v.length; i++) {

			v[i] = Integer.parseInt(JOptionPane.showInputDialog( (i == 0) ? "Digite 1 número." :
				"Digite 1 número. Restam apenas " + (v.length - i) + "\n" + "Valores digitados: " + Arrays.toString(v)));
		}
		
		JOptionPane.showMessageDialog(null, "Desordenado: " + Arrays.toString(v)
			+ "\nOrdenado com quick-sort: " + Arrays.toString(quickSort(v, 0, v.length - 1)));
		
	}

	private static int[] quickSort(int[] v, int iBaixo, int iAlto) {
		
		int iP,iPivot, iA, iB;
		iA = iAlto;
		iB = iBaixo;
		iPivot = v[iBaixo];
		
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
