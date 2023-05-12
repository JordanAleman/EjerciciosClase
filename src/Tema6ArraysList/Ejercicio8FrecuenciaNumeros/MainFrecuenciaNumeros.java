package Tema6ArraysList.Ejercicio8FrecuenciaNumeros;

public class MainFrecuenciaNumeros {
    public static void main(String[] args) {
        /* ---------------------------- Limpiar Pantalla ---------------------------- */
        System.out.print("\033[H\033[2J");
        System.out.flush();

        FrecuenciaNumeros miFrecuenciaNumeros1 = new FrecuenciaNumeros();
        FrecuenciaNumeros miFrecuenciaNumeros2 = new FrecuenciaNumeros();

        /* ------------- Añadir números al mapa de frecuencia de números ------------ */
        for (int i = 0; i < 50; i++) {
            int numeroRandom = (int) (Math.random() * 10) + 1;
            miFrecuenciaNumeros1.addNumero(numeroRandom);
        }

        miFrecuenciaNumeros2.cargarDeFichero();


        /* ----------------------------- Listar números ----------------------------- */
        miFrecuenciaNumeros1.listarFrecuencias();
        System.out.println();
        miFrecuenciaNumeros2.listarFrecuencias();
    }
}
