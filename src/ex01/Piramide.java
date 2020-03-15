package ex01;

public class Piramide extends GeometriaEspacial {

	private double altura;
	private double base;
	
	public Piramide(double altura, double base) {
		// TODO Auto-generated constructor stub
		this.altura = altura;
		this.base = base;
	}


	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return Math.pow(this.getBase(), 2) + 4 *( (this.getBase() * this.altura) / 2);
	}

	@Override
	double volume() {
		//(0.33) * b * b * h; 
		return (0.33) * this.getBase() * this.getBase() * this.getAltura();
	}
	
	public String toString() {

		return "Pirâmide" + "\n"+
				"Area: " + this.area() + "\n" + 
				"Volume: " + this.volume();

	}
}
