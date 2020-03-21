package ex01;

public class Losango extends Poligono {

	public Losango(double altura, double base) {
		super(altura, base);
	}
	
	@Override
	public double area() {

		return this.getAltura() * this.getBase();
	}

	@Override
	public double perimetro() {
		return Math.pow(this.getBase(), 4);
	}
	
	public String toString() {

		return "Losango" + "\n" +
				"Area: " + this.area() + "\n" + 
				"Perimetro: " + this.perimetro();

	}
}
