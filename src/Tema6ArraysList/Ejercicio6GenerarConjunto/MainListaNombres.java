package Tema6ArraysList.Ejercicio6GenerarConjunto;

public class MainListaNombres {
    public static void main(String[] args) {
        /* ---------------------------- Limpiar Pantalla ---------------------------- */
        System.out.print("\033[H\033[2J");
        System.out.flush();

        /* ---------------------- Crear conjuntos y mostrarlos ---------------------- */
        GenerarConjunto miConjunto1 = new GenerarConjunto("Conjunto");
        GenerarConjunto miConjunto2 = new GenerarConjunto();

        System.out.println(miConjunto1);
        System.out.println(miConjunto2);

        miConjunto2.setPalabra("La mamá de Paca ama a la mamá de Ana");
        System.out.println(miConjunto2);

        /* ------------------ Añadir nombres a la lista de nombres ------------------ */
        System.out.println("\nLISTA NOMBRES\n");
        ListaNombres miListaNombres = new ListaNombres();

        miListaNombres.addNombre("Pepito");
        miListaNombres.addNombre("Juanito");
        miListaNombres.addNombre("Pepito");
        miListaNombres.addNombre("Jaimito");
        miListaNombres.addNombre("Luisito");
        miListaNombres.addNombre("Carlitos");

        System.out.println(miListaNombres);

        /* ----------------- Mostrar conjunto de nombres de la lista ---------------- */
        System.out.println("\nConjunto de caracteres de nombres:");

        System.out.println(miListaNombres.getListaNombres().get(1) + " -> " +
                miListaNombres.obtenerConjuntoDe(1, miConjunto1));

        System.out.println(miListaNombres.getListaNombres().get(2) + " -> " +
                miListaNombres.obtenerConjuntoDe(2, miConjunto2));

        System.out.println(miListaNombres.getListaNombres().get(3) + " -> " +
                miListaNombres.obtenerConjuntoDe(3, new GenerarConjunto()));

        System.out.println(miListaNombres.getListaNombres().get(4) + " -> " +
                miListaNombres.obtenerConjuntoDe(40, new GenerarConjunto()));
    }
}
