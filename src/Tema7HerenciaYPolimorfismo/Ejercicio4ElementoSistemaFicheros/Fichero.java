package Tema7HerenciaYPolimorfismo.Ejercicio4ElementoSistemaFicheros;

import OperacionesAdicionales.StringOperaciones.ExpReg;

public class Fichero extends ElementoSistemaFicheros{
    private Fichero(String nombre) {
        super(nombre);
    }

    public Fichero instanciarFichero(String nombre) {
        if (!ExpReg.checkNoumAndExtension(nombre)) 
            return null;
        
        return new Fichero(nombre);
    }
}
