package exemploArray;

public class ExemploArrayUnidimencionalEmString {
	
	public static void main(String[] args) {
		
		String [] nomesUnidimencional = new String[] {"joao","paulo","ana"};
		
		nomesUnidimencional = PushArray.push(nomesUnidimencional, "fernanda");
		
		System.out.println("Os nomes informados foram:");
		//CRUD =  CREATE, READ, UPDADE, DELETE
		//for = enquanto
		for(int i=0;i< nomesUnidimencional.length;  i++) {			
	    // enquanto o valor i for 0 e ele for menor que o vetor ele percorre o array incrementando de 1 a 1.
			System.out.println("Valor do vetor [" + i + "]:  " + nomesUnidimencional[i]);
  		}	
	}	
}
