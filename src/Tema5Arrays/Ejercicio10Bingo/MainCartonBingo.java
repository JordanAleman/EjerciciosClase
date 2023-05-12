package Tema5Arrays.Ejercicio10Bingo;

public class MainCartonBingo {
    public static void main(String[] args) {
        /* ---------------------------- Limpiar Pantalla ---------------------------- */
        System.out.print("\033[H\033[2J");
        System.out.flush();

        /* ------------------------- Crear cartón del bingo ------------------------- */
        CartonBingo miCartoBingo = new CartonBingo();
        System.out.println(miCartoBingo);

        /* ----------------------------- Tachar números ----------------------------- */
        // System.out.println("Número a tachar el 22");
        // miCartoBingo.tacharNumero(22);

        // System.out.println("Número a tachar el 24");
        // miCartoBingo.tacharNumero(24);

        // System.out.println("Número a tachar el 26");
        // miCartoBingo.tacharNumero(26);

        // System.out.println("Número a tachar el 28");
        // miCartoBingo.tacharNumero(28);

        // System.out.println("Número a tachar el 30");
        // miCartoBingo.tacharNumero(30);

        while (true) {
            miCartoBingo.tacharNumero();
        }

        // String nu = "100";
        // int num = Integer.parseInt(nu);
        // System.out.println(num + 1);
    }
}
