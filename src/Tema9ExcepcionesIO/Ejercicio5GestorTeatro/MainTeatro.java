package Tema9ExcepcionesIO.Ejercicio5GestorTeatro;

import java.io.IOException;

import OperacionesAdicionales.StringOperaciones.LimpiarPantalla;

public class MainTeatro {
    public static void main(String[] args) throws IOException {
        /* ---------------------------- Limpiar pantalla ---------------------------- */
        LimpiarPantalla.clean();

        GestorTeatro miGestorTeatro = new GestorTeatro();
        miGestorTeatro.venderEntradas();

        // Teatro miTeatro = new Teatro();
        // miTeatro.mostrarTeatro();



        /* ------------------------------ Leer fichero ------------------------------ */
        // try {
        //     miTeatro.leerVendidos("vendidas.txt");
        // } catch (IOException e) {
        //     System.out.println("No se encuentra un fichero con ese nombre");
        //     e.printStackTrace();
        // }

        // miTeatro.venderEntradas(5);
        // try {
        //     miTeatro.leerVendidos("vendidas.txt");
        // } catch (IOException e) {
        //     System.out.println("No se encuentra un fichero con ese nombre");
        //     e.printStackTrace();
        // }

        // miTeatro.mostrarTeatro();

        // miTeatro.venderEntradas(6);
        // try {
        //     miTeatro.leerVendidos("vendidas.txt");
        // } catch (IOException e) {
        //     System.out.println("No se encuentra un fichero con ese nombre");
        //     e.printStackTrace();
        // }

        // miTeatro.mostrarTeatro();

        // miTeatro.venderEntradas(3);
        // try {
        //     miTeatro.leerVendidos("vendidas.txt");
        // } catch (IOException e) {
        //     System.out.println("No se encuentra un fichero con ese nombre");
        //     e.printStackTrace();
        // }

        // miTeatro.mostrarTeatro();

       

    }
}
