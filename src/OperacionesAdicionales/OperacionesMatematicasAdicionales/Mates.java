package OperacionesAdicionales.OperacionesMatematicasAdicionales;

public class Mates {

    /**
     * <p>
     * Devuelve el double del número pasado por parámetro redondeado a dos
     * decimales.
     * </p>
     * <br>
     * <br>
     *
     * <h4><b>Detalles:</b></h4>
     * <ul>
     * <li>Si el número fuera entero simplemente devuelve el número.</li>
     * <li>Si el número solo tiene un decimal, lo devolverá con ese decimal.</li>
     * <li>La expresión usada ha sido: 
     * {@code Math.round(numero * 100.0) / 100.0}</li>
     * </ul>
     * <br>
     * <br>
     * 
     * <p>
     * La idea es obtener un array modificado eliminando un elemento y desplazando
     * los siguientes elementos de esa posición a una posición anterior.
     * 
     * @param numero double que será redondeado.
     * @return el número {@code double} redondeado a dos decimales.
     */
    public static double redondeo2Decimales(double numero) {
        return Math.round(numero * 100.0) / 100.0;
    }
}
