package arboles.binarios;

import arboles.Nodo;

public class NodoBinario <T> extends Nodo {
	
	public NodoBinario(T dato) {
		super(dato);
		this.nodosHijos.add(null);
		this.nodosHijos.add(null);
	}
	
	
	
	public NodoBinario(T dato, Nodo<T> padre) {
		super(dato, padre);
		this.nodosHijos.add(null);
		this.nodosHijos.add(null);
	}



	@Override
	public String toString() {
		return dato.toString();
	}



	public void recorridoInOrder() {
		if(nodosHijos.get(0)!=null)
			((NodoBinario) nodosHijos.get(0)).recorridoInOrder();
		System.out.println(this);
		if(nodosHijos.get(1)!=null)
			((NodoBinario) nodosHijos.get(1)).recorridoInOrder();
		
	}

}
