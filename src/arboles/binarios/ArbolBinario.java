package arboles.binarios;

import arboles.Arbol;

public abstract class ArbolBinario<T> extends Arbol{
	public void recorridoInOrder() {
		if(raiz!=null)
			((NodoBinario)raiz).recorridoInOrder();
	}
}
