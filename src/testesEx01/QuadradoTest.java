package testesEx01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ex01.Quadrado;

class QuadradoTest {
	
	Quadrado quadrado;
	
	@BeforeEach
	void preparar() {
		quadrado = new Quadrado(6.0);
	}

	@Test
	void testArea() {
		double resultado = quadrado.area();
		assertEquals(36, resultado);
	}
	
	void testPerimetro() {
		double resultado = quadrado.perimetro();
		assertEquals(24, resultado);
	} 
	
	void testDiagonal() {
		double resultado = quadrado.calcularDiagonal();
		assertEquals(20, resultado);
	}
	
	@AfterEach
	void clear() {
		quadrado.setLado(0);
		
	}
}
