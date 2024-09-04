/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author CAROLINA FRANCO 20241221303
 */
//Crear un programa que pide un número por Scanner y escribe en consola "el número es xx" 
import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("escribe un número");
       int número=input.nextInt();
       System.out.println("el número es "+número);
    }
}
