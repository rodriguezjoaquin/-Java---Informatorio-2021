package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int numero1 = s.nextInt();
        System.out.println("Ingrese otro numero entero para realizar la potencia");
        int numero2 = s.nextInt();
        int pot=1;
        int res=0;

        for(int i=1; i<=numero2; i++){
            res = res + numero1;
            pot = pot * numero1;
        }
        System.out.println(numero1+" elevado a la "+numero2+"= "+pot);
    }
    
    
}
