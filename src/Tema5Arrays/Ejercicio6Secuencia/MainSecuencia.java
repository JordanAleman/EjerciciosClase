package Tema5Arrays.Ejercicio6Secuencia;

public class MainSecuencia {
    public static void main(String[] args) {
        /* ---------------------------- Limpiar Pantalla ---------------------------- */
        System.out.print("\033[H\033[2J");
        System.out.flush();

        /* --------------- Crear y mostrar por pantalla una secuencia --------------- */
        Secuencia miSecuencia1 = new Secuencia(5);
        Secuencia miSecuencia2 = new Secuencia(10);

        miSecuencia1.printSecuencia();
        miSecuencia2.printSecuencia();
        System.out.println();

        /* ------------- Fusionar ambas secuencias y mostrar en pantalla ------------ */
        Secuencia miSecuenciaFusionada = miSecuencia1.fusionarCon(miSecuencia2);
        miSecuenciaFusionada.printSecuencia();

        /* ----- Realizar la intersección de la secuencia fusionada y mostrarla ----- */
        Secuencia miSecuenciaInterseccion = Secuencia.interseccion(miSecuenciaFusionada);
        miSecuenciaInterseccion.printSecuencia();



    }
}
