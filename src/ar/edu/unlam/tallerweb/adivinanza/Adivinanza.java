package ar.edu.unlam.tallerweb.adivinanza;

public class Adivinanza {
private Integer numero;
	
	public Adivinanza(Integer numero) {
		this.numero = numero;
	}
	
	public Boolean adivinar(Integer numero) {
		return numero == this.numero;
	}
	
	public Boolean esMasGrandeQue(Integer numero) {
		return this.numero > numero;
	}
	
	public Boolean esMasChicoQue(Integer numero) {
		return this.numero < numero;
	}


}
