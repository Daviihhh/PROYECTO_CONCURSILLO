package concursillo_proyecto;

import java.awt.CardLayout;
import java.awt.*;
import javax.swing.*;

public class PanelElegirTematica extends JPanel {

    private static final long serialVersionUID = 1L;

    public JButton btnFutbol;
    public JButton btnJuegos;
    public JButton btnMusica;
    public JButton btnHistoria;
    public JButton btnPeliculas;
    private JLabel lblNewLabel;
    private JLabel menufondo;

    public PanelElegirTematica(CardLayout cardLayout, JPanel contenedor) {
        setBackground(new Color(0, 255, 255));
        setBounds(0, 0, 506, 361);
        setLayout(null);
                                                
	    btnPeliculas = new JButton("🎬 Películas");
	    btnPeliculas.setBounds(145, 277, 200, 35);
	    add(btnPeliculas);
        btnPeliculas.addActionListener(e -> cardLayout.show(contenedor, Interfaz.PREGUNTAS));

	                                        
	    btnHistoria = new JButton("📜 Historia");
	    btnHistoria.setBounds(145, 231, 200, 35);
	    add(btnHistoria);
        btnHistoria.addActionListener(e -> cardLayout.show(contenedor, Interfaz.PREGUNTAS));

	                                
	    btnMusica = new JButton("🎵 Música");
	    btnMusica.setBounds(145, 185, 200, 35);
	    add(btnMusica);
	    btnMusica.addActionListener(e -> cardLayout.show(contenedor, Interfaz.PREGUNTAS));

	                        
	   btnJuegos = new JButton("🎮 Juegos");
	   btnJuegos.setBounds(145, 139, 200, 35);
	   add(btnJuegos);
	   btnJuegos.addActionListener(e -> cardLayout.show(contenedor, Interfaz.PREGUNTAS));

	                
	   // BackgroundMenu
	   // Botones
	   btnFutbol = new JButton("⚽ Fútbol");
	   btnFutbol.setBounds(145, 93, 200, 35);
	   add(btnFutbol);
	   btnFutbol.addActionListener(e -> cardLayout.show(contenedor, Interfaz.PREGUNTAS));

                
       menufondo = new JLabel("");
       menufondo.setBounds(100, 78, 292, 253);
       add(menufondo);
       menufondo.setIcon(new ImageIcon(PanelElegirTematica.class.getResource("/resource/azul_nebula_menu.png")));
        
        JLabel fondoTematica = new JLabel("");
        fondoTematica.setIcon(new ImageIcon(PanelElegirTematica.class.getResource("/resource/abstract-background.png")));
        fondoTematica.setBounds(0, 51, 506, 310);
        add(fondoTematica);
        
        lblNewLabel = new JLabel("SELECIONA TU TEMÁTICA");
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 24));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(10, 0, 486, 51);
        add(lblNewLabel);

        JLabel bannerTOP = new JLabel("");
        bannerTOP.setIcon(new ImageIcon(PanelElegirTematica.class.getResource("/resource/azuloscuronébula.jpg")));
        bannerTOP.setBounds(0, 0, 506, 51);
        add(bannerTOP);
    }
}