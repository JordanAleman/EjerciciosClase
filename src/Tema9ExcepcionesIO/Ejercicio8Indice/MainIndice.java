package Tema9ExcepcionesIO.Ejercicio8Indice;

import java.io.IOException;

import OperacionesAdicionales.StringOperaciones.LimpiarPantalla;

public class MainIndice {
    public static void main(String[] args) throws IOException {
        LimpiarPantalla.clean();

        /* ------------------------------ CreadorIndice ----------------------------- */
        CreadorIndice miCreadorIndice = new CreadorIndice();
        miCreadorIndice.leerFichero();
        System.out.println();
        miCreadorIndice.listarIndice();
        miCreadorIndice.leerFicheroIndices();

        // IndiceDocumento miIndiceDocumento = new IndiceDocumento();
        // miIndiceDocumento.addPalabra("Hola", 1);
        // miIndiceDocumento.addPalabra("hola", 2);
        // miIndiceDocumento.addPalabra("Adiós", 2);
        // miIndiceDocumento.addPalabra("Hola", 3);
        // miIndiceDocumento.addPalabra("Caracola", 27);
        // miIndiceDocumento.addPalabra("Hola", 4);
        // miIndiceDocumento.addPalabra("Caracola", 28);
        // miIndiceDocumento.addPalabra("Hola", 5);
        // miIndiceDocumento.addPalabra("Hola", 4);
        // miIndiceDocumento.addPalabra("Caracola", 28);
        // miIndiceDocumento.addPalabra("caracola", 29);
        // miIndiceDocumento.addPalabra("Ratón", 479);
        // miIndiceDocumento.addPalabra("móvil", 23);
        // miIndiceDocumento.addPalabra("Azul", 455);
        // miIndiceDocumento.addPalabra("Ratón", 9);

        // IndiceDocumento prueba = new IndiceDocumento();

        // prueba.addPalabra("hola", 1);
        // prueba.addPalabra("Caracola", 5);
        // prueba.addPalabra("adios",56);
        // prueba.addPalabra("CaRAcOla", 6);
        // prueba.addPalabra("adios",57);
        // prueba.addPalabra("Caracola", 7);

        // miIndiceDocumento.listarIndiceDocumento();
        // prueba.listarIndiceDocumento();
    }
}
