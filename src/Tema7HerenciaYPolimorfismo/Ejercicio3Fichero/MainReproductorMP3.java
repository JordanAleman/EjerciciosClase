package Tema7HerenciaYPolimorfismo.Ejercicio3Fichero;

public class MainReproductorMP3 {
    public static void main(String[] args) {
        /* ---------------------------- Limpiar Pantalla ---------------------------- */
        System.out.print("\033[H\033[2J");
        System.out.flush();

        /* -------- Construir un objeto de ReproductorMP3 y ver sus canciones ------- */
        ReproductorMP3 miReproductorMP3 = new ReproductorMP3(300);
        // miReproductorMP3.mostrarCanciones();

        /* --------------------- Añadir ficheros al reproductor --------------------- */
        miReproductorMP3.addFichero(new FicheroMusica("PistaMúsica1", 5, 600));
        miReproductorMP3.addFichero(new FicheroMusica("PistaMúsica2", 50, 600));
        miReproductorMP3.addFichero(new FicheroMusica("PistaMúsica3", 19, 4600));

        miReproductorMP3.addFichero(new FicheroJPG("Imagen1", 10, Compresion.ALTA));
        miReproductorMP3.addFichero(new FicheroJPG("Imagen2", 8, Compresion.MEDIA));
        miReproductorMP3.addFichero(new FicheroJPG("Imagen3", 4, Compresion.BAJA));

        miReproductorMP3.addFichero(new FicheroJPG("ImagenRepetida", 5, Compresion.BAJA));
        miReproductorMP3.addFichero(new FicheroJPG("ImagenRepetida", 5, Compresion.BAJA));

        System.out.println();
        miReproductorMP3.mostrarCanciones();

        /* -------------------------- Ordenarlo por tamaño -------------------------- */
        System.out.println("\nOrdenadar las músicas por tamaño:");
        miReproductorMP3.ordenar();
        miReproductorMP3.mostrarCanciones();

        System.out.println("\nOrdenar de manera aleatoria:");
        miReproductorMP3.reordenar();
        miReproductorMP3.mostrarCanciones();

        /* -------------------------------- Eliminar -------------------------------- */
        System.out.println("\n\n");
        miReproductorMP3.mostrarImagenes();
        System.out.println("\nEliminar las imágenes repetidas");

        if (miReproductorMP3.borrarFicheroImagen("ImagenRepetida")) 
            miReproductorMP3.mostrarImagenes();
        else
            System.out.println("No se ha borrado nada");

    }
}
