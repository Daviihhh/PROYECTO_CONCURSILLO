package concursillo_proyecto;
import javax.swing.*;
import java.awt.*;
//cambi

public class Interfaz extends JFrame {
    private static final long serialVersionUID = 1L;

    public static final String INICIO         = "INICIO";
    public static final String PREGUNTAS      = "PREGUNTAS";
    public static final String RANKING        = "RANKING";
    public static final String USUARIO        = "USUARIO";
    public static final String DINERO         = "DINERO";
    public static final String ELEGIR         = "ELEGIR";
    public static final String INICIARSESION  = "INICIARSESION";
    public static final String INFO           = "INFO";

    private CardLayout cardLayout;
    private JPanel concursillo;

    public PanelInicio panelInicio;
    public PanelPreguntas panelPreguntas;
    public PanelRanking panelRanking;
    public PanelUsuario panelUsuario;
    public PanelDinero panelDinero;
    public PanelElegir panelElegir;
    public PanelIniciarSesion panelIniciarSesion;
    public Panelinfo panelinfo;

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

        panelInicio = new PanelInicio(cardLayout, concursillo);
        panelInicio.FondoAzull.setBounds(0, 0, 159, 361);
        panelInicio.InformacionJuego.setFont(new Font("Tahoma", Font.PLAIN, 9));

        panelPreguntas    = new PanelPreguntas(cardLayout, concursillo);
        panelRanking      = new PanelRanking(cardLayout, concursillo);
        panelUsuario      = new PanelUsuario(cardLayout, concursillo);
        panelDinero       = new PanelDinero(cardLayout, concursillo);
        panelElegir       = new PanelElegir(cardLayout, concursillo);
        panelIniciarSesion = new PanelIniciarSesion(cardLayout, concursillo);
        panelinfo         = new Panelinfo(cardLayout, concursillo);

        concursillo.add(panelInicio,         INICIO);
        concursillo.add(panelPreguntas,      PREGUNTAS);
        concursillo.add(panelRanking,        RANKING);
        concursillo.add(panelUsuario,        USUARIO);
        concursillo.add(panelDinero,         DINERO);
        concursillo.add(panelElegir,         ELEGIR);
        concursillo.add(panelIniciarSesion,  INICIARSESION);
        concursillo.add(panelinfo,           INFO);

        setContentPane(concursillo);
        cardLayout.show(concursillo, INICIO);
    }
}