package Tema7HerenciaYPolimorfismo.Ejercicio6Bigrama;

import OperacionesAdicionales.StringOperaciones.LimpiarPantalla;

public class MainFrecuenciaBigramas {
    public static void main(String[] args) {
        LimpiarPantalla.clean();

        /* ---- Construir el objeto de FrecuenciaBigramas y mostrar su contenido ---- */
        FrecuenciaBigramas miFrecuenciaBigramas = new FrecuenciaBigramas("src\\Tema7HerenciaYPolimorfismo\\Ejercicio6Bigrama\\palabras.txt");
        System.out.println(miFrecuenciaBigramas);

        /* -------------------------- Ver el más frecuente -------------------------- */
        System.out.println("\nLista de bigramas de mayor frecuencia:");
        miFrecuenciaBigramas.escribirMasFrecuente();

    }
}
