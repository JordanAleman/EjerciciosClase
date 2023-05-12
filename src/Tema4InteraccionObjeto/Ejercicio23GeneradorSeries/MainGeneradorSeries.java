package Tema4InteraccionObjeto.Ejercicio23GeneradorSeries;

public class MainGeneradorSeries {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        GeneradorSeries miGeneradoSeries = new GeneradorSeries();

        /* ------------------------------ SerieAlfabeto ----------------------------- */
        miGeneradoSeries.serieAlfebeto(10);
        System.out.println();

        /* ------------------------------- SerieLetras ------------------------------ */
        miGeneradoSeries.serieLetras(10);
        System.out.println();

        /* ------------------------------ SerieAlterna ------------------------------ */
        miGeneradoSeries.serieAlterna(10, 50);

    }
}
