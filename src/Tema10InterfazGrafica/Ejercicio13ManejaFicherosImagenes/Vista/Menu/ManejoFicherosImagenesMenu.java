package Tema10InterfazGrafica.Ejercicio13ManejaFicherosImagenes.Vista.Menu;

import java.util.ArrayList;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class ManejoFicherosImagenesMenu extends JMenuBar {
    private ArrayList<JMenu> menuPrincipal;
    private ArrayList<JMenuItem> menuArchivos;
    private ArrayList<JMenuItem> menuFiltros;

    /* ------------------------------- Constructor ------------------------------ */
    public ManejoFicherosImagenesMenu() {
        /* ------------------------- Inicializando atributos ------------------------ */
        menuPrincipal = new ArrayList<>();
        menuArchivos = new ArrayList<>();
        menuFiltros = new ArrayList<>();

        /* ----------------------------- Menú principal ----------------------------- */
        menuPrincipal.add(new JMenu("Archivos"));
        menuPrincipal.add(new JMenu("Filtros"));

        /* ------------------------------ Menú Archivos ----------------------------- */
        menuArchivos.add(new JMenuItem("Cargar"));
        menuArchivos.add(new JMenuItem("Guardar"));
        menuArchivos.add(new JMenuItem("Salir"));

        /* ------------------------------ Menú Filtros ------------------------------ */
        menuFiltros.add(new JMenuItem("Oscurecer"));
        menuFiltros.add(new JMenuItem("Aclarar"));
        menuFiltros.add(new JMenuItem("Grises"));

        /* -------------------------- Añadiendo componentes ------------------------- */
        for (JMenu opcionMenuPrincipal : menuPrincipal) 
            add(opcionMenuPrincipal);
        
        for (JMenuItem opcionMenuArchivos : menuArchivos) 
            menuPrincipal.get(0).add(opcionMenuArchivos);

        for (JMenuItem opcionMenuFiltros : menuFiltros) 
            menuPrincipal.get(1).add(opcionMenuFiltros);
        
    }
}
