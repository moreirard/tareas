package ar.edu.unlam.tallerweb.cerraduraelectronica;

public class CerraduraElectronica {
	private Integer clave;
	private Boolean abierta = false;
 
	public CerraduraElectronica(Integer clave) {
		this.clave = clave;
	}
	
	public void abrir(Integer clave) {
		if (clave.equals(this.clave)) {
			this.abierta = true;
		}
	}
	
	public void cerrar(Integer clave) {
		if (clave.equals(this.clave)){
			this.abierta = false;
		}
	}
 
	public Boolean estaAbierta() {
		return this.abierta;
	}


}
