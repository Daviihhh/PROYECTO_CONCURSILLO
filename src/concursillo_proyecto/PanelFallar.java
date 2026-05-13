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

	/**
	 * Create the panel.
	 */
	public PanelFallar(CardLayout cardLayout, JPanel contenedor) {
		setBackground(new Color(253, 247, 130));
		setLayout(null);
		
		FallarOGanar = new JTextField();
		FallarOGanar.setEditable(false);
		FallarOGanar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		FallarOGanar.setBackground(new Color(255, 255, 255));
		FallarOGanar.setBounds(113, 32, 217, 73);
		add(FallarOGanar);
		FallarOGanar.setColumns(10);
		
		CuantasAcertadas = new JTextField();
		CuantasAcertadas.setEditable(false);
		CuantasAcertadas.setBounds(50, 144, 348, 48);
		add(CuantasAcertadas);
		CuantasAcertadas.setColumns(10);
		
		VerRanking = new JButton("Ver Ranking");
		VerRanking.setBounds(174, 213, 89, 23);
		add(VerRanking);
		VerRanking.addActionListener(e -> cardLayout.show(contenedor, Interfaz.RANKING));
		
		
		SalirFallar = new JButton("Salir");
		SalirFallar.setBounds(174, 247, 89, 23);
		add(SalirFallar);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(PanelFallar.class.getResource("/resource/background-chills.png")));
		lblNewLabel.setBounds(0, 0, 450, 300);
		add(lblNewLabel);
		SalirFallar.addActionListener(e -> cardLayout.show(contenedor, Interfaz.INICIO));
		

	}
}
