/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Brain;
import Pila.Pila;
/**
 *
 * @author Luis Valdeavellano, 11218
 */
public class Calculadora {
    private String postfix;
    private Pila pila;
    private int[] operando;
    private int resultado = 0;
    
    /**
     * devuelve el siguiente caracter de la cadena del postfix y lo borra de la cadena
     * @return el siguiente caracter de la cadena postfix
     */
    private String getNextChar(){
        String str = "";
        if (postfix.isEmpty()) return "";
        while (postfix.startsWith(" ")){
            postfix=postfix.substring(1);
        }
        if (postfix.isEmpty()) return "";
        while (!postfix.startsWith(" ")){
            str=str.concat(postfix.substring(0, 1));
            postfix=postfix.substring(1);
        }
        return str;
    }
    
    /**
     * procede dependiendo si el caracter en turno es un operador o un operando
     * @param c caracter en turno
     */
    private void evalChar(String c){
        try {
            int a = Integer.parseInt(c);
            pila.push(a);
        }catch (NumberFormatException e) {
            operando[1]=pila.pop();
            operando[0]=pila.pop();
            switch (c) {
                case "+":
                    resultado=operando[0]+operando[1];
                    break;
                case "-":
                    resultado=operando[0]-operando[1];
                    break;
                case "*":
                    resultado=operando[0]*operando[1];
                    break;
                case "/":
                    resultado=operando[0]/operando[1];
                    break;
                default:
                    resultado=operando[1];
                    pila.push(operando[0]);
                    break;
            }
            pila.push(resultado);
        }
    }
    
    /**
     * ingresa la cadena postfix que se quiere calcular
     * @param p cadena postfix
     */
    public void setPostfix(String p){
        postfix=p;
    }
    
    /**
     * Calcula el resultado con la cadena postfix que se encuentre grabada
     * @return Resultado de la operación
     */
    public int calcular(){
        while (!postfix.isEmpty()){
            evalChar(getNextChar());
        }
        return resultado;
    }
}
