package Tema5Arrays.EjerciciosTema5.Ejercicios5_1_7_Array.Ejercicio5_12Array;

public class MainContadorDias {
    public static void main(String[] args) {
        ContadorDias miContadorDias = new ContadorDias();

        int dia = (int) (Math.random() * 31) + 1;
        int mes = (int) (Math.random() * 12) + 1;
        int anio = (int) (Math.random() * 230) + 1800;

        int contadorDias = miContadorDias.contarDias(dia, mes, anio);

        System.out.println("\nLos días transcurridos entre el primer día del año " + anio +
                " hasta la fecha " + dia + "/" + mes + "/" + anio + " han sido: " +
                ((contadorDias == -1)
                        ? "Ninguno porque la fecha está incorrecta.\n"
                        : contadorDias + " días.\n"));
    }

}
