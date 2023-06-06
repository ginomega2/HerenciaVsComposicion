package Listas;

public class RunnerRecursivo {
    public static void main(String[] args) {
        Lista lista = new Lista(TipoInsercion.INSERCION_ASC);
        lista.agregarOrdenado(new Nodo(new Cliente(701,"el 701",701.701)));
        lista.agregarOrdenado(new Nodo(new Cliente(101,"el 101",101.101)));
        lista.agregarOrdenado(new Nodo(new Cliente(401,"el 401",401.401)));
        lista.agregarOrdenado(new Nodo(new Cliente(301,"el 301",301.301)));
        lista.agregarOrdenado(new Nodo(new Cliente(501,"el 501",501.501)));
        lista.listarTodo();
        System.out.println("total de registros "+lista.numReg);

//        lista.llamarRecursivo();
        System.out.println("LISTADO Recursivo Ascendente ");
        lista.listarRecursivoAscendente(lista.primero);
        System.out.println("LISTADO RecursivoD escendente");
        lista.listarRecursivoDescendente(lista.primero);
        Nodo nodoBuscado = lista.bucarDatoRecursivo(lista.primero,501);
        if (nodoBuscado!=null){
            System.out.printf(" encontrado  id: %d, nombre: %s, saldo: %.2f %n",
                    nodoBuscado.dato.getId(),nodoBuscado.dato.getNombre(),nodoBuscado.dato.getSaldo());
        }
        else {
            System.out.println("no encontrado");
        }

        int lugar= lista.indexOf(401);
        System.out.println("indice del 401 "+lugar);

        System.out.println("LISTADO Recursivo Ascendente ");
        lista.listarRecursivoAscendente(lista.primero);

        Nodo elNodo=lista.getAtIndex(4);

        System.out.printf(" get at index 0 id: %d, nombre: %s, saldo: %.2f %n",
                elNodo.dato.getId(),elNodo.dato.getNombre(),elNodo.dato.getSaldo());



    }
}
