package arboles;

import java.util.ArrayList;

import arboles.ordenamiento.NodoOrdenamientoB;

public abstract class Nodo <T>{
	
	protected T dato;
	protected ArrayList<Nodo<T>> nodosHijos;
	protected Nodo<T> padre = null;

	public Nodo(T dato) {
		this.dato = dato;
		this.nodosHijos = new ArrayList<>();
	}

	public Nodo(T dato, Nodo<T> padre) {
		this.dato = dato;
		this.padre = padre;
		this.nodosHijos = new ArrayList<>();
	}
	
	public Nodo<T> getPadre() {
		return padre;
	}

	public void setPadre(Nodo<T> padre) {
		this.padre = padre;
	}

	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	public ArrayList<Nodo<T>> getNodosHijos() {
		return nodosHijos;
	}

	public void setNodosHijos(ArrayList<Nodo<T>> nodosHijos) {
		this.nodosHijos = nodosHijos;
	}
	
	public abstract void agregarNodo(Nodo<T> nodo);


}
