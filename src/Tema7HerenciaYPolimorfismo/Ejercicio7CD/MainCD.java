package Tema7HerenciaYPolimorfismo.Ejercicio7CD;

import OperacionesAdicionales.StringOperaciones.LimpiarPantalla;

public class MainCD {
    public static void main(String[] args) {
        LimpiarPantalla.clean();

        /* ----------------- Creamos objeto CD y añadimos canciones ----------------- */
        CD miCD = new CD();
        miCD.addCancion(new Cancion("Epic", "Musa", 125));
        miCD.addCancion(new Cancion("Fast", "Clock", 60));
        miCD.addCancion(new Cancion("Celta", "Maya", 185));
        miCD.addCancion(new Cancion("Celta", "Maya", 185));

        /* ---------------------------- Listar canciones ---------------------------- */
        System.out.println("Listar por duración:\n");
        miCD.listarPorDuracion();

        System.out.println("\n________________________________________");
        System.out.println("Listar por título:\n");
        miCD.listarPorTitulo();

        System.out.println("\n________________________________________");
        System.out.println("Listar por intérprete:\n");
        miCD.listarPorInterprete();

        /* ----------------------------- Borrar canción ----------------------------- */
        System.out.println("Borrar canción");
        miCD.borrarCancion("Celta");
        miCD.listarPorDuracion();
    }
}
