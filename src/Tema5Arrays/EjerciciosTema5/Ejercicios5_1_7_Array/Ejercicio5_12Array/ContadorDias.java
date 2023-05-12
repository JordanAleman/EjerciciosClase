package Tema5Arrays.EjerciciosTema5.Ejercicios5_1_7_Array.Ejercicio5_12Array;

public class ContadorDias {
    private int arrayMeses[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    /* ------------------------------- ContarDías ------------------------------- */
    public int contarDias(int dia, int mes, int anio) {
        if (!checkDate(dia, mes, anio))
            return -1;

        int totalDiasTranscurridos = 0;
        for (int i = 0; i < mes - 1; i++) {
            totalDiasTranscurridos += arrayMeses[i];
        }

        return totalDiasTranscurridos + dia;

    }

    /* -------------------------------- Functions ------------------------------- */
    private boolean checkDate(int dia, int mes, int anio) {
        if (anio <= 0)
            return false;
        if (mes < 1 || mes > 12)
            return false;

        // Comprobamos si es un año bisiesto. Si fuera el caso,
        // sumamos 1 al valor de la posición que correspondería a
        // Febrero en arrayMeses
        checkBisiesto(mes, anio);
        if (dia < 1 || dia > arrayMeses[mes - 1])
            return false;

        return true;
    }

    private void checkBisiesto(int mes, int anio) {
        if (((anio % 4) == 0) && (((anio % 100) != 0) || ((anio % 400) == 0)))
            arrayMeses[1]++;
    }

}
