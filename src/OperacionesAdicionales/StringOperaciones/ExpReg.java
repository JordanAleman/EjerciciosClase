package OperacionesAdicionales.StringOperaciones;

public class ExpReg {
    // public static final String LCap =  "([A-Z]|[Á-Ú])";
    // public static final String LCap0More =  "([A-Z]|[Á-Ú])*";
    // public static final String LCap1More =  "([A-Z]|[Á-Ú])+";

    // public static final String LNoCap =  "([a-z]|[á-ú])";
    // public static final String LNoCap0More =  "([a-z]|[á-ú])*";
    // public static final String LNoCap1More =  "([a-z]|[á-ú])+";

    // private final String TODO_LETRAS = "([A-Z]|[Á-Ú]|[a-z]|[á-ú])*";
    public static final String[] ARRAY_ALFABETO = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L",
                "M", "N", "Ñ", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", " ", "BS", "CL" };


    public static boolean checkNoumSpanish(String noum)  {
        boolean chekNoumBasic = noum.matches("([A-Z]|[Á-Ú])([a-z]|[á-ú])+((\\s)*([A-Z]|[Á-Ú])([a-z]|[á-ú])+)*");
        // boolean chekNoumBasic = noum.matches(rexExp.LCap + rexExp.LNoCap1More + "((\\s)" + rexExp.LCap + rexExp.LNoCap1More + ")*");

        if (chekNoumBasic) 
            return true;
        
        return false;
    }

    /* --------------- Evaluar nombres de ficheros con extensiones -------------- */
    public static boolean checkNoumAndExtension(String noum) {
        return noum.matches("\\S*\\.\\S*");
    }

    /* ------------------------ Comprobar si es un numero ----------------------- */
    public static boolean checkNumber(String noum) {
        return noum.matches("\\d");
    }

}
