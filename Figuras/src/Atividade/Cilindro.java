package atividade;

public class Cilindro extends Poligono3d {
	private double raio;
	
	public Cilindro(double base, double altura, double profundidade, double raio) {
		super(base, altura, profundidade);
		setRaio(raio);
	}

	public Cilindro() {
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
		return Math.PI * Math.sqrt(raio) * getAltura();
	}
}
