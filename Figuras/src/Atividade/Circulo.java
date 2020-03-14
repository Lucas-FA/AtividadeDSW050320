package atividade;

public class Circulo extends Figura {
	private double raio;
	
    public Circulo(double raio) {
		super();
		setRaio(raio);
	}
    
    public Circulo() {
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
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}
