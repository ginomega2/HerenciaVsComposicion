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

    public Nodo bucarDato(int datoBuscado){
        Nodo buscador=primero;
        boolean fueEncontrado=false;
        while (buscador!=null && ! fueEncontrado)
            if(buscador.getDato()!=datoBuscado)
                buscador=buscador.siguiente;
            else
                fueEncontrado=true;
        return fueEncontrado ? buscador:null;
    }

    public void listarTodo(){
        actual=primero;
        while (actual!=null) {
            System.out.println("el dato " + actual.getDato());
            actual = actual.siguiente;
        }
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
            actual=ultimo;
            ultimo=nodo;
            ultimo.siguiente=null;
            actual.siguiente=ultimo;
        }
    }


    public void agregarOrdenado(Nodo nodoNuevo){

        if(bucarDato(nodoNuevo.getDato())==null) {
            Nodo Temp, busqueda;
            Temp = nodoNuevo;
            Temp.siguiente = null;

            busqueda = primero;
            if (busqueda == null) {
                primero = Temp;
            } else {
                boolean hallado = false;
                while (busqueda != null && !hallado)
                    if (busqueda.getDato() < nodoNuevo.getDato()) {
                        ultimo = busqueda;
                        busqueda = busqueda.siguiente;
                    } else
                        hallado = true;
                Temp.siguiente = busqueda;
                if (busqueda == primero)
                    primero = Temp;
                else
                    ultimo.siguiente = Temp;
            }
        }else System.out.println("dato ya existe");
    }

    /***
     *
     * @param datoPoBorrar
     * @return 0 - BORRADO CON EXITO
     * 1 - CLAVE NO ENCONTRADA
     * 2 - LISTA VACIA
     */


    public Estado borrar(int datoPoBorrar){
        Nodo busqueda, temp;
        Estado estado;
        boolean  hallado=false;
        if(primero==null)
            estado=Estado.LISTA_VACIA;
        else if (datoPoBorrar==primero.getDato()){
            estado=Estado.BORRADO_CON_EXITO;
            temp=primero;
            primero=primero.siguiente;
            temp=null;
        }else {
            hallado=false;
            busqueda=primero;
            while (busqueda.siguiente!=null && !hallado)
                if (busqueda.siguiente.getDato()!=datoPoBorrar)
                    busqueda=busqueda.siguiente;
            else
                hallado=true;

            if (!hallado)
                estado=Estado.CLAVE_NO_EXISTE;
            else {
                estado=Estado.BORRADO_CON_EXITO;
                temp=busqueda.siguiente;
                busqueda.siguiente=busqueda.siguiente.siguiente;
                temp=null;
            }

        }
        return estado;
    }

}
