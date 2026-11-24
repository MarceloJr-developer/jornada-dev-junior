public class Main {

	static int contarDominados(Flashcard[] cards) {
		int contador = 0;

		for (int i = 0; i < cards.length; i++) {
			if (cards[i] != null && cards[i].estaDominado()) {
				contador++;
			}
		}
		return contador;
	}

	public static void main(String[] args) {
		Flashcard a1 = new Flashcard("que cor é a grama", "a grama é verde");
		Flashcard a2 = new Flashcard("que cor é a ovelha", "a ovelha é branca");

		a2.registrarAcertos();

		for (int i = 0; i < 3; i++) {
			a1.registrarAcertos();
		}

		System.out.println("----------------------------------------");
		Flashcard[] cards = new Flashcard[5];

		cards[0] = a1;
		cards[1] = a2;

		for (int i = 0; i < cards.length; i++) {
			if (cards[i] == null) {
				continue;
			}
			System.out.println(cards[i]);
			if (cards[i].estaDominado()) {
				System.out.println("ON FIRE!!");
			} else {
				System.out.println("Não esta dominado :(");
			}
		}

		System.out.println("Cards dominados: " + contarDominados(cards));
	}
}
