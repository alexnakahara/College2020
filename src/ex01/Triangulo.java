package ex01;

public class Triangulo extends Poligono {
	private double lado2;
	private double lado3;

	public Triangulo(double altura, double base) {
		super(altura, base);
	}

	public Triangulo(double lado1, double lado2, double lado3) {
		super(lado1);
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	@Override
	public double area() {
		return (this.getAltura() * this.getBase()) / 2;
	}

	@Override
	public double perimetro() {
		return this.getLado() + this.getLado2() + this.getLado3();
	}

	public String toString() {

		return "Triângulo" + "\n" + "Area: " + this.area() + "\n" + "Perimetro: " + this.perimetro();

	}
}
