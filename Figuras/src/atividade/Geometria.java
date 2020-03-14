package atividade;

import java.util.ArrayList;

public class Geometria {
	public static void main(String[] args) {
		ArrayList<Figura> lista = new ArrayList<Figura>();
		Circulo c = new Circulo(3);
		lista.add(c);
		Losango l = new Losango(3, 4);
		lista.add(l);
		Quadrado q = new Quadrado(3, 3);
		lista.add(q);
		Retangulo r = new Retangulo(3, 4);
		lista.add(r);
		Triangulo t = new Triangulo(3, 3);
		lista.add(t);
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).getClass().toString());
			System.out.println("Área: " + lista.get(i).calcularArea());
			System.out.println("Perímetro: " + lista.get(i).calcularPerimetro() + "\n");
		}
		
		ArrayList<Poligono3d> lista2 = new ArrayList<Poligono3d>();
		Cilindro cilindro = new Cilindro(4, 7, 3, 8);
		lista2.add(cilindro);
		Cubo cubo = new Cubo(4, 4, 4);
		lista2.add(cubo);
		Esfera esfera = new Esfera(4, 5, 5, 4);
		lista2.add(esfera);
		Piramide piramide = new Piramide(6, 6, 6);
		lista2.add(piramide);
		
		for (int i = 0; i < lista2.size(); i++) {
			System.out.println(lista2.get(i).getClass().toString());
			System.out.println("Volume: " + lista2.get(i).calcularVolume() + "\n");
		}
	}
}
