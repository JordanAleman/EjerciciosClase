package OperacionesAdicionales.StringOperaciones;

public class Conversiones {
    public static boolean esEntero(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException excepcion) {
            return false;
        }
    }
}
