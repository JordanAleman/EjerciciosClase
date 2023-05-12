package Tema4InteraccionObjeto.Ejercicio26PintarFigura;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        PintarFiguras miFigura = new PintarFiguras();
        
        miFigura.dibujarTableroAjedrez();
        System.out.println("\n\n\n");

        miFigura.dibujarArbolNavidad();
        System.out.println("\n\n\n");

        // System.out.printf("%1s%n", "Hola");
        // System.out.printf("%2s%n", "Hola");
        // System.out.printf("%6s%n", "Hola");
        // System.out.printf("%7s%n", "Hola");
        // System.out.printf("%8s%n", "Hola");
        // System.out.printf("%9s%n", "Hola");
        // System.out.printf("%10s%n", "Hola");
        // System.out.printf("%11s%n", "Hola");
        // System.out.printf("%12s%n", "Hola");
    }
}
