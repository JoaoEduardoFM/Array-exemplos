package exemploArray;

public class ExemploArrayUnidimencional {
	
	public static void main(String[] args) {
		
		int vet[] = new int[5];
		//0,1,2,3,4 = 5 indices
		
		vet[0] = 1;
		vet[1] = 2;
		vet[2] = 3;
		vet[3] = 4;
		vet[4] = 5;
		
		//for = enquanto
		for(int i=0;i< vet.length;  i++) {
	    // enquanto o valor i for 0 e ele for menor que o vetor ele percorre o array incrementando de 1 a 1.
			System.out.println("Valor do vetor [" + i + "]:  " + vet[i]);
  		}	
	}	
}
