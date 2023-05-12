package Tema5Arrays.Ejercicio5Alumno;

import java.util.Arrays;

public class MainCursoDai {
    public static void main(String[] args) {
        /* ---------------------------- Limpiar Pantalla ---------------------------- */
        System.out.print("\033[H\033[2J");
        System.out.flush();

        /* ------------------------------- Crear curso ------------------------------ */
        CursoDai miCursoDai = new CursoDai("1ºB");

        /* -------------------------- Añadir nuevos alumnos ------------------------- */
        System.out.println(miCursoDai);

        miCursoDai.addAlumno(new AlumnoDai());
        miCursoDai.addAlumno(new AlumnoDai("Pepito", 2.0, 5.0, 8));
        miCursoDai.addAlumno(new AlumnoDai());
        miCursoDai.addAlumno(new AlumnoDai("Luisito", 4.0, 1.0, 2.0));

        System.out.println(miCursoDai);

        /* ----------------- Ver cantidad de aprobados y suspendidos ---------------- */
        System.out.println("\nEl total de alumnos que han aprobado todo han sido " +
                miCursoDai.getTodoAprobado());
        System.out.println("El total de alumnos que han suspendido 2 asignaturas han sido " +
                miCursoDai.getSuspensos(2));
        System.out.println("El total de alumnos que han suspendido 3 asignaturas han sido " +
                miCursoDai.getSuspensos(3));

        /* --------------------- Ver la nota media de un módulo --------------------- */
        System.out.println("\nVamos a ver la nota media según los módulos: " +
                "\nADAI = " + miCursoDai.getMediaDe(0) +
                "\nSIMO = " + miCursoDai.getMediaDe(1) +
                "\nPLES = " + miCursoDai.getMediaDe(2));

        /* ---------------- Ver la cantidad de suspensos en un módulo --------------- */
        System.out.println("\nVamos a ver la cantidad de suspensos en los siguientes módulos: " +
                "\nADAI = " + miCursoDai.getSuspensosEn(0) + " suspendidos" +
                "\nSIMO = " + miCursoDai.getSuspensosEn(1) + " suspendidos" +
                "\nPLES = " + miCursoDai.getSuspensosEn(2) + " suspendidos");

        /* ------------------------- Ver lista de aprobados ------------------------- */
        System.out.println("\nLista de todos los alumnos que ha aprobado todo:" +
                "\n" + Arrays.toString(miCursoDai.alumnosConTodoAprobado()));

    }
}
