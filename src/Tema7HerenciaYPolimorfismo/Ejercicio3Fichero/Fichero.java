package Tema7HerenciaYPolimorfismo.Ejercicio3Fichero;

public abstract class Fichero implements Comparable<Fichero> {
    private String titulo;
    private int tamanio;

    /* ------------------------------- Constructor ------------------------------ */
    public Fichero(String titulo, int tamanio) {
        if (titulo == null || titulo.isBlank()) 
            titulo = "Desconocido";

        if (tamanio < 2) 
            tamanio = 2;
        
        this.titulo = titulo.toLowerCase();
        this.tamanio = tamanio;
    }

    /* --------------------------------- Getter --------------------------------- */
    public String getTitulo() {
        return titulo;
    }

    public int getTamanio() {
        return tamanio;
    }

    /* ------------------------------ PrinitScreen ------------------------------ */
    @Override
    public String toString() {
        return "Título: " + titulo +
                "\nTamaño: " + tamanio;
    }

    public void display() {
        System.out.println(this);
    }

    /* ------------------------------- Comparación ------------------------------ */
    @Override
    public int compareTo(Fichero obj) {
        return tamanio - obj.tamanio;
    }
}
