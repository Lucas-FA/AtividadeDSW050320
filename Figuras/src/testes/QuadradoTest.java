package testes;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import atividade.Quadrado;

class QuadradoTest {
	Quadrado q;
	
	@BeforeEach
	void iniciar() {
		q = new Quadrado();
	}
	
	@Test
	void calcular_area_positivos() {
		q.setAltura(3);
		q.setBase(3);
		double obtido = q.calcularArea();
		assertEquals(9, obtido, "Deu certo");
	}
	@Test
	void calcular_area_nulo() {
		q.setAltura(0);
		q.setBase(0);
		double obtido = q.calcularArea();
		assertNotEquals(0, obtido, "Deu certo");
	}
	
	@Test
	void calcular_perimetro_positivos() {
		q.setAltura(3);
		q.setBase(3);
		double obtido = q.calcularPerimetro();
		assertEquals(12, obtido, "Deu certo");
	}
	@Test
	void calcular_perimetro_nulo() {
		q.setAltura(0);
		q.setBase(0);
		double obtido = q.calcularPerimetro();
		assertNotEquals(0, obtido, "Deu certo");
	}
	
	@Test
	void calcular_diagonal_positivos() {
		q.setAltura(3);
		q.setBase(3);
		double obtido = q.calcularDiagonal();
		assertEquals(4.242640687119286, obtido, "Deu certo");
	}
	@Test
	void calcular_diagonal_nulo() {
		q.setAltura(0);
		q.setBase(0);
		double obtido = q.calcularDiagonal();
		assertNotEquals(0, obtido, "Deu certo");
	}
}
