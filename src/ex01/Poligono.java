package ex01;

public abstract class Poligono extends GeometriaPlana {

	private double base;
	private double altura;
	private double lado;
	
	
	public Poligono(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public Poligono(double lado) {
		this.lado = lado;
	}
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getBase() {
		return base;
	}

	public double getAltura() {
		return altura;
	}

	public void setBase(double base) {
		this.base = base;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
}
