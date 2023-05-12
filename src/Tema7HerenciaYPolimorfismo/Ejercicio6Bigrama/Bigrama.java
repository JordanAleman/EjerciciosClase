package Tema7HerenciaYPolimorfismo.Ejercicio6Bigrama;

public class Bigrama {
    private String primeraPalabra;
    private String segundaPalabra;

    /* ------------------------------- Constructor ------------------------------ */
    public Bigrama(String primeraPalabra, String segundaPalabra) {
        if (primeraPalabra == null) 
            primeraPalabra = "";

        if (segundaPalabra == null) 
            segundaPalabra = "";
        
        this.primeraPalabra = primeraPalabra.toLowerCase();
        this.segundaPalabra = segundaPalabra.toLowerCase();
    }

    /* --------------------------------- Getter --------------------------------- */
    public String getPrimeraPalabra() {
        return primeraPalabra;
    }

    public String getSegundaPalabra() {
        return segundaPalabra;
    }

    /* ------------------------------- PrintScreen ------------------------------ */
    @Override
    public String toString() {
        return "\"" + primeraPalabra + " " + segundaPalabra + "\"";
    }

    /* -------------------------------- Igualdad -------------------------------- */
    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;

        if (!(obj instanceof Bigrama otroBigrama))
            return false;

        return primeraPalabra.equalsIgnoreCase(otroBigrama.primeraPalabra) &&
                segundaPalabra.equalsIgnoreCase(otroBigrama.segundaPalabra);
    }

    @Override
    public int hashCode() {
        return primeraPalabra.hashCode() * 3 + segundaPalabra.hashCode() * 5; 
    }

}
