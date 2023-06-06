package Listas;


import java.util.Random;


public class runner {


    public static void main(String[] args) {
        Lista lista = new Lista();

        Nodo nodo1 = new Nodo(new Cliente(50,"nodo1",21234.12));
        Nodo nodo2 =  new Nodo(new Cliente(10,"nodo2",31234.12));
        Nodo nodo3 =  new Nodo(new Cliente(60,"nodo3",41234.12));
        Nodo nodo4 =  new Nodo(new Cliente(5,"nodo4",51234.12));
        Nodo nodo5 =  new Nodo(new Cliente(70,"nodo5",61234.12));
        System.out.println("total registros"+lista.numReg);

        lista.agregarOrdenado(nodo1);
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
        System.out.println("*************************");
        lista.agregarOrdenado(nodo5);
        lista.listarTodo();
        System.out.println("total registros"+lista.numReg);

        System.out.println(" insercion de nodo 4 ya existente se cambia la info ");
        nodo4.dato.setSaldo(333.33);
        nodo4.dato.setNombre("cambiado nodo 4");
        lista.agregarOrdenado(nodo4);
        lista.listarTodo();

        System.out.println("borrando ");
        lista.borrar(50);

        lista.listarTodo();
        System.out.println("total registros"+lista.numReg);

        lista.borrar(10);

        lista.listarTodo();
        System.out.println("total registros"+lista.numReg);





//
//        lista.listarTodo();
//        System.out.println("borados 10, 20 , 30");
//        lista.borrar(10);
//        lista.borrar(5);
//        lista.borrar(70);
//        System.out.println("queda solo");
//        lista.listarTodo();
//
//        System.out.println(lista.borrar(30));
//        System.out.println(lista.borrar(50));
//        System.out.println(lista.borrar(30));




    }
}
