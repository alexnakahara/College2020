package exCalvetti;

import javax.swing.JOptionPane;

public class BuscaBinariaIterativaEx44 {

	public static int search(int vetor[], int key) {
		
		int baixo = 0;
		int alto = vetor.length - 1;
		
		while(baixo <= alto) {
			int meioVetor = (baixo + alto) /2;
			if(key < vetor[meioVetor]) alto = meioVetor -1;
			else if(key > vetor[meioVetor] ) baixo = meioVetor + 1;
				else return meioVetor;
		}
		return -1;
	}

	public static void main(String[] args) {
		
		int vetor[] = new int[15];
		
		JOptionPane.showMessageDialog(null, "Digite os números inteiros em ordem crescente.\nSerão 15 no total.");
		for (int i = 0; i < vetor.length; i++) {
			
			vetor[i] =  Integer.parseInt(JOptionPane.showInputDialog("Digite 1 número "));

		}
		
		int key =  Integer.parseInt(JOptionPane.showInputDialog("Digite o número que deseja buscar"));
		
		int resultado = search(vetor, key);
		
		if(resultado != -1) {
			
			JOptionPane.showMessageDialog(null, "O número está na posição: \n" + resultado);
		} else {
			JOptionPane.showMessageDialog(null, "O número não foi encontrado \n Tente novamente! \n" + resultado);

		}
		
	}

}
