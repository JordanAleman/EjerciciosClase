package Tema7HerenciaYPolimorfismo.EjerciciosTema7.Ejercicio7_7Cuenta;

public class CuentaCorriente extends Cuenta {
    public double saldoMinimo;

    /* ------------------------------- Constructor ------------------------------ */
    public CuentaCorriente(String nombre, double saldo, double saldoMinimo) {
        super(nombre, saldo);

        if (saldoMinimo < 100.0)
            saldoMinimo = 100.0;

        this.saldoMinimo = saldoMinimo;
    }

    /* --------------------------------- Getter --------------------------------- */
    public double getRecargo() {
        if (getSaldo() > saldoMinimo) 
            return 0;
        
        return saldoMinimo - getSaldo();
    }

}
