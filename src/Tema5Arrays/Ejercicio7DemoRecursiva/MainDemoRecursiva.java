package Tema5Arrays.Ejercicio7DemoRecursiva;

import java.util.Arrays;

public class MainDemoRecursiva {
    public static void main(String[] args) {
        /* ----------- Crear lista de numeros y realizar sumas recursivas ----------- */
        int[] listaNumeros = { 2, 4, 6, 8, 10 };
        int resultadoSumaRecursiva1 = DemoRecursiva.sumaRecursiva(listaNumeros, 0, listaNumeros.length - 1);
        int resultadoSumaRecursiva2 = DemoRecursiva.sumaRecursiva(listaNumeros, 2, listaNumeros.length - 1);
        int resultadoSumaRecursiva3 = DemoRecursiva.sumaRecursiva(listaNumeros, 1, 3);

        System.out.println(Arrays.toString(listaNumeros));
        System.out.println("Resultado suma desde [0 - 4]: " + resultadoSumaRecursiva1);
        System.out.println("Resultado suma desde [2 - 4]: " + resultadoSumaRecursiva2);
        System.out.println("Resultado suma desde [1 - 3]: " + resultadoSumaRecursiva3);

        /* ----------------- Crear números capícuos y números que no ---------------- */
        int[] listaNumeros1 = { 2, 4, 6, 4, 2 };
        int[] listaNumeros2 = { 2, 4, 6, 8, 10 };
        int[] listaNumeros3 = { 10, -40, 60, 60, -40, 10 };
        int[] listaNumeros4 = { -2, -4, -6, 6, 4, 2 };

        boolean capicuaListaNumeros1_1 = DemoRecursiva.esListaCapicua(listaNumeros1, 0, listaNumeros1.length - 1);
        boolean capicuaListaNumeros1_2 = DemoRecursiva.esListaCapicua(listaNumeros1, 1, listaNumeros1.length - 2);
        boolean capicuaListaNumeros1_3 = DemoRecursiva.esListaCapicua(listaNumeros1, 2, listaNumeros1.length - 1);

        boolean capicuaListaNumeros2 = DemoRecursiva.esListaCapicua(listaNumeros2, 0, listaNumeros2.length - 1);
        boolean capicuaListaNumeros3 = DemoRecursiva.esListaCapicua(listaNumeros3, 0, listaNumeros3.length - 1);
        boolean capicuaListaNumeros4 = DemoRecursiva.esListaCapicua(listaNumeros4, 0, listaNumeros4.length - 1);

        boolean[] listaResultadosCapicua = { capicuaListaNumeros1_1, capicuaListaNumeros1_2, capicuaListaNumeros1_3,
                capicuaListaNumeros2, capicuaListaNumeros3, capicuaListaNumeros4 };

        System.out.println("-------------------------------------------");
        for (int i = 0; i < listaResultadosCapicua.length; i++) 
            System.out.println((listaResultadosCapicua[i])
                    ? "Es capicúa"
                    : "No es capicúa");
    }
}
