package EjerciciosComplementariosLevel2;

public class Ejercicio6 {
    public static void main(String[] args) {
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
