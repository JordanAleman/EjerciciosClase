package Tema9ExcepcionesIO.EjerciciosTema9.Ejer3ListaNumeros;

import java.io.IOException;

import OperacionesAdicionales.StringOperaciones.LimpiarPantalla;

public class MainListaNumeros {
    public static void main(String[] args) {
        LimpiarPantalla.clean();
        ListaNumeros miListaNumeros = null;

        try {
            miListaNumeros = new ListaNumeros(15);
            miListaNumeros.guardarEnFichero();

            System.out.println(miListaNumeros);

        } catch (ArgumentoIncorrectoExcepcion | IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}
