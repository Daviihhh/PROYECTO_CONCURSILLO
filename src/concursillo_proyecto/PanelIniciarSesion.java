package concursillo_proyecto;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PanelIniciarSesion extends JPanel {

    private static final long serialVersionUID = 1L;

    public JLabel lblNewLabel;
    public JTextField IniciarSesion;
    public JTextField NombreIniciarSesion;
    public JTextField ContraseñaIniciarSesion;
    public JTextField NombreRellenar;
    public JTextField ContraseñaRellenar;
    public JLabel lblNewLabel_1;

    public PanelIniciarSesion(CardLayout cardLayout, JPanel concursillo) {
        setBackground(new Color(253, 247, 130));
        setBounds(0, 0, 506, 361);
        setLayout(null);

        lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(PanelIniciarSesion.class.getResource("/resource/iniciarsesion (1).png")));
        lblNewLabel.setBounds(154, 13, 180, 143);
        add(lblNewLabel);

        IniciarSesion = new JTextField();
        IniciarSesion.setHorizontalAlignment(SwingConstants.CENTER);
        IniciarSesion.setText("Iniciar Sesion");
        IniciarSesion.setEditable(false);
        IniciarSesion.setBounds(180, 191, 129, 37);
        IniciarSesion.setColumns(10);
        add(IniciarSesion);

        NombreIniciarSesion = new JTextField();
        NombreIniciarSesion.setText("Nombre");
        NombreIniciarSesion.setBounds(141, 249, 86, 20);
        NombreIniciarSesion.setColumns(10);
        add(NombreIniciarSesion);

        ContraseñaIniciarSesion = new JTextField();
        ContraseñaIniciarSesion.setText("Contraseña");
        ContraseñaIniciarSesion.setBounds(141, 296, 86, 20);
        ContraseñaIniciarSesion.setColumns(10);
        add(ContraseñaIniciarSesion);

        NombreRellenar = new JTextField();
        NombreRellenar.setBounds(260, 249, 86, 20);
        NombreRellenar.setColumns(10);
        add(NombreRellenar);

        ContraseñaRellenar = new JTextField();
        ContraseñaRellenar.setBounds(260, 296, 86, 20);
        ContraseñaRellenar.setColumns(10);
        add(ContraseñaRellenar);

        lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon(PanelIniciarSesion.class.getResource("/resource/FondoAzul.png")));
        lblNewLabel_1.setBounds(0, 167, 506, 204);
        add(lblNewLabel_1);
    }
}