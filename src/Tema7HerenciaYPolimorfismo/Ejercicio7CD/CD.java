package Tema7HerenciaYPolimorfismo.Ejercicio7CD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import Tema7HerenciaYPolimorfismo.Ejercicio7CD.Comparaciones.CompararPorInterprete;
import Tema7HerenciaYPolimorfismo.Ejercicio7CD.Comparaciones.CompararPorTitulo;

public class CD {
    private List<Cancion> listaCanciones;

    /* ------------------------------- Constructor ------------------------------ */
    public CD(List<Cancion> listaCanciones) {
        this.listaCanciones = listaCanciones;
    }

    public CD() {
        listaCanciones = new ArrayList<>();
    }

    /* --------------------------------- Getter --------------------------------- */
    public List<Cancion> getListaCanciones() {
        return listaCanciones;
    }

    /* ------------------------------- PrintScreen ------------------------------ */
    @Override
    public String toString() {
        return super.toString();
    }

    public void listarPorDuracion() {
        if (listaCanciones.isEmpty()) {
            System.out.println("El CD no tiene ninguna canción por el momento");
            return;
        }

        Collections.sort(listaCanciones);

        for (Cancion cancion : listaCanciones) 
            System.out.println(cancion + "\n");
    }

    public void listarPorTitulo() {
        if (listaCanciones.isEmpty()) {
            System.out.println("El CD no tiene ninguna canción por el momento");
            return;
        }

        Collections.sort(listaCanciones, new CompararPorTitulo());

        for (Cancion cancion : listaCanciones) 
            System.out.println(cancion + "\n");
    }

    public void listarPorInterprete() {
        if (listaCanciones.isEmpty()) {
            System.out.println("El CD no tiene ninguna canción por el momento");
            return;
        }

        Collections.sort(listaCanciones, new CompararPorInterprete());

        for (Cancion cancion : listaCanciones) 
            System.out.println(cancion + "\n");
    }

    /* ----------------------- Añadir canciones a la lista ---------------------- */
    public void addCancion(Cancion nuevaCancion) {
        if (nuevaCancion == null) 
            return;
        
        listaCanciones.add(nuevaCancion);
    }

    /* ----------------------------- Borrar canción ----------------------------- */
    public void borrarCancion(String tituloCancion) {
        if (tituloCancion.isBlank() || listaCanciones.isEmpty()) 
            return;
        
        Iterator<Cancion> iterator = listaCanciones.iterator();

        while (iterator.hasNext()) {
            String tituloActual = iterator.next().getTitulo();

            System.out.println(tituloActual + " Tamaño String: " + tituloActual.length());
            System.out.println(tituloCancion  + " Tamaño String: " + tituloCancion.length() + "\n");

            if (tituloActual.equalsIgnoreCase(tituloCancion)) {
                iterator.remove();
            }
        }
    }
}
