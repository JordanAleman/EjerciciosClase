package Tema4InteraccionObjeto.EjerciciosTema4.Ejercicios419Recursividad;

public class Libreria {

    /* -------------------------------- Factorial ------------------------------- */
    public static int factorial(int numero) {
        if (numero == 1 || numero == 0)
            return 1;

        return numero < 0
                ? -1
                : numero * factorial(numero - 1);
    }

    /* -------------------------------- Sumatorio ------------------------------- */
    public static int sumatorio(int numero) {
        if (numero <= 0)
            return 0;

        return numero == 1
                ? 1
                : numero + sumatorio(numero - 1);
    }

    /* --------------------------- MaximoComunDivisor --------------------------- */
    public static int maxComDiv(int numero1, int numero2) {
        return numero1 % numero2 == 0
                ? Math.abs(numero2)
                : Math.abs(maxComDiv(numero2, numero1 % numero2));
    }

    /* ------------------------------ ContarDigitos ----------------------------- */
    public static int contarDigitos(int numero) {
        return Math.abs(numero) < 10
                ? 1
                : 1 + contarDigitos(numero / 10);
    }

    /* ---------------------------- CalcularPotencia ---------------------------- */
    public static double calcularPotencia(int base, int exp) {
        if (exp == 0)
            return 1;

        return exp > 0
                ? base * calcularPotencia(base, exp - 1)
                : 1.0 / base * calcularPotencia(base, exp + 1);
    }

    /* ---------------------------- CalcularFibonacci --------------------------- */
    public static int calcularFibonacci(int numero) {
        if (numero <= 0)
            return -1;
        if (numero < 3)
            return numero - 1;
        return calcularFibonacci(numero - 1) + calcularFibonacci(numero - 2);
    }

    /**
     * * calcularFibonacci(7) = calcularFibonacci(6) + calcularFibonacci(5);
     * ? 5+3=8
     * 
     * * calcularFibonacci(6) = calcularFibonacci(5) + calcularFibonacci(4);
     * ? 3+2=5
     * 
     * * calcularFibonacci(5) = calcularFibonacci(4) + calcularFibonacci(3);
     * ? 2+1=3
     * 
     * * calcularFibonacci(4) = calcularFibonacci(3) + calcularFibonacci(2);
     * ? 1+1=2
     * 
     * * calcularFibonacci(3) = calcularFibonacci(2) + calcularFibonacci(1);
     * ? 1+0=1
     * 
     * * If, calcularFibonacci(2) = 1;
     * * And calcularFibonacci(1) = 0;
     */
}
