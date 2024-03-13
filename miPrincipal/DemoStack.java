package miPrincipal;
import java.util.Stack;
public class Stack {
    public static void main(String[] strgs) {
        Stack<Integer> pila = new Stack<Integer>();
        //Apilamos elementos
        pila.push(2);
        pila.push(3);
        pila.push(4);
        System.out.println("El tope de la pila es "+pila.peek());
        //Desapilamos elementos
        pila.pop();
        System.out.println("El tope de la pila es "+pila.peek());
        int pos = pila.search(0);
        System.out.println("posicionamiento "+pos);
    }
}