
package ejercicios;

/**
 *
 * @author CAROLINA FRANCO 20241221303
 */
//Crear un programa que pide dos números por Scanner y escribe en consola la suma de ambos, con el texto "xx más yy son zz"
import java.util.Scanner;
public class ejercicioEntredaySalida4 {
    public static void main(String[] args){
        Scanner input=new Scanner (System.in);
        System.out.println("escriba dos números");
        int numero1=input.nextInt();
        int numero2=input.nextInt();
        int suma=numero1+numero2;
        System.out.println(numero1+ "más"+ numero2+ "son" +suma);
    }
}
