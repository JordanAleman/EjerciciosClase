package Tema7HerenciaYPolimorfismo.Ejercicio7CD;

import OperacionesAdicionales.StringOperaciones.Nombres;

public class Cancion implements Comparable<Cancion>{
    private String titulo;
    private String interprete;
    private int duracion;

    private static int tituloDesconocido = 1;
    private static int interpreteDesconocido = 1;

    /* ------------------------------- Constructor ------------------------------ */
    public Cancion(String titulo, String interprete, int duracion) {
        if (titulo.isBlank())
            titulo = "Desconocido" + tituloDesconocido++;

        if (interprete.isBlank())
            interprete = "Desconocido" + interpreteDesconocido++;

        if (duracion < 1)
            duracion = 1;

        this.titulo = Nombres.capitalizarNombre(titulo);
        this.interprete = Nombres.capitalizarNombre(interprete);
        this.duracion = duracion;
    }

    /* --------------------------------- Getter --------------------------------- */
    public String getTitulo() {
        return titulo;
    }

    public String getInterprete() {
        return interprete;
    }

    public int getDuracion() {
        return duracion;
    }

    /* ------------------------------- PrintScreen ------------------------------ */
    @Override
    public String toString() {
        int minutos = duracion / 60;
        int segundos = duracion % 60;

        return "Nombre canción: " + titulo +
                "\nIntérprete: " + interprete +
                String.format("%nDuración: %02d:%02d%n%n", minutos, segundos);
    }

    /* -------------------------------- Igualdad -------------------------------- */
    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Cancion otraCancion))
            return false;

        return titulo.equals(otraCancion.titulo) &&
                interprete.equals(otraCancion.interprete) &&
                duracion == otraCancion.duracion;
    }

    @Override
    public int hashCode() {
        return titulo.hashCode() * 3 +
                interprete.hashCode() * 5 +
                duracion * 7;
    }

    /* ------------------------------- Comparación ------------------------------ */
    @Override
    public int compareTo(Cancion obj) {
        return duracion - obj.duracion;
    }
}
