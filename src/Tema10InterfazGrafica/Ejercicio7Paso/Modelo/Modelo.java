package Tema10InterfazGrafica.Ejercicio7Paso.Modelo;

public class Modelo {
    private int cantidad;
    private int paso;
    private int limiteInferior;
    private int limiteSuperior;
    private ModeloListener listener;

    public Modelo() {
        this.cantidad = 0;
        this.paso = 1;
        this.limiteInferior = 0;
        this.limiteSuperior = 100;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setPaso(int paso) {
        this.paso = paso;
    }

    public void setLimiteInferior(int limiteInferior) {
        this.limiteInferior = limiteInferior;

        if (cantidad < limiteInferior) {
            cantidad = limiteInferior;
            notificarCambioCantidad();
        }
    }

    public void setLimiteSuperior(int limiteSuperior) {
        this.limiteSuperior = limiteSuperior;

        if (cantidad > limiteSuperior) {
            cantidad = limiteSuperior;
            notificarCambioCantidad();
        }
    }

    public void aumentarCantidad() {
        if (cantidad + paso <= limiteSuperior) {
            cantidad += paso;
            notificarCambioCantidad();
        }
    }

    public void disminuirCantidad() {
        if (cantidad - paso >= limiteInferior) {
            cantidad -= paso;
            notificarCambioCantidad();
        }
    }

    public void agregarModeloListener(ModeloListener listener) {
        this.listener = listener;
    }

    public void notificarCambioCantidad() {
            listener.cantidadActualizada(cantidad);
    }
}
