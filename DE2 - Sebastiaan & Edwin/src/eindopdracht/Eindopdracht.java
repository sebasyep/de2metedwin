package eindopdracht;

import java.util.Random;
import java.util.Scanner;

public class Eindopdracht {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		// Woorden worden hier aangemaakt.
		String[] woorden = { "banaan", "appel", "vuur", "bij", "jas", "pakket", "uien", "bier", "fles", "leren", "teer",
				"werken", "stift", "woord", "vijf", "zak", "oor", "mond", "kast", "regen", "zon", "kaas", "slim",
				"deur", "raam", "pot", "zeef", "aarde", "zoen", "spel" };

		
		boolean inGame = true;
		// Hier wordt een specifiek woord uitgekozen.
			while(inGame) {
				int nummer = new Random().nextInt(woorden.length);
				char randomWoord[] = woorden[nummer].toCharArray();
				int hoeveelheidKeuzes = randomWoord.length;
				char spelerKiest[] = new char[hoeveelheidKeuzes];
				
				for(int i=0; i<spelerKiest.length; i++){ // De dashes die er komen te staan aan het begin "_ _ _ _ _ _ _ _"
					spelerKiest[i] =  '_';
	            }
				boolean woordIsGeraden = false;
	            int pogingen = 0;
	            //Het woord gaan raden
	            while(!woordIsGeraden && pogingen != hoeveelheidKeuzes) {
	            	System.out.println("Het woord: ");
	            	print(spelerKiest);
	            	System.out.printf("Je hebt %d aantal pogingen over.\n", hoeveelheidKeuzes-pogingen);
	            	char input = scanner.nextLine().charAt(0);
	                pogingen++;
	                
	                if(input == '-'){
	                	woordIsGeraden = true;
	                	inGame = false;
	                }else{
	                    for(int i=0; i<randomWoord.length; i++){
	                        if(randomWoord[i] == input){
	                        	spelerKiest[i] = input;
	                        }
	                    }
	            }
			}
	            
	}
  }

	public static void print(char array[]){
        for(int i=0; i<array.length; i++){ // De dashes die er komen te staan in het begin "_ _ _ _ _ _ _ _"
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
