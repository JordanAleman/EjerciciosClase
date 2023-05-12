package Tema4InteraccionObjeto.Ejercicio4SisUsCont;

import Colores.Colores;

public class Usuario {
    private String nombre;
    private Contador accesos;
    private Contador fallos;

    /* ------------------------------- Constructor ------------------------------ */
    public Usuario(String nombre) {
        this.nombre = nombre;
        accesos = new Contador();
        fallos = new Contador();
    }

    /* --------------------------------- Getters -------------------------------- */
    public String getNombre() {
        return nombre;
    }

    /* ------------------------------- PrintScreen ------------------------------ */
    public void printDatosUsuario() {
        System.out.println(Colores.YELLOW_BOLD_BRIGHT + "\n■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■" + Colores.RESET);

        System.out.println(Colores.WHITE_BOLD_BRIGHT + Colores.WHITE_UNDERLINED + "Datos del usuario:\n" + Colores.RESET);
        System.out.println(Colores.WHITE_BOLD_BRIGHT + "Nombre: " + Colores.RESET + nombre);
        System.out.println(Colores.BLUE_BOLD_BRIGHT + "Accesos exitosos: " + accesos.getValor() + Colores.RESET);
        System.out.println(Colores.RED_BOLD_BRIGHT + "Accesos fallidos: " + fallos.getValor() + Colores.RESET);

        System.out.println(Colores.YELLOW_BOLD_BRIGHT + "■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n" + Colores.RESET);

        
    }

    /* -------------------------------- Functions ------------------------------- */
    public void acceder() {
        int intento = (int) (Math.random() * 2) + 1;

        if (intento == 1)
            fallos.incrementar();
        else
            accesos.incrementar();
    }
}
