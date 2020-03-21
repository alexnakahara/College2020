package testesEx01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ex01.Losango;

class LosanguloTeste {
	
	Losango losango;
	
	@BeforeEach
	void preparar() {
		losango = new Losango(2, 10);
	}

	@Test
	void testArea() {
		double resultado = losango.area();
		assertEquals(20, resultado);
	}
	
	void testPerimetro() {
		double resultado = losango.perimetro();
		assertEquals(40, resultado);
	}
	
	@AfterEach
	void clear() {
		losango.setAltura(0);
		losango.setBase(0);
	}

}
