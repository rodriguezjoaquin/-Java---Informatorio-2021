package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ejercicio3 {
    public static void main(String[] args){
        ArrayList<String> barajaFrancesa = new ArrayList<>();
        barajaFrancesa.add("As de corazones"); barajaFrancesa.add("2 de corazones"); barajaFrancesa.add("3 de corazones");
        barajaFrancesa.add("4 de corazones"); barajaFrancesa.add("5 de corazones"); barajaFrancesa.add("6 de corazones");
        barajaFrancesa.add("7 de corazones"); barajaFrancesa.add("8 de corazones"); barajaFrancesa.add("9 de corazones");
        barajaFrancesa.add("10 de corazones");
        barajaFrancesa.add("As de diamantes"); barajaFrancesa.add("2 de diamantes"); barajaFrancesa.add("3 de diamantes");
        barajaFrancesa.add("4 de diamantes"); barajaFrancesa.add("5 de diamantes"); barajaFrancesa.add("6 de diamantes");
        barajaFrancesa.add("7 de diamantes"); barajaFrancesa.add("8 de diamantes"); barajaFrancesa.add("9 de diamantes");
        barajaFrancesa.add("10 de diamantes");
        barajaFrancesa.add("As de treboles"); barajaFrancesa.add("2 de treboles"); barajaFrancesa.add("3 de treboles");
        barajaFrancesa.add("4 de treboles"); barajaFrancesa.add("5 de treboles"); barajaFrancesa.add("6 de treboles");
        barajaFrancesa.add("7 de treboles"); barajaFrancesa.add("8 de treboles"); barajaFrancesa.add("9 de treboles");
        barajaFrancesa.add("10 de treboles");
        barajaFrancesa.add("As de picas"); barajaFrancesa.add("2 de picas"); barajaFrancesa.add("3 de picas");
        barajaFrancesa.add("4 de picas"); barajaFrancesa.add("5 de picas"); barajaFrancesa.add("6 de picas");
        barajaFrancesa.add("7 de picas"); barajaFrancesa.add("8 de picas"); barajaFrancesa.add("9 de picas");
        barajaFrancesa.add("10 de picas");

        System.out.println("Baraja francesa ordenada: Corazon - Diamante - Trebol - Pica");
        for (int i=0; i<barajaFrancesa.size(); i++) {
            System.out.print(barajaFrancesa.get(i)+" - ");
        }
        System.out.println();
        System.out.println("Baraja orden inverso: ");
        Collections.reverse(barajaFrancesa);
        for (int i = 0; i <barajaFrancesa.size() ; i++) {
            System.out.print(barajaFrancesa.get(i)+" - ");
        }
        Collections.shuffle(barajaFrancesa);
        System.out.println();
        System.out.println("Baraja mezclada: ");

        for (int i = 0; i <barajaFrancesa.size() ; i++) {
            System.out.print(barajaFrancesa.get(i)+" - ");
        }

    }

}
