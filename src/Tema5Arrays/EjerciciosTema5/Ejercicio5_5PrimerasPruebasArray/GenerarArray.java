package Tema5Arrays.EjerciciosTema5.Ejercicio5_5PrimerasPruebasArray;

public class GenerarArray {
    private static final String[] DIAS_SEMANAS = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
    
    public static void devolverDiaSemana(int diaSemana) {
        if (diaSemana < 1 || diaSemana > 7) 
            System.out.println("Día incorrecto");
        else 
            System.out.println("Día de la semana: " + DIAS_SEMANAS[diaSemana - 1]);
        
    }



    public static int[] arrayNumerosAleatorios(int tamArray){
        if (tamArray <= 0) 
            tamArray = 1;
        
        int[] arrayNumerosAleatorios = new int[tamArray];

        for (int i = 0; i < arrayNumerosAleatorios.length; i++) 
            arrayNumerosAleatorios[i] = (int) (Math.random() * 20) + 1;
        
        return arrayNumerosAleatorios;
    }
    
}
