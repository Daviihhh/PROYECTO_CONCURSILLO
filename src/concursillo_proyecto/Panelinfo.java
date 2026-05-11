package concursillo_proyecto;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panelinfo extends JPanel {

    private static final long serialVersionUID = 1L;

    public JLabel InfoFoto;
    public JLabel fondoInfo;

    public Panelinfo(CardLayout cardLayout, JPanel concursillo) {
        setBackground(new Color(253, 247, 130));
        setBounds(0, 0, 506, 361);
        setLayout(null);

        InfoFoto = new JLabel("");
        InfoFoto.setIcon(new ImageIcon(Panelinfo.class.getResource("/resource/info (1).png")));
        InfoFoto.setBounds(298, 65, 147, 219);
        add(InfoFoto);

        fondoInfo = new JLabel("New label");
        fondoInfo.setIcon(new ImageIcon(Panelinfo.class.getResource("/resource/Otrofondo.png")));
        fondoInfo.setBounds(0, 0, 160, 361);
        add(fondoInfo);
    }
}