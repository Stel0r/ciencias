/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arboles;

/**
 *
 * @author KIKE
 */
public abstract class Arbol <T>{
    protected Nodo<T> raiz = null;
    
    public abstract void agregarNodo(T dato);
    
    public abstract void agregarNodo(Nodo<T> nodo);

    /**
     * @return the raiz
     */
    public Nodo<T> getRaiz() {
        return raiz;
    }

    /**
     * @param raiz the raiz to set
     */
    public void setRaiz(Nodo<T> raiz) {
        this.raiz = raiz;
    }
}
