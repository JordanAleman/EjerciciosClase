package InterfazGráfica;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class MarcoCentrado extends JFrame {
    private final Toolkit miPantalla = Toolkit.getDefaultToolkit();
    private final Dimension tamanioPantalla = miPantalla.getScreenSize();

    private final int anchura = tamanioPantalla.width;
    private final int altura = tamanioPantalla.height;

    /**
     * Crea un marco centrado con los elementos mínimos para conseguirlo
     * 
     * <pre>
     * Toolkit miPantalla = Toolkit.getDefaultToolkit();
     * Dimension tamanioPantalla = miPantalla.getScreenSize();
     * 
     * int anchura = tamanioPantalla.width;
     * int altura = tamanioPantalla.height;
     * 
     * setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     * setBounds(anchura / 4, altura / 4, anchura / 2, altura / 2);
     * </pre>
     * 
     * @see java.awt.Toolkit
     * @see java.awt.Dimension
     * 
     * @author Jordan Alemán Santana
     */
    public MarcoCentrado() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(anchura / 4, altura / 4, anchura / 2, altura / 2);
    }

    /**
     * Crea un marco centrado con los elementos mínimos para conseguirlo
     * 
     * <pre>
     * Toolkit miPantalla = Toolkit.getDefaultToolkit();
     * Dimension tamanioPantalla = miPantalla.getScreenSize();
     * 
     * int anchura = tamanioPantalla.width;
     * int altura = tamanioPantalla.height;
     * 
     * setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     * setBounds(anchura / 4, altura / 4, anchura / 2, altura / 2);
     * setTitle(tituloMarco);
     * </pre>
     * 
     * @param tituloMarco {@code String} con el título del marco
     * 
     * @see java.awt.Toolkit
     * @see java.awt.Dimension
     * 
     * @author Jordan Alemán Santana
     */
    public MarcoCentrado(String tituloMarco) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(anchura / 4, altura / 4, anchura / 2, altura / 2);
        setTitle(tituloMarco);
    }

    /**
     * Crea un marco centrado sin título con los elementos mínimos
     * para conseguirlo, asginándoles una anchura y una altura específicas
     * 
     * <pre>
     * setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     * setSize(anchura, altura);
     * setLocationRelativeTo(null);
     * </pre>
     * 
     * @param anchura {@code int} tamaño anchura en píxeles
     * @param altura  {@code int} tamaño altura en píxeles
     * 
     * @author Jordan Alemán Santana
     */
    public MarcoCentrado(int anchura, int altura) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(anchura, altura);
        setLocationRelativeTo(null);
    }

    /**
     * Crea un marco centrado sin título con los elementos mínimos
     * para conseguirlo, asginándoles una anchura y una altura específicas
     * 
     * <pre>
     * setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     * setTitle(tituloMarco);
     * setSize(anchura, altura);
     * setLocationRelativeTo(null);
     * </pre>
     * 
     * @param anchura     {@code int} tamaño anchura en píxeles
     * @param altura      {@code int} tamaño altura en píxeles
     * @param tituloMarco {@code String} con el título del marco
     * 
     * @author Jordan Alemán Santana
     */
    public MarcoCentrado(int anchura, int altura, String tituloMarco) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(tituloMarco);
        setSize(anchura, altura);
        setLocationRelativeTo(null);
    }
}
