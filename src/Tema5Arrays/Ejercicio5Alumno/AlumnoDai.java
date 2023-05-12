package Tema5Arrays.Ejercicio5Alumno;

public class AlumnoDai {
    private String nombre;
    private String apellidos;
    private double[] notas;

    /* ------------------------------- Constructor ------------------------------ */
    public AlumnoDai(String nombre, String apellidos, double adai, double simo, double ples) {
        notas = new double[3];

        this.nombre = nombre;
        this.apellidos = apellidos;
        notas[0] = notasValidas(adai);
        notas[1] = notasValidas(simo);
        notas[2] = notasValidas(ples);
    }

    // Todos los datos por parámetro menos los apellidos
    public AlumnoDai(String nombre, double adai, double simo, double ples) {
        notas = new double[3];

        this.nombre = nombre;
        apellidos = "";
        notas[0] = notasValidas(adai);
        notas[1] = notasValidas(simo);
        notas[2] = notasValidas(ples);
    }

    public AlumnoDai() {
        notas = new double[3];

        this.nombre = "Genérico";
        apellidos = "Ninguno";
        notas[0] = 5.0;
        notas[1] = 5.0;
        notas[2] = 5.0;
    }

    private double notasValidas(double nota) {
        if (nota < 0.0)
            return 0.0;
        if (nota > 10.0)
            return 10.0;
        return nota;
    }

    /* --------------------------------- Getter --------------------------------- */
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public double[] getNotas() {
        return notas;
    }

    public int getTotalNotas() {
        return notas.length;
    }

    /* --------------------------------- Setter --------------------------------- */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /* ------------------------------- printScreen ------------------------------ */
    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\nApellidos: " + apellidos +
                "\nNotas: " +
                "\nADAI = " + notas[0] +
                "\nSIMO = " + notas[1] +
                "\nPLES = " + notas[2];
    }

    /* -------------- Devolver la cantidad de suspensos del alumno -------------- */
    public int getSuspenso() {
        int cont = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < 5.0)
                cont++;
        }

        return cont;
    }

    /* ------------------- Devolver la media de las tres notas ------------------ */
    public double getMedia() {
        double sumaNotas = 0;

        for (int i = 0; i < notas.length; i++) 
            sumaNotas += notas[i];
        
        return Math.round((sumaNotas / notas.length) * 100.0) / 100.0;
    }

    /* ----------------- Devolver si ha aprobado una asignatura ----------------- */
    public boolean haAprobado(int asignatura) {
        if (asignatura < 0) 
            asignatura = 0;

        if (asignatura >= notas.length) 
            asignatura = notas.length - 1;

        return notas[asignatura] >= 5;
    }
}
