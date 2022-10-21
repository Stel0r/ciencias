package arboles.ordenamiento;

import java.util.ArrayList;

import arboles.Nodo;
import arboles.binarios.ArbolBinario;

public class ArbolOrdenamientoB <T extends Comparable> extends ArbolBinario<T> {
	
	private ArrayList<Nodo> nodos = new ArrayList<Nodo>();

	@Override
	public void agregarNodo(T dato) {
		NodoOrdenamientoB<T> nuevo = new NodoOrdenamientoB<>(dato);
		agregarNodo(nuevo);
	}

	@Override
	public void agregarNodo(Nodo<T> nodo) {
		if(raiz!=null) {
			raiz.agregarNodo(nodo);
		}else {
			raiz = nodo;
		}
		nodos.add(nodo);
	}

	@Override
	public void eliminarNodo(Nodo<T> nodo) {
		Nodo candidato = nodo.getNodosHijos().get(0);
		if(candidato == null) {
			candidato = nodo.getNodosHijos().get(1);
		}else {
			while(candidato.getNodosHijos().get(1)!=null) {
				candidato = (Nodo)candidato.getNodosHijos().get(1);
			}
		}
	}

}
