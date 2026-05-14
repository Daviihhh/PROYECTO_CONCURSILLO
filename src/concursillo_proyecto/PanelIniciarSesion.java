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

    public JLabel renderInicioSesion;
    public JTextField NombreIniciarSesion;
    public JTextField ContraseñaIniciarSesion;
    public JTextField NombreRellenar;
    public JTextField ContraseñaRellenar;
    public JLabel fondoInicioSesionAzul;
    public JButton Salir3;
    public JButton btnIniciarSesion;
    private JLabel fondoInicioSesionAmarillo;

    public PanelIniciarSesion(CardLayout cardLayout, JPanel concursillo) {
        setBackground(new Color(253, 247, 130));
        setBounds(0, 0, 506, 361);
        setLayout(null);

        renderInicioSesion = new JLabel("");
        renderInicioSesion.setIcon(new ImageIcon(PanelIniciarSesion.class.getResource("/resource/iniciarsesion (1).png")));
        renderInicioSesion.setBounds(163, 11, 180, 143);
        add(renderInicioSesion);

        NombreIniciarSesion = new JTextField();
        NombreIniciarSesion.setText("Nombre");
        NombreIniciarSesion.setBounds(140, 249, 86, 20);
        NombreIniciarSesion.setColumns(10);
        add(NombreIniciarSesion);

        ContraseñaIniciarSesion = new JTextField();
        ContraseñaIniciarSesion.setText("Contraseña");
        ContraseñaIniciarSesion.setBounds(140, 296, 86, 20);
        ContraseñaIniciarSesion.setColumns(10);
        add(ContraseñaIniciarSesion);

        NombreRellenar = new JTextField();
        NombreRellenar.setBounds(272, 249, 86, 20);
        NombreRellenar.setColumns(10);
        add(NombreRellenar);

        ContraseñaRellenar = new JTextField();
        ContraseñaRellenar.setBounds(272, 296, 86, 20);
        ContraseñaRellenar.setColumns(10);
        add(ContraseñaRellenar);

        
        Salir3 = new JButton("");
        Salir3.setIcon(new ImageIcon(getClass().getResource("/resource/salir.png")));
        Salir3.setBounds(10, 327, 25, 24);
        Salir3.addActionListener(e -> cardLayout.show(concursillo, Interfaz.ELEGIR));
        add(Salir3);
        
        btnIniciarSesion = new JButton("Iniciar sesión");
        btnIniciarSesion.setBounds(191, 185, 117, 41);
        btnIniciarSesion.addActionListener(e -> cardLayout.show(concursillo, Interfaz.ELEGIRTEMATICA));
        add(Salir3);
        
        add(btnIniciarSesion);
        
                fondoInicioSesionAzul = new JLabel("");
                fondoInicioSesionAzul.setIcon(new ImageIcon(PanelIniciarSesion.class.getResource("/resource/azuloscuronébula.jpg")));
                fondoInicioSesionAzul.setBounds(0, 167, 506, 204);
                add(fondoInicioSesionAzul);
                
                fondoInicioSesionAmarillo = new JLabel("");
                fondoInicioSesionAmarillo.setIcon(new ImageIcon(PanelIniciarSesion.class.getResource("/resource/background-chills.png")));
                fondoInicioSesionAmarillo.setBounds(-13, -136, 519, 313);
                add(fondoInicioSesionAmarillo);

    }
}