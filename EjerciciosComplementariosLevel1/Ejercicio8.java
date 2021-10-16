package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Ingresar nombre y apellido: ");
        String nombre= s.nextLine();
        System.out.print("Ingresar Edad: ");
        String edad= s.nextLine();
        System.out.print("Ingresar Direccion: ");
        String direc= s.nextLine();
        System.out.print("Ingresar Ciudad: ");
        String ciudad= s.nextLine();
        System.out.println();

        String datos []= {ciudad,direc,edad,nombre};
        for (int i = 0; i < datos.length; i++) {
            System.out.print(datos[i]+" - ");
        }

        
    }
}
