package Tema9ExcepcionesIO.Ejercicio6ComandoType;

import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import OperacionesAdicionales.StringOperaciones.LimpiarPantalla;

public class MainComandoType {
    public static void main(String[] args) {
        LimpiarPantalla.clean();

        // try {
        // ComandoType.mostrarFichero("typeDOS.txt");
        // } catch (FileNotFoundException e) {
        // System.out.println("Fichero no encontrado");
        // }

        JFileChooser fileChooser = new JFileChooser(new File("E:\\Otros ordenadores\\Mi PC\\1º DAM 2022-2023\\PRO - Programación\\NetBeans\\EjerciciosClase\\src"));
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.setFileFilter(new FileNameExtensionFilter("Archivos txt", "txt"));
        fileChooser.setFileHidingEnabled(true);

        int returnValue = fileChooser.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {

            File archivo = fileChooser.getSelectedFile();

            try {
                ComandoType.mostrarFichero(archivo);
            } catch (IOException i) {
                System.out.println("Hubo un problema con el archivo seleccionado.");
            }

        }

    }
}
