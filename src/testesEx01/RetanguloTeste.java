package testesEx01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ex01.Retangulo;

class RetanguloTeste {
	
	Retangulo retangulo;
	
	@BeforeEach
	void preparar() {
		retangulo = new Retangulo(10,10);
		
	}

	@Test
	void testArea() {
		double resultado = retangulo.area();
		assertEquals(100, resultado);
	}
	
	void testDiagonal() {
		double resultado = retangulo.calcularDiagonal();
		assertEquals(20, resultado);
	}
	
	void testPerimetro() {
		double resultado = retangulo.perimetro();
		assertEquals(24, resultado);
	}
	
	@AfterEach
	void clear() {
		retangulo.setBase(0);
		retangulo.setAltura(0);
		
	}

}
