package Excepciones;

public class ArgumentoIncorrectoExcepcion extends RuntimeException {    
    public ArgumentoIncorrectoExcepcion(String mensajeExcepcion) {
        super(mensajeExcepcion);
    }
}


