/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author CAROLINA FRANCO 20241221303
 */
// crear un programa que pide un nombre por Scanner y escribe en consola"buenas tardes, Sr xx"
import java.util.Scanner;
public class ejercicio1 {
    public static void main(String[] args){
     Scanner input= new Scanner (System.in);
     String nombre;
     System.out.println("Dime tu nombre");
     nombre=input.nextLine();
     System.out.println("buenas tardes, Sr "+nombre);
    }
}
