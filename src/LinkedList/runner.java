package LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class runner {
    public static void main(String[] args) {
        LinkedList lista = new LinkedList();
        System.out.println("add last");
        lista.addLast(10);
        lista.addLast(5);
        lista.addLast(50);
        lista.addLast(3);lista.addLast(5);
        System.out.println(lista);
        System.out.println("add first");
        lista.addFirst(100);
        lista.addFirst(1);
        lista.addFirst(104);
        lista.addFirst(100);
        lista.addFirst(1);
        lista.addFirst(104);
        System.out.println(lista);

        System.out.println("remove last");
        lista.removeLast();
        System.out.println(lista);
        lista.removeLast();
        System.out.println(lista);

        System.out.println("remove first");
        lista.removeFirst();
        System.out.println(lista);
        lista.removeFirst();
        System.out.println(lista);
        lista.removeFirst();
        System.out.println(lista);

        System.out.println("remove con indice 1,2,3");
        lista.remove(1);
        System.out.println(lista);
        lista.remove(2);
        System.out.println(lista);
        lista.remove(3);
        System.out.println(lista);

        System.out.println("busqueda de elementos");
        System.out.println(lista.contains(100));
        lista.addLast(33);
        System.out.println(lista);

        System.out.println("busqueda de elementos por indice");
        System.out.println(lista.indexOf(33));

        System.out.println("size ");
        System.out.println(lista.size());

        System.out.println("convertirko en array");
        var arreglo = lista.toArray();

        System.out.println(Arrays.toString(arreglo));


        //ejercicio crear lista ligada con loos metodos
        // addfirst
        // addLast
        // delete first
        // delete last
        // contains
        // indexOf




    }
}
