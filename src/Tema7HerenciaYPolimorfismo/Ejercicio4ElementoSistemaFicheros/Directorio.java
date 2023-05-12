package Tema7HerenciaYPolimorfismo.Ejercicio4ElementoSistemaFicheros;

import java.util.ArrayList;
import java.util.List;

import OperacionesAdicionales.StringOperaciones.Nombres;

public class Directorio extends ElementoSistemaFicheros {
    private List<ElementoSistemaFicheros> listaFicheros;

    /* ------------------------------- Constructor ------------------------------ */
    public Directorio(String nombre) {
        super(nombre);
        setNombre(Nombres.capitalizarNombre(nombre));

        listaFicheros = new ArrayList<>();
    }

    /* --------------------------------- Getter --------------------------------- */
    public List<ElementoSistemaFicheros> getListaFicheros() {
        return listaFicheros;
    }

    /* ------------------------------- PrintScreen ------------------------------ */
    @Override
    public String toString() {
        String listaString = "";

        for (ElementoSistemaFicheros elementoSistemaFicheros : listaFicheros) 
        if (elementoSistemaFicheros instanceof Directorio) {
            listaString += "\\" + 
            elementoSistemaFicheros.getNombre() + "      " +
            elementoSistemaFicheros.getPermisos() + "   ";
            
        }
        

        return listaString;
    }



    /* --------------------- Añadir elemento a la colección --------------------- */
    public void addElemento(ElementoSistemaFicheros nuevoElementoSistemaFicheros) {
        if (nuevoElementoSistemaFicheros == null)
            return;

        for (ElementoSistemaFicheros elementoSistemaFicheros : listaFicheros) {
            if (elementoSistemaFicheros.getNombre().equals(nuevoElementoSistemaFicheros.getNombre()))
                return;
        }

        listaFicheros.add(nuevoElementoSistemaFicheros);
    }

    /* ------------------- Borrar un elemento de la colección ------------------- */
    public void borrarElemento(ElementoSistemaFicheros unElementoSistemaFicheros) {
        if (unElementoSistemaFicheros == null)
            return;

        for (ElementoSistemaFicheros elementoSistemaFicheros : listaFicheros) {
            if (elementoSistemaFicheros.getNombre().equals(unElementoSistemaFicheros.getNombre())) {
                listaFicheros.remove(elementoSistemaFicheros);
                return;
            }
        }
    }

}
