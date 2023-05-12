package Tema6ArraysList.Ejercicio5Persona;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Club {
    private ArrayList<Persona> listaPersonas;

    /* ------------------------------- Constructor ------------------------------ */
    public Club() {
        listaPersonas = new ArrayList<>();
    }

    /* --------------------------------- Getter --------------------------------- */
    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    /* ------------------------------- PrintScreen ------------------------------ */
    public void printClub() {
        for (Persona persona : listaPersonas)
            System.out.println(persona + "\n---------------------------------");
    }

    /* ----------------------------- Añadir Personas ---------------------------- */
    public void addPersona(String nombre, HashSet<String> hsHobbies) {
        if (nombre == null || hsHobbies == null)
            return;

        listaPersonas.add(new Persona(nombre, hsHobbies));
    }

    public void addPersona(Persona unaPersona) {
        if (unaPersona == null)
            return;

        listaPersonas.add(unaPersona);
    }

    /* --------- Devolver cantidad de personas con un hobbie determinado -------- */
    public int personasConHobbieDeterminado(String unHobbie) {
        Iterator<Persona> listaPersonaIterator = listaPersonas.iterator();
        int contador = 0;

        while (listaPersonaIterator.hasNext()) {
            if (listaPersonaIterator.next().tieneHobbie(unHobbie.toLowerCase()))
                contador++;
        }

        return contador;
    }

    /* ----- Borrar a las personas de determinado hobbie y devolver la lista ---- */
    public HashSet<String> borrarPersonasConHobbie(String unHobbie) {
        if (unHobbie == null)
            new HashSet<String>().add("No se ha borrado a nadie");

        HashSet<String> listaPersonasBorradas = new HashSet<>();
        Iterator<Persona> listaPersonaIterator = listaPersonas.iterator();
        Persona siguientePersona;

        while (listaPersonaIterator.hasNext()) {
            siguientePersona = listaPersonaIterator.next();

            if (siguientePersona.tieneHobbie(unHobbie.toLowerCase())) {
                listaPersonasBorradas.add(siguientePersona.getNombre());
                listaPersonaIterator.remove();
            }
        }

        if (listaPersonasBorradas.isEmpty())
            listaPersonasBorradas.add("No se ha borrado a nadie");

        return listaPersonasBorradas;
    }
}
