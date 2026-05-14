package concursillo_proyecto;

import javax.swing.JPanel;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class PanelFallar extends JPanel {

	private static final long serialVersionUID = 1L;
	public JTextField FallarOGanar;
	public JTextField CuantasAcertadas;
	public JButton VerRanking;
	public JButton SalirFallar;
	public JLabel lblNewLabel;
	public PanelFallar panelFallar;

	public JLabel fondoPanelFallar;


	public PanelFallar(CardLayout cardLayout, JPanel contenedor, PanelRanking panelRanking) {
		setBackground(new Color(253, 247, 130));
        setBounds(0, 0, 506, 361);
		setLayout(null);
		
		FallarOGanar = new JTextField();
		FallarOGanar.setEditable(false);
		FallarOGanar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		FallarOGanar.setBackground(new Color(255, 255, 255));
		FallarOGanar.setBounds(139, 118, 217, 73);
		add(FallarOGanar);
		FallarOGanar.setColumns(10);
		
		CuantasAcertadas = new JTextField();
		CuantasAcertadas.setEditable(false);
		CuantasAcertadas.setBounds(80, 202, 348, 48);
		add(CuantasAcertadas);
		CuantasAcertadas.setColumns(10);
		
		VerRanking = new JButton("Ver Ranking");
		VerRanking.setBounds(183, 261, 131, 23);
		add(VerRanking);
		VerRanking.addActionListener(e -> {
		    panelRanking.actualizarRanking();
		    cardLayout.show(contenedor, Interfaz.RANKING);
		});
		
		
		SalirFallar = new JButton("Salir");
		SalirFallar.setBounds(203, 293, 89, 23);
		add(SalirFallar);
		
		fondoPanelFallar = new JLabel("");
		fondoPanelFallar.setIcon(new ImageIcon(PanelFallar.class.getResource("/resource/background-chills.png")));
		fondoPanelFallar.setBounds(0, 0, 506, 361);
		add(fondoPanelFallar);
		SalirFallar.addActionListener(e -> cardLayout.show(contenedor, Interfaz.INICIO));
		
	}
	
	public void mostrarResultado(String resultado, int puntuacion) {
		System.out.println("mostrarResultado llamado con: " + resultado + " puntuacion: " + puntuacion);
	    switch (resultado) {
	        case "ganar":
	            FallarOGanar.setText("¡HAS GANADO!");
	            break;
	        case "perder":
	            FallarOGanar.setText("¡HAS PERDIDO!");
	            break;
	        case "retirar":
	            FallarOGanar.setText("¡TE HAS RETIRADO!");
	            break;
	    }
	    CuantasAcertadas.setText("Has acertado " + puntuacion + " de 10 preguntas");
	    repaint();
	    revalidate();
	}
}
