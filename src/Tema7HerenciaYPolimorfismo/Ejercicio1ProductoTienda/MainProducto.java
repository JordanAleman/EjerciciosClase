package Tema7HerenciaYPolimorfismo.Ejercicio1ProductoTienda;

public class MainProducto {
    public static void main(String[] args) {
        /* ----------------------- Creando productos y tienda ----------------------- */
        ProductoInventariado miProducto1 = new ProductoInventariado("Leche", 10, 5, 10);
        ProductoInventariado miProducto2 = new ProductoInventariado("Azúcar", 2, 20, 10);
        ProductoInventariado miProducto3 = new ProductoInventariado("Sal", 1, 20, 10);
        ProductoInventariado miProducto4 = new ProductoInventariado("Agua", 1.5, 40, 10);
        ProductoInventariado miProducto5 = new ProductoInventariado("Vinagre", 2.5, 10, 10);
        
        ProductoInventariado miProducto6 = new ProductoInventariado("Agua", 1.5, 80, 10);
        ProductoInventariado miProducto7 = new ProductoInventariado("Vinagre", 5, 10, 10);



        Tienda miTienda = new Tienda("De todo", 10000);

        /* --------------------- Añadiendo productos a la tienda -------------------- */
        miTienda.addProducto(miProducto1);
        miTienda.addProducto(miProducto2);
        miTienda.addProducto(miProducto3);
        miTienda.addProducto(miProducto4);
        miTienda.addProducto(miProducto5);
        miTienda.addProducto(miProducto6);
        miTienda.addProducto(miProducto7);

        System.out.println(miTienda);




    }
}
