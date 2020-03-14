package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import atividade.Losango;

class LosangoTest {
	Losango l;
	
	@BeforeEach
	void iniciar() {
		l = new Losango();
	}
	
	@Test
	void calcular_area_positivos() {
		l.setAltura(3);
		l.setBase(5);
		double obtido = l.calcularArea();
		assertEquals(15, obtido, "Deu certo");
	}
	@Test
	void calcular_area_nulo() {
		l.setAltura(0);
		l.setBase(0);
		double obtido = l.calcularArea();
		assertNotEquals(0, obtido, "Deu certo");
	}
	
	@Test
	void calcular_perimetro_positivos() {
		l.setAltura(3);
		l.setBase(5);
		double obtido = l.calcularPerimetro();
		assertEquals(20, obtido, "Deu certo");
	}
	@Test
	void calcular_perimetro_nulo() {
		l.setAltura(0);
		l.setBase(0);
		double obtido = l.calcularPerimetro();
		assertNotEquals(0, obtido, "Deu certo");
	}
}
