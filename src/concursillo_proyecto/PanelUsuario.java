package concursillo_proyecto;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;

public class PanelUsuario extends JPanel {

    private static final long serialVersionUID = 1L;

    public JTextField IntroducirNombre;
    public JFormattedTextField CuadrotextoNombre;
    public JTextField CuadrotextoApellidos;
    public JTextField CuadrotextoDNI;
    public JTextPane NombreUsuario;
    public JTextPane DniUsuario;
    public JTextPane Contraseña;
    public JLabel ImagenUser;
    public JButton Salir2;
    public JButton BotonEntrar;
    public JButton btnNewButton;
    public JLabel FondoAzul;

    public PanelUsuario(CardLayout cardLayout, JPanel contenedor) {
        setBackground(new Color(253, 247, 130));
        setLayout(null);
        setBounds(0, 0, 506, 361);

        IntroducirNombre = new JTextField();
        IntroducirNombre.setEditable(false);
        IntroducirNombre.setHorizontalAlignment(SwingConstants.CENTER);
        IntroducirNombre.setText("Registrar una cuenta");
        IntroducirNombre.setBounds(138, 170, 225, 35);
        IntroducirNombre.setColumns(10);
        add(IntroducirNombre);

        CuadrotextoNombre = new JFormattedTextField();
        CuadrotextoNombre.setBounds(251, 230, 98, 20);
        add(CuadrotextoNombre);

        CuadrotextoApellidos = new JTextField();
        CuadrotextoApellidos.setBounds(251, 261, 96, 20);
        CuadrotextoApellidos.setColumns(10);
        add(CuadrotextoApellidos);

        CuadrotextoDNI = new JTextField();
        CuadrotextoDNI.setColumns(10);
        CuadrotextoDNI.setBounds(251, 292, 96, 20);
        add(CuadrotextoDNI);

        NombreUsuario = new JTextPane();
        NombreUsuario.setText("Nombre");
        NombreUsuario.setBounds(138, 261, 74, 20);
        add(NombreUsuario);

        DniUsuario = new JTextPane();
        DniUsuario.setText("DNI");
        DniUsuario.setBounds(138, 230, 74, 20);
        add(DniUsuario);

        Contraseña = new JTextPane();
        Contraseña.setText("Contraseña");
        Contraseña.setBounds(138, 292, 74, 20);
        add(Contraseña);

        ImagenUser = new JLabel("");
        ImagenUser.setIcon(new ImageIcon(getClass().getResource("/resource/concursillo_logogrande.png")));
        ImagenUser.setBounds(160, 21, 157, 95);
        add(ImagenUser);

        Salir2 = new JButton("");
        Salir2.setIcon(new ImageIcon(getClass().getResource("/resource/salir.png")));
        Salir2.setBounds(10, 327, 25, 24);
        Salir2.addActionListener(e -> cardLayout.show(contenedor, Interfaz.INICIO));
        add(Salir2);

        BotonEntrar = new JButton("Entrar");
        BotonEntrar.setBounds(198, 328, 89, 23);
        BotonEntrar.addActionListener(e -> cardLayout.show(contenedor, Interfaz.PREGUNTAS));
        add(BotonEntrar);

        btnNewButton = new JButton("");
        btnNewButton.setIcon(new ImageIcon(getClass().getResource("/resource/informacion_pequeno.png")));
        btnNewButton.setBounds(471, 327, 25, 24);
        add(btnNewButton);

        // Fondo al final para que quede detrás
        FondoAzul = new JLabel("");
        FondoAzul.setIcon(new ImageIcon(getClass().getResource("/resource/FondoAzul.png")));
        FondoAzul.setBounds(0, 148, 506, 213);
        add(FondoAzul);
    }
}