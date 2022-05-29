package exemploArray;

public class ExemploArrayBidimencionalEmString {
	
	public static void main(String[] args) {
		
		String nomes[][] = {{"joao","carlos"}, {"ana", "paulo"}, {"roberto","toninho"}};
		
		for(int i = 0; i < nomes.length; i++) {
			//enquanto i = 0 e o valor i for menor de o variavel mat ele percorre o array incrementando de 1 a 1.
			for(int j = 0; j < nomes[i].length; j++) {
				/* i = linha
				 * j = coluna */
				System.out.println("Linha: ["+ i + "] Coluna: [" + j + "]:" + nomes[i][j]);			 
				/*              coluna0	      coluna1 
				 * linha0 - > [ joão    ]   [  carlos  ]
				 * linha1 - > [ ana     ]   [  paulo   ]
				 * linha2 - > [ roberto ]   [ toninho ]
				 */
			}
		}
	}
}
