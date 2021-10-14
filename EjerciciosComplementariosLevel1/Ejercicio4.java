package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num;
        int factorial=1;
        System.out.println("Ingrese un numero para calcular el factorial");
        num = s.nextInt();
        int i= num;
        while(i != 0){
            factorial *= i;
            i--;
        }
        System.out.println("El factorial de "+num+" es "+factorial);
    }
    
}
