package Tema7HerenciaYPolimorfismo.EjerciciosTema7.Ejercicio7_15Figura;

public class MainFigura {
    public static void main(String[] args) {
        /* ---------------------------- Limpiar Pantalla ---------------------------- */
        System.out.print("\033[H\033[2J");
        System.out.flush();

        /* ------------------------------ Crear objetos ----------------------------- */
        GestorFiguras miGestorFiguras = new GestorFiguras();
        miGestorFiguras.testFigura();
    }
}
