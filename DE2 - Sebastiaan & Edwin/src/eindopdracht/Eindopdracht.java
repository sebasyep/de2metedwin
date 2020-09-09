package eindopdracht;

import java.util.Random;
import java.util.Scanner;

public class Eindopdracht {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// Woorden worden hier aangemaakt.
		String[] woorden = { "banaan", "appel", "vuur", "bij", "jas", "pakket", "uien", "bier", "fles", "leren", "teer",
				"werken", "stift", "woord", "vijf", "zak", "oor", "mond", "kast", "regen", "zon", "kaas", "slim",
				"deur", "raam", "pot", "zeef", "aarde", "zoen", "spel" };

		boolean inGame = true;
		boolean gewonnen = false;

		// Hier wordt een specifiek woord uitgekozen.
		int nummer = new Random().nextInt(woorden.length);
		char randomWoord[] = woorden[nummer].toCharArray();
		char spelerKiest[] = new char[randomWoord.length];
		char letters[] = new char[randomWoord.length + 2];
		int geraden = 0;
		int telling = 0;
		boolean woordIsGeraden = false;

		while (inGame) {

			for (int i = 0; i < spelerKiest.length; i++) { // De dashes die er komen te staan in het begin "_ _ _ _"
				spelerKiest[i] = '_';
			}
			int pogingen = 5;

			while (!woordIsGeraden && pogingen != 0) {

				if (geraden != randomWoord.length) {
					System.out.println("Het woord: ");
					print(spelerKiest);
					System.out.printf("Je hebt %d aantal pogingen over.\n", pogingen);

					if (pogingen != 5) {
						System.out.print("Gekozen letters: ");
						for (int i = 0; i < letters.length; i++) {
							System.out.print(letters[i] + " ");
						}
						System.out.println("\n");

					}
				}
				char input = scanner.nextLine().charAt(0);

				for (int i = 0; i < randomWoord.length; i++) {
					if (randomWoord[i] == input) {
						spelerKiest[i] = input;
						geraden++;
					}

					if (geraden == randomWoord.length) {
						woordIsGeraden = true;
						inGame = false;
						gewonnen = true;
						pogingen = 0;

					}

				}
				pogingen--;
				letters[telling] = input;
				telling++;

			}
			if (!woordIsGeraden && pogingen == 0) {
				inGame = false;
				gewonnen = false;
				pogingen = 0;
			}

			if (gewonnen) {
				System.out.print("Je hebt gewonnen!\n Het woord was: ");
				for (int i = 0; i < randomWoord.length; i++) {
					System.out.print(randomWoord[i]);
				}
				System.out.println("\n\nWilt u nog een spel starten?\nvoer in: ja of nee");
				Scanner scanner2 = new Scanner(System.in);
				String keuze = scanner2.nextLine();

				if (keuze.equals("ja")) {
					inGame = true;
					woordIsGeraden = false;
					gewonnen = false;
					nummer = new Random().nextInt(woorden.length);
					randomWoord = woorden[nummer].toCharArray();
					spelerKiest = new char[randomWoord.length];
					geraden = 0;
					telling = 0;
					letters = new char[randomWoord.length + 2];
				}
			} else {
				System.out.print("Je hebt verloren..\n Het woord was: ");
				for (int i = 0; i < randomWoord.length; i++) {
					System.out.print(randomWoord[i]);
				}
				System.out.println("\n\nWilt u nog een spel starten?\nvoer in: ja of nee");
				Scanner scanner2 = new Scanner(System.in);
				String keuze = scanner2.nextLine();

				if (keuze.equals("ja")) {
					inGame = true;
					woordIsGeraden = false;
					gewonnen = false;
					nummer = new Random().nextInt(woorden.length);
					randomWoord = woorden[nummer].toCharArray();
					spelerKiest = new char[randomWoord.length];
					geraden = 0;
					telling = 0;
					letters = new char[randomWoord.length + 2];
				}
			}

		}

	}

	public static void print(char array[]) {
		for (int i = 0; i < array.length; i++) { // De dashes die er komen te staan in het begin "_ _ _ _ _ _ _ _"
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
