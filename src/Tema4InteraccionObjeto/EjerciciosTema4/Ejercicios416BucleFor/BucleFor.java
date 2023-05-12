package Tema4InteraccionObjeto.EjerciciosTema4.Ejercicios416BucleFor;

public class BucleFor {
    private int numRandom;

    private final int MAX = 30;

    // public void contarParesImpares() - genera 20 nºs aleatorios comprendidos
    // entre 1 y 50 y cuenta los pares e impares generados escribiendo al final esta
    // cuenta
    public void contarParesImpares() {
        int sumPar = 0;
        int sumImpar = 0;

        for (int i = 0; i < 20; i++) {
            numRandom = newNumRandom(50);

            if (numRandom % 2 == 0)
                sumPar += numRandom;
            else
                sumImpar += numRandom;
        }

        System.out.println("La suma de pares e impares de 20 números aleatorios " +
                "comprendidos entre 1 y 50 ha dado: " +
                "\nSuma de pares: " + sumPar +
                "\nSuma de impares: " + sumImpar + "\n");
    }

    // public int maximo() - calcula y devuelve el máximo de una secuencia de
    // valores aleatorios comprendidos entre 1 y 100
    public int maximo() {
        int maximo = 0;

        for (int i = 0; i < 50; i++) {
            numRandom = newNumRandom(100);

            if (i == 100)
                return 100;

            if (numRandom > maximo) {
                maximo = numRandom;
            }
        }

        return maximo;
    }

    // public void escribirEstadisticas() - genera MAX notas aleatorias
    // (comprendidas entre 1 y 10) y escribe la siguiente estadística: media de las
    // notas, nota máxima, nota mínima, cuántas veces ha aparecido la nota máxima y
    // cuántas la nota mínima. MAX es una constante de valor 30.
    public void escribirEstadisticas() {
        double mediaNota = 0;
        int notaMaxima = 0;
        int notaMinima = 10;
        int vecesNotaMaxima = 0;
        int vecesNotaMinima = 0;

        System.out.print("Los alumnos han hecho sus exámenes " +
                "y tenemos las siguiente 30 notas: \n[");

        for (int i = 0; i < MAX; i++) {
            numRandom = newNumRandom(10);
            mediaNota += numRandom;

            if (numRandom > notaMaxima) {
                notaMaxima = numRandom;
                vecesNotaMaxima = 0;
            }

            if (numRandom == notaMaxima)
                vecesNotaMaxima++;

            if (numRandom < notaMinima) {
                notaMinima = numRandom;
                vecesNotaMinima = 0;
            }

            if (numRandom == notaMinima)
                vecesNotaMinima++;

            System.out.print((i == MAX - 1)
                    ? numRandom + "]\n"
                    : numRandom + " - ");
        }

        mediaNota = Math.round(mediaNota / MAX * 100.0) / 100.0;

        System.out.println("Media de las notas: " + mediaNota +
                "\nNota máxima: " + notaMaxima + ". Esta nota ha salido " +
                vecesNotaMaxima +
                ((vecesNotaMaxima == 1)
                        ? " vez"
                        : " veces")
                +
                "\nNota mínima: " + notaMinima + ". Esta nota ha salido " +
                vecesNotaMinima +
                ((vecesNotaMinima == 1)
                        ? " vez"
                        : " veces")
                + "\n");
    }

    /* ------------------------ Obtener numero aleatorio ------------------------ */
    private int newNumRandom(int limiteSuperior) {
        return (int) (Math.random() * limiteSuperior) + 1;
    }


   

}
