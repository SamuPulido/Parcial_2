package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import logica.Parcial;

public class Pruebas {
	
	@Test
	public void testPotenciaNormal() throws Exception{
		Parcial parcial = new Parcial();
		
		int resultado = parcial.potencia(2,5);
		
		assertEquals(32, resultado);
	}
	
	@Test
	public void testExponenteQueEsCero() throws Exception{
		Parcial parcial = new Parcial();
		
		int resultado = parcial.potencia(5, 0);
		
		assertEquals(1, resultado);
	}
	
	@Test
	public void testConBCero() throws Exception{
		Parcial parcial = new Parcial();
		
		int resultado = parcial.potencia(0,5);
		
		assertEquals(0, resultado);
	}
	
	@Test
	public void testCeroElevadoACero() throws Exception{
		Parcial parcial = new Parcial();
		
		assertThrows(Exception.class, () -> {
            parcial.potencia(0, 0);
        });
	}
	
	@Test
	public void testExponenteNegativo() {
		Parcial parcial = new Parcial();
		
		assertThrows(Exception.class, () -> {
			parcial.potencia(2, -2);
		});
	}
	
	@Test
	public void testDelLimite() {
		Parcial parcial = new Parcial();
		
		assertThrows(Exception.class, () -> {
			parcial.potencia(2, 50);
		});
	}
}
