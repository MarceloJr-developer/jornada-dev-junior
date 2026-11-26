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
		Flashcard card1 = new Flashcard("Azul em inglês?", "Blue");
		Flashcard card2 = new Flashcard("Vermelho em inglês?", "Red");

		for(int i = 0; i <3; i++){
			card1.registrarAcerto();
		}

		card1.estaDominado();

		card1.registrarErro();

		card1.estaDominado();

		Flashcard card3 = new Flashcard("", "verso");
	}
}
