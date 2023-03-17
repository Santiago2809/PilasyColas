public class Cola {
    Nodo inicio;
    Nodo fin;

    public Cola(){
        inicio = fin = null;
    }

    public boolean isEmpty(){
        return inicio == null;
    }
    public Object getInicio(){
        return inicio.elemento;
    }
    public void push(Object elemento){
        Nodo aux;
        aux = new Nodo(elemento);
        if(isEmpty()){
            inicio = aux;
        } else {
            fin.siguiente = aux;
        }
        fin = aux;
    }
    public Object pop() throws Exception {
        Object aux;
        if(!isEmpty()){
            aux = inicio.elemento;
            inicio = inicio.siguiente;
        } else {
            throw new Exception("No se puede eliminar porque esta vacia");
        }
        return aux;
    }

    public void cleanCola(){
        while (inicio!=null){
            inicio = inicio.siguiente;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        if(!isEmpty()){
            Nodo aux = inicio;
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
            sb.delete(0,sb.length()-1);
            sb.append("La cola esta vacia");
        }
        return sb.toString();
    }
}
