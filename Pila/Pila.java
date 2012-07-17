/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pila;

/**
 * 
 * @author Luis Valdeavellano, 11218
 */
public interface Pila {
    /**
     * 
     * @param numero que se quiere agregar a la pila
     */
    public void push(int numero);
    /**
     * 
     * @return ultimo número agregado a la pila
     */
    public int pop();
}
