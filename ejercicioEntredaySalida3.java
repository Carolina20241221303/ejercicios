
package ejercicios;

/**
 *
 * @author CAROLINA FRANCO 20241221303
 */
//Crear un programa que pide dos nÚmero por Scanner y escribe en consola “los números son X e Y”
import java.util.Scanner;
public class ejercicioEntredaySalida3 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("escribe un numero ");
        int número1=input.nextInt();
        System.out.println("escribir un numero ");
        int número2=input.nextInt();
        System.out.println("los números son "+número1+ "e" +número2);
        
    }
    
}
