package Tema6ArraysList.Ejercicio3Libro;

public class ControlErrores {
    protected static void errorParametros(String error) {
        System.out.println();
        throw new IllegalArgumentException(error);
    }
}
