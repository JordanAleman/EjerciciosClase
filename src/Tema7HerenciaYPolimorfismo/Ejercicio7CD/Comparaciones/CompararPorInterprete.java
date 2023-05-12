package Tema7HerenciaYPolimorfismo.Ejercicio7CD.Comparaciones;

import java.util.Comparator;

import Tema7HerenciaYPolimorfismo.Ejercicio7CD.Cancion;

public class CompararPorInterprete implements Comparator<Cancion>{
    @Override
    public int compare(Cancion obj1, Cancion obj2) {
        return obj1.getInterprete().compareTo(obj2.getInterprete());
    }
}
