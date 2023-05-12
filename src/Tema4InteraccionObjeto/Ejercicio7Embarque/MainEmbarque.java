package Tema4InteraccionObjeto.Ejercicio7Embarque;

import OperacionesAdicionales.ArrayOperacionesAdicionales.Array;

public class MainEmbarque {
    public static void main(String[] args) {
        // InterfazTextoEjercicio7 miInterfaz = new InterfazTextoEjercicio7();

        // miInterfaz.menuPrincipal();
        
        // Pasajero pasajero1 = new Pasajero("Pepito", -1);
        Pasajero pasajero2 = new Pasajero("Pepito", -1999);
        Pasajero pasajero3 = new Pasajero("Juanito");
        Pasajero pasajero4 = new Pasajero("Luisito");

        Ferry miFerry = new Ferry();

        miFerry.printDetallesPasajeros();

        // miFerry.addPasajero(new Pasajero("Pepito", 2));
        // miFerry.addPasajero(new Pasajero("Pepito", 2));
        // miFerry.addPasajero(new Pasajero("Juanito", 2));
        miFerry.addPasajero(pasajero2);
        miFerry.addPasajero(pasajero3);
        miFerry.addPasajero(pasajero4);
        // miFerry.addPasajeroPorNombre("Luisito");

        miFerry.printDetallesPasajeros();

        Array.invertir(miFerry.getAsientos());
        miFerry.printDetallesPasajeros();

        // if ((miFerry.getPasajero(0)).esIgual(miFerry.getPasajero(1))) {
        //     System.out.println("Sí, son iguales");
        // }
        // if (pasajero1.esIgual(pasajero2)) {
        //     System.out.println("Sí, son iguales");
        // } else {
        //     System.out.println("No, no son iguales :(");
        // }

        // System.out.println((miFerry.borrarPasajero(pasajero3)
        //         ? "Se ha eliminado al pasajero " + pasajero3.getNombre()
        //         : "No se ha eliminado a ningún pasajero"));

        // miFerry.printDetallesPasajeros();

        // System.out.println("El pasajero más joven es " + 
        //         ((miFerry.getPasajeroMasJoven() == null)
        //                 ? "ninguno. No se sabe la edad de nadie o no hay pasajeros"
        //                 : miFerry.getPasajeroMasJoven().getNombre()));

        // Pasajero[] nums = {pasajero1, pasajero2, pasajero3, pasajero4};
        // Array.mostrarDatosArray(nums);

        // Array.eliminarYDesplazar(nums, 2);

        // Array.mostrarDatosArray(nums);

        // Scanner miTeclado = new Scanner(System.in);
        // String a = miTeclado.next();
        // String b = miTeclado.next();

        // String pruebaA = "Hola";
        // String pruebaB = "Hola";

        // System.out.println(a + " y " + b + " ¿serán iguales?");
        // System.out.println(pruebaA + " y " + pruebaB + " ¿serán iguales?");

        // if (pruebaA.equals("Hola")) {
        //     System.out.println(pruebaA + " y " + pruebaB + " son iguales");
        // } else {
        //     System.out.println(pruebaA + " y " + pruebaB + " no son iguales");
        // }
        
        // if (a.equals(b)) {
        //     System.out.println(a + " y " + b + " son iguales");
        // } else {
        //     System.out.println(a + " y " + b + " no son iguales");
        // }

        // miTeclado.close();

        // System.out.println(a.length());
        // System.out.println(b.length());
       
    }
}
