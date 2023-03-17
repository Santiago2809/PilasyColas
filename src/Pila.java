import java.util.ArrayList;

public class Pila {
    public Nodo cima;

    public Pila() {
        this.cima = null;
    }

    public boolean isEmpty(){
        return cima == null;
    }

    public Object top() throws Exception {
        if(isEmpty()){ throw new Exception("La pila esta vacia, no tiene cima");}
        return cima.elemento;
    }

    public void push(Object elemento){
        Nodo nuevo;
        nuevo = new Nodo(elemento);
        nuevo.siguiente = cima;
        this.cima = nuevo;
    }
    public Object pop() throws Exception {
        if(isEmpty()){ throw new Exception("La pila esta vacia no se puede eliminar nada");}
        Object aux = cima.elemento;
        cima = cima.siguiente;
        return aux;
    }

    public void cleanStack(){
        Nodo aux;
        while (!isEmpty()){
            aux = cima;
            cima = cima.siguiente;
            aux.siguiente = null;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        if(!isEmpty()){
            Nodo aux = cima;
            while(aux != null){
                if(aux.siguiente != null){
                    sb.append(aux.elemento);
                    sb.append(",");
                } else {
                    sb.append(aux.elemento);
                }
                aux = aux.siguiente;
            }
            sb.append("]");
        } else {
            System.out.println("La pila esta vacia");
        }
        return sb.toString();
    }
}
