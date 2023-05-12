package Tema9ExcepcionesIO.Ejercicio8Indice;

import java.util.ArrayList;
import java.util.List;

import OperacionesAdicionales.StringOperaciones.Nombres;

public class EntradaIndice {
    private String palabra;
    private List<Integer> listaNumeros;

    /* ------------------------------- Constructor ------------------------------ */
    public EntradaIndice(String palabra) {
        if (palabra.isBlank())
            throw new ExceptionInInitializerError("Parámetro incorrecto");

        this.palabra = Nombres.capitalizarNombre(palabra);
        listaNumeros = new ArrayList<>();
    }

    /* --------------------------------- Getter --------------------------------- */
    public String getPalabra() {
        return palabra;
    }

    /* ------------------------------- PrintScreen ------------------------------ */
    @Override
    public String toString() {
        String stringListaNumeros = "";

        for (Integer integer : listaNumeros) 
            stringListaNumeros += integer + ",";
        
        if (listaNumeros.size() > 0) 
            stringListaNumeros = stringListaNumeros.substring(0, stringListaNumeros.length() - 1);    
        

        return palabra + " " + stringListaNumeros;
    }

    /* ---------------- Añadir nuevo número a la lista si no está --------------- */
    public void addNumeroLinea(int numeroLinea) {
        if (listaNumeros.contains(numeroLinea))
            return;

        listaNumeros.add(numeroLinea);
    }
}
