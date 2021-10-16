package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String texto;
        System.out.print("Ingrese frase o texto:");
        texto = s.nextLine();
        System.out.print("Ingrese letra a contar:");
        char letra = s.next().charAt(0);
        
        int contadorLetra = contarCaracteres(texto, letra);
        
        System.out.println("La letra se repite " +contadorLetra+" veces");
    }

    public static int contarCaracteres(String texto, char letra){
        int pos=0;
        int contador=0;
        pos = texto.indexOf(letra);
        while(pos!=-1){
            contador++;
            pos = texto.indexOf(letra,pos+1);
        }
        return contador;
    }
}
