package Tema6ArraysList.Ejercicio5Persona;

import java.util.HashSet;

public class Persona {
    private String nombre;
    private HashSet<String> hsHobbies;

    /* ------------------------------- Constructor ------------------------------ */
    public Persona() {
        nombre = "Anónimo";
        hsHobbies = new HashSet<>();

    }

    public Persona(String nombre) {
        if (nombre == null)
            nombre = "Anónimo";

        this.nombre = nombre;
        hsHobbies = new HashSet<>();
    }

    public Persona(String nombre, HashSet<String> hsHobbies) {
        if (nombre == null)
            nombre = "Anónimo";

        if (hsHobbies == null)
            hsHobbies = new HashSet<>();

        this.nombre = nombre;
        addHobbie(hsHobbies);
    }

    /* --------------------------------- Getter --------------------------------- */
    public String getNombre() {
        return nombre;
    }

    public HashSet<String> getHsHobbies() {
        return hsHobbies;
    }

    /* ------------------------------- PrintScreen ------------------------------ */
    public String hobbiesToString() {
        return hsHobbies.toString();
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\nHobbies: " + hobbiesToString();
    }

    /* ----------------------------- Añadir hobbies ----------------------------- */
    public void addHobbie(String nuevoHobbie) {
        if (nuevoHobbie == null)
            return;

        hsHobbies.add(nuevoHobbie.toLowerCase());
    }

    public void addHobbie(HashSet<String> nuevoHobbie) {
        if (nuevoHobbie == null)
            return;

        HashSet<String> auxNuevoHobbie = new HashSet<>();

        for (String string : nuevoHobbie)
            auxNuevoHobbie.add(string.toLowerCase());

        hsHobbies.addAll(auxNuevoHobbie);
    }

    /* ---------------------- Comprobar si tiene un hobbie ---------------------- */
    public boolean tieneHobbie(String unHobbie) {
        if (unHobbie == null)
            return false;
        return hsHobbies.contains(unHobbie.toLowerCase());
    }

}
