package Tema4InteraccionObjeto.EjerciciosTema4.Ejercicios2ºMatematicasWhile;

public class MainWhile {
    public static void main(String[] args) {
        MatematicasWhiles operaciones = new MatematicasWhiles();

        operaciones.escribirNumero(10, 20);

        operaciones.mostrarParesEntre2y50();

        int cantidadVeces12 = operaciones.generarAleatorios();

        System.out.println("\nEl número 12" + ((cantidadVeces12 == 1)
                ? " ha salido " + cantidadVeces12 + " vez"
                : (cantidadVeces12 == 0)
                        ? " no ha salido ninguna vez"
                        : " ha salido " + cantidadVeces12 + " veces"));

        int sumaSerie = (int) (Math.random() * 10) + 1;
        System.out.println("\nEl resultado de sumar 1/1 + 1/2 + ... + 1/n, siendo n = " + sumaSerie + " da: " +
                operaciones.sumarSeries(sumaSerie));

        System.out.printf("El resultado de sumar 1/1 + 1/2 + ... + 1/n, siendo n = " + sumaSerie + " da: " +
                "%.2f %n", operaciones.sumarSeries(sumaSerie));

        System.out.println("\nEl resultado de sumar 1/1 - 1/2 + 1/3 - 1/4 ... ± 1/n, siendo n = " +
                sumaSerie + " da: " +
                operaciones.sumarSeriesSignosAlternados(sumaSerie));

        /* ----------------------------- Sumar divisores ---------------------------- */
        int sumaDivisores = (int) (Math.random() * 20) + 1;
        System.out.println("\nLa suma de los divisores del número " + sumaDivisores +
                " es " + operaciones.sumarDivisores(sumaDivisores) + "\n");

        /* ------------------------------ Sumar dígitos ----------------------------- */
        int sumarDigitos = (int) (Math.random() * 9949) + 50;
        System.out.println("\nLa suma de los dígitos del número " + sumarDigitos +
                " es " + operaciones.sumarDigitos(sumarDigitos) + "\n");

        /* ---------------------------- Escribir figuras ---------------------------- */
        int escribirFigurasCantidad = (int) (Math.random() * 14) + 2;
        operaciones.escribirFigura1(escribirFigurasCantidad);
        operaciones.escribirFigura2(escribirFigurasCantidad);
        operaciones.escribirFigura3(escribirFigurasCantidad);

        /* -------------------------- Tabla de multiplicar -------------------------- */
        int numeroTablaMultiplicar = (int) (Math.random() * 5) + 8;
        operaciones.escribirTablaMultiplicar(numeroTablaMultiplicar);

        System.out.println("\n<=========⇋⇋⇆=========>");
        operaciones.calcularSumatorios(5, 10);
        
    }

}
