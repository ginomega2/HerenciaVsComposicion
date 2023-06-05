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

    /***
     * Metodo para buscar un elemento en la lista no debe haber repetidos
     * @param datoBuscado Elemento a buscar
     * @return si existe retorna el objeto encontrado, retorna null si no existe
     */
    public Nodo bucarDato(int datoBuscado){
        Nodo buscador=primero;
        boolean fueEncontrado=false;
        while (buscador!=null && ! fueEncontrado)
            if(buscador.dato.getId()!=datoBuscado)
                buscador=buscador.siguiente;
            else
                fueEncontrado=true;

        return fueEncontrado ? buscador:null;
    }

    /***
     * Metodo para mostrar todo el contenido de la lista
     */
    public void listarTodo(){
        actual=primero;
        while (actual!=null) {
            System.out.println("id " + actual.getDato().getId()+" nombre " + actual.getDato().getNombre()+" saldo " + actual.getDato().getSaldo());
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


    /***
     * Inserta un registro en la lista de manera ordenada
     * @param nodoNuevo El registro que hay que insertar como nodo
     */
    public void agregarOrdenado(Nodo nodoNuevo){

        Nodo elNodo=bucarDato(nodoNuevo.getDato().getId());
        if(elNodo==null) { // si el dato no se encuentra en la lista precedemos a insertarlo
            Nodo Temp, busqueda;
            Temp = nodoNuevo;   //Se crea el nodo nuevo y almacenamos la informacion de manera temporal y
            Temp.siguiente = null;// la liga la ponemos en nulo

            busqueda = primero;     // comenzamos la busqueda y nos situamos en el priemr elemento
            if (busqueda == null) { // si la busqueda es nula la lista esta vacia
                primero = Temp;     //el primero elemento sera lo que almacenampos de forma  temporal
            }
            else
            {                //en caso de si haber elementos en la lista continuamos la busqueda
                boolean hallado = false;
                while (busqueda != null && !hallado)//buscamos hasta que estemos a punto de ir demasiado lejos (hallado)
                                                    // o hasta que la lista se acaba
                    if (busqueda.getDato().getId() < nodoNuevo.getDato().getId()) {
                        ultimo = busqueda;
                        busqueda = busqueda.siguiente;
                    } else
                        hallado = true;

                Temp.siguiente = busqueda;  // hacemos que el registro temporal nuevo apunte al de busqueda
                if (busqueda == primero)    // si el registro nuevo va a ser el primer registro se pone el
                    primero = Temp;         // primero con los datos nuevos temporales
                else
                    ultimo.siguiente = Temp;// en caso contrario se hace que el ultimo registro apunte al nuevo temporal
            }
        }
        else { // en caso de que buscar dato si lo encuentre modificamos el nodo con la nueva informacin es decir la actualizamos excepto el ID
            System.out.println("dato ya existe nombre " +elNodo.dato.getId());
            System.out.println("dato ya existe nombre " +elNodo.dato.getNombre());
            System.out.println("dato ya existe saldo " +elNodo.dato.getSaldo());
            elNodo.dato.setNombre(nodoNuevo.dato.getNombre());
            elNodo.dato.setSaldo(nodoNuevo.dato.getSaldo());
            System.out.println("nuevo nombre " +elNodo.dato.getNombre());
            System.out.println("nuevo saldo " +elNodo.dato.getSaldo());
            System.out.println("mismo ID  " +elNodo.dato.getId());

        }
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
        else if (datoPoBorrar==primero.getDato().getId()){
            estado=Estado.BORRADO_CON_EXITO;
            temp=primero;
            primero=primero.siguiente;
            temp=null;
        }else {
            hallado=false;
            busqueda=primero;
            while (busqueda.siguiente!=null && !hallado)
                if (busqueda.siguiente.getDato().getId()!=datoPoBorrar)
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
