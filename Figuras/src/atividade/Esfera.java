package atividade;

public class Esfera extends Poligono3d {
	private double raio;
	
	public Esfera(double base, double altura, double profundidade, double raio) {
		super(base, altura, profundidade);
		setRaio(raio);
	}

	public Esfera() {
		super();
		setRaio(1);
	}
	
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		if (raio <= 0) {
			System.out.println("O valor não pode ser menor ou igual a 0");
		}
		else
			this.raio = raio;
	}

	@Override
	public double calcularVolume() {
		return (4 / 3) * Math.PI * Math.pow(raio, 3);
	}
}
