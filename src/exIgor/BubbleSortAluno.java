package exIgor;

public class BubbleSortAluno {

	public static void main(String[] args) {
		
		Aluno[] dataLoaded = new Aluno[5];
		
		dataLoaded[0]= new Aluno(819162510, "james@live.com","James Christopher");
		dataLoaded[1]= new Aluno(819162511, "ronald@live.com","Ronald Silva");
		dataLoaded[2]= new Aluno(819162501, "jaoa_Oliveira@live.com","João Silva");
		dataLoaded[3]= new Aluno(819162500, "gabriel.bruxo@live.com","Gabriel Silva Pinto");
		dataLoaded[4]= new Aluno(819162499, "lexandrade@live.com","Alexander Nakahara");
		
		BubbleSort(dataLoaded);

	}
	
	
	public static void BubbleSort(Aluno array[]) {

		Aluno aux;
		for (int i = 1; i < array.length; i++) {
			
			for(int j = array.length - 1; j >= i; j--) {
				
				if (array[j - 1].getRa() > array[j].getRa()) {
					
					aux = array[j - 1];
					array[j - 1] = array[j];
					array[j] = aux;
					
					
				}
			}
			
		}
		getAlunos(array);
		
	}
	
	public static void getAlunos(Aluno array[]) {
		for(Aluno i : array) {
			System.out.println("Ra: " + i.getRa() + 
								"\nEmail: " +i.getEmail() + 
								"\nNome: " + i.getNome() + "\n_________________");

		}

	}
}
