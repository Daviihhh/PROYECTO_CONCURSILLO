package concursillo_proyecto;
//cambio

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelIniciarSesion extends JPanel {

    private static final long serialVersionUID = 1L;

    public JLabel lblNewLabel;
    public JTextField NombreIniciarSesion;
    public JTextField ContraseñaIniciarSesion;
    public JTextField NombreRellenar;
    public JTextField ContraseñaRellenar;
    public JLabel lblNewLabel_1;
    public JButton Salir3;
    public JButton btnIniciarSesion;

    public PanelIniciarSesion(CardLayout cardLayout, JPanel concursillo) {
        setBackground(new Color(253, 247, 130));
        setBounds(0, 0, 506, 361);
        setLayout(null);

        lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(PanelIniciarSesion.class.getResource("/resource/iniciarsesion (1).png")));
        lblNewLabel.setBounds(154, 13, 180, 143);
        add(lblNewLabel);

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
        
        
        Salir3 = new JButton("");
        Salir3.setIcon(new ImageIcon(getClass().getResource("/resource/salir.png")));
        Salir3.setBounds(10, 327, 25, 24);
        Salir3.addActionListener(e -> cardLayout.show(concursillo, Interfaz.ELEGIR));
        add(Salir3);
        
        btnIniciarSesion = new JButton("Iniciar sesión");
        btnIniciarSesion.setBounds(192, 186, 117, 41);
        btnIniciarSesion.addActionListener(e -> cardLayout.show(concursillo, Interfaz.PREGUNTAS));
        add(Salir3);
        
        add(btnIniciarSesion);
        
                lblNewLabel_1 = new JLabel("");
                lblNewLabel_1.setIcon(new ImageIcon(PanelIniciarSesion.class.getResource("/resource/FondoAzul.png")));
                lblNewLabel_1.setBounds(0, 167, 506, 204);
                add(lblNewLabel_1);

    }
}