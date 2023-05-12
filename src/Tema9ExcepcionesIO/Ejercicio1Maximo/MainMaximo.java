package Tema9ExcepcionesIO.Ejercicio1Maximo;

// import java.io.IOException;

import OperacionesAdicionales.StringOperaciones.LimpiarPantalla;

public class MainMaximo {
    public static void main(String[] args)  {
        LimpiarPantalla.clean();

        /* ----------- Provocar excepciones propagándolas aquí, en el main ---------- */
        Maximo miMaximo = new Maximo();
        // try {
        //     System.out.println("El mayor número del fichero es " + miMaximo.maximoSinExcepciones());
        // } catch (IOException exception) {
        //     System.out.println("Ruta incorrecta");
        // }

        System.out.println("Con excepciones, número mayor es " + miMaximo.maximoConExcepciones());
        System.out.println("Continúo y paso de todo");
    }
}
