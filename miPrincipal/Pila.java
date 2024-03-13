package miPrincipal;
public class Pila<T> {
    //Atributo cabeza, que apunta al tope de la pila
    private Nodo<T> cabeza;
    //Almacena el total de elementos de la pila
    private int tamanio;
    //Constructor
    public Pila(){
        cabeza = null;
        tamanio = 0;
    }
    //Devuelve el total de elementos de la pila
    public int getTamanio(){
        return tamanio;
    }
    //Verificar si la vila esta vacia
    public boolean esVacia(){
        return (cabeza==null);
    }
    //Apila un elemento nuevo 
    public void apilar(T valor){
        //Crear un nuevo Nodo
        Nodo<T> nuevo = new Nodo<T>();
        //Fijarel valor dentro del nodo
        nuevo.setValor(valor);
        if(esVacia()){
            cabeza = nuevo;
        } else {
            //Se enlaza el campo siguente de nuevo con la cabeza
            nuevo.setSiguente(cabeza);
            //La nueva cabeza de la pila pasa a ser nuevo
            cabeza = nuevo;
        }
        tamanio++;
    }
    public void retirar(){
        if(!esVacia){
            cabeza = cabeza.getSiguente();
            tamanio--;
        }
    }
    //Devuelve el elemento en el tope de lapila
    public T cima(){
        
    }
}