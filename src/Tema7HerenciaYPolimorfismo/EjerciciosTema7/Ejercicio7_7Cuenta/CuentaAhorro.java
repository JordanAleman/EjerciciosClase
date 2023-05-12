package Tema7HerenciaYPolimorfismo.EjerciciosTema7.Ejercicio7_7Cuenta;

public class CuentaAhorro extends Cuenta {
    private int interes;

    /* ------------------------------- Constructor ------------------------------ */
    public CuentaAhorro(String nombre, double saldo, int interes) {
        super(nombre, saldo);

        if (interes <= 10)
            interes = 10;

        if (interes > 100)
            interes = 100;

        this.interes = interes;

    }

    /* ----------------------------- Aplicar interés ---------------------------- */
    public double aplicarInteres() {
        return (getSaldo() * interes) / 100;
    }



}
