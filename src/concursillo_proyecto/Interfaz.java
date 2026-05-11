package concursillo_proyecto;

import javax.swing.*;
import java.awt.*;

public class Interfaz extends JFrame {

    private static final long serialVersionUID = 1L;

    public static final String INICIO = "INICIO";
    public static final String PREGUNTAS = "PREGUNTAS";
    public static final String RANKING = "RANKING";
    public static final String USUARIO = "USUARIO";
    public static final String DINERO = "DINERO";

    private CardLayout cardLayout;
    private JPanel concursillo;

    public PanelInicio panelInicio;
    public PanelPreguntas panelPreguntas;
    public PanelRanking panelRanking;
    public PanelUsuario panelUsuario;
    public PanelDinero panelDinero;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Interfaz frame = new Interfaz();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public Interfaz() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 522, 400);
        setResizable(false);

        cardLayout = new CardLayout();
        concursillo = new JPanel(cardLayout);

        panelInicio      = new PanelInicio(cardLayout, concursillo);
        panelInicio.FondoAzull.setBounds(0, 0, 159, 361);
        panelInicio.InformacionJuego.setFont(new Font("Tahoma", Font.PLAIN, 9));
        panelPreguntas   = new PanelPreguntas(cardLayout, concursillo);
        panelRanking     = new PanelRanking(cardLayout, concursillo);
        panelUsuario     = new PanelUsuario(cardLayout, concursillo);
        panelDinero = new PanelDinero(cardLayout, concursillo);

        concursillo.add(panelInicio,      INICIO);
        concursillo.add(panelPreguntas,   PREGUNTAS);
        concursillo.add(panelRanking,     RANKING);
        concursillo.add(panelUsuario,     USUARIO);
        concursillo.add(panelDinero,	DINERO);

        setContentPane(concursillo);
        cardLayout.show(concursillo, INICIO);
    }
}