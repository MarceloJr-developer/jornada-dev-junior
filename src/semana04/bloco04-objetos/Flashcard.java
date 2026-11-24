class Flashcard {
	String frente;
	String verso;
	int acertos;

	Flashcard(String frente, String verso) {
		this.frente = frente;
		this.verso = verso;
		acertos = 0;
	}

	void registrarAcertos() {
		acertos++;
	}

	public boolean estaDominado() {
		return acertos >= 3;
	}

	public String toString() {
		if (acertos == 1) {
			return frente + "  (" + acertos + " acerto)";
		} else {
			return frente + "  (" + acertos + " acertos)";
		}
	}
}
