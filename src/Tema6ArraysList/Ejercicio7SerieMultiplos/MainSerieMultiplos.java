package Tema6ArraysList.Ejercicio7SerieMultiplos;

public class MainSerieMultiplos {
    public static void main(String[] args) {
        /* ---------------------------- Limpiar Pantalla ---------------------------- */
        System.out.print("\033[H\033[2J");
        System.out.flush();

        /* ------------------------- Añadir valores al mapa ------------------------- */
        SerieMultiplos miSerieMultiplos = new SerieMultiplos();

        miSerieMultiplos.addEntrada(2);
        miSerieMultiplos.addEntrada(3);
        miSerieMultiplos.addEntrada(5);
        miSerieMultiplos.addEntrada(10);

        /* ------------------- Obtener los valores según una clave ------------------ */
        System.out.println("Lista de múltiplos del '2': ");
        System.out.println(miSerieMultiplos.obtenerMultiplosDe(2));

        /* ------------------------ Mostrar mapa al completo ------------------------ */
        miSerieMultiplos.escribirMap();

    }
}
