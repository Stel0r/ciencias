package arboles;

public class NodoBinario <T extends Comparable> extends Nodo {
	
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

}
