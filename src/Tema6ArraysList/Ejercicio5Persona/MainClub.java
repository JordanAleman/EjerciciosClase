package Tema6ArraysList.Ejercicio5Persona;

import java.util.HashSet;

public class MainClub {
    public static void main(String[] args) {
        /* ---------------------------- Limpiar Pantalla ---------------------------- */
        System.out.print("\033[H\033[2J");
        System.out.flush();

        /* ---------------------------- Construir objetos --------------------------- */
        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Pepito");

        HashSet<String> listaHobbies3 = new HashSet<>();
        Persona persona3 = new Persona("Juanito");

        /* ---------------------- Añadir hobbies a las personas --------------------- */
        persona1.addHobbie("hobbie1");
        persona1.addHobbie("hobbie1");
        persona1.addHobbie("hobbie nADAr1");
        persona1.addHobbie("hobbie2");
        persona1.addHobbie("hobbie3");
        persona1.addHobbie("hobbie4");

        persona2.addHobbie("Nadar");
        persona2.addHobbie("Correr");
        persona2.addHobbie("Saltar");

        listaHobbies3.add("Nadar");
        listaHobbies3.add("Cantar");
        listaHobbies3.add("Bailar");

        persona3.addHobbie(listaHobbies3);

        // System.out.println("Persona1: " + persona1);
        // System.out.println("\nPersona2: " + persona2);
        // System.out.println("\nPersona3: " + persona3);

        /* ------------------------- Añadir personas al club ------------------------ */
        Club miClub = new Club();

        miClub.addPersona(persona1);
        miClub.addPersona(persona2);
        miClub.addPersona(persona3);

        System.out.println("\nPersonas en el club:");
        miClub.printClub();

        /* ---------------- Comprobar si tienen un determinado hobbie --------------- */
        System.out.println("Personas del club con el hobbie 'Nadar' hay " +
                miClub.personasConHobbieDeterminado("NADaR"));

        /* ------------ Eliminar a las personas de un determinado hobbie ------------ */
        System.out.println("\nLas personas que les gusta nadar fuera del club. Ellos son:");
        System.out.println(miClub.borrarPersonasConHobbie("Nadar"));
    }
}
