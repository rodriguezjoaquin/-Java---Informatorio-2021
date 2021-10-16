package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String palabra = s.nextLine();
        String p = " ";
        for(int i=0;i<palabra.length();i++){
            char letra = mayus(palabra.charAt(i));
            p += letra;

        }
        System.out.println(p);
    }

    private static char mayus(char palabra) {
       if(palabra >= 'a' || palabra <= 'z'){
           palabra = (char)(palabra - ('a' - 'A'));
       }
       return palabra;
    }
    
}
