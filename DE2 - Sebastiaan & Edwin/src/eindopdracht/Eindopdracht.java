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
		boolean gewonnen = false;

		// Hier wordt een specifiek woord uitgekozen.
		int nummer = new Random().nextInt(woorden.length);
		char randomWoord[] = woorden[nummer].toCharArray();
		char spelerKiest[] = new char[randomWoord.length];
		int geraden = 0;
		boolean woordIsGeraden = false;

		while (inGame) {

			for (int i = 0; i < spelerKiest.length; i++) { // De dashes die er komen te staan in het begin "_ _ _ _
															// _ _
															// _ _"
				spelerKiest[i] = '_';
			}
			int pogingen = 5;

			while (!woordIsGeraden && pogingen != 0) {

				if (geraden != randomWoord.length) {
					System.out.println("Het woord: ");
					print(spelerKiest);
					System.out.printf("Je hebt %d aantal pogingen over.\n", pogingen);
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
			}
			if (!woordIsGeraden && pogingen == 0) {
				inGame = false;
				gewonnen = false;
				pogingen = 0;
			}
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
				System.out.println("\n\n\n\n\n\n\n");
				inGame = true;
				woordIsGeraden = false;
				gewonnen = false;
			} else {
				System.out.println("\n\n\n\n\n\n\n");
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
				System.out.println("\n\n\n\n\n\n\n");
				inGame = true;
				woordIsGeraden = false;
				gewonnen = false;
			} else {
				System.out.println("\n\n\n\n\n\n\n");
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
