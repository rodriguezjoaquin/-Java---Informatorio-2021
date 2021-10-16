package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero entero");
        numero = s.nextInt();
        int i=1;
        while(i<=numero){
          for(int j=1; j<=i; j++){
            System.out.print(j);
          }
          System.out.println();
          i++;
        }
    }   
}
