package Listas;

public class Lista {
    int numReg=0;

    Nodo primero, ultimo, actual;

    public Lista() {
        primero=ultimo=actual=null;
        numReg=0;
    }

    public int totalRegistros(){
        return numReg;
    }
    public void listarTodo(){
        if(primero!=null)
        actual=primero;
        do {
            System.out.println("el dato "+actual.getDato());
            actual=actual.siguiente;

        }while (actual!=null);
    }

    public void agregar(Nodo nodo ){
        if(primero==null){
            numReg++;
            primero=nodo;
            primero.siguiente=null;
            ultimo=primero;
        }else if(primero==ultimo){
            numReg++;
            ultimo= nodo;
            ultimo.siguiente=null;
            primero.siguiente=ultimo;
        }else {
            numReg++;
            actual=primero;
            while (actual.siguiente!=null)
                actual= actual.siguiente;
            ultimo=nodo;
            ultimo.siguiente=null;
            actual.siguiente=ultimo;
        }

    }
}
