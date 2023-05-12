package Tema4InteraccionObjeto.ExamenTema4;

public class Quiniela {
    private int numJornada;
    private Partido miPartido;

    /* ------------------------------- Constructor ------------------------------ */
    public Quiniela(int numJornada) {
        this.numJornada = numJornada;
    }

    public void generarQuinielas() {
        for (int i = 1; i <= numJornada; i++) {
            System.out.println("\n\nJornada nº " + numJornada);
            System.out.println("    1 X 2\n");

            for (int j = 0; j < 15; j++) {
                miPartido = new Partido();
                System.out.println("   " + miPartido);
            }
        }
        System.out.println();
    }


    
}
