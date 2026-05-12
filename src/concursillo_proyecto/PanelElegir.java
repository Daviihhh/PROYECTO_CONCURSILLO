package concursillo_proyecto;

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
    public JButton IniciarSesion;

    public PanelElegir(CardLayout cardLayout, JPanel contenedor) {
        setBackground(new Color(253, 247, 130));
        setBounds(0, 0, 506, 361);
        setLayout(null);

        FondoCrearCuenta = new JLabel("");
        FondoCrearCuenta.setIcon(new ImageIcon(PanelElegir.class.getResource("/resource/FondoAzul.png")));
        FondoCrearCuenta.setBounds(0, 177, 506, 184);
        add(FondoCrearCuenta);
        
        IniciarSesion = new JButton("Iniciar Sesion en una Cuenta");
        IniciarSesion.setBounds(183, 112, 108, 38);
        add(IniciarSesion);
    }
}