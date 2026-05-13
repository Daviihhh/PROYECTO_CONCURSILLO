package concursillo_proyecto;
//cambio

import javax.swing.*;
import java.awt.*;

public class PanelInicio extends JPanel {

    private static final long serialVersionUID = 1L;

    public JButton NuevaPartida;
    public JButton InformacionJuego;
    public JButton SalirJuego;
    public JLabel logo_preguntas;
    public JLabel PreguntaPng;
    public JLabel FotoMenuPrincipal;
    public JLabel FondoAzull;
    public JButton VerRankingInicio;
    private JLabel background_chill;


    public PanelInicio(CardLayout cardLayout, JPanel contenedor) {
        setBackground(new Color(253, 247, 130));
        setLayout(null);
        setBounds(0, 0, 506, 361);

        NuevaPartida = new JButton("Crear Nueva Partida");

        NuevaPartida.setBounds(5, 127, 150, 23);

        NuevaPartida.setBounds(9, 109, 150, 23);

        NuevaPartida.addActionListener(e -> cardLayout.show(contenedor, Interfaz.ELEGIR));
        
                
                VerRankingInicio = new JButton("Ver Ranking");
                VerRankingInicio.setBounds(9, 177, 150, 23);
                VerRankingInicio.addActionListener(e -> cardLayout.show(contenedor, Interfaz.RANKING));
                add(VerRankingInicio);
        add(NuevaPartida);

        InformacionJuego = new JButton("Informacion Juego");
        InformacionJuego.setBounds(9, 143, 150, 23);

    

        InformacionJuego.addActionListener(e -> cardLayout.show(contenedor, Interfaz.INFO));
        add(InformacionJuego);

        SalirJuego = new JButton("Salir");
        SalirJuego.setBounds(9, 211, 150, 23);

        SalirJuego.addActionListener(e -> System.exit(0));
        add(SalirJuego);

        logo_preguntas = new JLabel("");
        logo_preguntas.setIcon(new ImageIcon(getClass().getResource("/resource/LOGO_PANTALLA_INICIO.png")));
        logo_preguntas.setBounds(217, 108, 237, 144);
        add(logo_preguntas);

        PreguntaPng = new JLabel("");
        PreguntaPng.setIcon(new ImageIcon(getClass().getResource("/resource/Interrogaciones.png")));

        PreguntaPng.setBounds(38, 271, 102, 63);

        add(PreguntaPng);

        FotoMenuPrincipal = new JLabel("");
        FotoMenuPrincipal.setIcon(new ImageIcon(getClass().getResource("/resource/MenuPrincipalPNG.png")));
        FotoMenuPrincipal.setBounds(15, 0, 131, 86);
        add(FotoMenuPrincipal);
        



       
        FondoAzull = new JLabel("");
        FondoAzull.setIcon(new ImageIcon(getClass().getResource("/resource/azuloscuronébula.jpg")));
        FondoAzull.setBounds(0, 0, 170, 361);
        add(FondoAzull);
        
        background_chill = new JLabel("");
        background_chill.setIcon(new ImageIcon(PanelInicio.class.getResource("/resource/background-chills.png")));
        background_chill.setBounds(169, 0, 337, 361);
        add(background_chill);

    }
}