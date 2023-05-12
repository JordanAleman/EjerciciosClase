package Tema5Arrays.Ejercicio15Cadena;

public class MainCadena {
    public static void main(String[] args) {
        /* ---------------------------- Limpiar Pantalla ---------------------------- */
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Cadena miCadena = new Cadena("Pepito2-Luisto2-JaimitoXYZ");
        Cadena miCadena2 = new Cadena("áÁbbEéeBBü Ü");

        /* ----------------------------- Suma de dígitos ---------------------------- */
        System.out.println("Si sumamos todos los dígitos que aparecen en " +
                miCadena.getRistra());
        System.out.println("Suma de dígitos: " + miCadena.sumarDigitos());

        /* ------------- Contar ocurrencias de una String dentro de otra ------------ */
        System.out.println("\nContar ocurrencias de \"to2\"");
        System.out.println(miCadena.getRistra());
        System.out.println("Cantidad de ocurrencias: " + miCadena.contarOcurrencia("to2"));

        /* ------------ Eliminar ocurrencias de una String dentro de otra ----------- */
        System.out.println("\nEliminar ocurrencias de \"to\"");
        System.out.println(miCadena.getRistra());
        miCadena.eliminar("to2");
        System.out.println("String resultante: " + miCadena.getRistra());

        /* ----------------------------- Contar vocales ----------------------------- */
        System.out.println("\nCadena: " + miCadena2);
        System.out.println("Tiene " + miCadena2.contarVocales() + " vocales");

        /* ------------------------------ Cifrar cadena ----------------------------- */
        System.out.println("\nCifrar cadena: " + miCadena);
        miCadena.cifrar();
        System.out.println(miCadena);

        /* ---------------- Mostrar diferentes fechas con su formato ---------------- */
        System.out.println("\nDiferentes fechas");

        String fecha = "";
        int dia, mes, anio;
        for (int i = 0; i < 20; i++) {
            dia = (int) (Math.random() * 31) + 1;
            mes = (int) (Math.random() * 12) + 1;
            anio = (int) (Math.random() * 99);
            fecha = dia + "/" + mes + "/" + anio;
            System.out.println(Cadena.fechaToString(fecha));
        }
        // System.out.println(Cadena.fechaToString("02/12/1990"));
        // System.out.println(Cadena.fechaToString("02/13/1990"));
        // System.out.println(Cadena.fechaToString("29/02/1900"));
        // System.out.println(Cadena.fechaToString("29/2/2001"));
        // System.out.println(Cadena.fechaToString("9/2/01"));
        // System.out.println(Cadena.fechaToString("30/12/50"));
        // System.out.println(Cadena.fechaToString("1/1/49"));
        // System.out.println(Cadena.fechaToString("09/08/5000"));
    }
}
