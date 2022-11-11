package arboles.ordenamiento;

import arboles.Nodo;
import arboles.binarios.NodoBinario;

public class NodoOrdenamientoB <T extends Comparable> extends NodoBinario<T> {

	public NodoOrdenamientoB(T dato) {
		super(dato);
	}
	
	@Override
	public void agregarNodo(Nodo nodo) {
		if(((Comparable) nodo.getDato()).compareTo(this.dato)>0) {
			if(this.getNodosHijos().get(1)!=null) {
				((NodoOrdenamientoB) this.getNodosHijos().get(1)).agregarNodo(nodo);
			}else {
				nodo.setPadre(this);
				this.getNodosHijos().set(1, nodo);
			}
		}else {
			if(this.getNodosHijos().get(0)!=null) {
				((NodoOrdenamientoB) this.getNodosHijos().get(0)).agregarNodo(nodo);
			}else {
				nodo.setPadre(this);
				this.getNodosHijos().set(0, nodo);
			}
		}
	}

}
