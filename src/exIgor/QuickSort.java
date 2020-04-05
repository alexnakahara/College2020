package exIgor;

import java.util.Arrays;

public class QuickSort {
	
	public static void main(String args[]) {
		
		int v[] = {55, 44, 22, 11, 66, 33};
		System.out.println("Desordenado: " + Arrays.toString(v) + "\nQuick-Sort" + Arrays.toString(quickSort(v, 0, v.length -1))); 
		
		
	}

	private static int[] quickSort(int[] v, int iBaixo, int iAlto) {
		
		int iP,iPivot, iA, iB;
		iA = iAlto;
		iB = iBaixo;
		iPivot = v[iBaixo];
		System.out.println("****");
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
		if(iBaixo < iP)quickSort(v, iBaixo, iP-1);
		if(iAlto > iP)quickSort(v, iP+1, iAlto);
		
		return v;
		
	}

}
