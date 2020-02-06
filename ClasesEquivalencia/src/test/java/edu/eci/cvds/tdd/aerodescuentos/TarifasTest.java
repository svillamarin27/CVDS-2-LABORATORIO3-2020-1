package edu.eci.cvds.tdd.aerodescuentos;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class TarifasTest {
	
	private CalculadorDescuentos calculadorD = new CalculadorDescuentos(); 
	@Test
	public void descuentoDiasAntelacionMasEdadMayor() throws Exception {
		double CalculoTarifa = CalculadorDescuentos.calculoTarifa(300, 21, 68);
		Assert.assertEquals(CalculoTarifa,231.0);			
	}
	@Test 
	public void descuentoDiasAntelacionMasMenorEdad()throws Exception {
		double CalculoTarifa = CalculadorDescuentos.calculoTarifa(600, 30, 15);
		Assert.assertEquals(CalculoTarifa, 480.0);
	}
	@Test
	public void descuentoDiasAntelacion()throws Exception {
		double CalculoTarifa = CalculadorDescuentos.calculoTarifa(500, 25, 30);
		Assert.assertEquals(CalculoTarifa, 425.0);
	}
	@Test
	public void descuentoMenorEdad()throws Exception {
		double CalculoTarifa = CalculadorDescuentos.calculoTarifa(150, 15, 14);
		Assert.assertEquals(CalculoTarifa, 142.5);
	}
	@Test 
	public void descuentoMayorEdad()throws Exception {
		double CalculoTarifa = CalculadorDescuentos.calculoTarifa(1000, 15, 78);
		Assert.assertEquals(CalculoTarifa,920.0 );
	}
	
	

}