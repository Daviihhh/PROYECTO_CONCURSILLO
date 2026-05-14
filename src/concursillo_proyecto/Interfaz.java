package concursillo_proyecto;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;




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

    
    public GestionMongoDB gestion = new GestionMongoDB();





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
        panelRanking = new PanelRanking(cardLayout, concursillo, gestion);
        panelDinero = new PanelDinero(cardLayout, concursillo, gestion);
        panelElegir = new PanelElegir(cardLayout, concursillo);
        panelinfo = new Panelinfo(cardLayout, concursillo);
        panelFallar = new PanelFallar(cardLayout, concursillo, panelRanking);
        panelPreguntas = new PanelPreguntas(cardLayout, concursillo, panelDinero, gestion, panelFallar);
        panelRegistrarse = new PanelRegistrarse(cardLayout, concursillo, gestion, panelPreguntas, panelDinero, panelRanking);
        panelIniciarSesion = new PanelIniciarSesion(cardLayout, concursillo, gestion, panelPreguntas, panelDinero, panelRanking);
        panelelegirtematica = new PanelElegirTematica(cardLayout, concursillo, gestion, panelPreguntas);

        panelRegistrarse.Contraseña.setEditable(false);
        panelRegistrarse.NombreUsuario.setEditable(false);
        panelRegistrarse.DniUsuario.setEditable(false);
        panelDinero.textoUsuario.setEditable(false);
        panelDinero.NombreDelJugador.setEditable(false);
        panelElegir       = new PanelElegir(cardLayout, concursillo);
        panelIniciarSesion.ContraseñaIniciarSesion.setEditable(false);
        panelIniciarSesion.NombreIniciarSesion.setEditable(false);
        panelinfo         = new Panelinfo(cardLayout, concursillo);
        



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

        concursillo.add(panelFallar,           FALLAR);

        setContentPane(concursillo);
        cardLayout.show(concursillo, INICIO);

        

        setContentPane(concursillo);
        cardLayout.show(concursillo, 		INICIO);
        
        panelPreguntas.actualizarNombre();
        panelDinero.actualizarNombre();
        panelRanking.actualizarNombre();


        panelRanking.actualizarRanking();
        
  

    }
}