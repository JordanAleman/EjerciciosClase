package Tema5Arrays.Ejercicio15Cadena;

public class Cadena {
    private String ristra;

    /* ------------------------------- Constructor ------------------------------ */
    public Cadena(String ristra) {
        this.ristra = ristra;
    }

    public Cadena(Cadena otraCadena) {
        if (otraCadena != null)
            ristra = otraCadena.getRistra();
        else
            ristra = "";

    }

    /* --------------------------------- Getter --------------------------------- */
    public String getRistra() {
        return ristra;
    }

    /* --------------------------------- Setter --------------------------------- */
    public void setRistra(String ristra) {
        this.ristra = ristra;
    }

    /* ------------------------------- printScreen ------------------------------ */
    @Override
    public String toString() {
        return ristra;
    }

    /* ----------------------------- Suma de dígitos ---------------------------- */
    public int sumarDigitos() {
        int sumAcumulador = 0;
        char unCaracter;

        for (int i = 0; i < ristra.length(); i++) {
            unCaracter = ristra.charAt(i);

            if (Character.isDigit(unCaracter))
                sumAcumulador += Character.getNumericValue(unCaracter);
        }

        return sumAcumulador;
    }

    /* ---------------------------- Contar ocurrencia --------------------------- */
    public int contarOcurrencia(String fragmento) {
        int acumOcurrencia = 0;

        if (!ristra.contains(fragmento))
            return 0;

        for (int i = 0; i < ristra.length(); i++) {
            if (ristra.indexOf(fragmento, i) != -1) {
                acumOcurrencia++;
                i = ristra.indexOf(fragmento, i);
            }
        }

        return acumOcurrencia;
    }

    /* ------------- Eliminar todas las ocurrencias de un fragmento ------------- */
    public void eliminar(String fragmento) {
        if (fragmento == null)
            return;

        fragmento = fragmento.toLowerCase();
        int posicionFragmento;

        while (ristra.toLowerCase().contains(fragmento)) {
            posicionFragmento = ristra.toLowerCase().indexOf(fragmento);
            ristra = ristra.substring(0, posicionFragmento) +
                    ristra.substring(posicionFragmento + fragmento.length(), ristra.length());
        }
    }

    /* ----------------------------- Contar vocales ----------------------------- */
    public int contarVocales() {
        int sumVocales = 0;

        for (int i = 0; i < ristra.length(); i++) {
            if (esVocal(ristra.charAt(i)))
                sumVocales++;
        }

        return sumVocales;
    }

    private boolean esVocal(char vocal) {
        vocal = Character.toUpperCase(vocal);
        String vocales = "AEIOUÁÉÍÓÚÜ";
        return vocales.contains(vocal + "");
    }

    /* -------------------------- Evaluar tamaño cadena ------------------------- */
    public boolean mayorQue(Cadena otraRistra) {
        return ristra.length() > otraRistra.getRistra().length();
    }

    public boolean menorQue(Cadena otraRistra) {
        return !mayorQue(otraRistra);
    }

    public boolean igualQue(Cadena otraRistra) {
        return ristra.length() == otraRistra.getRistra().length();
    }

    /* ---------------------------- Cifrar la ristra ---------------------------- */
    public Cadena cifrar() {
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String ristraCifrada = "";
        String letra;
        int posicionCifrada;

        for (int i = 0; i < ristra.length(); i++) {
            letra = (ristra.charAt(i) + "").toUpperCase();
            if (!alfabeto.contains(letra))
                ristraCifrada += letra;
            else {
                posicionCifrada = (alfabeto.indexOf(letra) + 3) % alfabeto.length();
                ristraCifrada += alfabeto.charAt(posicionCifrada);
            }
        }

        return new Cadena(ristraCifrada);
    }

    /* ----------------------------- Formatear fecha ---------------------------- */
    public static String fechaToString(String fecha) {
        if (!evaluarFormatoFechaCorrecta(fecha))
            return "Formato fecha incorrecto";

        int[] fechaCorrecta = fechaNumerica(fecha.split("/"));

        if (!evaluarFechaCorrecta(fechaCorrecta))
            return "Fecha inexistente";

        String[] meses = { "enero", "febrero", "marzo", "abril", "mayo", "junio",
                "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre" };

        return String.format("Día %02d de %s de %d",
                fechaCorrecta[0], meses[fechaCorrecta[1] - 1], fechaCorrecta[2]);
    }

    /**
     * Evaluar que el formato de fecha cumpla "dd/mm/aaaa"
     * "dd" puede tener uno o dos dígitos
     * "mm" puede tener uno o dos dígitos
     * "aaaa" es el año y puede tener dos o cuatro dígitos.
     * Si el año es de dos dígitos y son menores que 25, se toma
     * la fecha como mayor de 2000, y si es mayor o igual a 25
     * se tomará como una fecha de 1900
     */
    private static boolean evaluarFormatoFechaCorrecta(String fecha) {
        String[] fechaCorrecta = fecha.split("/");

        if (fechaCorrecta.length != 3) 
            return false;

        if (!evaluarDia(fechaCorrecta[0]))
            return false;

        if (!evaluarMes(fechaCorrecta[1]))
            return false;

        if (!evaluarAnio(fechaCorrecta[2]))
            return false;

        return true;
    }

    private static boolean evaluarDia(String dia) {
        if (!isNumeric(dia))
            return false;
        return dia.length() > 0 && dia.length() <= 2;
    }

    private static boolean evaluarMes(String mes) {
        if (!isNumeric(mes))
            return false;
        return mes.length() > 0 && mes.length() <= 2;
    }

    private static boolean evaluarAnio(String anio) {
        if (!isNumeric(anio))
            return false;
        return anio.length() > 0 && (anio.length() == 2 || anio.length() == 4);
    }

    private static boolean isNumeric(String fecha) {
        try {
            Integer.parseInt(fecha);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    // Evaluar que se trata de una fecha válida
    private static int[] fechaNumerica(String[] fecha) {
        int dia = Integer.parseInt(fecha[0]);
        int mes = Integer.parseInt(fecha[1]);
        int anio = Integer.parseInt(fecha[2]);

        if (fecha[2].length() == 2) {
            if (anio < 25)
                anio += 2000;
            else
                anio += 1900;
        }

        int[] fechaNumerica = { dia, mes, anio };

        return fechaNumerica;
    }

    private static boolean evaluarFechaCorrecta(int[] fecha) {
        int dia = fecha[0];
        int mes = fecha[1];
        int anio = fecha[2];

        if (mes < 1 || mes > 12)
            return false;
        if (dia < 1 || dia > checkBisiesto(mes, anio))
            return false;

        return true;
    }

    private static int checkBisiesto(int mes, int anio) {
        int arrayMeses[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (((anio % 4) == 0)) {
            if (((anio % 100) != 0) || ((anio % 400) == 0))
                arrayMeses[1]++;
        }

        return arrayMeses[mes - 1];
    }
}
