package arboles.binarios;

import arboles.Arbol;
import arboles.Nodo;

/**
 *
 * @author KIKE
 */
public abstract class ArbolBinario <T> extends Arbol<T> {
    public void recorridoInfijo(){
        if(raiz != null){
            ((NodoBinario)raiz).recorridoInfijo();
        }
    }
}
