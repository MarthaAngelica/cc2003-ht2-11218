/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pila;

/**
 * 
 * @author Luis Valdeavellano, 11218
 */
public interface Pila<T> {
    /**
     * Agrega un elemento a la pila
     * Precondición: la pila existe
     * Postcondición: la pila tiene un elemento más
     * @param elem elemento que se quiere agregar a la pila
     */
    public void push(T elem);
    /**
     * Devuelve y elimina el último elemento agregado a la pila
     * Precondición: la pila existe y tiene almenos un valor ingresado
     * Postcondición: la pila tiene un elemento menos
     * @return ultimo elemento agregado a la pila
     */
    public T pop();
    /**
     * Indica si la pila esta vacía (si no tiene elementos)
     * Precondición: la pila existe
     * Postcondición: 
     * @return si esta vacía o no la pila
     */
    public boolean isEmpty();
}
