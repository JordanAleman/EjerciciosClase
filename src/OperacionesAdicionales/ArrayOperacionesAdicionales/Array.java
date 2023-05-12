package OperacionesAdicionales.ArrayOperacionesAdicionales;

public class Array {

    /**
     * <p>
     * Modifica el array pasadado por parámetro donde se borra un elemento y todos
     * los elementosposteriores son desplazados a una posición anterior, dejando la
     * última posición que estaba ocupada a null.
     * </p>
     * <br>
     * <br>
     *
     * <h4><b>Detalles:</b></h4>
     * <ul>
     * <li>Si pasan un array de tamaño 1 simplemente borrará el único elemento que
     * contiene el array, dejando esa posición a null.</li>
     * <li>Si pasan un array de tamaño superior a 1 y en su segundo argumento una la
     * última posición del array, simplemente borrará el último elemento dejándolo a
     * null.</li>
     * <li>Si el array pasado por el primer argumento es superior a 1 y por segundo
     * argumento es pasado cualquier posición que no sea la última del array
     * entonces borrará el elemento del array situado en la posición indicada por el
     * segundo argumento. Luego desplazará cada elemento que había a la derecha una
     * posición anterior.</li>
     * </ul>
     * <br>
     * <br>
     * 
     * <p>
     * La idea es obtener un array modificado eliminando un elemento y desplazando
     * los siguientes elementos de esa posición a una posición anterior.
     * 
     * @param array    array tipo referencia que será modificado.
     * @param posicion posición del array donde será eliminado su valor.
     * @return el modificado {@code array}.
     */
    public static void eliminarYDesplazar(Object[] array, int posicion) {
        int tamArray = array.length;

        if (posicion == tamArray - 1)
            array[posicion] = null;
        else {
            for (int i = posicion; i < tamArray; i++) {
                if (i < tamArray - 1)
                    array[i] = array[i + 1];
                else
                    array[i] = null;
            }
        }
    }

    /**
     * <p>
     * Modifica el array pasadado por parámetro donde se borra un elemento y todos
     * los elementosposteriores son desplazados a una posición anterior, dejando la
     * última posición que estaba ocupada a null.
     * </p>
     * <br>
     * <br>
     *
     * <h4><b>Detalles:</b></h4>
     * <ul>
     * <li>Si pasan un array de tamaño 1 simplemente borrará el único elemento que
     * contiene el array, dejando esa posición a null.</li>
     * <li>Si pasan un array de tamaño superior a 1 y en su segundo argumento una la
     * última posición del array, simplemente borrará el último elemento dejándolo a
     * null.</li>
     * <li>Si el array pasado por el primer argumento es superior a 1 y por segundo
     * argumento es pasado cualquier posición que no sea la última del array
     * entonces borrará el elemento del array situado en la posición indicada por el
     * segundo argumento. Luego desplazará cada elemento que había a la derecha una
     * posición anterior.</li>
     * </ul>
     * <br>
     * <br>
     * 
     * <p>
     * La idea es obtener un array modificado eliminando un elemento y desplazando
     * los siguientes elementos de esa posición a una posición anterior.
     * 
     * @param array    array tipo {@code int} que será modificado.
     * @param posicion posición del array donde será eliminado su valor.
     * @return el modificado {@code array}.
     */
    public static void eliminarYDesplazar(int[] array, int posicion) {
        int tamArray = array.length;

        if (posicion == tamArray - 1)
            array[posicion] = 0;
        else {
            for (int i = posicion; i < tamArray; i++) {
                if (i < tamArray - 1)
                    array[i] = array[i + 1];
                else
                    array[i] = 0;
            }
        }
    }

