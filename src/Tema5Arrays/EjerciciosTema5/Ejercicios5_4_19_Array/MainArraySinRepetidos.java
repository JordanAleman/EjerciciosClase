package Tema5Arrays.EjerciciosTema5.Ejercicios5_4_19_Array;

import java.util.Arrays;

public class MainArraySinRepetidos {
    public static void main(String[] args) {
        ArraySinRepetidos miArray = new ArraySinRepetidos();
        ArraySinRepetidos miArray2 = new ArraySinRepetidos();



        System.out.println("Vamos a insertar varios elementos al array Elementos" + 
        ", verificando que ninguno de ellos estén repetidos.");
        System.out.println("Intentaremos insertar 20 aleatorios hasta" +
        " que se rellene con números del 0 al 99");

        // miArray.insertar(48);
        // miArray.insertar(51);

        for (int i = 0; i < 10; i++) {
            miArray.insertar((int) (Math.random() * 100));
        }

        // miArray2.insertar(2);
        
        // for (int i = 0; i < 10; i++) {
        //     miArray2.insertarOrdenadamente((int) (Math.random() * 100));
        // }

        

        miArray2.insertarOrdenadamente(2);
        miArray2.insertarOrdenadamente(20);
        miArray2.insertarOrdenadamente(240);
        miArray2.insertarOrdenadamente(260);
        miArray2.insertarOrdenadamente(250);
        miArray2.insertarOrdenadamente(10);
        miArray2.insertarOrdenadamente(0);
        miArray2.insertarOrdenadamente(30);
        miArray2.insertarOrdenadamente(15);
        miArray2.insertarOrdenadamente(1);
        miArray2.insertarOrdenadamente(11);
        miArray2.insertarOrdenadamente(44);
        miArray2.insertarOrdenadamente(0);
        miArray2.insertarOrdenadamente(12);

        System.out.println("Siguiente de miArray es: " + miArray.getSiguiente());
        System.out.println("Siguiente de miArray2 es: " + miArray2.getSiguiente());
        System.out.println();

        System.out.println("Los datos de estos valores insertados son los siguientes:");

        // System.out.println(Arrays.toString(miArray.elementosOrdenados()));
        System.out.println(Arrays.toString(miArray.getElementos()));
        System.out.println(Arrays.toString(miArray2.getElementos()));


        // System.out.println("El anterior a 50 es " + miArray.buscarAnteriorElementoAproximado(50));
        // System.out.println("El posterior a 50 es " + miArray.buscarSuperiorElementoAproximado(50));

        // miArray.encontrarElemento(50);
    }
}
