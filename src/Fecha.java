public class Fecha {
    private int dia, mes, anio;
    private int arrayMeses[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public Fecha() {
        dia = 29;
        mes = 9;
        anio = 2022;
    }

    public Fecha(int dia, int mes, int anio) {
        if (checkDate(dia, mes, anio)) {
            this.dia = dia;
            this.mes = mes;
            this.anio = anio;
        } else {
            this.dia = 4;
            this.mes = 10;
            this.anio = 2022;
        }
    }

    /* -------------------------------------------------------------------------- */
    /* --------------------------------- Getter --------------------------------- */
    /* -------------------------------------------------------------------------- */
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    /* -------------------------------------------------------------------------- */
    /* --------------------------------- Setter --------------------------------- */
    /* -------------------------------------------------------------------------- */
    public void setDia(int dia) {
        if (checkDate(dia, mes, anio))
            this.dia = dia;
    }

    public void setMes(int mes) {
        if (checkDate(dia, mes, anio))
            this.mes = mes;
    }

    public void setAnio(int anio) {
        if (checkDate(dia, mes, anio))
            this.anio = anio;
    }

    /* -------------------------------------------------------------------------- */
    /* ------------------------------- PrintScreen ------------------------------ */
    /* -------------------------------------------------------------------------- */
    public String toString() {
        return dia + "/" + mes + "/" + anio;
    }

    /* -------------------------------------------------------------------------- */
    /* -------------------------------- Functions ------------------------------- */
    /* -------------------------------------------------------------------------- */
    private boolean checkDate(int dia, int mes, int anio) {

        if (anio == 0)
            return false;
        if (mes < 1 || mes > 12)
            return false;
        if (dia < 1 || dia > checkBisiesto(mes, anio))
            return false;
        return true;
    }

    private int checkBisiesto(int mes, int anio) {

        if (((anio % 4) == 0) && (((anio % 100) != 0) || ((anio % 400) == 0)))
            arrayMeses[1]++;
        return arrayMeses[mes - 1];
    }
}