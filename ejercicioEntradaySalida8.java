package ejercicios;

/**
 *
 * @author CAROLINA FRANCO 20241221303
 */
//Escribir un programa que escriba por pantalla dos números al azar entre 10 y 20
import java.util.Random;
public class ejercicioEntradaySalida8 {
    public static void main(String[] args){
        Random b=new Random();
        int numero;
        
        for (int i=0; i<2;i++){
        numero=(b.nextInt(20-10+1)+10);
        System.out.println(numero);
        }
    }
}
