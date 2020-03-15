package ex01;

public class Triangulo extends Poligono {

	public Triangulo(double altura, double base) {
		super(altura, base);
	}

	@Override
	public double area() {
		return (this.getAltura() * this.getBase()) / 2;
	}

	// calculate the hypotenuse
	Double hypotenuse = Math.pow(Math.pow(this.getBase(), 2) + Math.pow(this.getAltura(), 2), 0.5);
	@Override
	double perimetro() {
		return this.getAltura() + this.getBase() + hypotenuse;
	}

	public String toString() {

		return "Triângulo" + "\n" + 
				"Area: " + this.area() + "\n" + 
				"Perimetro: " + this.perimetro();

	}
}
