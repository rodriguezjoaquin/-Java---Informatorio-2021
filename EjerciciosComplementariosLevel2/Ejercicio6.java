package EjerciciosComplementariosLevel2;

import java.util.HashMap;
import java.util.HashSet;

public class Ejercicio6 {
    public static void main(String[] args) {
        HashSet<Empleado> empleado = new HashSet<>();
        HashMap<Integer, Float> sueldo = new HashMap<>();
        empleado.add(new Empleado("Diego Armando Maradona", 14276579, 8, 700));
        empleado.add(new Empleado("Lionel Andres Messi", 33016244, 8, 800));
        empleado.add(new Empleado("Wanda Nara", 35021765, 4, 600));
        empleado.add(new Empleado("Mauro Icardi", 38098654, 3, 500));

        for (Empleado e : empleado) {
            System.out.println("Nombre: "+e.nombre+" - DNI: "+e.dni+" - Horas trabajadas: " +e.horasTrabajadas+" - Valor por hora: "+e.valorPorHora);
        }

        for (Empleado e : empleado) {
            sueldo.put(e.getDni(), e.valor());
            System.out.println("CLAVE (DNI): "+e.dni+" - SUELDO: "+e.valor());
        }

    }

    public static class Empleado{
        String nombre;
        int dni;
        float horasTrabajadas;
        float valorPorHora;
    
        public Empleado(String nombre, int dni, float horasTrabajadas, float valorPorHora) {
            this.nombre = nombre;
            this.dni = dni;
            this.horasTrabajadas = horasTrabajadas;
            this.valorPorHora = valorPorHora;
        }
        public int getDni() {
            return dni;
        }
        public void setDni(int dni) {
            this.dni = dni;
        }
        public float valor() {
            return this.horasTrabajadas * this.valorPorHora;
        }
    }
}
