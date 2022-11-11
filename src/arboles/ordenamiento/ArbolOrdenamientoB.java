package arboles.ordenamiento;

import java.util.ArrayList;

import arboles.Nodo;
import arboles.binarios.ArbolBinario;

public class ArbolOrdenamientoB<T extends Comparable> extends ArbolBinario<T> {

    /**
     * @return the nodos
     */
    public ArrayList<Nodo> getNodos() {
        return nodos;
    }

    /**
     * @param nodos the nodos to set
     */
    public void setNodos(ArrayList<Nodo> nodos) {
        this.nodos = nodos;
    }

    private ArrayList<Nodo> nodos = new ArrayList<Nodo>();

    @Override
    public void agregarNodo(T dato) {
        NodoOrdenamientoB<T> nuevo = new NodoOrdenamientoB<>(dato);
        agregarNodo(nuevo);
    }

    @Override
    public void agregarNodo(Nodo<T> nodo) {
        if (raiz != null) {
            raiz.agregarNodo(nodo);
        } else {
            raiz = nodo;
        }
        getNodos().add(nodo);
    }
    
    public Nodo buscar(T dato){
        for (Nodo nodo : nodos) {
            if(nodo.getDato().equals(dato)){
                return nodo;
            }
        }
        return null;
    }

    @Override
    public void eliminarNodo(Nodo<T> nodo) {
        Nodo candidato = nodo.getNodosHijos().get(0);
        if (candidato == null) {
            candidato = nodo.getNodosHijos().get(1);
            //existe un caso nulo cuando el nodo a eliminar es una hoja
            if(candidato == null){
            	if(nodo.getPadre().getNodosHijos().indexOf(candidato) == 0) {
            		candidato.getPadre().getNodosHijos().set(0, null);
            	}else {
            		candidato.getPadre().getNodosHijos().set(1, null);
            	}
            	return;
            }
            candidato.setPadre(nodo.getPadre());
            if (candidato.getPadre() != null) {
                candidato.getPadre().getNodosHijos().set(candidato.getPadre().getNodosHijos().indexOf(nodo), candidato);
            }else{
                this.setRaiz(candidato);
            }
            return;
        } else {
            while (candidato.getNodosHijos().get(1) != null) {
                candidato = (Nodo) candidato.getNodosHijos().get(1);
            }
        }
        if (candidato.getPadre().getNodosHijos().indexOf(candidato) == 0) {
            candidato.getPadre().getNodosHijos().set(0, candidato.getNodosHijos().get(0));
        } else {
            candidato.getPadre().getNodosHijos().set(1, candidato.getNodosHijos().get(0));
        }
        candidato.setPadre(nodo.getPadre());
        candidato.setNodosHijos(nodo.getNodosHijos());
        if (candidato.getPadre() != null) {
            candidato.getPadre().getNodosHijos().set(candidato.getPadre().getNodosHijos().indexOf(nodo), candidato);
        }else{
            this.setRaiz(candidato);
        }
       
    }

}
