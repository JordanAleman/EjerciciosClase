package Tema5Arrays.Ejercicio7DemoRecursiva;

public class DemoRecursiva {
    /* ----------------------------- Suma recursiva ----------------------------- */
    public static int sumaRecursiva(int[] lista, int desde, int hasta) {
        if (!verificarLimites(lista, desde, hasta)) 
            errorParametros("Error en los parámetros");

        if (desde == hasta) 
            return lista[desde];
        else 
            return lista[desde] + sumaRecursiva(lista, ++desde, hasta);
    }

    /* --------------------- Averigüar palíndromo recursiva --------------------- */
    public static boolean esListaCapicua(int[] lista, int desde, int hasta) {
        if (!verificarLimites(lista, desde, hasta)) 
            errorParametros("Error en los parámetros");

        if ((hasta - desde) <= 1) 
            return true;
        
        if (lista[desde] == lista[hasta]) 
            return esListaCapicua(lista, ++desde, --hasta);
        
        return false;
    }

 


    /* ----------------------------- ControlErrores ----------------------------- */
    private static boolean verificarLimites(int[] lista, int desde, int hasta) {
        if (lista == null) 
            return false;

        if (desde < 0 || desde > hasta) 
            return false;

        if (hasta >= lista.length) 
            return false;
        
        return true;
    }

    private static void errorParametros(String error) {
        System.out.println();
        throw new IllegalArgumentException(error);
    }
}
