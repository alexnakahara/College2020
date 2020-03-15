package ex01;

public  class Circulo extends GeometriaPlana {
	private double raio;

	public Circulo (double raio) {
		this.raio = raio;
	}
	public double getRaio() {
		return raio;
	}
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double area() {
		 return Math.PI * Math.pow(this.getRaio(), 2) ;
	}
	
	@Override
	double perimetro() {
		return Math.PI* 2 * this.getRaio();
	}

	public String toString() {

		return "Circulo" + "\n"+
				"Area: " + this.area() + "\n" + 
				"Perimetro: " + this.perimetro();

	}
}
