package testes;

import atividade.Circulo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CirculoTest {
	
	Circulo c;
	
	@BeforeEach
	void iniciar() {
		c = new Circulo();
	}
	
	@Test
	void calcular_area_positivos() {
		c.setRaio(3);
		double obtido = c.calcularArea();
		assertEquals(28.274333882308138, obtido, "Deu certo");
	}
	@Test
	void calcular_area_nulo() {
		c.setRaio(0);
		double obtido = c.calcularArea();
		assertNotEquals(0, obtido, "Deu certo");
	}
	
	@Test
	void calcular_perimetro_positivos() {
		c.setRaio(3);
		double obtido = c.calcularPerimetro();
		assertEquals(18.84955592153876, obtido, "Deu certo");
	}
	@Test
	void calcular_perimetro_nulo() {
		c.setRaio(0);
		double obtido = c.calcularPerimetro();
		assertNotEquals(0, obtido, "Deu certo");
	}
}
