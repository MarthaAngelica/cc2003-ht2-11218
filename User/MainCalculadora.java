/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package User;
import Brain.Calculadora;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Luis Valdeavellano, 11218
 */
public class MainCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        System.out.println("Calculadora Postfix\n");
        Calculadora calcu = new Calculadora();
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            System.out.println("Ingrese una operación postfix separando con espacios o ingrese 'x' para salir:");
            String postfix = teclado.readLine();
            if (postfix.equals("x")) break;
            calcu.setPostfix(postfix);
            int r = calcu.calcular();
            System.out.println("El resultado es: ".concat(String.valueOf(r)));
            System.out.println();
        }
    }
}
