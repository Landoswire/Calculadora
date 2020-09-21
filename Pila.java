
/**
 *
 * @author issei
 */
public class Pila {

    NodoPila inicio;

    void push(char dato) {
        NodoPila nuevo = new NodoPila();
        nuevo.dato = dato;
        nuevo.siguiente = null;
        if (inicio != null) {
            nuevo.siguiente = inicio;
        }
        inicio = nuevo;
    }

    char pop() {
        if (inicio != null) {
            NodoPila aux = inicio;
            inicio = inicio.siguiente;
            aux.siguiente = null;
            return aux.dato;
        }
        return 0;
    }

    boolean isPilaVacia() {
        return inicio == null;
    }
    //return inicio=null;

    void imprimir() {
        NodoStack aux = inicio;
        System.out.println("PILA");
        while (aux != null) {
            System.out.println(aux.dato);
            aux = aux.siguiente;
        }
    }

}
