package Listas;

public class Nodo {

    protected Cliente dato;

    public Nodo(Cliente dato) {
        this.dato = dato;
        siguiente=null;
    }

    public Cliente getDato() {
        return dato;
    }

    public void setDato(Cliente dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    Nodo siguiente;


}
