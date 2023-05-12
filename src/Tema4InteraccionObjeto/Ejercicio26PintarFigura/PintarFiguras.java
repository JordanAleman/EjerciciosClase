package Tema4InteraccionObjeto.Ejercicio26PintarFigura;

public class PintarFiguras {
    private final char BLANCO = ' ';
    private final char NEGRO = '*';
        
    private final int TAM_FILAS_AJEDREZ = 8;
    private final int TAM_COLOR_CASILLA_AJEDREZ = 4;

    /* -------------------------- dibujarTableroAjedrez ------------------------- */
    public void dibujarTableroAjedrez() {
        for (int i = 0; i < TAM_FILAS_AJEDREZ; i++) 
            dibujarBloqueFilaTableroAjedrez(i);
    }

    private void dibujarBloqueFilaTableroAjedrez(int posicion) {
        for (int i = 0; i < 3; i++) {
            if (posicion % 2 == 0) 
                dibujarLineaTableroAjedrez(BLANCO, NEGRO);
            else
                dibujarLineaTableroAjedrez(NEGRO, BLANCO);

            System.out.println();
        }      
    }

    private void dibujarLineaTableroAjedrez(char color1, char color2) {
        for (int i = 0; i < TAM_FILAS_AJEDREZ / 2; i++) {
            for (int j = 0; j < TAM_COLOR_CASILLA_AJEDREZ; j++) 
                System.out.print(color1 + " ");
            

            for (int j = 0; j < TAM_COLOR_CASILLA_AJEDREZ; j++) 
                System.out.print(color2 + " ");       
        }
    }


    /* --------------------------- dibujarArbolNavidad -------------------------- */
    public void dibujarArbolNavidad() {
        int row = 1;
        int tam = 1;

        while (row <= 9) {
            System.out.printf("%" + (row + 30) + "s", dibujarLineaAscendente(row, tam));
            row++;
            tam += 2;
            System.out.println();
        }

        System.out.printf("%32s%n%32s", "000", "000");
    }

    public String dibujarLineaAscendente(int row, int tam) {
        String linea = "";
        int col = row;
        int auxTam = row;

        while (auxTam <= tam) {
            linea += Integer.toString(col); 


            if (++col > 9)
                col = 0;

            if (auxTam++ == tam) {
                linea += dibujarLineaDescendente(--col, auxTam, row);
            }
        }

        return linea;
    }

    public String dibujarLineaDescendente(int col, int auxTam, int row) {
        String linea = "";
        if (col < 0) 
            col = 9;
        

        while (--auxTam > row) {
            if (--col < 0) 
                col = 9;
            
            linea += col;
        }

        return linea;
    }
}
