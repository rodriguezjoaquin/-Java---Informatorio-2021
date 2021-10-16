package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) {
        List<String> alumnos = new ArrayList<>();
        ingresarAlumnos(alumnos);
        List <String> sublista1 = alumnos.subList(0,4);
        System.out.println("Curso 1:");
        imprimirCursos(sublista1);
        List <String> sublista2 = alumnos.subList(4,8);
        System.out.println("Curso 2:");
        imprimirCursos(sublista2);
        List <String> sublista3 = alumnos.subList(8,12);
        System.out.println("Curso 3:");
        imprimirCursos(sublista3);

    }
    private static void ingresarAlumnos(List<String> alumnos) {
        alumnos.add("Joaquin");
        alumnos.add("Gustavo");
        alumnos.add("Lionel");
        alumnos.add("Homero");
        alumnos.add("Maria");
        alumnos.add("Eva");
        alumnos.add("Daniel");
        alumnos.add("Domingo");
        alumnos.add("Diego");
        alumnos.add("Armando");
        alumnos.add("Dalma");
        alumnos.add("Gianina");
    }

    public static void imprimirCursos(List<String> alumnos){
        for (String alumno: alumnos){
            System.out.print(alumno+" - ");
        }
        System.out.println();
    }
}
