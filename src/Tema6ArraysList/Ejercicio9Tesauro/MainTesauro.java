package Tema6ArraysList.Ejercicio9Tesauro;

public class MainTesauro {
    public static void main(String[] args) {
        /* ---------------------------- Limpiar Pantalla ---------------------------- */
        System.out.print("\033[H\033[2J");
        System.out.flush();

        /* ----------------------- Añadir elementos al tesauro ---------------------- */
        Tesauro miTesauro = new Tesauro();

        miTesauro.addSinonimo("excelente", "brillante");
        miTesauro.addSinonimo("excelente", "colosal");
        miTesauro.addSinonimo("excelente", "brillante");
        miTesauro.addSinonimo("fabuloso", "exquisito");
        miTesauro.addSinonimo("fabuloso", "maravilloso");
        miTesauro.addSinonimo("excelente", "exquisito");

        // System.out.println(miTesauro);

        /* ------------------ Añadir como un conjunto de sinónimos ------------------ */
        miTesauro.addSinonimo("estupendo maravilloso superior");
        miTesauro.addSinonimo(" estupendo superior magnífico exquisito ");

        System.out.println(miTesauro);

        /* ----------------------------- Borrar palabra ----------------------------- */
        System.out.println("-----------------------------------------");
        System.out.println("\nEliminamos el sinónimo 'maravilloso' y las claves " +
                "que las contenían eran: \n" +
                miTesauro.borrarSinonimo("maravilloso"));

        System.out.print("\nLos sinónimos quedarían de la siguiente manera: ");
        System.out.println(miTesauro);

    }
}
