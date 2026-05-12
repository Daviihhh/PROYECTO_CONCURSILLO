package concursillo_proyecto;
//cambi

import javax.swing.*;
import java.awt.*;

public class PanelDinero extends JPanel {

    private static final long serialVersionUID = 1L;

    public JTextField NombreDelJugador;
    public JButton Comodin1;
    public JButton Comodin2;
    public JButton Comodin3;
    public JButton Salir1;
    public JTextField Premio10;
    public JTextField Premio9;
    public JTextField Premio8;
    public JTextField Premio7;
    public JTextField Premio6;
    public JTextField Premio5;
    public JTextField Premio4;
    public JTextField Premio3;
    public JTextField Premio2;
    public JTextField Premio1;
    public JTextArea textoUsuario;
    public JLabel FondoAzul1;
    public JLabel FondoAzul2;

    public PanelDinero(CardLayout cardLayout, JPanel contenedor) {
        setBackground(new Color(253, 247, 130));
        setLayout(null);
        setBounds(0, 0, 506, 361);

        NombreDelJugador = new JTextField();
        NombreDelJugador.setBounds(95, 10, 86, 20);
        NombreDelJugador.setColumns(10);
        add(NombreDelJugador);

        Comodin1 = new JButton("");
        Comodin1.setIcon(new ImageIcon(getClass().getResource("/resource/escudo.png")));
        Comodin1.setBounds(335, 10, 25, 24);
        add(Comodin1);

        Comodin2 = new JButton("");
        Comodin2.setIcon(new ImageIcon(getClass().getResource("/resource/llamada.png")));
        Comodin2.setBounds(381, 10, 25, 24);
        add(Comodin2);

        Comodin3 = new JButton("");
        Comodin3.setIcon(new ImageIcon(getClass().getResource("/resource/Eliminar.png")));
        Comodin3.setBounds(427, 10, 25, 24);
        add(Comodin3);

        Salir1 = new JButton("");
        Salir1.setForeground(new Color(0, 0, 64));
        Salir1.setIcon(new ImageIcon(getClass().getResource("/resource/salir.png")));
        Salir1.setBounds(471, 51, 25, 24);
        Salir1.addActionListener(e -> cardLayout.show(contenedor, Interfaz.PREGUNTAS));
        add(Salir1);

        Premio10 = new JTextField("10º Pregunta: 1000$ + Moto");
        Premio10.setEditable(false);
        Premio10.setBounds(10, 51, 171, 20);
        Premio10.setColumns(10);
        add(Premio10);

        Premio9 = new JTextField("9º Pregunta: 500$");
        Premio9.setEditable(false);
        Premio9.setBounds(10, 82, 151, 20);
        Premio9.setColumns(10);
        add(Premio9);

        Premio8 = new JTextField("8º Pregunta: 300$");
        Premio8.setEditable(false);
        Premio8.setBounds(10, 113, 130, 20);
        Premio8.setColumns(10);
        add(Premio8);

        Premio7 = new JTextField("7º Pregunta: 100$");
        Premio7.setEditable(false);
        Premio7.setBounds(10, 144, 110, 20);
        Premio7.setColumns(10);
        add(Premio7);

        Premio6 = new JTextField("6º Pregunta: 100$");
        Premio6.setEditable(false);
        Premio6.setBounds(10, 175, 110, 20);
        Premio6.setColumns(10);
        add(Premio6);

        Premio5 = new JTextField("5º Pregunta: 100$");
        Premio5.setEditable(false);
        Premio5.setBounds(10, 206, 110, 20);
        Premio5.setColumns(10);
        add(Premio5);

        Premio4 = new JTextField("4º Pregunta: 100$");
        Premio4.setEditable(false);
        Premio4.setBounds(10, 237, 110, 20);
        Premio4.setColumns(10);
        add(Premio4);

        Premio3 = new JTextField("3º Pregunta: 100$");
        Premio3.setEditable(false);
        Premio3.setBounds(10, 268, 110, 20);
        Premio3.setColumns(10);
        add(Premio3);

        Premio2 = new JTextField("2º Pregunta: 100$");
        Premio2.setEditable(false);
        Premio2.setBounds(10, 299, 110, 20);
        Premio2.setColumns(10);
        add(Premio2);

        Premio1 = new JTextField("1º Pregunta: 100$");
        Premio1.setEditable(false);
        Premio1.setBounds(10, 330, 110, 20);
        Premio1.setColumns(10);
        add(Premio1);

        textoUsuario = new JTextArea();
        textoUsuario.setText("Usuario:");
        textoUsuario.setBounds(10, 10, 75, 20);
        add(textoUsuario);

        FondoAzul1 = new JLabel("");
        FondoAzul1.setIcon(new ImageIcon(getClass().getResource("/resource/AzulMarino2.png")));
        FondoAzul1.setBounds(0, 0, 506, 37);
        add(FondoAzul1);

        FondoAzul2 = new JLabel("");
        FondoAzul2.setIcon(new ImageIcon(getClass().getResource("/resource/DINERO.png")));
        FondoAzul2.setBounds(189, 136, 202, 214);
        add(FondoAzul2);
    }
}