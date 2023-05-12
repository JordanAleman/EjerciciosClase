package Tema5Arrays.EjerciciosTema5.Ejercicios5_5_20_OrdenacionArray;

public class MainCursoPles {
    public static void main(String[] args) {
        CursoPles miCursoPles = new CursoPles();
        miCursoPles.altaAlumno("Pepito");
        miCursoPles.altaAlumno("Jaimito", 10);
        miCursoPles.altaAlumno("Luisito", 2);
        miCursoPles.altaAlumno("Yuisito", 5);
        miCursoPles.altaAlumno("Fuisito");
        miCursoPles.altaAlumno("Auisito", 7);
        // miCursoPles.altaAlumno("Buisito");

        miCursoPles.mostrarListaAlumnos();
        System.out.println();
        miCursoPles.ordenarPorNotas();

        

    }
}

