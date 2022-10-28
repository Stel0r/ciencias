package main;

import arboles.Nodo;
import arboles.ordenamiento.ArbolOrdenamientoB;
import arboles.ordenamiento.NodoOrdenamientoB;

public class Tester {

	public static void main(String[] args) {
		/*
		NodoOrdenamientoB<Edificio> a = new NodoOrdenamientoB<Edificio>(new Edificio(10, 50.5, 1 ));
		NodoOrdenamientoB<Edificio> b = new NodoOrdenamientoB<Edificio>(new Edificio(15, 50.5, 1 ));
		NodoOrdenamientoB<Edificio> c = new NodoOrdenamientoB<Edificio>(new Edificio(13, 50.5, 1 ));
		a.agregarNodo(b);
		a.agregarNodo(c);
		System.out.println(b.getNodosHijos().get(1));
                NodoOrdenamientoB<Integer> n1 = new NodoOrdenamientoB<>(80);
                n1.agregarNodo(new NodoOrdenamientoB<>(20));
                n1.agregarNodo(new NodoOrdenamientoB<>(150));
                n1.agregarNodo(new NodoOrdenamientoB<>(120));*/
                ArbolOrdenamientoB<Integer> abi = new ArbolOrdenamientoB<>();
                abi.agregarNodo(20);
                abi.agregarNodo(150);
                abi.agregarNodo(120);
                abi.agregarNodo(-10);
                abi.agregarNodo(0);
                abi.agregarNodo(15);
                abi.agregarNodo(5);
                abi.agregarNodo(9);
                
                abi.eliminarNodo(abi.buscar(20));
                abi.recorridoInfijo();
                System.out.println(abi.getRaiz());
	}

}
