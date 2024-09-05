package ejercicios;

/**
 *
 * @author CAROLINA FRANCO 20241221303
 */
//Crear un programa que pide dos valores, el nombre y la edad de una persona, y escribe en consola “me llamo XXX y tengo FF años”
import java.util.Scanner;
public class ejercicioEntredaySalida5 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String nombre;
        System.out.println("Dime tu nombre");
        nombre=input.nextLine();
        System.out.println("dime tu edad");
        int edad=input.nextInt();
        System.out.println("me llamo "+nombre+" y tengo "+edad+" años");
    }
    
}
