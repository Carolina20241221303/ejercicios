/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author CAROLINA FRANCO 20241221303
 */
/*Pedir por teclado tres números enteros: el día, mes y año de una fecha. Indicar por pantalla si la fecha
es correcta o incorrecta, imaginando estas reglas para que una fecha sea correcta;
• Ha de ser del siglo XXI (el año debe estar entre 2001 y 2100)
• Todos los meses del año tienen 30 días, (el día no puede ser ni 0 ni menor que 0, ni mayor que 30)
• Hay doce meses en el año (el mes ha de ser menor que 13 y mayor que 0)
*/
import java.util.Scanner;
public class ejercicioSwitch3 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int numero1, numero2, numero3;
        System.out.println("ingrese el año");
        numero1=in.nextInt();
        System.out.println("ingrese el numero de mes");
        numero2=in.nextInt();
        System.out.println("ingrese el numero del dia");
        numero3=in.nextInt();
        // fecha
        if ((numero1>=2001)&&(numero1<=2100)&&(numero2>0)&&(numero2<13)&&(numero3>0)&&(numero3<=30)){
         System.out.println("la fecha es correcta");
        }
        else {
            System.out.println("la fecha es incorrecta, ingrese nuevos datos");
        }
    }
}
