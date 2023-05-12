package ClasesPrincipales;

public class Persona {
    private String nombre;
    private int edad;

    /* ------------------------------- Constructor ------------------------------ */
    public Persona(String nombre, int edad) {
        if (!validarNombre(nombre))
            nombre = "Sin nombre";

        if (!validarEdad(edad)) {
            edad = 1;
        }

        this.nombre = nombre;
        this.edad = edad;
    }

    private boolean validarNombre(String nombre) {
        return nombre.matches("[A-ZÁ-Ú][a-zá-ú]+");
    }

    private boolean validarEdad(int edad) {
        return edad > 0;
    }

    /* --------------------------------- Getter --------------------------------- */
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    /* --------------------------------- Setter --------------------------------- */
    public void setNombre(String nombre) {
        if (validarNombre(nombre))
            this.nombre = nombre;
    }

    public void setEdad(int edad) {
        if (validarEdad(edad))
            this.edad = edad;
    }

    /* ------------------------------- PrintScreen ------------------------------ */
    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\nEdad: " + edad;
    }
}
