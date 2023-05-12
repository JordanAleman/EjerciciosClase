package Tema4InteraccionObjeto.Ejercicio12ClaseCuenta;

public class Cuenta {
    private String nCuenta;
    private double saldo;
    private String titular;

    /* ------------------------------- Constructor ------------------------------ */
    public Cuenta(String nCuenta, String titular) {
        this.nCuenta = nCuenta;
        this.saldo = 0.0;
        this.titular = titular;
    }

    /* --------------------------------- Getters -------------------------------- */
    public String getNCuenta() {
        return nCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    /* --------------------------------- Setters -------------------------------- */
    public void setnCuenta(String nCuenta) {
        this.nCuenta = nCuenta;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0.0)
            this.saldo = 0.0;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    /* ------------------------------- printScreen ------------------------------ */
    public void consultarSaldo() {
        System.out.println("Saldo: " + getSaldo());
    }

    public String toString() {
        return "Nombre: " + getTitular() +
                "\nNº de cuenta: " + getNCuenta() +
                "\nSaldo: " + getSaldo();
    }

    /* -------------------------------- Functions ------------------------------- */
    public void ingreso(double cantidad) {
        if (cantidad > 0.0)
            saldo += cantidad;
    }

    public void reintegro(double cantidad) {
        if (cantidad > 0.0)
            saldo -= cantidad;
    }

}
