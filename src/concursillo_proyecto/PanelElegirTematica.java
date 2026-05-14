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
    
    private GestionMongoDB gestion;
    
    private PanelPreguntas panelPreguntas;

    public PanelElegirTematica(CardLayout cardLayout, JPanel contenedor, GestionMongoDB gestion, PanelPreguntas panelPreguntas) {
        
    	this.panelPreguntas = panelPreguntas;
    	
        setBackground(new Color(0, 255, 255));
        setBounds(0, 0, 506, 361);
        setLayout(null);

        // PRIMERO creas los botones
        btnPeliculas = new JButton("🎬 Películas");
        btnPeliculas.setBounds(145, 277, 200, 35);
        add(btnPeliculas);

        btnHistoria = new JButton("📜 Historia");
        btnHistoria.setBounds(145, 231, 200, 35);
        add(btnHistoria);

        btnMusica = new JButton("🎵 Música");
        btnMusica.setBounds(145, 185, 200, 35);
        add(btnMusica);

        btnJuegos = new JButton("🎮 Juegos");
        btnJuegos.setBounds(145, 139, 200, 35);
        add(btnJuegos);

        btnFutbol = new JButton("⚽ Fútbol");
        btnFutbol.setBounds(145, 93, 200, 35);
        add(btnFutbol);

        menufondo = new JLabel("");
        menufondo.setBounds(100, 78, 292, 253);
        menufondo.setIcon(new ImageIcon(PanelElegirTematica.class.getResource("/resource/azul_nebula_menu.png")));
        add(menufondo);

        JLabel fondo = new JLabel("");
        fondo.setIcon(new ImageIcon(PanelElegirTematica.class.getResource("/resource/abstract-background.png")));
        fondo.setBounds(0, 51, 506, 310);
        add(fondo);

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

        // DESPUÉS añades los ActionListener
        btnFutbol.addActionListener(e -> {
            gestion.guardarTema("Futbol");
            gestion.iniciarConcursillo("Futbol");
            panelPreguntas.iniciar();
            cardLayout.show(contenedor, Interfaz.PREGUNTAS);
        });
        btnJuegos.addActionListener(e -> {
            gestion.guardarTema("Juegos");
            gestion.iniciarConcursillo("Juegos");
            panelPreguntas.iniciar();
            cardLayout.show(contenedor, Interfaz.PREGUNTAS);
        });
        btnMusica.addActionListener(e -> {
            gestion.guardarTema("Musica");
            gestion.iniciarConcursillo("Musica");
            panelPreguntas.iniciar();
            cardLayout.show(contenedor, Interfaz.PREGUNTAS);
        });
        btnHistoria.addActionListener(e -> {
            gestion.guardarTema("Historia");
            gestion.iniciarConcursillo("Historia");
            panelPreguntas.iniciar();
            cardLayout.show(contenedor, Interfaz.PREGUNTAS);
        });
        btnPeliculas.addActionListener(e -> {
            gestion.guardarTema("Peliculas");
            gestion.iniciarConcursillo("Peliculas");
            panelPreguntas.iniciar();
            cardLayout.show(contenedor, Interfaz.PREGUNTAS);
        });
    }
}