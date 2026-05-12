package concursillo_proyecto;
//cambio

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelPreguntas extends JPanel {

    private static final long serialVersionUID = 1L;

    public JButton Opcion_A;
    public JButton Opcion_B;
    public JButton Opcion_C;
    public JButton Opcion_D;
    public JTextField Pregunta;
    public JLabel ImagenConcursillo;
    public JButton ComodinProteccion;
    public JButton ComodinLlamada;
    public JButton ComodinDescartarOpcion;
    public JButton Salir;
    public JButton VerDinero;
    public JButton VerInfo;
    public JLabel lblNewLabel;
    public JLabel lblNewLabel_1;

    

    public PanelPreguntas(CardLayout cardLayout, JPanel contenedor) {
        setBackground(new Color(253, 247, 130));
        setBounds(100, 100, 506, 355);
        setLayout(null);

        
        Opcion_A = new JButton("A) Honkai");
        Opcion_A.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	
        	}
        });
        Opcion_A.setBackground(new Color(160, 254, 219));
        Opcion_A.setBounds(28, 247, 175, 23);
        add(Opcion_A);

        Opcion_B = new JButton("B) Un gacha de nintendo");
        Opcion_B.setBackground(new Color(160, 254, 219));
        Opcion_B.setBounds(247, 247, 175, 23);
        add(Opcion_B);

        Opcion_C = new JButton("C) Genshin");
        Opcion_C.setBackground(new Color(160, 254, 219));
        Opcion_C.setBounds(28, 281, 175, 23);
        add(Opcion_C);

        Opcion_D = new JButton("D) Ninguno, es de fracasados");
        Opcion_D.setBackground(new Color(160, 254, 219));
        Opcion_D.setBounds(247, 281, 175, 23);
        add(Opcion_D);

        Pregunta = new JTextField();
        Pregunta.setEditable(false);
        Pregunta.setBackground(new Color(160, 254, 219));
        Pregunta.setText("Si dabbido jugara un gacha por lo que sea cual jugaria");
        Pregunta.setBounds(56, 205, 337, 31);
        Pregunta.setColumns(10);
        add(Pregunta);

        ImagenConcursillo = new JLabel("");
        ImagenConcursillo.setIcon(new ImageIcon(getClass().getResource("/resource/ConcursilloLogo.png")));
        ImagenConcursillo.setBounds(166, 114, 85, 80);
        add(ImagenConcursillo);

        ComodinProteccion = new JButton("");
        ComodinProteccion.setIcon(new ImageIcon(getClass().getResource("/resource/escudo.png")));
        ComodinProteccion.setBounds(368, 11, 25, 24);
        add(ComodinProteccion);

        ComodinLlamada = new JButton("");
        ComodinLlamada.setIcon(new ImageIcon(getClass().getResource("/resource/llamada.png")));
        ComodinLlamada.setBounds(417, 11, 25, 24);
        add(ComodinLlamada);
        
        ComodinDescartarOpcion = new JButton("");
        ComodinDescartarOpcion.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        ComodinDescartarOpcion.setIcon(new ImageIcon(getClass().getResource("/resource/Eliminar.png")));
        ComodinDescartarOpcion.setBounds(467, 11, 25, 24);
        add(ComodinDescartarOpcion);

        //Salir = new JButton("");
        //Salir.setIcon(new ImageIcon(getClass().getResource("/resource/salir.png")));
        //Salir.setBounds(10, 11, 25, 24);
        // Salir.addActionListener(e -> cardLayout.show(contenedor, Interfaz.INICIO));
        //add(Salir);

        VerDinero = new JButton("");
        VerDinero.setIcon(new ImageIcon(getClass().getResource("/resource/verDinero.png")));
        VerDinero.setBounds(56, 11, 25, 24);
        VerDinero.addActionListener(e -> cardLayout.show(contenedor, Interfaz.DINERO));
        add(VerDinero);
        
        VerInfo = new JButton("");
        VerInfo.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        VerInfo.setIcon(new ImageIcon(PanelPreguntas.class.getResource("/resource/informacion_pequeno.png")));
        VerInfo.setBounds(467, 52, 25, 24);
        VerInfo.addActionListener(e -> cardLayout.show(contenedor, Interfaz.INFO));
        add(VerInfo);
        
        lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(PanelPreguntas.class.getResource("/resource/AzulMarino.png")));
        lblNewLabel.setBounds(0, 0, 506, 41);
        add(lblNewLabel);
        
        lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon(PanelPreguntas.class.getResource("/resource/AzulMarino3.png")));
        lblNewLabel_1.setBounds(460, 39, 46, 316);
        add(lblNewLabel_1);
    }
    
}