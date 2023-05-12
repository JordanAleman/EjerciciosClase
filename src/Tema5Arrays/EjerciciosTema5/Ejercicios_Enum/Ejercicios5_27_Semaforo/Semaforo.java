package Tema5Arrays.EjerciciosTema5.Ejercicios_Enum.Ejercicios5_27_Semaforo;

public class Semaforo {
    private EnumColoresSemaforo estado;

    /* ------------------------------- Constructor ------------------------------ */
    public Semaforo() {
        estado = EnumColoresSemaforo.VERDE;
    }

    /* --------------------------------- Getter --------------------------------- */
    public EnumColoresSemaforo getEstado() {
        return estado;
    }

    /* --------------------------------- Setter --------------------------------- */
    public void setEstado(EnumColoresSemaforo estado) {
        this.estado = estado;
    }

    /* ------------------------------- printScreen ------------------------------ */
    @Override
    public String toString() {
        return "" + estado;
    }

    public void printSemaforo() {
        System.out.println("El semáforo está en " + estado);
    }

    /* ------------------------- CambiarColoresSemáforo ------------------------- */
    public void cambiarEstado() {
        switch (estado) {
            case VERDE -> estado = EnumColoresSemaforo.AMARILLO;
            case AMARILLO -> estado = EnumColoresSemaforo.ROJO;
            case ROJO -> estado = EnumColoresSemaforo.VERDE;
        }
    }
}
