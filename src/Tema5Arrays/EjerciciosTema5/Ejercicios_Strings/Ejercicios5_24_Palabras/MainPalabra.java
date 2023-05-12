package Tema5Arrays.EjerciciosTema5.Ejercicios_Strings.Ejercicios5_24_Palabras;

public class MainPalabra {
    public static void main(String[] args) {
        Palabra miPalabra = new Palabra("Dúbale .,-,.-,.-,.-,.-,.-,.-,.,-:;¿''¡!!3456/()el tbud.");
        // Palabra miPalabra2 = new Palabra("No soy un palíndromo");
        System.out.println(miPalabra);

        /* ------------------------ Mostrar palabra invertida ----------------------- */
        String invertida = miPalabra.invertir();
        System.out.println(invertida);

        /* ------------------------ Contar número de volcales ----------------------- */
        System.out.println("La palabra " + miPalabra + " tiene " +
                miPalabra.contarVocales() + " vocales");

        /* ----------- Comparar si la nueva palabra es mayor que miPalabra ---------- */
        if (miPalabra.mayorQue("Zapato"))
            System.out.println("miPalabra es mayor");
        else
            System.out.println("miPalabra es menor");

        /* ------------------------ Comprobar si es palídromo ----------------------- */
        // System.out.println("La palabra " + miPalabra +
        //         (miPalabra.esPalindromo()
        //                 ? " es un palídromo"
        //                 : " no es un palíndromo"));

        System.out.println("\nLa frase " + miPalabra +
                (miPalabra.esPalindromoAbsoluto()
                        ? " es un palídromo"
                        : " no es un palíndromo"));

        // System.out.println("La frase " + miPalabra2 +
        //         (miPalabra2.esPalindromoAbsoluto()
        //                 ? " es un palídromo"
        //                 : " no es un palíndromo"));
    }
}
