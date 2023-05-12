package Tema6ArraysList.Ejercicio11Restaurante;

import java.util.ArrayList;
import java.util.Iterator;

public class Restaurante {
    private String nombreRestaurante;

    private ArrayList<Mesa> listaMesas;
    private ArrayList<Reserva> listaReservas;

    private final int CAPACIDAD_MINIMA_MESAS = 3;
    private final int CAPACIDAD_MAXIMA_MESAS = 15;

    /* ------------------------------- Constructor ------------------------------ */
    public Restaurante(String nombreRestaurante, int cantidadMesas) {
        if (nombreRestaurante == null)
            nombreRestaurante = NombresRestaurantes.nombreAleatorio();

        this.nombreRestaurante = nombreRestaurante;

        if (cantidadMesas < CAPACIDAD_MINIMA_MESAS)
            cantidadMesas = CAPACIDAD_MINIMA_MESAS;

        if (cantidadMesas > CAPACIDAD_MAXIMA_MESAS)
            cantidadMesas = CAPACIDAD_MAXIMA_MESAS;

        inicializarMesas(cantidadMesas);
        listaReservas = new ArrayList<>();
    }

    public Restaurante() {
        nombreRestaurante = NombresRestaurantes.nombreAleatorio();
        int cantidadMesas = (int) (Math.random() *
                (CAPACIDAD_MAXIMA_MESAS - CAPACIDAD_MINIMA_MESAS + 1)) + CAPACIDAD_MINIMA_MESAS;

        inicializarMesas(cantidadMesas);
        listaReservas = new ArrayList<>();
    }

    private void inicializarMesas(int cantidadMesas) {
        listaMesas = new ArrayList<>();

        for (int i = 0; i < cantidadMesas; i++)
            listaMesas.add(new Mesa());
    }

    /* --------------------------------- Getter --------------------------------- */
    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public ArrayList<Mesa> getListaMesas() {
        return listaMesas;
    }

    public ArrayList<Reserva> getListaReservas() {
        return listaReservas;
    }

    /* ------------------------------- PrintScreen ------------------------------ */
    public void mostrarReservas() {
        if (listaReservas.isEmpty()) {
            System.out.println("Aún no se ha realizado ninguna reserva");
            return;
        }

        Iterator<Reserva> iterator = listaReservas.iterator();

        while (iterator.hasNext())
            System.out.println(iterator.next() + "\n");

    }

    public void mostrarRestaurante() {
        for (Mesa mesa : listaMesas)
            System.out.println(mesa);
    }

    public void mostrarUltimaReservaRealizada() {
        System.out.println(listaReservas.get(listaReservas.size() - 1));
    }

    /* ------------------------------ ReservarMesa ------------------------------ */
    public boolean reservarMesa(String nombreCliente, int cantidadComensales) {
        if (cantidadComensales < 0 || cantidadComensales > CAPACIDAD_MAXIMA_MESAS)
            return false;

        int idMesaDisponible = asignarMesa(cantidadComensales);

        if (idMesaDisponible >= 0) {
            Mesa mesaDisponible = listaMesas.get(idMesaDisponible);
            listaReservas.add(new Reserva(nombreCliente, cantidadComensales, mesaDisponible));
            return true;
        }

        return false;
    }

    /**
     * ============================
     ** Asignar Mesa
     * ==============================
     *
     * busca la mesa de menor tamaño en la que caben todos los comensales. Si
     * encuentra una devuelve el nº de mesa (se devuelve un nº a partir de 1), si no
     * la encuentra devuelve -1.
     */
    private int asignarMesa(int cantidadComensales) {
        Iterator<Mesa> iterator = listaMesas.iterator();

        Mesa mesaMinimaCapacidad = null;
        Mesa mesaSiguiente;

        while (iterator.hasNext()) {
            mesaSiguiente = iterator.next();

            if (compararCapacidadYDisponibilidadMesas(mesaSiguiente, cantidadComensales)) {
                if (mesaMinimaCapacidad != null)
                    mesaMinimaCapacidad = mesaMinimaCapacidadPosible(mesaMinimaCapacidad, mesaSiguiente);
                else 
                    mesaMinimaCapacidad = mesaSiguiente;
            }
        }


        if (mesaMinimaCapacidad != null) {
            listaMesas.get(listaMesas.indexOf(mesaMinimaCapacidad)).mesaOcupada();;
            return listaMesas.indexOf(mesaMinimaCapacidad);
        }

        return -1;
    }

    private boolean compararCapacidadYDisponibilidadMesas(Mesa mesaSiguiente, int cantidadComensales) {
        if (mesaSiguiente.getCapacidad() < cantidadComensales)
            return false;

        if (!mesaSiguiente.getDisponibilidad())
            return false;

        return true;
    }

    private Mesa mesaMinimaCapacidadPosible(Mesa mesaMinimaCapacidad, Mesa mesaSiguiente) {
        if (mesaMinimaCapacidad.getCapacidad() > mesaSiguiente.getCapacidad())
            return mesaSiguiente;

        return mesaMinimaCapacidad;
    }
    // !---- Fin de Asignar mesa ----

    /* ------------------------ Vaciar lista de reservas ------------------------ */
    public void eliminarReserva(boolean seguridad) {
        if (!seguridad)
            return;

        listaReservas.clear();
        Reserva.reiniciarIdentificador(seguridad);

        for (int i = 0; i < listaMesas.size(); i++)
            listaMesas.get(i).mesaLibre();
    }
}
