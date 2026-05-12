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
    private JLabel lblNewLabel_1;

    public PanelElegirTematica(CardLayout cardLayout, JPanel contenedor) {
        setBackground(new Color(0, 255, 255));
        setBounds(0, 0, 506, 361);
        setLayout(null);
        
        lblNewLabel = new JLabel("SELECIONA TU TEMÁTICA");
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(103, 11, 292, 34);
        add(lblNewLabel);

        JLabel bannerTOP = new JLabel("");
        bannerTOP.setIcon(new ImageIcon(PanelElegirTematica.class.getResource("/resource/azuloscuronébula.jpg")));
        bannerTOP.setBounds(0, 0, 506, 51);
        add(bannerTOP);

        // JPanel en lugar de JLabel para poder meter botones dentro
        JPanel BackgroundMenu = new JPanel();
        BackgroundMenu.setBackground(new Color(0, 0, 64));
        BackgroundMenu.setBounds(103, 86, 292, 253);
        BackgroundMenu.setLayout(null);
        add(BackgroundMenu);

        // Botones dentro de BackgroundMenu
        // Coordenadas relativas al BackgroundMenu, no al panel principal
        btnFutbol = new JButton("⚽ Fútbol");
        btnFutbol.setBounds(46, 20, 200, 35);
        BackgroundMenu.add(btnFutbol);

        btnJuegos = new JButton("🎮 Juegos");
        btnJuegos.setBounds(46, 65, 200, 35);
        BackgroundMenu.add(btnJuegos);

        btnMusica = new JButton("🎵 Música");
        btnMusica.setBounds(46, 110, 200, 35);
        BackgroundMenu.add(btnMusica);

        btnHistoria = new JButton("📜 Historia");
        btnHistoria.setBounds(46, 155, 200, 35);
        BackgroundMenu.add(btnHistoria);

        btnPeliculas = new JButton("🎬 Películas");
        btnPeliculas.setBounds(46, 200, 200, 35);
        BackgroundMenu.add(btnPeliculas);
        
        lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setBounds(0, 0, 292, 253);
        BackgroundMenu.add(lblNewLabel_1);
        lblNewLabel_1.setIcon(new ImageIcon(PanelElegirTematica.class.getResource("/resource/azuloscuronébula.jpg")));
    }
}