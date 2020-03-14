package atividade;

public abstract class Poligono extends Figura {
	private double base;
	private double altura;
	
	public Poligono(double base, double altura) {
		super();
		setBase(base);
		setAltura(altura);
	}
	
	public Poligono() {
		super();
		setBase(1);
		setAltura(1);
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
	
	@Override
    public double calcularArea() {
        return base * altura;
    }
}
