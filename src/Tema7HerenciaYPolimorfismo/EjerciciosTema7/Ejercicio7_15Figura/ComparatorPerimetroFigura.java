package Tema7HerenciaYPolimorfismo.EjerciciosTema7.Ejercicio7_15Figura;

import java.util.Comparator;

public class ComparatorPerimetroFigura implements Comparator<Figura> {

    @Override
    public int compare(Figura o1, Figura o2) {
        if (o1.getPerimetro() < o2.getPerimetro())
            return -1;

        if (o1.getPerimetro() > o2.getPerimetro())
            return 1;

        return 0;
    }

}
