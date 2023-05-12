package Tema5Arrays.Ejercicio5Alumno;

public class CursoDai {
    private String nombreCurso;
    private AlumnoDai[] listaAlumnos;
    private int cantidadAlumnosActuales;

    private final int MAX_ALUMNOS = 5;

    /* ------------------------------- Constructor ------------------------------ */
    public CursoDai(String nombreCurso) {
        this.nombreCurso = nombreCurso;
        listaAlumnos = new AlumnoDai[MAX_ALUMNOS];
        cantidadAlumnosActuales = 0;
    }

    /* --------------------------------- Getter --------------------------------- */
    public String getNombreCurso() {
        return nombreCurso;
    }

    public AlumnoDai[] getListaAlumnos() {
        return listaAlumnos;
    }

    public int getCantidadAlumnosActuales() {
        return cantidadAlumnosActuales;
    }

    /* ------------------------------- printScreen ------------------------------ */
    @Override
    public String toString() {
        String listaAlumnosString = "";

        if (cantidadAlumnosActuales == 0)
            listaAlumnosString = "\nNo hay ningún alumno en el curso de " + nombreCurso;
        else {
            listaAlumnosString += "\nNombre\t\t\tADAI\t\tSIMO\t\tPLES\t\tNota media";
            for (int i = 0; i < cantidadAlumnosActuales; i++) {
                listaAlumnosString += "\n" + addEspacios(listaAlumnos[i].getNombre()) +
                        listaAlumnos[i].getNotas()[0] + "\t\t" +
                        listaAlumnos[i].getNotas()[1] + "\t\t" +
                        listaAlumnos[i].getNotas()[2] + "\t\t" +
                        listaAlumnos[i].getMedia();

            }
        }

        return listaAlumnosString;

    }

    private String addEspacios(String nombre) {
        for (int i = nombre.length(); i < 24; i++)
            nombre += " ";
        return nombre;
    }

    /* ----------------------- Controlar cantidad alumnos ----------------------- */
    private boolean cursoLleno() {
        return cantidadAlumnosActuales == MAX_ALUMNOS;
    }

    private boolean cursoSinAlumnos() {
        return cantidadAlumnosActuales == 0;
    }

    /* --------------------- Añadir un nuevo alumno al curso -------------------- */
    public void addAlumno(String nombre, int notaAdai, int notaSimo, int notaPles) {
        if (cursoLleno())
            return;

        listaAlumnos[cantidadAlumnosActuales++] = new AlumnoDai(nombre, notaAdai, notaSimo, notaPles);
    }

    public void addAlumno(AlumnoDai alumno) {
        if (cursoLleno())
            return;

        listaAlumnos[cantidadAlumnosActuales++] = alumno;
    }

    /* ------- Devolver la cantidad de alumnos que han tenido n suspensos ------- */
    public int getSuspensos(int cantidadAsignaturas) {
        if (cursoSinAlumnos())
            return 0;

        int sumaSuspensos = 0;

        for (int i = 0; i < cantidadAlumnosActuales; i++) {
            if (listaAlumnos[i].getSuspenso() == cantidadAsignaturas)
                sumaSuspensos++;
        }

        return sumaSuspensos;
    }

    /* ---------- Devolver el nº total de alumnos que han aprobado todo --------- */
    public int getTodoAprobado() {
        return getSuspensos(0);
    }

    /* ------- Evalúa la cantidad total de notas que puede tener un alumno ------ */
    private int cantidadNotasTotales(int cantidadNotas) {
        if (cantidadNotas < 0)
            return 0;

        if (cantidadNotas > listaAlumnos[0].getTotalNotas() - 1)
            return listaAlumnos[0].getTotalNotas() - 1;

        return cantidadNotas;
    }

    /* ------------ Devuelve la media del módulo pasado por parámetro ----------- */
    public double getMediaDe(int modulo) {
        if (cursoSinAlumnos())
            return 0;

        modulo = cantidadNotasTotales(modulo);
        double sumaMedia = 0.0;

        for (int i = 0; i < cantidadAlumnosActuales; i++) {
            sumaMedia += listaAlumnos[i].getNotas()[modulo];
        }

        return sumaMedia / cantidadAlumnosActuales;
    }

    /* ----- Devuelve los suspensos habido en un módulo pasado por parámetro ---- */
    public int getSuspensosEn(int modulo) {
        if (cursoSinAlumnos())
            return 0;

        modulo = cantidadNotasTotales(modulo);
        int sumaSuspensos = 0;

        for (int i = 0; i < cantidadAlumnosActuales; i++) {
            if (!listaAlumnos[i].haAprobado(modulo))
                sumaSuspensos++;
        }

        return sumaSuspensos;
    }

    /* --- Devolver un array con los nombres de los alumnos con todo aprobado --- */
    /**
     * <p>
     * Crea un array de String con todos los nombres de aquellos que han aprobado
     * todas las asignaturas.
     * </p>
     * <br>
     * <br>
     *
     * <h4><b>Consideraciones:</b></h4>
     * <ul>
     * <li>El tamaño del array de los nombres de alumnos aprobados se obtiene
     * de calcular la cantidad total de aprobados.</li>
     * <li>Cada vez que encontramos un alumno con todo aprobado se irá
     * añadiendo al array por medio del indiceNombreAprobado, y después dicho
     * índice se incrementará en 1 para apuntar a la siguiente posición.</li>
     * <li>Si no hubiera ningún alumno aprobado, el tamaño del array será 1
     * y el único valor que contendrá será informando de que no hay ningún
     * alumno aprobado.</li>
     * <li>Si no hubiera ningún alumno en el curso, , el tamaño del array será 1
     * y el único valor que contendrá será informando de que no hay ningún
     * alumno en el curso.</li>
     * </ul>
     * <br>
     * <br>
     * 
     * <p>
     * 
     * @param nombresAprobados      array de String que almacena los nombres de los
     *                              alumnos aprobados.
     * @param indiceNombreAprobados int que indica la siguiente posición a añadir al
     *                              array de nombresAprobados.
     * @return el array de nombres con todos los aprobados.
     */
    public String[] alumnosConTodoAprobado() {
        if (cursoSinAlumnos()) {
            String[] ningunAlumno = { "No hay ningún alumno en el curso" };
            return ningunAlumno;
        }

        if (getTodoAprobado() == 0) {
            String[] ningunAprobado = { "No hay ningún alumno aprobado" };
            return ningunAprobado;
        }

        String[] nombresAprobados = new String[getTodoAprobado()];
        int indiceNombreAprobados = 0;

        for (int i = 0; i < cantidadAlumnosActuales; i++) {
            if (listaAlumnos[i].getSuspenso() == 0)
                nombresAprobados[indiceNombreAprobados++] = listaAlumnos[i].getNombre();
        }

        return nombresAprobados;
    }

}