    /**
     * <p>
     * Modifica el array pasadado por parámetro donde se borra un elemento y todos
     * los elementosposteriores son desplazados a una posición anterior, dejando la
     * última posición que estaba ocupada a null.
     * </p>
     * <br>
     * <br>
     *
     * <h4><b>Detalles:</b></h4>
     * <ul>
     * <li>Si pasan un array de tamaño 1 simplemente borrará el único elemento que
     * contiene el array, dejando esa posición a null.</li>
     * <li>Si pasan un array de tamaño superior a 1 y en su segundo argumento una la
     * última posición del array, simplemente borrará el último elemento dejándolo a
     * null.</li>
     * <li>Si el array pasado por el primer argumento es superior a 1 y por segundo
     * argumento es pasado cualquier posición que no sea la última del array
     * entonces borrará el elemento del array situado en la posición indicada por el
     * segundo argumento. Luego desplazará cada elemento que había a la derecha una
     * posición anterior.</li>
     * </ul>
     * <br>
     * <br>
     * 
     * <p>
     * La idea es obtener un array modificado eliminando un elemento y desplazando
     * los siguientes elementos de esa posición a una posición anterior.
     * 
     * @param array    array tipo {@code int} que será modificado.
     * @param posicion posición del array donde será eliminado su valor.
     * @return el modificado {@code array}.
     */
    public static void eliminarYDesplazar(double[] array, int posicion) {
        int tamArray = array.length;

        if (posicion == tamArray - 1)
            array[posicion] = 0.0;
        else {
            for (int i = posicion; i < tamArray; i++) {
                if (i < tamArray - 1)
                    array[i] = array[i + 1];
                else
                    array[i] = 0.0;
            }
        }
    }

    /**
     * <p>
     * Modifica el array pasadado por parámetro donde se borra un elemento y todos
     * los elementosposteriores son desplazados a una posición anterior, dejando la
     * última posición que estaba ocupada a null.
     * </p>
     * <br>
     * <br>
     *
     * <h4><b>Detalles:</b></h4>
     * <ul>
     * <li>Si pasan un array de tamaño 1 simplemente borrará el único elemento que
     * contiene el array, dejando esa posición a null.</li>
     * <li>Si pasan un array de tamaño superior a 1 y en su segundo argumento una la
     * última posición del array, simplemente borrará el último elemento dejándolo a
     * null.</li>
     * <li>Si el array pasado por el primer argumento es superior a 1 y por segundo
     * argumento es pasado cualquier posición que no sea la última del array
     * entonces borrará el elemento del array situado en la posición indicada por el
     * segundo argumento. Luego desplazará cada elemento que había a la derecha una
     * posición anterior.</li>
     * </ul>
     * <br>
     * <br>
     * 
     * <p>
     * La idea es obtener un array modificado eliminando un elemento y desplazando
     * los siguientes elementos de esa posición a una posición anterior.
     * 
     * @param array    array tipo {@code char} que será modificado.
     * @param posicion posición del array donde será eliminado su valor.
     * @return el modificado {@code array}.
     */
    public static void eliminarYDesplazar(char[] array, int posicion) {
        int tamArray = array.length;

        if (posicion == tamArray - 1)
            array[posicion] = 0;
        else {
            for (int i = posicion; i < tamArray; i++) {
                if (i < tamArray - 1)
                    array[i] = array[i + 1];
                else
                    array[i] = 0;
            }
        }
    }

    /* -------------------------------- Invertir -------------------------------- */
    /**
     * <p>
     * Modifica un array de objetos pasado por parámetro. Invierte los valores del
     * array.
     * </p>
     * <br>
     * <br>
     *
     * <h4><b>Detalles:</b></h4>
     * <ul>
     * <li>El primer elemento pasará a ser el último y viceversa. Así con cada valor
     * hasta que todos queden invertidos</li>
     * <li>Si pasan un array de tamaño 1 simplemente no hará nada</li>
     * </ul>
     * <br>
     * <br>
     * 
     * <p>
     * Tener en cuenta que modifca el array que le pasan por parámetro. No devuelve
     * ningún array invertido.
     * </p>
     * 
     * @param array array tipo {@code Object} que será invertido.
     * @return el {@code array} invertido.
     */
    public static void invertir(Object[] array) {
        Object[] arrayAux = new Object[array.length];

        for (int i = 0; i < array.length; i++)
            arrayAux[i] = array[array.length - i - 1];

        for (int i = 0; i < array.length; i++)
            array[i] = arrayAux[i];
    }

