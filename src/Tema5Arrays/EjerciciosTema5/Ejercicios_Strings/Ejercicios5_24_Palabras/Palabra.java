package Tema5Arrays.EjerciciosTema5.Ejercicios_Strings.Ejercicios5_24_Palabras;

public class Palabra {
    private String palabra;
    public final String LCap = "[AEIOU]|[Á-Ú]";
    public final String LETRAS = "[A-Z]|[Á-Ú]";
    public final String LETRAS_TILDES = "[Á-Ú]|[Ü]";

    /* ------------------------------- Constructor ------------------------------ */
    public Palabra(String palabra) {
        this.palabra = palabra;
    }

    /* ------------------------------- printScreen ------------------------------ */
    @Override
    public String toString() {
        return palabra;
    }

    /* -------------------------------- Functions ------------------------------- */
    public String invertir() {
        String invertida = "";

        for (int i = palabra.length() - 1; i >= 0; i--)
            invertida += palabra.charAt(i);

        return invertida;
    }

    public int contarVocales() {
        int cont = 0;

        for (int i = 0; i < palabra.length(); i++) {
            String letra = (palabra.charAt(i) + "").toUpperCase();

            if (letra.matches(LCap))
                cont++;
        }

        return cont;
    }

    public boolean mayorQue(String otraPalabra) {
        return palabra.compareTo(otraPalabra) > 0;
    }

    public boolean mayorQueExhaustivo(String otraPalabra) {
        if (palabra.equals(otraPalabra))
            return false;

        return false;
    }

    public boolean esPalindromo() {
        return palabra.equalsIgnoreCase(invertir());
    }

    public boolean esPalindromoAbsoluto() {
        String palindromo = "";
        for (int i = palabra.length() - 1; i >= 0; i--) {
            String letra = (palabra.charAt(i) + "").toUpperCase();

            if (letra.matches(LETRAS_TILDES))
                letra = letraSinTilde(letra);

            if (letra.matches(LETRAS))
                palindromo += letra;
        }

        return soloLetras(palabra).equals(palindromo);
    }

    private String soloLetras(String palabra) {
        String palabraSoloLetras = "";
        for (int i = 0; i < palabra.length(); i++) {
            String letra = (palabra.charAt(i) + "").toUpperCase();

            if (letra.matches(LETRAS_TILDES))
                letra = letraSinTilde(letra);

            if (letra.matches(LETRAS))
                palabraSoloLetras += letra;
        }
        return palabraSoloLetras;
    }

    private String letraSinTilde(String letra) {
        String letrasConTilde = "ÁÉÍÓÚÜ";
        String letrasSinTilde = "AEIOUU";

        for (int i = 0; i < letrasConTilde.length(); i++) {
            if (letra.equals(letrasConTilde.charAt(i) + ""))
                return letrasSinTilde.charAt(i) + "";
        }
        return null;
    }
}
