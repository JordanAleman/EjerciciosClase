package Tema6ArraysList.Ejercicio11Restaurante;

public class MainRestaurante {
    public static void main(String[] args) {
        /* ---------------------------- Limpiar Pantalla ---------------------------- */
        System.out.print("\033[H\033[2J");
        System.out.flush();

        /* ------------------ Crear un restaurante y ver sus mesas ------------------ */
        Restaurante miRestaurante = new Restaurante();
        System.out.println("Mesas disponibles antes de las reservas");
        miRestaurante.mostrarRestaurante();

        /* ---------------- Reservar mesas y visualizar el resultado ---------------- */
        miRestaurante.reservarMesa("Pepito", 6);
        miRestaurante.reservarMesa("Juanito", 17);
        miRestaurante.reservarMesa("Luisito", 6);
        miRestaurante.reservarMesa("Paquito", 14);
        miRestaurante.reservarMesa("Evita", 4);

        System.out.println("\nMesas disponibles tras las reservas");
        miRestaurante.mostrarRestaurante();

        System.out.println("\nListado de reservas");
        miRestaurante.mostrarReservas();

        /* -------------------------- Eliminar las reservas ------------------------- */
        System.out.println("\nSe eliminarán todas las reservas");
        miRestaurante.eliminarReserva(true);
        miRestaurante.mostrarReservas();

        System.out.println("\nMesas disponibles tras eliminar todas las reservas");
        miRestaurante.mostrarRestaurante();
    }
}
