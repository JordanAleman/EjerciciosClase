package Tema6ArraysList.Ejercicio1Bola;

public class MainUrna {
    public static void main(String[] args) {
        Bola miBola = new Bola();

        System.out.println(miBola);

        if (miBola.esBlanca()) {
            System.out.println("Es blanca");
        }
        if (miBola.esNegra()) {
            System.out.println("Es negra");
        }

        Urna miUrna = new Urna();

        miUrna.meterBola(new Bola());
        miUrna.meterBola(new Bola());
        miUrna.meterBola(new Bola());
        miUrna.meterBola(new Bola());
        miUrna.meterBola(new Bola());
        miUrna.meterBola(new Bola());

        miUrna.mostrarUrna();
        miUrna.borrarBlancas();

        System.out.println();
        miUrna.mostrarUrna();
    }
}
