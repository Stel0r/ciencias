package arboles.ordenamiento;

import arboles.binarios.ArbolBinario;

public class ArbolOrdenamientoBinario<T extends Comparable> extends ArbolBinario{
	public void agregarNodo(NodoOrdenamientoB nodo) {
		if(raiz!=null) {
			((NodoOrdenamientoB) raiz).agregarNodo(nodo);
		}else {
			raiz=nodo;
		}
		nodos.add(nodo);
	}
	
	public boolean eliminarNodo(NodoOrdenamientoB nodo) {
		return false;
		
	}
}
