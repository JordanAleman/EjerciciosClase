package Tema10InterfazGrafica.Ejercicio9Bordes.Controlador;

import java.awt.Image;

import javax.swing.ImageIcon;

public class ImagenRedimensionada {
    public static ImageIcon ImageIconRedimensionada(String path, int nuevoAncho, int nuevoAlto) {
        ImageIcon imagenOriginal  = new ImageIcon(path);

        // Obtener la imagen del ImageIcon
        Image imagen = imagenOriginal .getImage();

        // Cambiar el tamaño de la imagen
        Image imagenRedimensionada = imagen.getScaledInstance(nuevoAncho, nuevoAlto, Image.SCALE_SMOOTH);

        // Crear un nuevo ImageIcon con la imagen redimensionada
        ImageIcon imagenRedimensionadaIcon = new ImageIcon(imagenRedimensionada);

        return imagenRedimensionadaIcon;
    }
}
