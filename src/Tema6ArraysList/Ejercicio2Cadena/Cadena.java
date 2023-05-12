package Tema6ArraysList.Ejercicio2Cadena;

public class Cadena extends Tema5Arrays.Ejercicio15Cadena.Cadena {
    
    /* ------------------------------- Constructor ------------------------------ */
    public Cadena(String ristra) {
        super(ristra);
    }

    public Cadena(Cadena otraCadena) {
        super(otraCadena.getRistra());
    }
}
