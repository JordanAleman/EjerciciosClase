package Tema6ArraysList.Ejercicio3Libro;

public class MainLibreria {
    public static void main(String[] args) {
        /* ---------------------------- Limpiar Pantalla ---------------------------- */
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Libro miLibro1 = new Libro(null, null, 0);
        Libro miLibro2 = new Libro("Abecedario", "Babel", 28);
        Libro miLibro3 = new Libro("Enciclopedia", "Dios", 200000);
        Libro miLibro4 = new Libro("Otro título", "Another", 10);
        Libro miLibro5 = new Libro(
                "Te complicaré ligeramente mi búsqueda al tener un título un tanto más largo de lo normal",
                "Wenceslao Perdomo", 1937);
        Libro miLibro6 = new Libro("X", "Profesor", 600);

        Libreria miLibreria = new Libreria();

        /* ----------------------- Intentos con librería vacía ---------------------- */
        miLibreria.borrarLibrosDelAutor("Babel");
        miLibreria.prestarLibro("Otro título");

        System.out.println();
        
        /* ----------------------- Añadir libros a la librería ---------------------- */
        miLibreria.addLibrosEnLibreria(miLibro1);
        miLibreria.addLibrosEnLibreria(miLibro2);
        miLibreria.addLibrosEnLibreria(miLibro3);
        miLibreria.addLibrosEnLibreria(miLibro4);
        miLibreria.addLibrosEnLibreria(miLibro5);
        miLibreria.addLibrosEnLibreria(miLibro6);
        System.out.println(miLibreria);

        /* ---------------------------- Localizar libros ---------------------------- */
        System.out.print("¿Está el libro 'El mañana es hoy'? --> ");
        System.out.println((miLibreria.localizarLibro("El mañana es hoy") != null) ? "Sí" : "No");

        System.out.print("¿Está el libro 'Otro título'? --> ");
        System.out.println((miLibreria.localizarLibro("Otro título") != null) ? "Sí" : "No");

        System.out.print("\n¿Hay algo del autor 'Roberto Luján'? --> ");
        System.out.println((miLibreria.hayLibroDelAutor("Roberto Luján")) ? "Sí" : "No");
        
        System.out.print("¿Hay algo del autor 'Wenceslao Perdomo'? --> ");
        System.out.println((miLibreria.hayLibroDelAutor("Wenceslao Perdomo")) ? "Sí" : "No");

        /* ----------------------- Eliminar libros por autores ---------------------- */
        miLibreria.borrarLibrosDelAutor("Babel");
        miLibreria.borrarLibrosDelAutor("Dios");
        miLibreria.borrarLibrosDelAutor("No existo");

        System.out.println(miLibreria);

        /* ----------------------- Prestar libros y listarlos ----------------------- */
        miLibreria.prestarLibro("Otro título");
        miLibreria.prestarLibro("Te complicaré ligeramente mi búsqueda al tener un título un tanto más largo de lo normal");
        miLibreria.prestarLibro("No existe ningún libro con este título");

        miLibreria.listarLibrosPrestados();
    }
}
