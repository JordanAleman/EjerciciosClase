package Tema6ArraysList.Ejercicio10JugadorContratoEquipo;

public class MainEquipo {
    public static void main(String[] args) {
        /* ---------------------------- Limpiar Pantalla ---------------------------- */
        System.out.print("\033[H\033[2J");
        System.out.flush();

        /* ------------------- Crear objetos para añadir al equipo ------------------ */
        Jugador unJugador1 = new Jugador("Pepito", 30);
        Jugador unJugador2 = new Jugador("Juanito", 35);
        Jugador unJugador3 = new Jugador("Luisito", 25);

        String[] arrayNombresJugadores = {"Pedrito", "Jorgito", "Paquito"};
        int[] arrayEdadesJugadores = {20, 18, 38};
        int[] arraySalarioJugadores = {2000, 1800, 3500};

        Equipo miEquipo = new Equipo("miEquipo");

        /* ---------------------------- Firmar contratos ---------------------------- */
        miEquipo.firmarContrato(unJugador1, 1500);
        miEquipo.firmarContrato(unJugador2, 2500);
        miEquipo.firmarContrato(unJugador3, 3000);
        miEquipo.firmarContrato(unJugador1, 1600);

        miEquipo.firmarContratos(arrayNombresJugadores, arrayEdadesJugadores, arraySalarioJugadores);

        miEquipo.escribirNombreJugadores();
        miEquipo.escribirNombreYSalariosJugadores();

        System.out.println();
        int[] posiciones = {1, 3, 50, 2};
        miEquipo.escribirDetallesJugadores(posiciones);
        miEquipo.escribirDetallesJugadores(null);

        /* ------------------------ Obtener contrato más alto ----------------------- */
        System.out.println("\nJugador con el mayor contrato: \n" + miEquipo.getContratoMasAlto());
    }
}
