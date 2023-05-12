package Tema4InteraccionObjeto.Ejercicio1RelojDigital;

public class Alarma {
    private int hora;
    private int minutos;

    /* ------------------------------- Constructor ------------------------------ */
    public Alarma() {
        hora = 7;
        minutos = 0;
    }

    /* --------------------------------- Getters -------------------------------- */
    public int getHora() {
        return hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public String getHoraAlarma() {
        return ((hora < 10) ? "0" : "") + hora + ":" +
                ((minutos < 10) ? "0" : "") + minutos;
    }

    /* --------------------------------- Setters -------------------------------- */
    public void setHora(int hora) {
        if (hora >= 0 && hora <= 23)
            this.hora = hora;
    }

    public void setMinutos(int minutos) {
        if (minutos >= 0 && minutos <= 59)
            this.minutos = minutos;
    }

    public void setHoraAlarma(int hora, int minuto) {
        setHora(hora);
        setMinutos(minuto);
    }
}
