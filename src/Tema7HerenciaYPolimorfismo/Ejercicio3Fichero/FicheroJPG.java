package Tema7HerenciaYPolimorfismo.Ejercicio3Fichero;

public class FicheroJPG extends FicheroImagen {
    private Compresion compresion;

    /* ------------------------------- Constructor ------------------------------ */
    public FicheroJPG(String titulo, int tamanio, Compresion compresion) {
        super(titulo, tamanio);

        this.compresion = compresion;
    }

    /* --------------------------------- Getter --------------------------------- */
    public Compresion getCompresion() {
        return compresion;
    }

    /* ------------------------------- PrintSceen ------------------------------- */
    @Override
    public void display() {
        super.display();
        System.out.println("Compresión: " + compresion);
    }

}