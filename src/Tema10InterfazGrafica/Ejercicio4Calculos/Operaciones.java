package Tema10InterfazGrafica.Ejercicio4Calculos;

public class Operaciones {
    public static long factorial(int numero) {
        if (numero == 0 || numero == 1)
            return 1;
 
        return numero * factorial(numero - 1);
    }

    public static String esPrimo(int num) {
        if (num <= 1) {
            return "No es primo";
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return "No es primo";
            }
        }
        return "Sí es primo";
    }

    public static void salir() {
        System.exit(0);
    }
}
