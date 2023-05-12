package Tema6ArraysList.Ejercicio2Cadena;

public class MainGrupoCadenas {
    public static void main(String[] args) {
        /* ---------------------------- Limpiar Pantalla ---------------------------- */
        System.out.print("\033[H\033[2J");
        System.out.flush();

        GrupoCadenas miGrupoCadenas = new GrupoCadenas();

        /* ------------------------ Añadir cadenas a la lista ----------------------- */
        Cadena miCadena1 = new Cadena("12345Hala");
        Cadena miCadena2 = new Cadena("1-2-Jordan-3-4");
        Cadena miCadena3 = new Cadena("_-CIeLO-_99");
        Cadena miCadena4 = new Cadena("La palabra palabra tiene palabra en palabra");
        Cadena miCadena5 = new Cadena("Finalmente una 123CADENA321 más");

        miGrupoCadenas.addCadena(miCadena1.getRistra());
        miGrupoCadenas.addCadena(miCadena2.getRistra());
        miGrupoCadenas.addCadena(miCadena3.getRistra());
        miGrupoCadenas.addCadena(miCadena4.getRistra());
        miGrupoCadenas.addCadena(miCadena5.getRistra());

        /* ------------------------------ Listar cadena ----------------------------- */
        System.out.println("Mostrar las cadenas y la suma de sus cifras:\n");
        miGrupoCadenas.listarGrupo();

        System.out.println("████████████████████████████████████████");

        // System.out.println("\nMostrar las cadenas y su cifrado:\n");
        // miGrupoCadenas.listarGrupoCifrado();

        /* -------------- Mostrar lista con cadenas de 3 o más vocales -------------- */
        System.out.println("████████████████████████████████████████");

        System.out.println("\nMostrar lista con cadenas de 3 o más vocales:\n");
        System.out.println(miGrupoCadenas.borrarTresMasVocales() + "\n");
        miGrupoCadenas.listarGrupo();

    }
}
