package ar.edu.unlam.tallerweb.nota;

public class Nota {
	private Integer nota;

	public Nota(Integer nota) {
		this.nota = nota;
	}

	public int estaAprobadoOndaC() {
		if (nota >= 4) {
			return 1;
		} else {
			return 0;
		}
	}

	public Boolean estaAprobado() {
		return nota >= 4;
	}

	public Boolean estaPromocionado() {
		return nota >= 7;
	}

	public Boolean estaReprobado() {
		return nota < 4;
	}

}
