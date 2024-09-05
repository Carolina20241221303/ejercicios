package ejercicios;

/**
 *
 * @author CAROLINA FRANCO 20241221303
 */
//Escribir un programa que escriba por pantalla un numero al azar entre 0 y 99.
import java.util.Random;
public class ejercicioEntradaySalida7 {
    public static void main(String[] args){
         Random d= new Random();
         int numero;
         numero=d.nextInt(99);
        System.out.println(numero);
        
        
    }
}
