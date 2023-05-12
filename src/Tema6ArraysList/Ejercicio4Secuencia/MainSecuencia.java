package Tema6ArraysList.Ejercicio4Secuencia;

import java.util.ArrayList;

public class MainSecuencia {
    public static void main(String[] args) {
        /* ---------------------------- Limpiar Pantalla ---------------------------- */
        System.out.print("\033[H\033[2J");
        System.out.flush();

        /* ----------------------- Crear secuencias de números ---------------------- */
        ArrayList<Integer> listaEnteros1 = Secuencia.listaEnterosAleatorios();
        ArrayList<Integer> listaEnteros2 = Secuencia.listaEnterosAleatorios();

        Secuencia miSecuencia1 = new Secuencia(listaEnteros1);
        Secuencia miSecuencia2 = new Secuencia(listaEnteros2);
        System.out.println(miSecuencia1);
        System.out.println(miSecuencia2);

        /* ------------------------- Fusionar las secuencias ------------------------ */
        Secuencia secuenciasFusionadas = miSecuencia1.fusionarCon(miSecuencia2);
        System.out.println("\nSecuencia fusionada: \n" + secuenciasFusionadas);

        /* ----------------------- Interseccion de secuencias ----------------------- */
        Secuencia secuenciasInterseccion = miSecuencia1.interseccionCon(miSecuencia2);
        System.out.println("\nSecuencia intersección: \n" + secuenciasInterseccion);


        // ArrayList<Integer> listaEnteros3 = new ArrayList<>();
        // ArrayList<Integer> listaEnteros4 = new ArrayList<>();

        // Secuencia miSecuencia3 = new Secuencia(listaEnteros3);
        // Secuencia miSecuencia4 = new Secuencia(listaEnteros4);

        // Secuencia aux = miSecuencia3.interseccionCon(miSecuencia4);
        // System.out.println(aux);
    }
}
