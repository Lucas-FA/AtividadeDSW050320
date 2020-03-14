package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import atividade.Triangulo;

class TrianguloTest {
	Triangulo t;
	
	@BeforeEach
	void iniciar() {
		t = new Triangulo();
	}
	
	@Test
	void calcular_area_positivos() {
		t.setAltura(4);
		t.setBase(4);
		double obtido = t.calcularArea();
		assertEquals(8, obtido, "Deu certo");
	}
	@Test
	void calcular_area_nulo() {
		t.setAltura(0);
		t.setBase(0);
		double obtido = t.calcularArea();
		assertNotEquals(0, obtido, "Deu certo");
	}
	
	@Test
	void calcular_perimetro_positivos() {
		t.setAltura(4);
		t.setBase(4);
		double obtido = t.calcularPerimetro();
		assertEquals(12, obtido, "Deu certo");
	}
	@Test
	void calcular_perimetro_nulo() {
		t.setAltura(0);
		t.setBase(0);
		double obtido = t.calcularPerimetro();
		assertNotEquals(0, obtido, "Deu certo");
	}
}
