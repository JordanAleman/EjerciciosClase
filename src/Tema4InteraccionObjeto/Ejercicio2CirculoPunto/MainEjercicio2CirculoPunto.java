package Tema4InteraccionObjeto.Ejercicio2CirculoPunto;

public class MainEjercicio2CirculoPunto {
    public static void main(String[] args) {
        Punto miPunto1 = new Punto(3, 8);
        Punto miPunto2 = new Punto(12, 9);
        // Circulo miCirculo = new Circulo(10, miPunto);

        System.out.println("El primer punto es: \n" + miPunto1 + "\n");
        System.out.println("El segundo punto es: \n" + miPunto2 + "\n");

        /* --------------------- Calcular distancia desde origen -------------------- */
        System.out.println("Distancia desde el primer punto al origen: " +
                miPunto1.getDistanciaDesdeOrigen());

        /* ------------------- Calcular distancia entre dos puntos ------------------ */
        System.out.println("Distancia entre ambos puntos: " +
                miPunto1.getDistanciaDesdePunto(miPunto2));

        System.out.printf("Distancia entre ambos punto: %.2f", miPunto1.getDistanciaDesdePunto(miPunto2));
    }
}
