package Tema5Arrays.EjerciciosTema5.Ejercicios5_5_20_OrdenacionArray;

public class CursoPles {
    private String[] alumnos;
    private double[] notas;
    private static int cantidadAlumnosActuales = 0;

    private final int MAX = 25;

    /* ------------------------------- Constructor ------------------------------ */
    public CursoPles() {
        alumnos = new String[MAX];
        notas = new double[MAX];
    }
    

    /* --------------------------------- Getters -------------------------------- */
    public String getAlumno(int posiciónAlumno) {
        return alumnos[posiciónAlumno];
    }

    public int getCantidadAlumnosActuales() {
        return cantidadAlumnosActuales;
    }

    /* ------------------------------- printScreen ------------------------------ */
    public void mostrarListaAlumnos() {
        for (int i = 0; i < cantidadAlumnosActuales; i++)
            System.out.println("Nombre: " + alumnos[i] + 
            "\nNota en PLES: " + notas[i] + "\n");

    }

    /* -------------------------------- Functions ------------------------------- */

    /* ------------------------------- AltaAlumno ------------------------------- */
    public void altaAlumno(String nuevoAlumno, double notaNuevoAlumno) {
        if (cursoLleno())
            return;

        alumnos[cantidadAlumnosActuales++] = nuevoAlumno;
        ordenarPorNombre(nuevoAlumno, notaNuevoAlumno);
    }
    
    public void altaAlumno(String nuevoAlumno) {
        if (cursoLleno())
            return;

        alumnos[cantidadAlumnosActuales++] = nuevoAlumno;
        ordenarPorNombre(nuevoAlumno, 0);
    }

    private boolean cursoLleno() {
        return cantidadAlumnosActuales >= MAX - 1;
    }

    private void ordenarPorNombre(String nuevoAlumno, double notaNuevoAlumno) {
        // Si no hay al menos dos alumnos no hay nada que comparar a la hora de ordenar
        if (cantidadAlumnosActuales < 2)
            return;

        for (int i = 0; i < cantidadAlumnosActuales; i++) {
            if (alumnos[i].compareTo(nuevoAlumno) > 0) {
                for (int j = cantidadAlumnosActuales - 2; j >= i; j--) {
                    alumnos[j + 1] = alumnos[j];
                    notas[j + 1] = notas[j];
                }

                alumnos[i] = nuevoAlumno;
                notas[i] = notaNuevoAlumno; 
                return;
            }
        }
    }

    /* -------------------------- MostrarNotasOrdenadas ------------------------- */
    public void ordenarPorNotas() {
        boolean flag = true;
        double[] mostrarNotas = notas.clone();

        for (int i = 0; i < cantidadAlumnosActuales - 1; i++) {
            if (!flag) 
                break;

            flag = false;
            
            for (int j = 0; j < cantidadAlumnosActuales - 1 - i; j++) {
                if (mostrarNotas[j] < mostrarNotas[j + 1]) {
                    intercambiar(mostrarNotas, j, j + 1);
                    flag = true;
                }
            }
        }

        for (int i = 0; i < cantidadAlumnosActuales; i++) 
            System.out.println(mostrarNotas[i]);
    }

    private void intercambiar(double[] notas, int posicion1, int posicion2) {
        double aux = notas[posicion2];
        notas[posicion2] =  notas[posicion1];
        notas[posicion1] = aux;
    }
}
