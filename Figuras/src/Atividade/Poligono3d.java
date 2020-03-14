package atividade;

public abstract class Poligono3d {
	private double base;
	private double altura;
	private double profundidade;
	
	public Poligono3d(double base, double altura, double profundidade) {
		setBase(base);
		setAltura(altura);
		setProfundidade(profundidade);
	}

	public Poligono3d() {
		setBase(1);
		setAltura(1);
		setProfundidade(1);
	}
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		if (base <= 0) {
			System.out.println("O valor não pode ser menor ou igual a 0");
		}
		else
			this.base = base;
	}

	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		if (altura <= 0) {
			System.out.println("O valor não pode ser menor ou igual a 0");
		}
		else
			this.altura = altura;
	}

	public double getProfundidade() {
		return profundidade;
	}
	public void setProfundidade(double profundidade) {
		if (profundidade <= 0) {
			System.out.println("O valor não pode ser menor ou igual a 0");
		}
		else
			this.profundidade = profundidade;
	}

	public abstract double calcularVolume();
}
