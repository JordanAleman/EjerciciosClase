package Tema9ExcepcionesIO.Ejercicio9Buffer;

public class Nodo {
    private String datos;
    private Nodo siguienteNodo;

    /* ------------------------------- Constructor ------------------------------ */
    public Nodo(String itemDatos, Nodo siguienteNodo) {
        if (itemDatos.isBlank() || siguienteNodo == null)
            throw new ExceptionInInitializerError("Algunos parámetros no son correctos");

        datos = itemDatos;
        this.siguienteNodo = siguienteNodo;
    }

    public Nodo(String itemDatos) {
        if (itemDatos.isBlank())
            throw new ExceptionInInitializerError("Algunos parámetros no son correctos");

        datos = itemDatos;
    }

    /* --------------------------------- Getter --------------------------------- */
    public String getDatos() {
        return datos;
    }

    public Nodo getSiguienteNodo() {
        return siguienteNodo;
    }

    /* --------------------------------- Setter --------------------------------- */
    public void setDatos(String datos) {
        if (!datos.isBlank())
            this.datos = datos;
    }

    public void setSiguienteNodo(Nodo siguienteNodo) {
        if (siguienteNodo != null)
            this.siguienteNodo = siguienteNodo;
    }
}
