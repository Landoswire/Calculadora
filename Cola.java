/**
 *
 * @author Issei
 */
public class Cola {

    NodoCola inicio = null;
    NodoCola fin = null;

    void queue(char dato) {
        NodoCola nuevo = new NodoCola();
        nuevo.dato = dato;
        nuevo.siguiente = null;
        nuevo.anterior = null;
        if (inicio != null) {
            inicio.anterior = nuevo;
            nuevo.siguiente = inicio;
            
        } else {
            
            inicio = nuevo;
            fin = nuevo;
        }
    }

    char dequeue() {
        char letra;
        if (fin != null) {
            NodoCola aux = fin;

            if (inicio == fin) {
                inicio = null;
                //  System.out.println("un elemento");
                fin = null;
            } else {
                fin = fin.anterior;
                fin.siguiente = null;
            }
            aux.siguiente = null;
            aux.anterior = null;
            letra = aux.dato;
        } else {
            letra = 0;
        }
        return letra;
    }

}
