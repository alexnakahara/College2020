package ex01;

import java.util.ArrayList;

public class GeometriaMain {

	public static void main(String args[]) {

		ArrayList<Figura> figuras = new ArrayList<Figura>();

		figuras.add(new Circulo(3.1)); // raio somente

		figuras.add(new Losango(10, 10)); // altura e base

		figuras.add(new Triangulo(78, 98.25)); // altura e base

		figuras.add(new Retangulo(13.2, 12.05)); // altura e base

		figuras.add(new Quadrado(10)); // lado somente
		
		figuras.add(new Cubo(2));
		figuras.add(new Cilindro(7, 5));
		figuras.add(new Esfera(5));
		figuras.add(new Piramide(12, 4));
		
		figuras.forEach(item -> {

			System.out.println(item + "\n" + "-------------------------" );
		
		});

	}

}
