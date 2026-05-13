package concursillo_proyecto;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//cambi

public class Interfaz extends JFrame {
    private static final long serialVersionUID = 1L;

    public static final String INICIO         = "INICIO";
    public static final String PREGUNTAS      = "PREGUNTAS";
    public static final String RANKING        = "RANKING";
    public static final String REGISTRARSE        = "REGISTRARSE";
    public static final String DINERO         = "DINERO";
    public static final String ELEGIR         = "ELEGIR";
    public static final String INICIARSESION  = "INICIARSESION";
    public static final String INFO           = "INFO";
    public static final String FALLAR		  = "FALLAR";
    public static final String ELEGIRTEMATICA           = "ELEGIRTEMATICA";


    private CardLayout cardLayout;
    private JPanel concursillo;

    public PanelInicio panelInicio;
    public PanelPreguntas panelPreguntas;
    public PanelRanking panelRanking;
    public PanelRegistrarse panelRegistrarse;
    public PanelDinero panelDinero;
    public PanelElegir panelElegir;
    public PanelIniciarSesion panelIniciarSesion;
    public Panelinfo panelinfo;
    public PanelFallar panelFallar;
    public PanelElegirTematica panelelegirtematica;


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
        panelInicio.InformacionJuego.setLocation(5, 161);
        panelInicio.FondoAzull.setBounds(0, 0, 159, 361);
        panelInicio.InformacionJuego.setFont(new Font("Tahoma", Font.PLAIN, 11));


        
        panelInicio = new PanelInicio(cardLayout, concursillo);
        panelPreguntas    = new PanelPreguntas(cardLayout, concursillo);
        panelRanking      = new PanelRanking(cardLayout, concursillo);
        panelRanking.lblNewLabel.setLocation(10, 41);
        panelRegistrarse      = new PanelRegistrarse(cardLayout, concursillo);
        panelDinero       = new PanelDinero(cardLayout, concursillo);
        panelElegir       = new PanelElegir(cardLayout, concursillo);
        panelIniciarSesion = new PanelIniciarSesion(cardLayout, concursillo);
        panelinfo         = new Panelinfo(cardLayout, concursillo);
        panelinfo.InformacionJuego.setSize(215, 340);
        panelinfo.InformacionJuego.setLocation(21, 11);
        panelFallar         = new PanelFallar(cardLayout, concursillo);
        panelFallar.SalirFallar.setLocation(213, 248);
        panelFallar.SalirFallar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        panelFallar.VerRanking.setLocation(213, 213);
        panelFallar.FallarOGanar.setLocation(151, 31);
        panelFallar.CuantasAcertadas.setLocation(90, 145);
        panelFallar.lblNewLabel.setBounds(0, 0, 506, 361);
        panelelegirtematica         = new PanelElegirTematica(cardLayout, concursillo);


        concursillo.add(panelInicio,         INICIO);
        concursillo.add(panelPreguntas,      PREGUNTAS);
        concursillo.add(panelRanking,        RANKING);
        concursillo.add(panelRegistrarse,        REGISTRARSE);
        concursillo.add(panelDinero,         DINERO);
        concursillo.add(panelElegir,         ELEGIR);
        concursillo.add(panelIniciarSesion,  INICIARSESION);
        concursillo.add(panelinfo,           INFO);
        concursillo.add(panelFallar,           FALLAR);      
        concursillo.add(panelelegirtematica,           ELEGIRTEMATICA);

        setContentPane(concursillo);
        cardLayout.show(concursillo, INICIO);
    }
}
