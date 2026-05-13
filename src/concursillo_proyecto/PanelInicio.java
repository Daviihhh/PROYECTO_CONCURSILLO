package concursillo_proyecto;
//cambio

import javax.swing.*;
import java.awt.*;

public class PanelInicio extends JPanel {

    private static final long serialVersionUID = 1L;

    public JButton NuevaPartida;
    public JButton InformacionJuego;
    public JButton SalirJuego;
    public JLabel FotoPanelUsuario;
    public JLabel PreguntaPng;
    public JLabel FotoMenuPrincipal;
    public JLabel FondoAzull;
    private JLabel lblNewLabel;

    public PanelInicio(CardLayout cardLayout, JPanel contenedor) {
        setBackground(new Color(253, 247, 130));
        setLayout(null);
        setBounds(0, 0, 506, 361);

        NuevaPartida = new JButton("Crear Nueva Partida");
        NuevaPartida.setBounds(9, 109, 150, 23);
        NuevaPartida.addActionListener(e -> cardLayout.show(contenedor, Interfaz.ELEGIR));
        add(NuevaPartida);

        InformacionJuego = new JButton("Informacion Del Juego");
        InformacionJuego.setBounds(9, 168, 150, 23);
        InformacionJuego.addActionListener(e -> cardLayout.show(contenedor, Interfaz.INFO));
        add(InformacionJuego);

        SalirJuego = new JButton("Salir");
        SalirJuego.setBounds(9, 228, 150, 23);
        SalirJuego.addActionListener(e -> System.exit(0));
        add(SalirJuego);

        FotoPanelUsuario = new JLabel("");
        FotoPanelUsuario.setIcon(new ImageIcon(getClass().getResource("/resource/LOGO_PANTALLA_INICIO.png")));
        FotoPanelUsuario.setBounds(217, 108, 237, 144);
        add(FotoPanelUsuario);

        PreguntaPng = new JLabel("");
        PreguntaPng.setIcon(new ImageIcon(getClass().getResource("/resource/Interrogaciones.png")));
        PreguntaPng.setBounds(34, 275, 102, 63);
        add(PreguntaPng);

        FotoMenuPrincipal = new JLabel("");
        FotoMenuPrincipal.setIcon(new ImageIcon(getClass().getResource("/resource/MenuPrincipalPNG.png")));
        FotoMenuPrincipal.setBounds(15, 0, 131, 86);
        add(FotoMenuPrincipal);

        // Fondo al final para que quede detrás
        FondoAzull = new JLabel("");
        FondoAzull.setIcon(new ImageIcon(getClass().getResource("/resource/azuloscuronébula.jpg")));
        FondoAzull.setBounds(0, 0, 170, 361);
        add(FondoAzull);
        
        lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(PanelInicio.class.getResource("/resource/background-chills.png")));
        lblNewLabel.setBounds(169, 0, 337, 361);
        add(lblNewLabel);
    }
}