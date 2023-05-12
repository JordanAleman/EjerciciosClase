package Tema7HerenciaYPolimorfismo.EjerciciosTema7.Ejercicio7_7Cuenta;

import OperacionesAdicionales.StringOperaciones.Nombres;

public class Cuenta {
    private String nombre;
    private double saldo;

    /* ------------------------------- Constructor ------------------------------ */
    public Cuenta(String nombre, double saldo) {
        this.nombre = Nombres.capitalizarNombre(nombre);
        this.saldo = saldo;
    }

    /* --------------------------------- Getter --------------------------------- */
    protected String getNombre() {
        return nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    /* --------------------------------- Setter --------------------------------- */
    public void ingresar(double addSaldo) {
        if (addSaldo <= 0.0)
            return;

        saldo += addSaldo;
    }

    public void reintegrar(double retirarSaldo) {
        if (retirarSaldo > saldo)
            saldo = 0;
        else
            saldo -= retirarSaldo;
    }

    /* ------------------------------- PrintScreen ------------------------------ */
    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\nSaldo: " + saldo;
    }
}
