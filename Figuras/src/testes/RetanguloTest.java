package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import atividade.Retangulo;

class RetanguloTest {
	Retangulo r;
	
	@BeforeEach
	void iniciar() {
		r = new Retangulo();
	}
	
	@Test
	void calcular_area_positivos() {
		r.setAltura(3);
		r.setBase(4);
		double obtido = r.calcularArea();
		assertEquals(12, obtido, "Deu certo");
	}
	@Test
	void calcular_area_nulo() {
		r.setAltura(0);
		r.setBase(0);
		double obtido = r.calcularArea();
		assertNotEquals(0, obtido, "Deu certo");
	}
	
	@Test
	void calcular_perimetro_positivos() {
		r.setAltura(3);
		r.setBase(4);
		double obtido = r.calcularPerimetro();
		assertEquals(14, obtido, "Deu certo");
	}
	@Test
	void calcular_perimetro_nulo() {
		r.setAltura(0);
		r.setBase(0);
		double obtido = r.calcularPerimetro();
		assertNotEquals(0, obtido, "Deu certo");
	}
	
	@Test
	void calcular_diagonal_positivos() {
		r.setAltura(3);
		r.setBase(4);
		double obtido = r.calcularDiagonal();
		assertEquals(5, obtido, "Deu certo");
	}
	@Test
	void calcular_diagonal_nulo() {
		r.setAltura(0);
		r.setBase(0);
		double obtido = r.calcularDiagonal();
		assertNotEquals(0, obtido, "Deu certo");
	}
}
