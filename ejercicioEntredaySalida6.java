package ejercicios;

/**
 *
 * @author CAROLINA FRANCO 20241221303
 */
//Crear una variable de tipo double, darle valor, almacenar luego dicha variable double en una variable int, y escribir en valor de las dos variables

public class ejercicioEntredaySalida6 {
    public static void main(String[] args){
        double a=345.6;
        int i=new Double(a).intValue();
        System.out.println("el valor de la variable siendo double es "+a+" y el valor de la variable siendo int es "+i);
    }
    
}
