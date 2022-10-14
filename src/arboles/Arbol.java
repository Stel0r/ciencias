package arboles;

import java.util.ArrayList;

public abstract class Arbol<T>{
	
	protected Nodo<T> raiz=null;
	protected ArrayList<Nodo<T>> nodos=new ArrayList();
	
	public Nodo<T> getRaiz() {
		return raiz;
	}
	public void setRaiz(Nodo<T> raiz) {
		this.raiz = raiz;
	}
	public ArrayList<Nodo<T>> getNodos() {
		return nodos;
	}
	public void setNodos(ArrayList<Nodo<T>> nodos) {
		this.nodos = nodos;
	}
	
}
