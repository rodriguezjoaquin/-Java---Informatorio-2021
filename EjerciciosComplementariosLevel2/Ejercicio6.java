package EjerciciosComplementariosLevel2;

import java.util.HashMap;
import java.util.HashSet;

public class Ejercicio6 {
    public static void main(String[] args) {
        HashSet<Empleado> empleado = new HashSet<>();
    }

    class Empleado {
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
