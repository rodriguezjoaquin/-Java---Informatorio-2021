package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero entero");
        numero = s.nextInt();
        for(int i=1; i<=numero; i++){
          System.out.print(i+" ");
        }

    }   
}
