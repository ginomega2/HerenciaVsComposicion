package Listas;

public class Nodo {
    private int dato;

    public Nodo(int dato) {
        this.dato = dato;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }
    Nodo siguiente;
}
