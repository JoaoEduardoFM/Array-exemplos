package exemploArray;

public class ExemploArrayBidimencional {
	
	public static void main(String[] args) {
		
		double mat[][] = {{1.5, 5.2}, {3.6, 4.9}, {2.4,8.1}};
		
		for(int i = 0; i < mat.length; i++) {
			//enquanto i = 0 e o valor i for menor de o variavel mat ele percorre o array incrementando de 1 a 1.
			for(int j = 0; j < mat[i].length; j++) {
				/* i = linha
				 * j = coluna */
				System.out.println("Linha: ["+ i + "] Coluna: [" + j + "]:" + mat[i][j]);			 
				/*              coluna0	   coluna1 
				 * linha0 - >   [ 1.5 ]    [ 5.2 ]
				 * linha1 - >   [ 3.6 ]    [ 4.9 ]
				 * linha2 - >   [ 2.4 ]    [ 8.1 ]
				 */
			}
		}
	}
}
