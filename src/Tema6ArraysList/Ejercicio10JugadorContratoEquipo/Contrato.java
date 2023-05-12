package Tema6ArraysList.Ejercicio10JugadorContratoEquipo;

public class Contrato {
    private Jugador jugador;
    private int salario;

    /* ------------------------------- Constructor ------------------------------ */

    public Contrato(Jugador jugador, int salario) {
        if (jugador == null) 
            throw new IllegalArgumentException("Jugador nulo");    
        
        if (!validarSalario(salario))
            salario = 100;

        this.jugador = jugador;
        this.salario = salario;
    }

    private boolean validarSalario(int salario) {
        return salario > 100;
    }

    /* --------------------------------- Getter --------------------------------- */
    public Jugador getJugador() {
        return jugador;
    }

    public int getSalario() {
        return salario;
    }

    /* --------------------------------- Setter --------------------------------- */
    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public void setSalario(int salario) {
        if (validarSalario(salario))
            this.salario = salario;
    }

    /* ------------------------------- PrintSreen ------------------------------- */
    @Override
    public String toString() {
        return "Jugador: " + jugador +
                "\nSalario: " + salario;
    }
}
