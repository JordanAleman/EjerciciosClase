package Tema7HerenciaYPolimorfismo.Ejercicio2Coche;

public class CocheDeportivo extends Coche {
    /* ------------------------------- Constructor ------------------------------ */
    public CocheDeportivo(String nombreConductor, String colorCoche) {
        super(nombreConductor, "Deportivo", colorCoche, new Punto(0, 200));
    }

    /* -------------------------- Avanzar en el espacio ------------------------- */
    @Override
    public void avanza() {
        double numRandom = Math.random();

        if (numRandom >= 0.7) 
            getPosicion().desplaza(50, 0);
        else
            getPosicion().desplaza(30, 0);
    }  
}
