package Tema4InteraccionObjeto.Ejercicio17NumerosExponenciales;

public class Main17Exponencial {
    public static void main(String[] args) {
        Exponencial miExponencial1 = new Exponencial(2, 2);
        Exponencial miExponencial2 = new Exponencial(2, 4);

        /* ---------------------------- ValorExponencial ---------------------------- */
        System.out.println(miExponencial1);
        // System.out.println("El exponencial de 2^-2 = " + miExponencial2.valorExponencial());

        /* ---------------------------- PotenciaExponente --------------------------- */
        Exponencial nuevoExponencial = miExponencial1.multiplicar(miExponencial2);
        System.out.println("\n" + nuevoExponencial);

        nuevoExponencial = miExponencial1.dividir(miExponencial2);
        System.out.println("\n" + nuevoExponencial);

        nuevoExponencial = miExponencial1.elevar(2);
        System.out.println("\n" + nuevoExponencial);
    }
}
