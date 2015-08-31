package ar.edu.unlam.tallerweb.dado;

import org.junit.Assert;
import org.junit.Test;

public class DadoTest {
	
	@Test
	public void testQueMiCaraUnValorEntreUnoYSeis() {
		
		//1. Preparación
				Dado miDado = new Dado(6);
				Integer min = 1;
				Integer max = 6;
				
				//2. Ejecución
				Integer miCaraDado = miDado.tirar();

				//3. Contrastación
				Assert.assertTrue("El valor está entre 1 y 6", miCaraDado>=min && miCaraDado <=max);
				
				//4. Limpieza
				miDado = null;
	
	//Assert Ctrl+Espacio para importar
//				Assert.assertTrue(a.area()==0);
//				Assert.assertEquals(0,a.area());
	}

}
