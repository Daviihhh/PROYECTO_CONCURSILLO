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
    public JButton VerRankingInicio;

    public PanelInicio(CardLayout cardLayout, JPanel contenedor) {
        setBackground(new Color(253, 247, 130));
        setLayout(null);
        setBounds(0, 0, 506, 361);

        NuevaPartida = new JButton("Crear Nueva Partida");
        NuevaPartida.setBounds(5, 127, 150, 23);
        NuevaPartida.addActionListener(e -> cardLayout.show(contenedor, Interfaz.ELEGIR));
        add(NuevaPartida);

        InformacionJuego = new JButton("Informacion Del Juego");
        InformacionJuego.setBounds(5, 161, 150, 23);
        InformacionJuego.addActionListener(e -> cardLayout.show(contenedor, Interfaz.INFO));
        add(InformacionJuego);

        SalirJuego = new JButton("Salir");
        SalirJuego.setBounds(5, 229, 150, 23);
        SalirJuego.addActionListener(e -> System.exit(0));
        add(SalirJuego);

        FotoPanelUsuario = new JLabel("");
        FotoPanelUsuario.setIcon(new ImageIcon(getClass().getResource("/resource/LOGO_PANTALLA_INICIO.png")));
        FotoPanelUsuario.setBounds(221, 108, 237, 144);
        add(FotoPanelUsuario);

        PreguntaPng = new JLabel("");
        PreguntaPng.setIcon(new ImageIcon(getClass().getResource("/resource/Interrogaciones.png")));
        PreguntaPng.setBounds(26, 287, 102, 63);
        add(PreguntaPng);

        FotoMenuPrincipal = new JLabel("");
        FotoMenuPrincipal.setIcon(new ImageIcon(getClass().getResource("/resource/MenuPrincipal.png")));
        FotoMenuPrincipal.setBounds(10, 11, 131, 86);
        add(FotoMenuPrincipal);
        
        VerRankingInicio = new JButton("Ver Ranking");
        VerRankingInicio.setBounds(5, 195, 150, 23);
        VerRankingInicio.addActionListener(e -> cardLayout.show(contenedor, Interfaz.RANKING));
        add(VerRankingInicio);
        
                // Fondo al final para que quede detrás
                FondoAzull = new JLabel("");
                FondoAzull.setIcon(new ImageIcon(getClass().getResource("/resource/Otrofondo.png")));
                FondoAzull.setBounds(0, 0, 159, 361);
                add(FondoAzull);
    }
}