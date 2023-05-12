package Tema4InteraccionObjeto.Ejercicio7Embarque;

public class Pasajero {
    private String nombre;
    private int edad;

    /* ------------------------------ Constructors ------------------------------ */
    public Pasajero(String nombre) {
        this.nombre = nombre;
        edad = -1;
        
        if (nombre.equals(""))
            this.nombre = "Anónimo";
    }

    public Pasajero(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        
        if (nombre.equals(""))
            this.nombre = "Anónimo";

        if (edad <= -1)
            this.edad = -1;

    }

    /* --------------------------------- Getters -------------------------------- */
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    /* --------------------------------- Setters -------------------------------- */
    public void setNombre(String nombre) {
        if (!nombre.equals(""))
            this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;

        if (edad <= -1)
            this.edad = -1;
    }

    /* ------------------------------- printScreen ------------------------------ */
    public String printDetalles() {
        return "\nNombre: " + getNombre() +
                "\nEdad: " +
                ((getEdad() < 0)
                        ? "\"Sin especificar\""
                        : getEdad());
    }

    public String toString() {
        return printDetalles();
    }

    /* -------------------------------- Functions ------------------------------- */
    public boolean esMasJoven(Pasajero otroPasajero) {
        if (otroPasajero == null)
            return false;

        if (edad < 0 || otroPasajero.getEdad() < 0)
            return false;

        return otroPasajero.getEdad() > edad;
    }

    public boolean esIgual(Pasajero otroPasajero) {
        if (!nombre.equals(otroPasajero.getNombre()))
            return false;
        if (edad != otroPasajero.getEdad())
            return false;

        return true;
    }

}
