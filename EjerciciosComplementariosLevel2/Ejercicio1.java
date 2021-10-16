package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args){
        List<String> ciudades = new ArrayList<>();
        cargarLista(ciudades);
        int i=1;
        for(String ciudad: ciudades){
            System.out.println("#"+i+" - "+ciudad);
            i++;
        }
    }

    private static void cargarLista(List<String> ciudades) {
        ciudades.add("Bariloche");
        ciudades.add("Cordoba");
        ciudades.add("Resistencia");
    }
    
}
