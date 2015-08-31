package ar.edu.unla.tallerweb.subasta;

public class Subasta {

	private Integer valor = 0;
	private Boolean abierta = true;
	
	Subasta(Integer valorInicial) {
		this.valor  = valorInicial;
	}
	
	void nuevaOferta(Integer oferta) {
		if (this.abierta && oferta > this.valor) {
			this.valor = oferta;
		}
	}
	
	Integer cerrar() {
		this.abierta = false;
		return this.valor;
	}

}
