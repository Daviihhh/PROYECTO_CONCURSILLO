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

    

    public PanelPreguntas(CardLayout cardLayout, JPanel contenedor) {
        setBackground(new Color(253, 247, 130));
        setBounds(100, 100, 522, 400);
        setLayout(null);

        
        Opcion_A = new JButton("A) Honkai");
        Opcion_A.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	
        	}
        });
        Opcion_A.setBackground(new Color(160, 254, 219));
        Opcion_A.setBounds(41, 247, 175, 23);
        add(Opcion_A);

        Opcion_B = new JButton("B) Un gacha de nintendo");
        Opcion_B.setBackground(new Color(160, 254, 219));
        Opcion_B.setBounds(290, 247, 175, 23);
        add(Opcion_B);

        Opcion_C = new JButton("C) Genshin");
        Opcion_C.setBackground(new Color(160, 254, 219));
        Opcion_C.setBounds(41, 281, 175, 23);
        add(Opcion_C);

        Opcion_D = new JButton("D) Ninguno, es de fracasados");
        Opcion_D.setBackground(new Color(160, 254, 219));
        Opcion_D.setBounds(290, 281, 175, 23);
        add(Opcion_D);

        Pregunta = new JTextField();
        Pregunta.setEditable(false);
        Pregunta.setBackground(new Color(160, 254, 219));
        Pregunta.setText("Si dabbido jugara un gacha por lo que sea cual jugaria");
        Pregunta.setBounds(85, 205, 337, 31);
        Pregunta.setColumns(10);
        add(Pregunta);

        ImagenConcursillo = new JLabel("");
        ImagenConcursillo.setIcon(new ImageIcon(getClass().getResource("/resource/ConcursilloLogo.png")));
        ImagenConcursillo.setBounds(208, 97, 85, 80);
        add(ImagenConcursillo);

        ComodinProteccion = new JButton("");
        ComodinProteccion.setIcon(new ImageIcon(getClass().getResource("/resource/escudo.png")));
        ComodinProteccion.setBounds(372, 11, 25, 24);
        add(ComodinProteccion);

        ComodinLlamada = new JButton("");
        ComodinLlamada.setIcon(new ImageIcon(getClass().getResource("/resource/llamada.png")));
        ComodinLlamada.setBounds(422, 11, 25, 24);
        add(ComodinLlamada);
        
        ComodinDescartarOpcion = new JButton("");
        ComodinDescartarOpcion.setIcon(new ImageIcon(getClass().getResource("/resource/Eliminar.png")));
        ComodinDescartarOpcion.setBounds(471, 11, 25, 24);
        add(ComodinDescartarOpcion);

        Salir = new JButton("");
        Salir.setIcon(new ImageIcon(getClass().getResource("/resource/salir.png")));
        Salir.setBounds(10, 11, 25, 24);
        Salir.addActionListener(e -> cardLayout.show(contenedor, Interfaz.INICIO));
        add(Salir);

        VerDinero = new JButton("");
        VerDinero.setIcon(new ImageIcon(getClass().getResource("/resource/verDinero.png")));
        VerDinero.setBounds(56, 11, 25, 24);
        VerDinero.addActionListener(e -> cardLayout.show(contenedor, Interfaz.DINERO));
        add(VerDinero);
    }
    
}