package Tema7HerenciaYPolimorfismo.Ejercicio1ProductoTienda;

import OperacionesAdicionales.StringOperaciones.Nombres;

public class Tienda {
    private String nombreTienda;
    private double dineroCaja;

    private ProductoInventariado[] arrayInventario;
    private int ultimaEntrada;

    private final int MAX = 10;

    /* ------------------------------- Constructor ------------------------------ */
    public Tienda(String nombreTienda, double dineroCaja) {
        nombreTienda = Nombres.capitalizarNombre(nombreTienda);
        if (nombreTienda == null)
            nombreTienda = "Nombre pendiente";

        if (dineroCaja < 0.0)
            dineroCaja = 0.0;

        this.nombreTienda = nombreTienda;
        this.dineroCaja = dineroCaja;

        arrayInventario = new ProductoInventariado[MAX];
        ultimaEntrada = 0;
    }

    /* --------------------------------- Getter --------------------------------- */
    public String getNombreTienda() {
        return nombreTienda;
    }

    public double getDineroCaja() {
        return dineroCaja;
    }

    /* ------------------------------- PrintScreen ------------------------------ */
    @Override
    public String toString() {
        String listaInventario = "";

        for (int i = 0; i < ultimaEntrada; i++)
            listaInventario += arrayInventario[i] + "\n";

        return "Nombre tienda: " + nombreTienda +
                "\nDinero en caja: " + dineroCaja +
                "\n\nInventario: \n" + listaInventario;
    }

    /* --------------------------- Buscar un producto --------------------------- */
    public int buscarProducto(String identificador) {
        if (ultimaEntrada == 0 || identificador == null)
            return -1;

        for (int i = 0; i < ultimaEntrada; i++) {
            if (arrayInventario[i].getIdentificador().equals(Nombres.capitalizarNombre(identificador)))
                return i;
        }

        return -1;
    }

    /* ----------------------------- Añadir producto ---------------------------- */
    public void addProducto(String identificador, double precio, int cantidad, int beneficio) {
        if (ultimaEntrada == MAX) {
            System.out.println("No caben más productos en la tienda");
            return;
        }

        if (identificador == null || precio < 0.0 || cantidad < 1 || beneficio < 0) {
            System.out.println("Algunos parámetros no son correctos");
            return;
        }

        if (dineroCaja < (precio * cantidad)) {
            System.out.println("No hay dinero en la caja");
            return;
        }

        if (buscarProducto(identificador) == -1) {
            arrayInventario[ultimaEntrada++] = new ProductoInventariado(identificador, precio, cantidad, beneficio);
            System.out.println("Producto añadido");
        } else {
            arrayInventario[buscarProducto(identificador)].setPrecioBase(precio);
            arrayInventario[buscarProducto(identificador)].setCantidad(cantidad);
            arrayInventario[buscarProducto(identificador)].setBeneficio(beneficio);
            System.out.println("Producto modificado");
        }
        
        dineroCaja -= precio * cantidad;
    }

    public void addProducto(ProductoInventariado unProducto) {
        addProducto(unProducto.getIdentificador(), unProducto.getPrecioBase(),
                unProducto.getCantidad(), unProducto.getBeneficio());
    }

    /* ----------------------------- Vender producto ---------------------------- */
    public void venderProducto(String identificador, int cantidad) {
        if (identificador == null || cantidad < 1) {
            System.out.println("Algunos parámetros son correctos");
            return;
        }

        if (buscarProducto(identificador) == -1) {
            System.out.println("No existe un producto con ese identificador");
            return;
        }

        int cantidadProducto = arrayInventario[buscarProducto(identificador)].getCantidad();

        if (cantidadProducto < cantidad) {
            System.out.println("No hay la cantidad que solicita de ese producto");
            return;
        }

        arrayInventario[buscarProducto(identificador)].setCantidad(cantidadProducto - cantidad);
        dineroCaja += arrayInventario[buscarProducto(identificador)].getPrecioBase() * cantidad;

        System.out.println("Producto vendido");
    }
}
