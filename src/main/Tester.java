package main;

import javax.print.attribute.standard.NumberOfDocuments;

import arboles.NodoBinario;
import arboles.NodoOrdenamientoB;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NodoOrdenamientoB<Edificio> a = new NodoOrdenamientoB<Edificio>(new Edificio(10, 50.5, 1 ));
		NodoOrdenamientoB<Edificio> b = new NodoOrdenamientoB<Edificio>(new Edificio(15, 50.5, 1 ));
		NodoOrdenamientoB<Edificio> c = new NodoOrdenamientoB<Edificio>(new Edificio(10, 51.5, 1 ));
		a.agregarNodo(b);
		a.agregarNodo(c);
		System.out.println(a.getNodosHijos().get(1));
	}

}
