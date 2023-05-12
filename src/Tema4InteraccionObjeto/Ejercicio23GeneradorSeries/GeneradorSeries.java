package Tema4InteraccionObjeto.Ejercicio23GeneradorSeries;

public class GeneradorSeries {
    private final String ALFABETO = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final String CARACTERES = "*=";

    public void serieAlfebeto(int fila) {

        int contAlfabeto = 0;

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(ALFABETO.charAt(contAlfabeto) + "    ");
                contAlfabeto++;

                if (contAlfabeto == ALFABETO.length())
                    contAlfabeto = 0;
            }
            System.out.println();
        }

        if (fila <= 0)
            System.out.println("Número inferior o igual a 0 no hay nada que mostrar");
    }

    public void serieLetras(int fila) {
        int contAlfabeto = 0;

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < 10; j++) 
                System.out.print(ALFABETO.charAt(contAlfabeto) + "    ");
                
            contAlfabeto++;
            if (contAlfabeto == ALFABETO.length())
                contAlfabeto = 0;
            System.out.println();
        }

        if (fila <= 0)
            System.out.println("Número inferior o igual a 0 no hay nada que mostrar");

    }

    /* --------------------------- GenerarSerieAlterna -------------------------- */
    public void serieAlterna(int numFilas, int numColumnas) {
        for (int i = 0; i < numFilas; i++) {
            escribirFila(CARACTERES.charAt(i % 2), numColumnas);
            System.out.println();
        }
    }

    public void escribirFila(char caracter, int numColumnas) {
        for (int i = 0; i < numColumnas; i++)
            System.out.print(caracter);
    }

}
