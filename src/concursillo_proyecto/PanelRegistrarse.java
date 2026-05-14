package concursillo_proyecto;
//cambi
import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;

public class PanelRegistrarse extends JPanel {

    private static final long serialVersionUID = 1L;

    public JTextField IntroducirNombre, CuadrotextoApellidos;
    public JFormattedTextField CuadrotextoNombre;
    public JTextPane NombreUsuario, DniUsuario, Contraseña;
    public JLabel ImagenUser, FondoAzulRegistro;
    public JButton Salir2, BotonEntrar;
    public JPasswordField CuadrotextoDNI;
    private JLabel fondoAmarilloRegistro;

    public PanelRegistrarse(CardLayout cardLayout, JPanel contenedor) {
        setBackground(new Color(253, 247, 130));
        setLayout(null);
        setBounds(0, 0, 506, 361);

        IntroducirNombre = new JTextField();
        IntroducirNombre.setEditable(false);
        IntroducirNombre.setHorizontalAlignment(SwingConstants.CENTER);
        IntroducirNombre.setText("Registrar una cuenta");
        IntroducirNombre.setBounds(134, 169, 225, 35);
        IntroducirNombre.setColumns(10);
        add(IntroducirNombre);

        CuadrotextoNombre = new JFormattedTextField();
        CuadrotextoNombre.setBounds(251, 230, 98, 20);
        add(CuadrotextoNombre);

        CuadrotextoApellidos = new JTextField();
        CuadrotextoApellidos.setBounds(251, 261, 96, 20);
        CuadrotextoApellidos.setColumns(10);
        add(CuadrotextoApellidos);

        CuadrotextoDNI = new JPasswordField();
        CuadrotextoDNI.setColumns(10);
        CuadrotextoDNI.setBounds(251, 292, 96, 20);
        CuadrotextoDNI.setEchoChar('*');
        add(CuadrotextoDNI);

        NombreUsuario = new JTextPane();
        NombreUsuario.setText("Nombre");
        NombreUsuario.setBounds(149, 261, 74, 20);
        add(NombreUsuario);

        DniUsuario = new JTextPane();
        DniUsuario.setText("DNI");
        DniUsuario.setBounds(149, 230, 74, 20);
        add(DniUsuario);

        Contraseña = new JTextPane();
        Contraseña.setText("Contraseña");
        Contraseña.setBounds(149, 292, 74, 20);
        add(Contraseña);

        ImagenUser = new JLabel("");
        ImagenUser.setIcon(new ImageIcon(getClass().getResource("/resource/concursillo_logogrande.png")));
        ImagenUser.setBounds(160, 21, 157, 95);
        add(ImagenUser);

        Salir2 = new JButton("");
        Salir2.setIcon(new ImageIcon(getClass().getResource("/resource/salir.png")));
        Salir2.setBounds(10, 327, 25, 24);
        Salir2.addActionListener(e -> cardLayout.show(contenedor, Interfaz.ELEGIR));
        add(Salir2);

        BotonEntrar = new JButton("Entrar");
        BotonEntrar.setBounds(198, 328, 89, 23);
        BotonEntrar.addActionListener(e -> cardLayout.show(contenedor, Interfaz.ELEGIRTEMATICA));
        add(BotonEntrar);

        // Fondo al final para que quede detrás
        FondoAzulRegistro = new JLabel("");
        FondoAzulRegistro.setIcon(new ImageIcon(PanelRegistrarse.class.getResource("/resource/azuloscuronébula.jpg")));
        FondoAzulRegistro.setBounds(0, 148, 506, 213);
        add(FondoAzulRegistro);
        
        fondoAmarilloRegistro = new JLabel("");
        fondoAmarilloRegistro.setIcon(new ImageIcon(PanelRegistrarse.class.getResource("/resource/background-chills.png")));
        fondoAmarilloRegistro.setBounds(0, -16, 506, 175);
        add(fondoAmarilloRegistro);
    }
}