    /**
     * <p>
     * Modifica un array de enteros pasado por parámetro. Invierte los valores del
     * array.
     * </p>
     * <br>
     * <br>
     *
     * <h4><b>Detalles:</b></h4>
     * <ul>
     * <li>El primer elemento pasará a ser el último y viceversa. Así con cada valor
     * hasta que todos queden invertidos</li>
     * <li>Si pasan un array de tamaño 1 simplemente no hará nada</li>
     * </ul>
     * <br>
     * <br>
     * 
     * <p>
     * Tener en cuenta que modifca el array que le pasan por parámetro. No devuelve
     * ningún array invertido.
     * </p>
     * 
     * @param array array tipo {@code int} que será invertido.
     * @return el {@code array} invertido.
     */
    public static void invertir(int[] array) {
        int[] arrayAux = new int[array.length];

        for (int i = 0; i < array.length; i++)
            arrayAux[i] = array[array.length - i - 1];

        for (int i = 0; i < array.length; i++)
            array[i] = arrayAux[i];
    }

    /**
     * <p>
     * Modifica un array de doubles pasado por parámetro. Invierte los valores del
     * array.
     * </p>
     * <br>
     * <br>
     *
     * <h4><b>Detalles:</b></h4>
     * <ul>
     * <li>El primer elemento pasará a ser el último y viceversa. Así con cada valor
     * hasta que todos queden invertidos</li>
     * <li>Si pasan un array de tamaño 1 simplemente no hará nada</li>
     * </ul>
     * <br>
     * <br>
     * 
     * <p>
     * Tener en cuenta que modifca el array que le pasan por parámetro. No devuelve
     * ningún array invertido.
     * </p>
     * 
     * @param array array tipo {@code double} que será invertido.
     * @return el {@code array} invertido.
     */
    public static void invertir(double[] array) {
        double[] arrayAux = new double[array.length];

        for (int i = 0; i < array.length; i++)
            arrayAux[i] = array[array.length - i - 1];

        for (int i = 0; i < array.length; i++)
            array[i] = arrayAux[i];
    }

    /**
     * <p>
     * Modifica un array de caracteres pasado por parámetro. Invierte los valores del
     * array.
     * </p>
     * <br>
     * <br>
     *
     * <h4><b>Detalles:</b></h4>
     * <ul>
     * <li>El primer elemento pasará a ser el último y viceversa. Así con cada valor
     * hasta que todos queden invertidos</li>
     * <li>Si pasan un array de tamaño 1 simplemente no hará nada</li>
     * </ul>
     * <br>
     * <br>
     * 
     * <p>
     * Tener en cuenta que modifca el array que le pasan por parámetro. No devuelve
     * ningún array invertido.
     * </p>
     * 
     * @param array array tipo {@code char} que será invertido.
     * @return el {@code array} invertido.
     */
    public static void invertir(char[] array) {
        char[] arrayAux = new char[array.length];

        for (int i = 0; i < array.length; i++)
            arrayAux[i] = array[array.length - i - 1];

        for (int i = 0; i < array.length; i++)
            array[i] = arrayAux[i];
    }

    /* ------------------------------- PrintScreen ------------------------------ */
    /**
     * @param array array tipo {@code Object} que se mostrarán sus valores.
     * @return formato: "[valor1, valor2, ..., valorN]"
     */
    public static void toString(Object[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i] +
                    ((i != array.length - 1)
                            ? ", "
                            : "]"));
        }
        System.out.println();
    }

    /**
     * @param array array tipo {@code int} que se mostrarán sus valores.
     * @return formato: "[valor1, valor2, ..., valorN]"
     */
    public static void toString(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i] +
                    ((i != array.length - 1)
                            ? ", "
                            : "]"));
        }
        System.out.println();
    }

    /**
     * @param array array tipo {@code char} que se mostrarán sus valores.
     * @return formato: "[valor1, valor2, ..., valorN]"
     */
    public static void toString(char[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i] +
                    ((i != array.length - 1)
                            ? ", "
                            : "]"));
        }
        System.out.println();
    }
}
