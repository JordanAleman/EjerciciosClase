package Tema5Arrays.Ejercicio1Histograma;

public class MainHistograma {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        Histograma miHistograma = new Histograma();
        miHistograma.escribirHistograma();
    }
}
