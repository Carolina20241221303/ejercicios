package ejercicios;

/**
 *
 * @author CAROLINA FRANCO 20241221303
 */
/*Realiza un programa que pida una hora por teclado y que muestre luego buenos días, buenas tardes buenas noches según la hora. 
Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las horas, los minutos no 
se deben introducir por teclado.
*/
import java.util.Scanner;
public class ejercicioSwitch4 {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int hora;
        System.out.println("Ingrese la hora");
        hora=in.nextInt();
        if((hora>=6)&&(hora<=12)){
            System.out.println("Buenos días");
        }
        else if ((hora>=13)&&(hora<=20)){
            System.out.println("Buenas tardes");
        }
        else if((hora>=21)&&(hora<=24)){
            System.out.println("Buenas noches");
        }
        else if((hora>=1)&&(hora<=5));
        System.out.println("Buenas noches");
    }
}
