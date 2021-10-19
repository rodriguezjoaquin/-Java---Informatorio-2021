package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio5 {
    public static void main(String args[]){
        List<Integer> horas_trabajadas = new ArrayList<>();
        List<Integer> valorPorHora = new ArrayList<>();
        List<Integer> totales = new ArrayList<>();

        horas_trabajadas.add(6);
        horas_trabajadas.add(7);
        horas_trabajadas.add(8);
        horas_trabajadas.add(4);
        horas_trabajadas.add(5);
        valorPorHora.add(350);
        valorPorHora.add(345);
        valorPorHora.add(550);
        valorPorHora.add(600);
        valorPorHora.add(320);
        for (int i=0; i<horas_trabajadas.size();i++) {
            int j = horas_trabajadas.get(i) * valorPorHora.get(i);
            totales.add(j);
        }
        int totalFinal = 0;
        for (Integer a : totales) {
            totalFinal += a;

        }
        System.out.println(totales);
        System.out.println("Total Final: $"+totalFinal);
    }
    
}
