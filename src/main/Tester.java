package main;

import arboles.ordenamiento.NodoOrdenamientoB;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NodoOrdenamientoB<Edificio> a = new NodoOrdenamientoB<Edificio>(new Edificio(10, 50.5, 1 ));
		NodoOrdenamientoB<Edificio> b = new NodoOrdenamientoB<Edificio>(new Edificio(15, 50.5, 1 ));
		NodoOrdenamientoB<Edificio> c = new NodoOrdenamientoB<Edificio>(new Edificio(13, 50.5, 1 ));
		a.agregarNodo(b);
		a.agregarNodo(c);
		System.out.println(b.getNodosHijos().get(1));
                NodoOrdenamientoB<Integer> n1 = new NodoOrdenamientoB<>(80);
                n1.agregarNodo(new NodoOrdenamientoB<>(20));
                n1.agregarNodo(new NodoOrdenamientoB<>(150));
                n1.agregarNodo(new NodoOrdenamientoB<>(120));
                System.out.println(((NodoOrdenamientoB)n1.getNodosHijos().get(1)).getNodosHijos().get(1));
	}

}
