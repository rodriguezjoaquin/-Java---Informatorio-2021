package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int num1 = s.nextInt();
        System.out.println("Ingrese otro numero entero");
        int num2 = s.nextInt();
        int mult = num1 * num2;
        System.out.println(num1+" X "+num2+" = "+mult);
    }
    
}
