/**
 * 
 */
package testesEx01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ex01.Triangulo;

/**
 * @author alexander.nakahara
 *
 */
class TrianguloTeste {
	
	Triangulo triangulo;
	Triangulo trianguloLado;
	@BeforeEach
	void preparar() {
		triangulo = new Triangulo(15, 10);
		trianguloLado = new Triangulo(10, 15, 20);
	}

	@Test
	void testArea() {
		double resultado = triangulo.area();
		assertEquals(75, resultado);
	}

	void testPerimetro() {
		double resultado = trianguloLado.perimetro();
		assertEquals(45, resultado);
	}
	
	@AfterEach
	void clear() {
		triangulo.setAltura(0);
		triangulo.setBase(0);
		trianguloLado.setLado(0);
		trianguloLado.setLado2(0);
		trianguloLado.setLado3(0);
	}
}
