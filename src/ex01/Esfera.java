package ex01;

public class Esfera extends GeometriaEspacial {

	private double raio;
	
	public Esfera(double raio) {
		// TODO Auto-generated constructor stub
		this.raio = raio;
	}
	public double getRaio() {
		return raio;
	}
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	@Override
	double volume() {
		
		return (4.0 / 3.0) * Math.PI * Math.pow(this.getRaio(), 3); // instead of 4/3 in yours
		   
	}
	@Override
	double area() {
		// TODO Auto-generated method stub
		return (4*22*this.getRaio()*this.getRaio())/7;
	}
	
	public String toString() {

		return "Esfera" + "\n"+
				"Area: " + this.area() + "\n" + 
				"Volume: " + this.volume();

	}

	
	

}
