package ar.edu.unlam.tallerweb.dado;

public class Dado {

	private Integer caras;
	 
	public Dado(Integer caras) {
		this.caras = caras;
	}
 
	public Integer getCaras() {
		return this.caras;
	}
	
	public Integer tirar() {
		
		return (int) (Math.random() * this.caras) + 1;
	}

}
