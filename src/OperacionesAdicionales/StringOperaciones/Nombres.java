package OperacionesAdicionales.StringOperaciones;

public class Nombres {
    private static final String TODO_LETRAS = "([A-Z]|[Á-Ú]|[a-z]|[á-ú])*";

    /* -------- Poner todos los nombres con la primera letra en mayúscula ------- */
    /* ------------------------- y el resto en minúscula ------------------------ */
    public static String capitalizarNombre(String nombre) {
        String[] arrayNombre = nombre.split(" ");
        String nombreCapitalizado = "";

        for (int i = 0; i < arrayNombre.length; i++) {
            if (!arrayNombre[i].matches(TODO_LETRAS))
                return null;
            else
                nombreCapitalizado += arrayNombre[i].substring(0, 1).toUpperCase() +
                        arrayNombre[i].substring(1, arrayNombre[i].length()).toLowerCase() + " ";

        }

        return nombreCapitalizado.substring(0, nombreCapitalizado.length() - 1);
    }

    

}
