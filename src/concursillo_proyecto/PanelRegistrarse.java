package concursillo_proyecto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class PanelRegistrarse extends JPanel {

    private static final long serialVersionUID = 1L;

    public JTextField IntroducirNombre, CuadrotextoApellidos;
    public JFormattedTextField CuadrotextoNombre;
    public JPasswordField CuadrotextoDNI;
    public JTextPane NombreUsuario, DniUsuario, Contraseña;
    public JLabel ImagenUser, FondoAzulRegistro;
    public JButton Salir2, BotonEntrar;

    private GestionMongoDB gestion;
    private PanelPreguntas panelPreguntas;
    private PanelDinero panelDinero;
    private PanelRanking panelRanking;
    private JLabel fondoAmarilloRegistro;

    public PanelRegistrarse(CardLayout cardLayout, JPanel contenedor, GestionMongoDB gestion,
            PanelPreguntas panelPreguntas, PanelDinero panelDinero, PanelRanking panelRanking) {
        this.gestion = gestion;
        this.panelPreguntas = panelPreguntas;
        this.panelDinero = panelDinero;
        this.panelRanking = panelRanking;

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
        BotonEntrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String dni = CuadrotextoNombre.getText();
                String nombre = CuadrotextoApellidos.getText();
                String contrasena = new String(CuadrotextoDNI.getPassword());
                int puntuacion = 0;

                if (nombre.isEmpty() || contrasena.isEmpty() || dni.isEmpty()) {
                    JOptionPane.showMessageDialog(null,
                        "Rellena todos los campos.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                if (dni.length() != 9) {
                    JOptionPane.showMessageDialog(null,
                        "El DNI debe tener exactamente 9 caracteres.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                if (gestion.existeDNI(dni)) {
                    JOptionPane.showMessageDialog(null,
                        "Este DNI ya está registrado.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                Usuario usuario = new Usuario(nombre, dni, contrasena, puntuacion);
                gestion.guardarUsuario(usuario);
                gestion.setNombreUsuarioActual(nombre);
                gestion.setDniUsuarioActual(dni);
                gestion.setContrasenaUsuarioActual(contrasena);

                panelPreguntas.actualizarNombre();
                panelDinero.actualizarNombre();
                panelRanking.actualizarNombre();

                JOptionPane.showMessageDialog(null, "¡Usuario registrado correctamente!");
                cardLayout.show(contenedor, Interfaz.ELEGIRTEMATICA);
            }
        });
        add(BotonEntrar);

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