package ex01;

public class Retangulo extends Poligono implements Diagonal {

	public Retangulo(double altura, double base) {
		super(altura, base);
	}
	
	@Override
	public double area() {
		return this.getAltura() * this.getBase();
	}

	@Override
	public double calcularDiagonal() {
		return  Math.sqrt(Math.pow(this.getBase(),2)+Math.pow(this.getAltura(),2));
	}

	@Override
	double perimetro() {
		// TODO Auto-generated method stub
		return (this.getAltura() * 2) + (this.getBase() * 2) ;
	}
	
	public String toString() {
		
		return "Retângulo" + "\n" + 
				"Area: " + this.area() + "\n" + 
				"Perimetro: " + this.perimetro() + "\n" + 
				"Diagonal: " + this.calcularDiagonal();
	}
	
	

}
