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

    public PanelElegir(CardLayout cardLayout, JPanel contenedor) {
        setBackground(new Color(253, 247, 130));
        setBounds(0, 0, 506, 361);
        setLayout(null);

        FondoCrearCuenta = new JLabel("");
        FondoCrearCuenta.setIcon(new ImageIcon(PanelElegir.class.getResource("/resource/FondoAzul.png")));
        FondoCrearCuenta.setBounds(0, 177, 506, 184);
        add(FondoCrearCuenta);
        

        
      
        // Botón de iniciar sesión

        btnIniciarCuenta = new JButton("Iniciar sesión con tu cuenta");
        btnIniciarCuenta.setBounds(10, 22, 136, 38);
        btnIniciarCuenta.addActionListener(e -> cardLayout.show(contenedor, Interfaz.INICIARSESION));
        add(btnIniciarCuenta);
      
        // Botón de registrar cuent

        btnRegistrarCuenta = new JButton("Registrar nueva cuenta");
        btnRegistrarCuenta.setBounds(345, 22, 151, 57);
        btnRegistrarCuenta.addActionListener(e -> cardLayout.show(contenedor, Interfaz.USUARIO));
        add(btnRegistrarCuenta);
        
        
      
       

    }
}