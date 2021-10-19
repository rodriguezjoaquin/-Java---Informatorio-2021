package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String args[]){
        ArrayList<String> array = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num1 = s.nextInt();
        System.out.println("Ingrese el segundo numero (debe ser mayor al primero): ");
        int num2 = s.nextInt();

        for (int i=num1; i<num2; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                array.add(" FizzBuzz ");
            } else if (i % 3 == 0) {
                array.add(" Buzz");
            } else if (i % 2 == 0) {
                array.add(" Fizz");
            } else {
                array.add(""+i);
            }
        }
        System.out.print(array);
    }   
}
