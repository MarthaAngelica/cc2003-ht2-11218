/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pila;
import java.util.Vector;
/**
 *
 * @author Luis Valdeavellano, 11218
 */
public class Pila1<T> implements Pila<T> {
    private Vector<T> pila;
    
    public Pila1(){
        pila = new Vector();
    }
    
    @Override
    public void push(T elem) {
        pila.add(elem);
    }
    
    /**
     * Devuelve el ultimo número ingresado y lo borra de la pila
     */
    @Override
    public T pop(){
        T a = getLast();
        deleteLast();
        return a;
    }
    
    /**
     * Revisa si la pila está vacía
     * @return true si está vacía y false si no lo está
     */
    @Override
    public boolean isEmpty(){
        return pila.isEmpty();
    }
    
    /**
     * Devuelve el último numero ingresado
     * @return último numero ingresado en la pila
     */
    private T getLast(){
        T a = pila.get(pila.size()-1);
        return a;
    }
    
    /**
     * Borra el último valor ingresado en la pila.
     */
    private void deleteLast(){
        pila.remove(pila.size()-1);
    }
}
