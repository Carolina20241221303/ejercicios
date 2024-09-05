package ejercicios;

/**
 *
 * @author CAROLINA FRANCO 20241221303
 */
//Pide un nombre y una edad. Luego nos dice por consola: "El señor/a XXXXX hace YYYY años que es mayor de edad".
import java.util.Scanner;
public class ejercicioEntradaySalida9 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("dime tu nombre");
        String nombre=input.nextLine();
        System.out.println("dime tu edad");
        int edad=input.nextInt();
        if (edad>=18){
            int a = edad-18;
            System.out.println("el señor/a "+nombre+"hace "+a+"años que es mayor de edad");
        }
        else if (edad<18){
            System.out.println("esta persona no es mayor de edad");
        }
    }
}
