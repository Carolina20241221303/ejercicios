package ejercicios;

/**
 *
 * @author CAROLINA FRANCO 20241221303
 */
//Pedir por teclado una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien...
import java.util.Scanner;
public class ejercicioSwitch2 {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        double nota;
        System.out.println("ingrese una nota de 0 a 10");
        nota=in.nextDouble();
        if (nota<6){
            System.out.println("la nota es insuficiente");
        }
        else if(nota<=7)
            System.out.println("la nota es sufiente");
         else if (nota<=10){
             System.out.println("la nota esta bien");
             
    }
   
    
    
    
    
}
    
}
