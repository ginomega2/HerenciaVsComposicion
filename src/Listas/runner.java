package Listas;


import java.util.Random;


public class runner {


    public static void main(String[] args) {
        Lista lista = new Lista();

        Nodo nodo1 = new Nodo(10);
        Nodo nodo2 = new Nodo(20);
        Nodo nodo3 = new Nodo(30);
        Nodo nodo4 = new Nodo(40);
        Nodo nodo5 = new Nodo(50);
        lista.agregarOrdenado(nodo1);
        lista.listarTodo();
        System.out.println("*************************");
        lista.agregarOrdenado(nodo5);
        lista.listarTodo();
        System.out.println("*************************");
        lista.agregarOrdenado(nodo2);
        lista.listarTodo();
        System.out.println("*************************");
        lista.agregarOrdenado(nodo3);
        lista.listarTodo();
        System.out.println("*************************");
        lista.agregarOrdenado(nodo4);
        lista.listarTodo();
        System.out.println(" insercion no permitida dato ya existe 40");
        lista.agregarOrdenado(nodo4);
        lista.listarTodo();



        Nodo busca = lista.bucarDato(40);
        if (busca!=null){
            System.out.println("se busco el 40 ");
            System.out.println(busca.getDato());
        }else {
            System.out.println("se busco el 40 ");
            System.out.println("no encontrado");
        }

         busca = lista.bucarDato(45);
        if (busca!=null){
            System.out.println("se busco el 45 ");
            System.out.println(busca.getDato());
        }else {
            System.out.println("se busco el 45 ");
            System.out.println("no encontrado");
        }

       System.out.println("se va a borra el 40");
       Estado resultado = lista.borrar(40);
        switch (resultado){
            case BORRADO_CON_EXITO:
                System.out.println("borado con exito");
                break;
            case CLAVE_NO_EXISTE:
                System.out.println("clave no existe");
                break;
            case LISTA_VACIA:
                System.out.println("LIStA VACIA");

        }

        System.out.println("se va a borra el 40 OTRA VES");
        resultado = lista.borrar(40);
        switch (resultado){
            case BORRADO_CON_EXITO:
                System.out.println("borado con exito");
                break;
            case CLAVE_NO_EXISTE:
                System.out.println("clave no existe");
                break;
            case LISTA_VACIA:
                System.out.println("LIStA VACIA");
        }

        lista.listarTodo();
        System.out.println("borados 10, 20 , 30");
        lista.borrar(10);
        lista.borrar(20);
        lista.borrar(30);
        System.out.println("queda solo");
        lista.listarTodo();

        System.out.println(lista.borrar(30));
        System.out.println(lista.borrar(50));
        System.out.println(lista.borrar(30));



//
//        lista.agregar(nodo4);
//        lista.agregar(nodo2);
//        lista.agregar(nodo3);
//        lista.agregar(nodo1);
//
//        lista.listarTodo();
//        lista.agregarOrdenado(new Nodo(5));
//        lista.listarTodo();
////
//        System.out.println(lista.numReg);
//
//        lista.agregar(nodo);
//        lista.agregar(nodo2);
//        lista.agregar(nodo3);
//        lista.agregar(nodo4);
//
//        lista.listarTodo();
//        System.out.println(lista.numReg);
    }
}
