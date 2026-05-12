package concursillo_proyecto;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelElegir extends JPanel {

    private static final long serialVersionUID = 1L;

    public JTextField IniciarSesionCuenta,RegistrarUnaCuenta;
    public JLabel FondoCrearCuenta;
    private JButton btnIniciarCuenta,btnRegistrarCuenta, Salir4;
    private JButton button;

    public PanelElegir(CardLayout cardLayout, JPanel contenedor) {
        setBackground(new Color(253, 247, 130));
        setBounds(0, 0, 506, 361);
        setLayout(null);

        IniciarSesionCuenta = new JTextField();
        IniciarSesionCuenta.setHorizontalAlignment(SwingConstants.CENTER);
        IniciarSesionCuenta.setText("Iniciar sesion en una cuenta");
        IniciarSesionCuenta.setBounds(143, 89, 190, 55);
        IniciarSesionCuenta.setColumns(10);
        add(IniciarSesionCuenta);

        RegistrarUnaCuenta = new JTextField();
        RegistrarUnaCuenta.setHorizontalAlignment(SwingConstants.CENTER);
        RegistrarUnaCuenta.setText("Registrar una cuenta nueva");
        RegistrarUnaCuenta.setColumns(10);
        RegistrarUnaCuenta.setBounds(143, 208, 190, 55);
        add(RegistrarUnaCuenta);

        FondoCrearCuenta = new JLabel("");
        FondoCrearCuenta.setIcon(new ImageIcon(PanelElegir.class.getResource("/resource/FondoAzul.png")));
        FondoCrearCuenta.setBounds(0, 177, 506, 184);
        add(FondoCrearCuenta);
        
        
      
        // Botón de iniciar sesión

        btnIniciarCuenta = new JButton("Iniciar sesión con tu cuenta");
        btnIniciarCuenta.setBounds(10, 22, 136, 38);
        btnIniciarCuenta.addActionListener(e -> cardLayout.show(contenedor, Interfaz.INICIARSESION));
        add(btnIniciarCuenta);
      
        // Botón de registrar cuent

        btnRegistrarCuenta = new JButton("Registrar nueva cuenta");
        btnRegistrarCuenta.setBounds(345, 22, 151, 57);
        btnRegistrarCuenta.addActionListener(e -> cardLayout.show(contenedor, Interfaz.USUARIO));
        add(btnRegistrarCuenta);
        
        button = new JButton("New button");
        button.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        button.setBounds(10, 147, 84, 20);
        add(button);
        
       
    }
}