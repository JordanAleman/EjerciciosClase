package Tema9ExcepcionesIO.Ejercicio3SumadorEnterosScanner;

import java.io.FileNotFoundException;

import OperacionesAdicionales.StringOperaciones.LimpiarPantalla;

public class MainSumadorEnterosScanner {
    public static void main(String[] args) throws FileNotFoundException {
        LimpiarPantalla.clean();

        SumadorEnterosScanner miSumadorEnterosScanner = new SumadorEnterosScanner("numerosEnteros.txt");
        System.out.println(miSumadorEnterosScanner.sumar());
    }
}
