package Listas;

import java.util.Scanner;

public class RunnerMenu {
    public static Lista lista = new Lista();

    public static void main(String[] args) {

        int opcion = 0;
        int salir = 5;

        Scanner scanner =new Scanner(System.in);

        do {
            System.out.println("""
                    1.- Insertar
                    2.- Borrar
                    3.- Modificar
                    4.- Buscar
                    5.- Listar Todo
                    6.- Salir
                    Opcion-->
                    """);
            opcion=scanner.nextInt();
            switch (opcion){
                case 1:insertar();
                    break;
                case 2: borrar();
                    break;
                case 3: modificar();
                    break;
                case 4: buscar();
                    break;
                case 5: listarTodo();
                    break;
            }

        }while (opcion!=6);
    }

    private static void listarTodo() {
        lista.listarTodo();

    }

    private static void buscar() {
        Cliente cliente=new Cliente();
        int elId =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduzca el id a buscar");
        elId=scanner.nextInt();
        Nodo nodo =lista.bucarDato(elId);
        if (nodo==null){
            System.out.println(" el id buscado no existe");
        }else {
            System.out.println("id: "+ nodo.getDato().getId());
            System.out.println( "nombre: "+nodo.getDato().getNombre());
            System.out.println(" saldo: "+nodo.getDato().getSaldo());
        }

    }

    private static void modificar() {
        Cliente cliente=new Cliente();
        Scanner scanner = new Scanner(System.in);
        int idMOdificar;
        System.out.println("introduzca los datos del cleinte");
        System.out.println("ID a modificar");
        idMOdificar= scanner.nextInt();
        var bubsqueda= lista.bucarDato(idMOdificar);
        if (bubsqueda==null){
            System.out.println("id no existe");
        }else {
            System.out.println(" nombre actual es "+bubsqueda.dato.getNombre());
            System.out.println(" saldo  actual es "+bubsqueda.dato.getSaldo());

            System.out.println("introduzca el saldo nuevo");
            bubsqueda.dato.setSaldo(scanner.nextFloat());
            scanner.nextLine();
            System.out.println("introduzca el nombre nuevo");
            bubsqueda.dato.setNombre(scanner.nextLine());

        }



    }

    private static void borrar() {
        Cliente cliente=new Cliente();
        Scanner scanner = new Scanner(System.in);
        int id;
        System.out.println("introduzca los datos del cleinte a borrar");
        System.out.println("introduzca ID");
        id = scanner.nextInt();
        var result=lista.borrar(id);
        switch (result){
            case LISTA_VACIA:
                System.out.println("la lista esta vacia");
                break;
            case CLAVE_NO_EXISTE:
                System.out.println("el id no existe");
                break;
            case BORRADO_CON_EXITO:
                System.out.println("clente borrado con exito");
                break;
        }


    }

    private static void insertar() {
        Cliente cliente=new Cliente();
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduzca los datos del cleinte");
        System.out.println("introduzca nombre");
        cliente.setNombre(scanner.nextLine());
        System.out.println("introduzca ID");
        cliente.setId(scanner.nextInt());

        System.out.println("introduzca saldo");
        cliente.setSaldo(scanner.nextFloat());
        lista.agregarOrdenado(new Nodo(cliente));



    }
}
