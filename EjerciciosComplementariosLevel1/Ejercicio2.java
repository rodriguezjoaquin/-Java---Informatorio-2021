package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        int num1, num2, suma, resta, multiplicacion, division, resto;
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        num1 = s.nextInt();
        System.out.println("Ingrese otro numero entero");
        num2 = s.nextInt();

        suma = num1 + num2;
        System.out.println(num1+" + "+num2+" = "+suma);
        resta = num1 - num2;
        System.out.println(num1+" - "+num2+" = "+resta);
        multiplicacion = num1 * num2;
        System.out.println(num1+" * "+num2+" = "+multiplicacion);
        division = num1 / num2;
        System.out.println(num1+" / "+num2+" = "+division);
        resto = num1 % num2;
        System.out.println(num1+" % "+num2+" = "+resto);

    }
    
}
