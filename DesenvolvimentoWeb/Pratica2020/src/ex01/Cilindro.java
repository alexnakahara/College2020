package ex01;

public class Cilindro extends GeometriaEspacial{

	private double altura;
	private double raio;
	
	public Cilindro(double altura, double raio) {
		// TODO Auto-generated constructor stub
		this.altura = altura;
		this.raio = raio;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	double volume() {
		// TODO Auto-generated method stub
		return Math.PI * this.getRaio() * this.getRaio() * this.getAltura();
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * this.getRaio() * (this.getRaio() + this.getAltura());
	}
	
	public String toString() {

		return "Cilindro" + "\n"+
				"Area: " + this.area() + "\n" + 
				"Volume: " + this.volume();

	}


}
