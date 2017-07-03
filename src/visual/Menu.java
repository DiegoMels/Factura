/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visual;

import Controlador.ControladorAceptar;
import Controlador.ControladorMenu;
import java.awt.*;
import javax.swing.*;


/**
 *
 * @author leona
 */
public class Menu extends JFrame {
    private ControladorMenu controlador = new ControladorMenu();
    private ControladorAceptar controladorAceptar = new ControladorAceptar();
    private GridLayout contenedor = new GridLayout(0,2);
    
    public Menu() {
        this.setSize(300, 300);
        this.setTitle("Menu");
        this.setLocation(100, 100);
        this.addWindowListener(controlador);
        this.setLayout(contenedor);
        this.AgregarComponente();
    }
    private void AgregarComponente() {
        JButton aceptar = new JButton();
        aceptar.setName("Aceptar");
        aceptar.setText("Aceptar");
        aceptar.setVisible(true);
        
        aceptar.addMouseListener(controladorAceptar);
        
        JButton salir = new JButton();
        salir.setName("Salir");
        salir.setText("Salir");
        salir.setVisible(true);
        
        
        // para poder agregar a JFrame (ocea, ya lo cree anteriormente pero ahora los estoy haciendo aceptar por el programa.
        this.add(aceptar);
        this.add(salir);
        this.setVisible(true);
    }
    
    
}
