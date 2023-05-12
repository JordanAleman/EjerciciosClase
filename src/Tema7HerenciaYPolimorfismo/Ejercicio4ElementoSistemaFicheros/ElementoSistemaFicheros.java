package Tema7HerenciaYPolimorfismo.Ejercicio4ElementoSistemaFicheros;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

public abstract class ElementoSistemaFicheros implements Comparable<ElementoSistemaFicheros>{
    protected String nombre;
    protected String permisos;
    protected String fechaModificacion;
    protected String horaModificacion;
    protected int tamanio;

    private static int incrementoDesconocido = 1;
    private static final Random RANDOM = new Random();

    /* ------------------------------- Constructor ------------------------------ */
    public ElementoSistemaFicheros(String nombre) {
        if (nombre == null || nombre.isBlank())
            nombre = "desconocido" + (incrementoDesconocido++);

        this.nombre = nombre.toLowerCase();

        permisos = "xxxx--x--";
        fechaModificacion = formatearFecha();
        horaModificacion = formatearHora();

        tamanio = RANDOM.nextInt(100) + 1;
    }

    private String formatearFecha() {
        Calendar calendarioActual = new GregorianCalendar();

        int anio = calendarioActual.get(Calendar.YEAR);
        int mes = calendarioActual.get(Calendar.MONTH);
        int dia = calendarioActual.get(Calendar.DAY_OF_MONTH);

        return String.format("%02d-%02d-%04d", dia, mes, anio);
    }

    private String formatearHora() {
        Calendar horaActual = new GregorianCalendar();

        int hora = horaActual.get(Calendar.HOUR);
        int minuto = horaActual.get(Calendar.MINUTE);
        int segundo = horaActual.get(Calendar.SECOND);

        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    /* --------------------------------- Getter --------------------------------- */
    public String getNombre() {
        return nombre;
    }

    public String getPermisos() {
        return permisos;
    }

    public String getFechaModificacion() {
        return fechaModificacion;
    }

    public String getHoraModificacion() {
        return horaModificacion;
    }

    public int getTamanio() {
        return tamanio;
    }

    /* --------------------------------- Setter --------------------------------- */
    /**
     * guardar() supone formatear de nuevo la fecha y hora actuales
     * (se traduce en asignar un nuevo valor devuelto por los métodos
     * formatearFecha() y formatearHora().
     */
    public void guardar() {
        fechaModificacion = formatearFecha();
        horaModificacion = formatearHora();
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank())
            return;

        this.nombre = nombre.toLowerCase();
    }

    public void setPermisos(String permisos) {
        if (permisos == null || permisos.isBlank() || permisos.length() != 9)
            return;

        permisos = permisos.toLowerCase();

        if (!permisos.matches("[x-]*"))
            return;

        this.permisos = permisos;
    }

    /* ------------------------------- PrintScreen ------------------------------ */
    protected String formatearSalida() {
        return String.format("%s   %20s   %s   %s   %d KB",
                nombre, permisos, fechaModificacion, horaModificacion, tamanio);
    }

    @Override
    public String toString() {
        return formatearSalida();
    }

    public void listar() {
        System.out.println(this);
    }

    public void listar(String prefijo) {
        System.out.println(prefijo + "   " + this);
    }

    /* ------------------------------- Comparación ------------------------------ */
    @Override
    public int compareTo(ElementoSistemaFicheros obj) {
        return nombre.compareTo(obj.nombre);
    }


}
