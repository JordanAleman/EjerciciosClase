package Tema7HerenciaYPolimorfismo.Ejercicio3Fichero;

public class FicheroMusica extends Fichero {
    private int duracion;

    /* ------------------------------- Constructor ------------------------------ */
    public FicheroMusica(String titulo, int tamanio, int duracion) {
        super(titulo, tamanio);

        if (duracion < 10)
            duracion = 10;

        this.duracion = duracion;
    }

    /* --------------------------------- Getter --------------------------------- */
    public int getDuracion() {
        return duracion;
    }

    /* ------------------------------- PrintScreen ------------------------------ */
    @Override
    public void display() {
        super.display();

        int minutos = duracion / 60;
        int segundos = duracion % 60;
        System.out.printf("Duración: %02d:%02d%n%n", minutos, segundos);
    }
}
