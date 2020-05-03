package exCalvetti;
import javax.swing.*;

public class PilhaEx7 {
		public static int iTAM=10;
		public static String cPilha[]=new String[iTAM];
		public static int iPos=0;
		public static String sIO,sTitle;
		public static String[] sSN={"Sim","Não"};
		public static int iSN;
		public static String[] sOpcao={"Inserir Elemento","Consultar Elemento","Retirar Elemento","Sair"};
		public static int iOpcao;
		
		public static void main(String Args[]){
			//Tela inicial
			sTitle="ALGED-Ex07-2°Semestre";
			sIO="Pilhas - Implementação Baseada em Vetor (Conceitual)";
			JOptionPane.showMessageDialog(null,sIO,sTitle,JOptionPane.PLAIN_MESSAGE);
			//Tela de menu
			do{
				sIO="Selecione o botão da opção desejada:";
				iOpcao=JOptionPane.showOptionDialog(null,sIO,sTitle,1,JOptionPane.QUESTION_MESSAGE,
						null,sOpcao,null);
				switch(iOpcao){
			case 0: Inserir_Nome();
			break;
			case 1: ConsultarNome();
			break;
			case 2: Retirar_Nome();
			break;
			case 3: sIO="Deseja realmente sair?";
			iSN=JOptionPane.showOptionDialog(null,sIO,sTitle,1,JOptionPane.QUESTION_MESSAGE,null,sSN,null);
			if(iSN==1) iOpcao=-1;
				break;
			}
			}while(iOpcao!=3);
			//Termina execução
			System.exit(0);
		}

		private static void Inserir_Nome() {
			String sDigitado;
			sIO="Digite o caractere a ser colocado na Pilha:";
			sDigitado=JOptionPane.showInputDialog(null,sIO,sTitle,JOptionPane.QUESTION_MESSAGE);
			if(Push(sDigitado)==null) sIO="Pilha Cheia. Caractere não colocado na Pilha!";
			else sIO="Caractere colocado na Pilha com sucesso!";
			JOptionPane.showMessageDialog(null,sIO,sTitle,JOptionPane.PLAIN_MESSAGE);
		}
		
		public static void ConsultarNome(){
			int iTamanho;
			String text;
			iTamanho=Size();
				if(iTamanho==0) sIO="Pilha Vazia!";
					else{
						text=Top();
						sIO="Tamanho da Pilha: "+iTamanho+"\nTopo da Pilha: "+text;
					}
				JOptionPane.showMessageDialog(null,sIO,sTitle,JOptionPane.PLAIN_MESSAGE);
		}
		
		public static void Retirar_Nome(){
			String text;
			text=Pop();
			if(text==null) sIO="Pilha Vazia!";
			else sIO="Caractere retirado da Pilha: "+text;
			JOptionPane.showMessageDialog(null,sIO,sTitle,JOptionPane.PLAIN_MESSAGE);
		}

		private static String Push(String sC) {
			if(iPos>=iTAM) return null;
			return cPilha[iPos++]=sC;
		}
		
		public static String Pop(){
			if(iPos==0) return null;
			return cPilha[--iPos];
		}
		
		public String toString() {
			return "sString";
		}
		
		public static int Size(){
			return iPos;
		}
		public static String Top(){
			return cPilha[iPos-1];
		}
		
		
}
