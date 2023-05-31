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

    @Override
    public String toString() {
        return "Nodo{" +
                "dato=" + dato +
                ", siguiente=" + siguiente +
                '}';
    }
}
