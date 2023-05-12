package Tema4InteraccionObjeto.EjerciciosTema4.Ejercicios416BucleFor;

public class AppEjercicio416BucleFor {
    public static void main(String[] args) {
        BucleFor misPruebasFor = new BucleFor();

        misPruebasFor.contarParesImpares();

        System.out.println("El número máximo del 1 al 100 entre 50 números " +
                "aleatorios ha sido el " + misPruebasFor.maximo());

        misPruebasFor.escribirEstadisticas();

    }
}
