package firstEx;

public class Ex1 {
	
	public static int soma(int n, int [] vs) {
		if (n == 0 ) return 0;
		
		int a = soma(n-1, vs) + vs[n-1];
		System.out.println(a);
		return a;
	}
	
	/*Escreva uma função q recebe um int  n>=1  e um vetor
	  vs[0,n) de int's e devolve um máximo de vs[0,n).
	*/
	
	public static int max(int n, int [] vs) {
		if (n == 1) return vs[0];
		int m = max(n -1, vs);
		
		return  m > vs[n-1] ? m : vs[n-1];
	}
	
	/*
	 * Recebe ints e, d tais que e <= d
	 * e um vetor vs[e] + vs[e+1] + ...+ vs[d-1]
	 * */
	
	public static int somaEx(int e, int d, int [] vs) {
		if (e == d) return 0;
		return somaEx(e, d-1, vs) + vs[d-1];
	}
	
	public static int somaLastEx(int e, int d, int [] vs) {
		if (e == d) return 0;
		return vs[e] + somaLastEx(e +1, d, vs);
	}
	
	public void main(String args[]) {
		
		
	}
	
}
