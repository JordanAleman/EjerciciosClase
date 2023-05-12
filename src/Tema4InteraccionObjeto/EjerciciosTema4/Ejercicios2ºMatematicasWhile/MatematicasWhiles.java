package Tema4InteraccionObjeto.EjerciciosTema4.Ejercicios2ºMatematicasWhile;

public class MatematicasWhiles {

    public void escribirNumero(int desde, int hasta) {

        while (desde <= hasta) {
            System.out.print(desde +
                    ((desde++ != hasta)
                            ? ", "
                            : "\n"));
        }
    }

    public void mostrarParesEntre2y50() {
        int cont = 2;

        while (cont <= 50) {
            System.out.print(cont +
                    (((cont += 2) <= 50)
                            ? ", "
                            : "\n"));
        }
    }

    public int generarAleatorios() {
        int acum = 0;
        int cont = 0;
        int numRandom = 0;

        while (++cont <= 300 && numRandom != 99) {
            numRandom = (int) ((Math.random() * 100) + 1);
            if (numRandom == 12) {
                acum++;
            }
        }

        return acum;
    }

    public double sumarSeries(int n) {
        int cont = 1;
        double resultadoSuma = 0;

        if (n <= 0)
            n = 1;

        while (cont <= n) {
            resultadoSuma += (double) 1 / cont++;
        }

        return resultadoSuma;
    }

    public double sumarSeriesSignosAlternados(int n) {
        double cont = 2.0;
        double signo = -1.0;
        double resultadoSuma = 1.0;

        if (n <= 0)
            n = 1;

        while (cont <= n) {
            resultadoSuma += (1.0 / cont++) * signo;
            signo *= -1.0;
        }

        return Math.round(resultadoSuma * 100.0) / 100.0;
    }

    public int sumarDivisores(int numero) {
        numero = Math.abs(numero);
        int aux = numero;
        int acum = 0;

        while (aux > 0) {
            if (numero % aux == 0) {
                acum += aux;
            }

            aux--;
        }

        return acum;
    }

    public int sumarDigitos(int numero) {
        int acum = 0;

        while (numero > 0) {
            acum += (numero % 10);
            numero /= 10;
        }

        return acum;
    }

    /* ---------------------------- Escribir Figuras ---------------------------- */
    public void escribirLinea(int n, int row) {
        int colum = 1;

        while (colum <= n) {
            System.out.printf("%2d" +
                    ((colum++ == n)
                            ? "\n"
                            : " "),
                    row);
        }
    }

    public void escribirFigura1(int n) {
        if (n == 0)
            n = 1;

        n = Math.abs(n);
        int row = 0;

        while (++row <= n) {
            escribirLinea(n, row);
        }

        System.out.println();

    }

    public void escribirFigura2(int n) {
        if (n == 0)
            n = 1;

        n = Math.abs(n);
        int row = 0;

        while (++row <= n) {
            escribirLinea(row, row);
        }

        System.out.println();

    }

    public void escribirFigura3(int n) {
        if (n == 0)
            n = 1;

        n = Math.abs(n);
        int colum = 1;
        int row = 0;

        while (++row <= n) {
            while (colum <= row) {
                System.out.print(colum +
                        ((colum++ == row)
                                ? "\n"
                                : " "));
            }

            colum = 1;

        }

        System.out.println();

    }

    public void escribirTablaMultiplicar(int numero) {
        numero = Math.abs(numero);
        int contRow = 1;
        int contColumn = 1;

        while (contRow <= 10) {
            while (contColumn <= numero) {
                System.out.printf("%2d * %2d = %3d     ",
                        contColumn, contRow, contColumn * contRow);
                contColumn++;
            }
            contColumn = 1;
            contRow++;
            System.out.println();
        }
    }

    public void calcularSumatorios(int cuantos, int limite) {
        while (cuantos-- > 0) {
            int numeroAleatorio = numeroAleatorio(limite);
            System.out.println("El sumatorio de " + numeroAleatorio + " da: " + sumatorio(numeroAleatorio));
        }
    }

    /* --------------------------- Operaciones básicas -------------------------- */
    public int numeroAleatorio(int numero) {
        return (int) (Math.random() * numero) + 1;
    }

    public int sumatorio(int numero) {
        int acum = 0;

        while (numero > 0) {
            acum += numero--;
        }

        return acum;
    }


    

}
