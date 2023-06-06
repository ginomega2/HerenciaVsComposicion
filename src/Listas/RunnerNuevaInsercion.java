package Listas;
///************************** NO TERMINADO   ********************************
public class RunnerNuevaInsercion {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.insertarConIndicd(new Nodo(new Cliente(100,"kris",1010.10)));
        lista.insertarConIndicd(new Nodo(new Cliente(50,"kris",1010.10)));
        lista.insertarConIndicd(new Nodo(new Cliente(150,"kris",1010.10)));
        lista.insertarConIndicd(new Nodo(new Cliente(10,"kris",1010.10)));
        lista.listarTodo();
    }
}
