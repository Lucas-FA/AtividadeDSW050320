package atividade;

public class Piramide extends Poligono3d {
	public Piramide(double base, double altura, double profundidade) {
		super(base, altura, profundidade);
	}
	
	public Piramide() {
		super();
	}
	
	@Override
	public double calcularVolume() {
		return (getBase() * getProfundidade()) * getAltura() * 1 / 3;
	}
}
