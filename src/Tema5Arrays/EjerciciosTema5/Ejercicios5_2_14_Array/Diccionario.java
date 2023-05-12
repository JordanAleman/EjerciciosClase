package Tema5Arrays.EjerciciosTema5.Ejercicios5_2_14_Array;

public class Diccionario {
    private Palabra[] listaPalabras;
    private int pos;

    private final int MAX_PALABRAS = 10;

    /* ------------------------------ Constructors ------------------------------ */
    public Diccionario(int numPalabras) {
        if (numPalabras > MAX_PALABRAS && numPalabras <= 0) 
            numPalabras = MAX_PALABRAS;
        
        listaPalabras = new Palabra[numPalabras];
        pos = 0;
    }

    /* --------------------------------- Getters -------------------------------- */
    public int getTamDiccionario() {
        return listaPalabras.length;
    }

    public int getPos() {
        return pos;
    }

    /* ------------------------------- printScreen ------------------------------ */
    @Override
    public String toString() {
        String diccionario = "";

        for (int i = 0; i < listaPalabras.length; i++) 
            diccionario += i + "º: " + listaPalabras[i] + "\n";
        
        return diccionario;
    }

    /* -------------------------------- Functions ------------------------------- */
    public void insertarPalabra(Palabra palabra) {
        if (pos < MAX_PALABRAS) {
            listaPalabras[pos++] = palabra;
        }
    }

    public Palabra obtenerPalabra(int posicion) {
        if (posicion >= MAX_PALABRAS || posicion < 0) 
            return null;

        return listaPalabras[posicion];  
    }

    public Palabra traduccionAlIngles(String palabraCastellano) { //Coche
        for (Palabra palabra : listaPalabras) {
            if (palabraCastellano.toLowerCase().equals(palabra.getCastellano().toLowerCase())) 
                return palabra;
        }
        return null;
    }
    
    public Palabra traduccionAlCastellano(String palabraIngles) { //Car
        for (Palabra palabra : listaPalabras) {
            if (palabraIngles.toLowerCase().equals(palabra.getIngles().toLowerCase())) 
                return palabra;
        }
        return null;
    }
    
    /**
     * Coche - Car
     * Pared - Wall
     * Ratón - Mouse
     * Mesa - Table
     * ...
     */
}
