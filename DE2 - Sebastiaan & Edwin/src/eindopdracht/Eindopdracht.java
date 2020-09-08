package eindopdracht;

import java.util.Random;

public class Eindopdracht {

	public static void main(String[] args) {

		// Woorden worden hier aangemaakt.
		String[] woorden = { "banaan", "appel", "vuur", "bij", "jas", "pakket", "uien", "bier", "fles", "leren", "teer",
				"werken", "stift", "woord", "vijf", "zak", "oor", "mond", "kast", "regen", "zon", "kaas", "slim",
				"deur", "raam", "pot", "zeef", "aarde", "zoen", "spel" };

		// Hier wordt een specifiek woord uitgekozen.
		int nummer = new Random().nextInt(woorden.length);
		String gekozenWoord = woorden[nummer];

		System.out.println(gekozenWoord);
	}

}
