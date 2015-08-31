package ar.edu.unlam.tallerweb.cerraduraeslectronica;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.unlam.tallerweb.cerraduraelectronica.CerraduraElectronica;

public class CerraduraElectronicaTest {
	@Test
	public void queUnaCerraduraNuevaEstaCerrada(){
		
		//1. Preparación
		CerraduraElectronica miCerradura = new CerraduraElectronica(1234);
		
		//2. Ejecución
		Boolean estadoCerradura = miCerradura.estaAbierta();

		//3. Contrastación
		Assert.assertFalse("", estadoCerradura);
	}
	
	@Test
	public void queCuandoIngresoClaveCorrectaSeAbra(){
		CerraduraElectronica miCerradura = new CerraduraElectronica(4321);
		miCerradura.abrir(4321);
		Boolean estadoCerradura = miCerradura.estaAbierta();
		Assert.assertTrue("", estadoCerradura);
	}
	
	@Test
	public void queCuandoIngresoClaveIncorrectaNoSeAbra(){
		CerraduraElectronica miCerradura = new CerraduraElectronica(4321);
		miCerradura.abrir(1234);
		Boolean estadoCerradura = miCerradura.estaAbierta();
		Assert.assertFalse("", estadoCerradura);
	}
}
