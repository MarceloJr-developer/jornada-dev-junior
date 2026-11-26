public class Flashcard {
	private final String frente;
	private final String verso;
	private int acertos;

	Flashcard(String frente, String verso) {
		if(frente == null || frente.isEmpty()){
			throw new IllegalArgumentException("Card invalido");
		}
		this.frente = frente;
		this.verso = verso;
		acertos = 0;
		
	}

	public String getFrente(){
		return frente;
	}

	public int getAcertos(){
		return acertos;
	}

	public void registrarAcerto() {
		acertos++;
	}

	public void registrarErro(){
		acertos = 0;
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
