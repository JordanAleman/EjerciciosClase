package Tema4InteraccionObjeto.Ejercicio4SisUsCont;

public class Sistema {
    private Usuario usuario1, usuario2, usuario3;

    /* ------------------------------- Constructor ------------------------------ */
    public Sistema(String usuario1, String usuario2, String usuario3) {
        this.usuario1 = new Usuario(usuario1);
        this.usuario2 = new Usuario(usuario2);
        this.usuario3 = new Usuario(usuario3);
    }

    public void entrarEnSistema() {
        usuario1.acceder();
        usuario2.acceder();
        usuario3.acceder();
    }
    
    public void printEstadisticasSistema() {
        usuario1.printDatosUsuario();
        usuario2.printDatosUsuario();
        usuario3.printDatosUsuario();
    }


}
