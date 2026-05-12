import javax.swing.*;
import java.awt.*;

public class PanelInicio extends JPanel {

    private static final long serialVersionUID = 1L;

    public PanelInicio() {

        setLayout(null);
        setBackground(Color.YELLOW);

        JLabel titulo = new JLabel("PANTALLA INICIO");
        titulo.setBounds(250, 50, 200, 30);

        JButton boton = new JButton("Entrar");
        boton.setBounds(250, 120, 120, 40);

        add(titulo);
        add(boton);
    }
}