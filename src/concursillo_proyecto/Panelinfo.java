package concursillo_proyecto;
//cambio

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.DropMode;
import javax.swing.JTextArea;
import java.awt.Font;

public class Panelinfo extends JPanel {

    private static final long serialVersionUID = 1L;

    public JLabel InfoFoto;
    public JLabel fondoInfo;
    public JButton SalirInformacion;
    public JTextArea InformacionJuego;

    public Panelinfo(CardLayout cardLayout, JPanel contenedor) {
        setBackground(new Color(253, 247, 130));
        setBounds(0, 0, 506, 407);
        setLayout(null);
        
        InformacionJuego = new JTextArea();
        InformacionJuego.setFont(new Font("Tahoma", Font.PLAIN, 11));
        InformacionJuego.setText("Funcionamiento del juego:\r\n-Tienes que elegir entre 5 modalidades.\r\n(Futbol, juegos, música, historia y peliculas)\r\n\r\n-Una vez elegida la modalidad tendrás que \r\nresponder una pregunta en la que tendrás \r\nque elegir 1 buena opcion entre 3 opciones\r\nincorrectas, si fallas 1 vez has perdido. \r\n\r\n-Tienes 3 comodines para ayudarte, los \r\ncomodines son de un solo uso.\r\n(Escudo, llamada y quitar una respuesta \r\nincorrecta)\r\n\r\n-El escudo te protege de una respuesta \r\nmala en caso de elegirla. \r\n\r\n-La llamada te permite llamar a \r\nquien tu quieras durante 60 segundos para que te diga la respuesta de una pregunta.\r\n\r\n-Quitar una respuesta incorrecta te quita \r\nuna de las 3 respuestas incorrectas para \r\nque no falles.");
        InformacionJuego.setLineWrap(true);
        InformacionJuego.setBounds(10, 21, 215, 361);
        add(InformacionJuego);

        InfoFoto = new JLabel("");
        InfoFoto.setIcon(new ImageIcon(Panelinfo.class.getResource("/resource/info (1).png")));
        InfoFoto.setBounds(253, 67, 147, 219);
        add(InfoFoto);

        fondoInfo = new JLabel("New label");
        fondoInfo.setIcon(new ImageIcon(Panelinfo.class.getResource("/resource/Otrofondo.png")));
        fondoInfo.setBounds(0, 0, 160, 361);
        add(fondoInfo);
        
        SalirInformacion = new JButton("");
        SalirInformacion.setIcon(new ImageIcon(Panelinfo.class.getResource("/resource/salir.png")));
        SalirInformacion.setBounds(471, 327, 25, 23);
        SalirInformacion.addActionListener(e -> cardLayout.show(contenedor, Interfaz.INICIO));
        add(SalirInformacion);
    }
}