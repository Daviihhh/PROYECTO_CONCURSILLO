package concursillo_proyecto;
//cambio

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

public class Panelinfo extends JPanel {

    private static final long serialVersionUID = 1L;

    public JLabel InfoFoto;
    public JLabel fondoInfo;
    public JButton SalirInformacion;

    public Panelinfo(CardLayout cardLayout, JPanel contenedor) {
        setBackground(new Color(253, 247, 130));
        setBounds(0, 0, 506, 361);
        setLayout(null);

        InfoFoto = new JLabel("");
        InfoFoto.setIcon(new ImageIcon(Panelinfo.class.getResource("/resource/info (1).png")));
        InfoFoto.setBounds(253, 67, 147, 219);
        add(InfoFoto);

        fondoInfo = new JLabel("New label");
        fondoInfo.setIcon(new ImageIcon(Panelinfo.class.getResource("/resource/azuloscuronébula.jpg")));
        fondoInfo.setBounds(0, 0, 160, 361);
        add(fondoInfo);
        
        SalirInformacion = new JButton("");
        SalirInformacion.setIcon(new ImageIcon(Panelinfo.class.getResource("/resource/salir.png")));
        SalirInformacion.setBounds(471, 327, 25, 23);
        SalirInformacion.addActionListener(e -> cardLayout.show(contenedor, Interfaz.INICIO));
        add(SalirInformacion);
    }
}