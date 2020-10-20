package teste;

import java.util.Random;

public class geraNome {

	public static void main(String[] args) {
		int i,nrAleatorioVogal,nrAleatorioConsoante, nrAleatorioConsoante2 ;
		
		
		String vogal[] = {"Maria","Ezequiel","Igor","Olavio","Ulisses",}, vc = "" ,nome = "" ,consoante [] = {"Bezerra","Calisso","Damasco","Felipenses","Gantirio","Huliveira","Jakovisque","Karbornado","Limael","Maciel","Nardista","Paiva","Queiroz","Ramusco","Sargento","Tenorio","Wansitadisco","Xamusca","Ygortisecsa","Zaburocisque"}; 
		
		
		Random random = new Random();

				
			
				
				for(i = 0 ; i <= 8; i++){
					
					nrAleatorioVogal = 0 + random.nextInt(4);  //escolhe uma pos de 0 a 4
					
					nrAleatorioConsoante = 0 + random.nextInt(19); //escolhe pos de 0 a 19
					
					nrAleatorioConsoante2 = 0 + random.nextInt(19); //escolhe pos de 0 a 19
					   	
					vc = vogal[nrAleatorioVogal] + " " +consoante[nrAleatorioConsoante]+ " " +consoante[nrAleatorioConsoante2] ;
					
					nome = vc;
					
				}
					
					System.out.print(nome);
					
			
			
			
			
			}

	}


