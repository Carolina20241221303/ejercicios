package ejercicios;

/**
 *
 * @author CAROLINA FRANCO 2024122130
 */
/*Crear un programa que declare una variable de tipo entero y pida al usuario por teclado un valor para ella. 
A continuación muestra un mensaje indicando si el valor de dicha variable es positivo o negativo (Consideraremos el 0 como positivo)
*/
import java.util.Scanner;
public class ejercicioSwitch1 {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int a;
        System.out.println("ingrese un número");
        a=in.nextInt();
        if (a<0){
            System.out.println("este número es negativo");
        }
            else if(a>=0){
                System.out.println("este número es positivo");
                
            }
                
        
    }
}
