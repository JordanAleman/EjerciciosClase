package Tema7HerenciaYPolimorfismo.EjerciciosTema7.Ejercicio7_15Figura;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.awt.Point;
import java.awt.Color;

public class GestorFiguras {
    private ArrayList<Figura> listaFiguras;

    /* ------------------------------- Constructor ------------------------------ */
    public GestorFiguras() {
        listaFiguras = new ArrayList<>();
    }

    /* ------------------------------- PrintScreen ------------------------------ */
    public void listarFiguras() {
        for (Figura figura : listaFiguras)
            System.out.println(figura + "\n");
    }

    /* ----------------------------- Añadir figuras ----------------------------- */
    public void addFigura(Figura nuevaFigura) {
        if (listaFiguras.contains(nuevaFigura))
            return;

        listaFiguras.add(nuevaFigura);
    }

    /* -------------------------- Figura con mayor área ------------------------- */
    public Figura mayorArea() {
        if (listaFiguras.isEmpty()) 
            return null;
        
        double max = -1;
        Figura mayor = null;

        for (Figura figura : listaFiguras) {
            if (figura.getArea() > max) {
                max = figura.getArea();
                mayor = figura;
            }
        }

        return mayor;
    }

    /* ------------------- Borrar figuras de un color concreto ------------------ */
    public void borrarDeColor(Color color) {
        Iterator<Figura> iterator = listaFiguras.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getColor().equals(color)) 
                iterator.remove();
        }
    }

    /* --------------------------------- Ordenar -------------------------------- */
    public void ordenarPorArea() {
        listaFiguras.sort(null);
    }

    public void ordernarPorPerimetro() {
        listaFiguras.sort(new ComparatorPerimetroFigura());
    }

    /* ------------------------------- TestFigura ------------------------------- */
    public void testFigura() {
        
        /* ------------------------------ Crear objetos ----------------------------- */
        Random azar = new Random();
        Movible[] arrayMovible = new Movible[5];

        /* ---------------- Añadir elementos al array de tipo Movible --------------- */
        arrayMovible[0] = new Circulo(new Point(100, 100), new Color(20, 30, 40), 50);
        arrayMovible[1] = new Triangulo(new Point(200, 200), new Color(120, 130, 140), 50, 30);
        arrayMovible[2] = new Circulo(new Point(300, 300), new Color(20, 30, 40), 50);
        arrayMovible[3] = new Cuadrado(new Point(400, 400), new Color(20, 30, 40), 20);
        arrayMovible[4] = new Cuadrado(new Point(500, 500), new Color(20, 30, 40), 30);

        /* ------------------------------ Mover figuras ----------------------------- */
        for (Movible movible : arrayMovible)
            System.out.println(movible + "\n");

        for (Movible movible : arrayMovible) {
            movible.moverHorizontal(azar.nextInt(20));
            movible.moverVertical(azar.nextInt(20));
        }

        System.out.println("\nTras mover:\n");
        for (Movible movible : arrayMovible)
            System.out.println(movible + "\n");

    }
}
