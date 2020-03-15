package ex01;

public class Quadrado extends Poligono implements Diagonal {

	public Quadrado(double lado) {
		super(lado);
	}
	
	public double area() {
		return Math.pow(this.getLado(), 2);
	}

	@Override
	public double calcularDiagonal() {
		return Math.sqrt(2) * this.getLado();
	}

	@Override
	public double perimetro() {
	
		return Math.pow(this.getLado(), 4);
	}
	
	public String toString() {

		return "Quadrado" + "\n" +
				"Area: " + this.area() + "\n" + 
				"Perimetro: " + this.perimetro() + "\n" + 
				"Diagonal: " + this.calcularDiagonal();

	}

}
