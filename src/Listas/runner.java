package Listas;

import java.util.Random;

public class runner {
    public static void main(String[] args) {
        Lista lista = new Lista();

        Nodo nodo = new Nodo(1);
        Nodo nodo2 = new Nodo(2);
        Nodo nodo3 = new Nodo(3);
        Nodo nodo4 = new Nodo(4);


        lista.agregar(nodo);
        lista.agregar(nodo2);
        lista.agregar(nodo3);
        lista.agregar(nodo4);
        lista.listarTodo();

        System.out.println(lista.numReg);

        lista.agregar(nodo);
        lista.agregar(nodo2);
        lista.agregar(nodo3);
        lista.agregar(nodo4);

        lista.listarTodo();
        System.out.println(lista.numReg);
    }
}
