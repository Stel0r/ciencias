package main;

import javax.print.attribute.standard.NumberOfDocuments;

import arboles.binarios.NodoBinario;
import arboles.ordenamiento.ArbolOrdenamientoBinario;
import arboles.ordenamiento.NodoOrdenamientoB;

public class Tester {

	public static void main(String[] args) {
		ArbolOrdenamientoBinario<Integer> arbol=new ArbolOrdenamientoBinario();
		arbol.agregarNodo(new NodoOrdenamientoB(5));
		arbol.agregarNodo(new NodoOrdenamientoB(7));
		arbol.agregarNodo(new NodoOrdenamientoB(2));
		arbol.agregarNodo(new NodoOrdenamientoB(3));
		arbol.recorridoInOrder();
		System.out.println(arbol.getRaiz().getNodosHijos().get(1));
	}

}
