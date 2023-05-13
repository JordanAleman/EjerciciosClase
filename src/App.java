// import Expresiones.rexExp;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        // System.out.println("\n\n\n\n");

        // System.out.println("Hello, World!\n");

        // String oracion = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. In
        // eleifend scelerisque mi sed ultrices.";
        // String[] oracionArray = oracion.split(" ");

        // int cont = 0;

        // for (String oracionArray1 : oracionArray) {
        // System.out.print(oracionArray1 + " ");

        // if(cont++ == oracionArray.length - 1)
        // System.out.println("╰(*°▽°*)╯ FIN 😁");

        // }

        // System.out.println(Math.round(5.4));
        // System.out.printf("%5s%n", "Hola");
        // System.out.printf("%6s%n", "Hola");
        // System.out.printf("%7s%n", "Hola");
        // System.out.printf("%8s%n", "Hola");
        // System.out.printf("%9s%n", "Hola");
        // System.out.printf("%10s%n", "Hola");

        // int[] nums = new int[10];
        // nums[0] = 8;

        // System.out.print("[");
        // for (int i = 0; i < nums.length; i++) {
        // nums[i] = (int) (Math.random() * 20) + 1;

        // System.out.print(nums[i] +
        // ((i != nums.length - 1)
        // ? ", "
        // : "]"));
        // }

        // System.out.println("\n" + Arrays.toString(nums) + "\n");

        // // String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // String[] alfaberoArray = { "A", "B", "C", "D", "E", "F", "G",
        // "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
        // "U", "V", "W", "X", "Y", "Z" };

        // String[] otroAlfabetoArray = alfaberoArray;

        // Array.toString(alfaberoArray);

        // Array.invertir(otroAlfabetoArray);
        // Array.toString(otroAlfabetoArray);

        // String[] numerosString = {"1", "2", "3", "4", "5", "6"};
        // Array.toString(numerosString);
        // Array.invertir(numerosString);
        // Array.toString(numerosString);

        // System.out.println();

        // int[] numeros = {1, 2, 3, 4, 5, 6};

        // Array.toString(numeros);
        // Array.invertir(numeros);
        // Array.toString(numeros);

        // char[] numerosChar = {'1'};

        // Array.toString(numerosChar);
        // Array.invertir(numerosChar);
        // Array.toString(numerosChar);

        // Array.eliminarYDesplazar(numerosChar, 1);
        // Array.toString(numerosChar);

        // char[] pruebaCharArray = new char[2];

        // System.out.println("-" + pruebaCharArray[0] + "-");

        // if (pruebaCharArray[0] == 0) {
        // System.out.println("Sí");
        // } else {
        // System.out.println("No");
        // }

        // ArrayList<String> listaNombres = new ArrayList<>();
        // listaNombres.add("Pepito");
        // listaNombres.add("Luisito");
        // listaNombres.add("Jaimito");

        // listaNombres.sort(null);

        // System.out.println(listaNombres);

        // String[] arrayNombres = new String[1];
        // String[] arrayNombres2 = listaNombres.toArray(arrayNombres);

        // System.out.println(Arrays.toString(arrayNombres2));

        // String letras = "([A-Z]|[Á-Ú]|[a-z]|[á-ú])*";

        // String nombre = "Jordan2";

        // if (nombre.matches(letras))
        //     System.out.println("Correcto");
        // else
        //     System.out.println("No es correcto");

        // System.out.println("Hola");

        // String a = "aasdsa";

        // if (a.matches("\\S*\\.\\S*")) {
        //     System.out.println("Bien");
        // } else {
        //     System.out.println("Mal");
        // }

        // String[] abc = new String[1];
        // abc[1] = "Nada";

        // System.out.println(abc[0]);
        // String numeros = " ";

        // for (int i = 1; i <= 10000; i++) {
        //     // if (i % 10 == 1) 
        //     //     numeros = numeros.substring(0, numeros.length() - 1) + "\n";
            
        //     numeros += ((int) (Math.random() * 9999) + 1) + "\n";
        // }

        // System.out.println(Character.isISOControl('?'));
        // System.out.println("2p".matches("\\d"));
        JFrame frame = new JFrame("GridLayout Example");
        JPanel panel = new JPanel();
        
        // Establecer un GridLayout con 2 filas, 3 columnas y un espacio de 10 píxeles entre columnas
        panel.setLayout(new GridLayout(2, 3, 200, 0));
        
        panel.add(new JButton("Botón 1"));
        panel.add(new JButton("Botón 2"));
        panel.add(new JButton("Botón 3"));
        panel.add(new JButton("Botón 4"));
        panel.add(new JButton("Botón 5"));
        panel.add(new JButton("Botón 6"));
        
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}