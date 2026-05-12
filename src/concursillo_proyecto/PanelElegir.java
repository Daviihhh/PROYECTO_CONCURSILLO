package concursillo_proyecto;
//cambi

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class PanelElegir extends JPanel {

    private static final long serialVersionUID = 1L;
    public JLabel FondoCrearCuenta;
    public JButton IniciarSesion, btnIniciarCuenta, btnRegistrarCuenta;

    public JButton SalirElegir;


    public PanelElegir(CardLayout cardLayout, JPanel contenedor) {
        setBackground(new Color(253, 247, 130));
        setBounds(0, 0, 506, 361);
        setLayout(null);
        

        
      
        // Botón de iniciar sesión

        btnIniciarCuenta = new JButton("Iniciar sesión con tu cuenta");

        btnIniciarCuenta.setBounds(133, 100, 216, 69);
        btnIniciarCuenta.addActionListener(e -> cardLayout.show(contenedor, Interfaz.INICIARSESION));
        add(btnIniciarCuenta);
      
        // Botón de registrar cuent

        btnRegistrarCuenta = new JButton("Registrar nueva cuenta");
        btnRegistrarCuenta.setBounds(133, 198, 216, 69);
        btnRegistrarCuenta.addActionListener(e -> cardLayout.show(contenedor, Interfaz.REGISTRARSE));
        add(btnRegistrarCuenta);
                
                SalirElegir = new JButton("");
                SalirElegir.setIcon(new ImageIcon(PanelElegir.class.getResource("/resource/salir.png")));
                SalirElegir.setBounds(10, 327, 25, 24);
                SalirElegir.addActionListener(e -> cardLayout.show(contenedor, Interfaz.INICIO));
                add(SalirElegir);
        
                FondoCrearCuenta = new JLabel("");
                FondoCrearCuenta.setIcon(new ImageIcon(PanelElegir.class.getResource("/resource/FondoAzul.png")));
                FondoCrearCuenta.setBounds(0, 177, 506, 184);
                add(FondoCrearCuenta);
        


        
        

      
       

    }
}