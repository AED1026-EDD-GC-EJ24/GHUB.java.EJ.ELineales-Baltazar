package miPrincipal;
public class Nodo<T>{
    private T valor;
    //Referencia al siguente nodo enlazado
    Nodo<T> siguente;
    //Constructor por defecto
    public Nodo(){
        valor = null;
        siguente = null;

    }
    public T getValor(){
        return valor;
    }
    //Regresa el valor 
    public void setValor(T valor){
        this.valor = valor;
    }
    //Devuelve el atributo siguente 
    public Nodo<T> getSiguente(){
        return siguente;
    }
    //Modifica el atributo siguente
    public void setSiguente(Nodo<T> siguente){
        this.siguente = siguente;
    }
    
}