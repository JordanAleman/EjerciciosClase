package Tema7HerenciaYPolimorfismo.EjerciciosTema7.Ejercicio7_7Cuenta;

public class MainCuenta {
    public static void main(String[] args) {
        /* ----------------------- Ver datos de cuenta ahorro ----------------------- */
        CuentaAhorro miCuenta = new CuentaAhorro("Pepito", 200.0, 10);

        miCuenta.reintegrar(150.0);
        System.out.println(miCuenta);
    }
}
