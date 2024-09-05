package ejercicios;

/**
 *
 * @author CAROLINA FRANCO 20241221303
 */
//Solicitar por teclado el radio de un círculo, guardarlo en un int, y calcular el área del círculo (el area de un circulo es 2*PI*radio). Escribir luego el área por consola. Comprobar que sale con decimales, si es el caso.
import java.util.Scanner;
public class ejercicioEntradaySalida10 {
    public static void main (String[] args){
        Scanner input=new Scanner(System.in);
        float pi,ar;
        System.out.println("escriba el radio del circulo");
        int radio=input.nextInt();
        pi=(float)3.14;
        ar=2*pi*radio;
        System.out.println("el area del ciruclo es: "+ar);
        
        
        
    }
}
