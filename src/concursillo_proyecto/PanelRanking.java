package concursillo_proyecto;
//cambi

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;

public class PanelRanking extends JPanel {

    private static final long serialVersionUID = 1L;

    public JTextField top1;
    public JTextField top2;
    public JTextField top3;
    public JTextField top4;
    public JTextField top5;
    public JButton salir;
    public JTextField NombreUser;
    public JTextArea Usuariotexto;
    public JLabel lblNewLabel;
    public JLabel lblNewLabel_2;
    public JLabel lblNewLabel_6;

    public PanelRanking(CardLayout cardLayout, JPanel contenedor) {
        setBorder(new BevelBorder(BevelBorder.LOWERED,
                new Color(0, 0, 64), new Color(0, 0, 64),
                new Color(0, 0, 64), new Color(0, 0, 64)));
        setForeground(new Color(253, 247, 130));
        setBackground(new Color(253, 247, 130));
        setLayout(null);

        top1 = new JTextField();
        top1.setBackground(Color.WHITE);
        top1.setBounds(93, 117, 219, 20);
        top1.setColumns(10);
        add(top1);

        top2 = new JTextField();
        top2.setColumns(10);
        top2.setBounds(93, 155, 219, 20);
        add(top2);

        top3 = new JTextField();
        top3.setColumns(10);
        top3.setBounds(93, 193, 219, 20);
        add(top3);

        top4 = new JTextField();
        top4.setColumns(10);
        top4.setBounds(93, 233, 219, 20);
        add(top4);

        top5 = new JTextField();
        top5.setColumns(10);
        top5.setBounds(93, 272, 219, 20);
        add(top5);

        salir = new JButton("");
        salir.setBackground(new Color(0, 0, 64));
        salir.setIcon(new ImageIcon(getClass().getResource("/resource/salir.png")));
        salir.setBounds(10, 8, 35, 27);
        salir.addActionListener(e -> cardLayout.show(contenedor, Interfaz.INICIO));
        add(salir);

        NombreUser = new JTextField();
        NombreUser.setBounds(410, 11, 86, 20);
        NombreUser.setColumns(10);
        add(NombreUser);

        Usuariotexto = new JTextArea();
        Usuariotexto.setText("Usuario:");
        Usuariotexto.setEditable(false);
        Usuariotexto.setBounds(327, 11, 73, 19);
        add(Usuariotexto);

        lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(getClass().getResource("/resource/clasificacion_redimensionado.png")));
        lblNewLabel.setBounds(0, 34, 329, 316);
        add(lblNewLabel);

        lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setIcon(new ImageIcon(getClass().getResource("/resource/AzulMarino.png")));
        lblNewLabel_2.setBounds(0, 0, 506, 41);
        add(lblNewLabel_2);

        lblNewLabel_6 = new JLabel("");
        lblNewLabel_6.setIcon(new ImageIcon(getClass().getResource("/resource/clasificacion_banner.png")));
        lblNewLabel_6.setBounds(339, 86, 140, 235);
        add(lblNewLabel_6);
    }
}