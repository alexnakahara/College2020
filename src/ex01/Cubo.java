package ex01;

public class Cubo extends GeometriaEspacial {

	private double lado;
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public Cubo(double lado) {
		// TODO Auto-generated constructor stub
		this.lado = lado;
	}

	@Override
	double volume() {
		
		return 6 * this.getLado() * this.getLado();
	}

	@Override // area total do cubo
	double area() {
		// TODO Auto-generated method stub
		return this.getLado() * this.getLado() * this.getLado();
	}
	
	public String toString() {

		return "Cubo" + "\n"+
				"Area: " + this.area() + "\n" + 
				"Volume: " + this.volume();

	}

}
