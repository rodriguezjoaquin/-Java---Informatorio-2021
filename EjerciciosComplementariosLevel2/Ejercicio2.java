package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args){
        List<Integer> numeros = new ArrayList<Integer>();
        //ArrayList<Integer> numeros = new ArrayList();
        numeros.add(4);
        numeros.add(6);
        numeros.add(8);
        numeros.add(2);
        numeros.add(1);
        System.out.println("Lista de enteros: ");
        for(Integer numero: numeros){
            System.out.println(numero);
        }
        System.out.println("Tamaño: "+numeros.size());
        numeros.add(0,15);
        System.out.println();
        System.out.println("Lista agregando un numero entero al principio: ");
        for(Integer numero: numeros){
            System.out.println(numero);
        }
        System.out.println("Tamaño: "+numeros.size());
        numeros.add(numeros.size(),24);
        System.out.println();
        System.out.println("Lista agregando un numero entero al final: ");
        for(Integer numero: numeros){
            System.out.println(numero);
        }
        System.out.println("Tamaño: "+numeros.size());
        
    }
}
