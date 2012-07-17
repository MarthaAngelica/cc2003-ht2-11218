/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pila;
import java.util.ArrayList;
/**
 *
 * @author Luis Valdeavellano, 11218
 */
public class Pila1 implements Pila {
    private ArrayList<Integer> pila;
    
    @Override
    /**
     * Agrega un número a la pila
     */
    public void push(int numero){
        Integer a = numero;
        pila.add(a);
    }
    
    @Override
    /**
     * Devuelve el ultimo número ingresado y lo borra de la pila
     */
    public int pop(){
        Integer a = getLast();
        deleteLast();
        return a;
    }
    
    /**
     * Revisa si la pila está vacía
     * @return true si está vacía y false si no lo está
     */
    private boolean isEmpty(){
        return pila.isEmpty();
    }
    
    /**
     * Devuelve el último numero ingresado
     * @return último numero ingresado en la pila
     */
    private int getLast(){
        Integer a = pila.get(pila.size()-1);
        return a;
    }
    
    /**
     * Borra el último valor ingresado en la pila.
     */
    private void deleteLast(){
        pila.remove(pila.size()-1);
    }
}
