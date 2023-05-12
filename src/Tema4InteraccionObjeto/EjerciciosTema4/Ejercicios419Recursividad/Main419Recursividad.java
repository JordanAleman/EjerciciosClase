package Tema4InteraccionObjeto.EjerciciosTema4.Ejercicios419Recursividad;

public class Main419Recursividad {
    public static void main(String[] args) {
        limpiarPantalla();
        int numRandom = (int) (Math.random() * 900) + 1;
        int numRandom2 = (int) (Math.random() * 900) + 1;

        System.out.println("El factorial de 6 es " + Libreria.factorial(6));
        System.out.println("El sumatorio de " + numRandom + " es " + Libreria.sumatorio(-5));
        System.out.println("El MCD de " + numRandom + " y " + numRandom2 + " es " +
                Libreria.maxComDiv(-100, -50));

        System.out.println("Número de dígitos de " + numRandom + " es: " + Libreria.contarDigitos(numRandom));
        System.out.println("La potencia es " + Libreria.calcularPotencia(2, -2));
        System.out.println("Fibonacci: " + Libreria.calcularFibonacci(7));

        int maxCount = 20;
        for (int i = 1; i <= maxCount; i++) {
            int fibonacciNumber = Libreria.calcularFibonacci(i);
            System.out.print(fibonacciNumber + " ");
        }
    }

    public static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
