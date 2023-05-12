package Tema5Arrays.Ejercicio4TrenesVagones;

public class MainVagonTren {
        public static void main(String[] args) {
                /* ---------------------------- Limpiar Pantalla ---------------------------- */
                System.out.print("\033[H\033[2J");
                System.out.flush();

                Vagon miVagon1 = new Vagon(5);
                Vagon miVagon2 = new Vagon(10);
                Vagon miVagon3 = new Vagon(20);
                Vagon miVagon4 = new Vagon(15);
                Vagon miVagon5 = new Vagon(8);
                Vagon miVagon6 = new Vagon(25);

                /* ---------------- Mostrar detalles del vagón recién creado ---------------- */
                miVagon1.printDetalles();
                miVagon2.printDetalles();

                /* ---------------------------- Reservar asientos --------------------------- */
                System.out.println("El primer asiento disponible es el " +
                                miVagon1.getAsientoActualDisponible());

                System.out.println();
                miVagon1.reservarSiguienteAsiento();
                miVagon1.reservarSiguienteAsiento();
                miVagon1.reservarSiguienteAsiento();
                miVagon1.reservarSiguienteAsiento();
                miVagon1.reservarSiguienteAsiento();
                miVagon1.reservarSiguienteAsiento();
                System.out.println("El primer asiento disponible es el " +
                                miVagon1.getAsientoActualDisponible());

                /* --------------------------- Reembolsar asiento --------------------------- */
                System.out.println("\nEl reembolso del asiento 2 es " + miVagon1.reembolsarAsiento(2));
                System.out.println("El primer asiento disponible tras reembolsar es el " +
                                miVagon1.getAsientoActualDisponible());

                /* ------------------------- Obtener el precio medio ------------------------ */
                System.out.println("El precio medio es " + miVagon1.getPrecioMedio());

                /* ----------------------- Crear Tren y añadir vagones ---------------------- */
                System.out.println("\nAñadir vagones al tren.");
                Tren miTren = new Tren();

                miTren.addVagon(miVagon1);
                miTren.addVagon(miVagon2);
                miTren.addVagon(miVagon3);
                miTren.addVagon(miVagon4);
                miTren.addVagon(miVagon5);
                miTren.addVagon(miVagon6);

                miTren.printListaVagones();
                System.out.println();

                /* ----------------------------- Ordenar vagones ---------------------------- */
                miTren.ordenarVagones();
                miTren.printListaVagones();
                System.out.println();

                /* ------------------------------ Emitir ticket ----------------------------- */
                System.out.println("Comproba si se ha reservado correctamente un asiento:");

                miTren.emitirTicket();
                System.out.println();

        }
}
