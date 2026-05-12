package concursillo_proyecto;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PanelElegir extends JPanel {

    private static final long serialVersionUID = 1L;

    public JTextField IniciarSesionCuenta;
    public JTextField RegistrarUnaCuenta;
    public JLabel FondoCrearCuenta;

    public PanelElegir(CardLayout cardLayout, JPanel contenedor) {
        setBackground(new Color(253, 247, 130));
        setBounds(0, 0, 506, 361);
        setLayout(null);

        IniciarSesionCuenta = new JTextField();
        IniciarSesionCuenta.setHorizontalAlignment(SwingConstants.CENTER);
        IniciarSesionCuenta.setText("Iniciar sesion en una cuenta");
        IniciarSesionCuenta.setBounds(143, 89, 190, 55);
        IniciarSesionCuenta.setColumns(10);
        add(IniciarSesionCuenta);

        RegistrarUnaCuenta = new JTextField();
        RegistrarUnaCuenta.setHorizontalAlignment(SwingConstants.CENTER);
        RegistrarUnaCuenta.setText("Registrar una cuenta nueva");
        RegistrarUnaCuenta.setColumns(10);
        RegistrarUnaCuenta.setBounds(143, 208, 190, 55);
        add(RegistrarUnaCuenta);

        FondoCrearCuenta = new JLabel("");
        FondoCrearCuenta.setIcon(new ImageIcon(PanelElegir.class.getResource("/resource/FondoAzul.png")));
        FondoCrearCuenta.setBounds(0, 177, 506, 184);
        add(FondoCrearCuenta);
    }
}