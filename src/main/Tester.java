package main;

import arboles.Nodo;
import arboles.ordenamiento.ArbolOrdenamientoB;
import arboles.ordenamiento.NodoOrdenamientoB;

public class Tester {

	public static void main(String[] args) {
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
