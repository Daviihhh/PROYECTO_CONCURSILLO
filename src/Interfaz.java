import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JToolBar;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.JSplitPane;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.CompoundBorder;

public class Interfaz extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel PanelPreguntas;
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
	public JPanel PanelInicio;
	public JButton NuevaPartida;
	public JButton Ranking;
	public JButton InformacionJuego;
	public JLabel FotoPanelUsuario;
	public JPanel PanelUsuario;
	public JTextField IntroducirNombre;
	public JFormattedTextField CuadrotextoNombre;
	public JLabel lblNewLabel_1;
	public JPanel PanelInformacion;
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
	public JTextField Premio1;
	private JTextField Premio2;
	public JPanel PanelRanking;
	public JTextField top1;
	public JTextField top2;
	public JTextField top3;
	public JTextField top4;
	public JTextField top5;
	public JButton salir;
	public JTextField CuadrotextoApellidos;
	public JTextField CuadrotextoDNI;
	public JTextPane NombreUsuario;
	public JTextPane ApellidosUsuario;
	public JTextPane DNIusuario;
	public JTextField NombreUser;
	public JTextArea Usuariotexto;
	public JLabel lblNewLabel;
	public JLabel lblNewLabel_2;
	public JTextArea txtrUsuario;
	public JLabel lblNewLabel_4;
	public JLabel lblNewLabel_3;
	public JLabel lblNewLabel_6;
	public JLabel lblNewLabel_5;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 522, 400);
		PanelPreguntas = new JPanel();
		PanelPreguntas.setBackground(new Color(253, 247, 130));
		PanelPreguntas.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(PanelPreguntas);
		PanelPreguntas.setLayout(null);
		
		Opcion_A = new JButton("A) Honkai");
		Opcion_A.setBackground(new Color(160, 254, 219));
		Opcion_A.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		PanelInicio = new JPanel();
		PanelInicio.setBackground(new Color(253, 247, 130));
		PanelInicio.setBounds(0, 0, 506, 361);
		PanelPreguntas.add(PanelInicio);
		PanelInicio.setLayout(null);
		
		NuevaPartida = new JButton("Crear Nueva Partida");
		NuevaPartida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		PanelUsuario = new JPanel();
		PanelUsuario.setBounds(0, 0, 506, 361);
		PanelInicio.add(PanelUsuario);
		PanelUsuario.setBackground(new Color(253, 247, 130));
		PanelUsuario.setLayout(null);
		
		PanelInformacion = new JPanel();
		PanelInformacion.setBounds(468, 287, 506, 361);
		PanelUsuario.add(PanelInformacion);
		PanelInformacion.setBackground(new Color(253, 247, 130));
		PanelInformacion.setLayout(null);
		
		PanelRanking = new JPanel();
		PanelRanking.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 64), new Color(0, 0, 64), new Color(0, 0, 64), new Color(0, 0, 64)));
		PanelRanking.setForeground(new Color(253, 247, 130));
		PanelRanking.setBackground(new Color(253, 247, 130));
		PanelRanking.setBounds(-483, 299, 506, 361);
		PanelInformacion.add(PanelRanking);
		PanelRanking.setLayout(null);
		
		top1 = new JTextField();
		top1.setBackground(new Color(255, 255, 255));
		top1.setBounds(93, 117, 219, 20);
		PanelRanking.add(top1);
		top1.setColumns(10);
		
		top2 = new JTextField();
		top2.setColumns(10);
		top2.setBounds(93, 155, 219, 20);
		PanelRanking.add(top2);
		
		top3 = new JTextField();
		top3.setColumns(10);
		top3.setBounds(93, 193, 219, 20);
		PanelRanking.add(top3);
		
		top4 = new JTextField();
		top4.setColumns(10);
		top4.setBounds(93, 233, 219, 20);
		PanelRanking.add(top4);
		
		top5 = new JTextField();
		top5.setColumns(10);
		top5.setBounds(93, 272, 219, 20);
		PanelRanking.add(top5);
		
		salir = new JButton("");
		salir.setBackground(new Color(0, 0, 64));
		salir.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/salir.png")));
		salir.setBounds(10, 8, 35, 27);
		PanelRanking.add(salir);
		
		NombreUser = new JTextField();
		NombreUser.setBounds(410, 11, 86, 20);
		PanelRanking.add(NombreUser);
		NombreUser.setColumns(10);
		
		Usuariotexto = new JTextArea();
		Usuariotexto.setText("Usuario:");
		Usuariotexto.setEditable(false);
		Usuariotexto.setBounds(327, 11, 73, 19);
		PanelRanking.add(Usuariotexto);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/clasificacion_redimensionado.png")));
		lblNewLabel.setBounds(0, 34, 329, 316);
		PanelRanking.add(lblNewLabel);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/AzulMarino.png")));
		lblNewLabel_2.setBounds(0, 0, 506, 41);
		PanelRanking.add(lblNewLabel_2);
		
		lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/clasificacion_banner.png")));
		lblNewLabel_6.setBounds(339, 86, 140, 235);
		PanelRanking.add(lblNewLabel_6);
		
		
		NombreDelJugador = new JTextField();
		NombreDelJugador.setBounds(95, 10, 86, 20);
		PanelInformacion.add(NombreDelJugador);
		NombreDelJugador.setColumns(10);
		
		Comodin1 = new JButton("");
		Comodin1.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/escudo.png")));
		Comodin1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Comodin1.setBounds(335, 10, 25, 24);
		PanelInformacion.add(Comodin1);
		
		Comodin2 = new JButton("");
		Comodin2.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/llamada.png")));
		Comodin2.setBounds(381, 10, 25, 24);
		PanelInformacion.add(Comodin2);
		
		Comodin3 = new JButton("");
		Comodin3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Comodin3.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/Eliminar.png")));
		Comodin3.setBounds(427, 10, 25, 24);
		PanelInformacion.add(Comodin3);
		
		Salir1 = new JButton("");
		Salir1.setForeground(new Color(0, 0, 64));
		Salir1.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/salir.png")));
		Salir1.setBounds(471, 51, 25, 24);
		PanelInformacion.add(Salir1);
		
		Premio10 = new JTextField();
		Premio10.setText("10º Pregunta: 1000$ + Moto");
		Premio10.setEditable(false);
		Premio10.setBounds(10, 51, 171, 20);
		PanelInformacion.add(Premio10);
		Premio10.setColumns(10);
		
		Premio9 = new JTextField();
		Premio9.setText("9º Pregunta: 500$");
		Premio9.setEditable(false);
		Premio9.setBounds(10, 82, 151, 20);
		PanelInformacion.add(Premio9);
		Premio9.setColumns(10);
		
		Premio8 = new JTextField();
		Premio8.setText("8º Pregunta: 300$");
		Premio8.setEditable(false);
		Premio8.setBounds(10, 113, 130, 20);
		PanelInformacion.add(Premio8);
		Premio8.setColumns(10);
		
		Premio7 = new JTextField();
		Premio7.setText("7º Pregunta: 100$");
		Premio7.setEditable(false);
		Premio7.setBounds(10, 144, 110, 20);
		PanelInformacion.add(Premio7);
		Premio7.setColumns(10);
		
		Premio6 = new JTextField();
		Premio6.setText("6º Pregunta: 100$");
		Premio6.setEditable(false);
		Premio6.setBounds(10, 175, 110, 20);
		PanelInformacion.add(Premio6);
		Premio6.setColumns(10);
		
		Premio5 = new JTextField();
		Premio5.setText("5º Pregunta: 100$");
		Premio5.setEditable(false);
		Premio5.setBounds(10, 206, 110, 20);
		PanelInformacion.add(Premio5);
		Premio5.setColumns(10);
		
		Premio4 = new JTextField();
		Premio4.setText("4º Pregunta: 100$");
		Premio4.setEditable(false);
		Premio4.setBounds(10, 237, 110, 20);
		PanelInformacion.add(Premio4);
		Premio4.setColumns(10);
		
		Premio3 = new JTextField();
		Premio3.setText("3º Pregunta: 100$");
		Premio3.setEditable(false);
		Premio3.setBounds(10, 268, 110, 20);
		PanelInformacion.add(Premio3);
		Premio3.setColumns(10);
		
		Premio2 = new JTextField();
		Premio2.setText("2º Pregunta: 100$");
		Premio2.setEditable(false);
		Premio2.setBounds(10, 299, 110, 20);
		PanelInformacion.add(Premio2);
		Premio2.setColumns(10);
		
		Premio1 = new JTextField();
		Premio1.setText("1º Pregunta: 100$");
		Premio1.setEditable(false);
		Premio1.setBounds(10, 330, 110, 20);
		PanelInformacion.add(Premio1);
		Premio1.setColumns(10);
		
		txtrUsuario = new JTextArea();
		txtrUsuario.setText("Usuario:");
		txtrUsuario.setBounds(10, 10, 75, 20);
		PanelInformacion.add(txtrUsuario);
		
		lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/AzulMarino2.png")));
		lblNewLabel_4.setBounds(0, 0, 506, 37);
		PanelInformacion.add(lblNewLabel_4);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/DINERO.png")));
		lblNewLabel_3.setBounds(250, 82, 202, 214);
		PanelInformacion.add(lblNewLabel_3);
		
		IntroducirNombre = new JTextField();
		IntroducirNombre.setEditable(false);
		IntroducirNombre.setHorizontalAlignment(SwingConstants.CENTER);
		IntroducirNombre.setText("Registrar una cuenta ");
		IntroducirNombre.setBounds(139, 169, 225, 35);
		PanelUsuario.add(IntroducirNombre);
		IntroducirNombre.setColumns(10);
		
		CuadrotextoNombre =new JFormattedTextField();
		CuadrotextoNombre.setBounds(251, 230, 98, 20);
		PanelUsuario.add(CuadrotextoNombre);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/concursillo_logogrande.png")));
		lblNewLabel_1.setBounds(160, 21, 157, 95);
		PanelUsuario.add(lblNewLabel_1);
		
		CuadrotextoApellidos = new JTextField();
		CuadrotextoApellidos.setBounds(251, 261, 96, 20);
		PanelUsuario.add(CuadrotextoApellidos);
		CuadrotextoApellidos.setColumns(10);
		
		CuadrotextoDNI = new JTextField();
		CuadrotextoDNI.setColumns(10);
		CuadrotextoDNI.setBounds(251, 292, 96, 20);
		PanelUsuario.add(CuadrotextoDNI);
		
		NombreUsuario = new JTextPane();
		NombreUsuario.setText("Nombre");
		NombreUsuario.setBounds(156, 230, 56, 20);
		PanelUsuario.add(NombreUsuario);
		
		ApellidosUsuario = new JTextPane();
		ApellidosUsuario.setText("Apellidos");
		ApellidosUsuario.setBounds(156, 261, 56, 20);
		PanelUsuario.add(ApellidosUsuario);
		
		DNIusuario = new JTextPane();
		DNIusuario.setText("DNI");
		DNIusuario.setBounds(158, 292, 56, 20);
		PanelUsuario.add(DNIusuario);
		
		lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/FondoAzul.png")));
		lblNewLabel_5.setBounds(0, 148, 506, 213);
		PanelUsuario.add(lblNewLabel_5);
		
		//Quitar visibilidad Interfaz Inicio Sesion//
		CuadrotextoNombre.setVisible(false);
		IntroducirNombre.setVisible(false);
		NuevaPartida.setBounds(69, 220, 150, 23);
		PanelInicio.add(NuevaPartida);
		
		Ranking = new JButton("Ver Ranking");
		Ranking.setBounds(284, 220, 150, 23);
		PanelInicio.add(Ranking);
		
		InformacionJuego = new JButton("Informacion Del Juego");
		InformacionJuego.setBounds(180, 269, 139, 23);
		PanelInicio.add(InformacionJuego);
		
		FotoPanelUsuario = new JLabel("");
		FotoPanelUsuario.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/LOGO_PANTALLA_INICIO.png")));
		FotoPanelUsuario.setBounds(142, 36, 237, 144);
		PanelInicio.add(FotoPanelUsuario);
		Opcion_A.setBounds(41, 247, 175, 23);
		PanelPreguntas.add(Opcion_A);
		
		
		Opcion_B = new JButton("B) Un gacha de nintendo");
		Opcion_B.setBackground(new Color(160, 254, 219));
		Opcion_B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Opcion_B.setBounds(290, 247, 175, 23);
		PanelPreguntas.add(Opcion_B);
		
		Opcion_C = new JButton("C) Genshin");
		Opcion_C.setBackground(new Color(160, 254, 219));
		Opcion_C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Opcion_C.setBounds(41, 281, 175, 23);
		PanelPreguntas.add(Opcion_C);
		
		Opcion_D = new JButton("D) Ninguno, es de fracasados");
		Opcion_D.setBackground(new Color(160, 254, 219));
		Opcion_D.setBounds(290, 281, 175, 23);
		PanelPreguntas.add(Opcion_D);
		
		Pregunta = new JTextField();
		Pregunta.setEditable(false);
		Pregunta.setBackground(new Color(160, 254, 219));
		Pregunta.setText("Si dabbido jugara un gacha por lo que sea cual jugaria");
		Pregunta.setBounds(85, 205, 337, 31);
		PanelPreguntas.add(Pregunta);
		Pregunta.setColumns(10);
		
		ImagenConcursillo = new JLabel("New label");
		ImagenConcursillo.setBackground(new Color(0, 255, 0));
		ImagenConcursillo.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/ConcursilloLogo.png")));
		ImagenConcursillo.setBounds(208, 97, 85, 80);
		PanelPreguntas.add(ImagenConcursillo);
		
		ComodinProteccion = new JButton("");
		ComodinProteccion.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/escudo.png")));
		ComodinProteccion.setBounds(372, 11, 25, 24);
		PanelPreguntas.add(ComodinProteccion);
		
		ComodinLlamada = new JButton("");
		ComodinLlamada.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/llamada.png")));
		ComodinLlamada.setBounds(422, 11, 25, 24);
		PanelPreguntas.add(ComodinLlamada);
		
		ComodinDescartarOpcion = new JButton("");
		ComodinDescartarOpcion.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/Eliminar.png")));
		ComodinDescartarOpcion.setBounds(471, 11, 25, 24);
		PanelPreguntas.add(ComodinDescartarOpcion);
		
		Salir = new JButton("");
		Salir.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/salir.png")));
		Salir.setBounds(10, 11, 25, 24);
		PanelPreguntas.add(Salir);
		
		VerDinero = new JButton("");
		VerDinero.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/verDinero.png")));
		VerDinero.setBounds(56, 11, 25, 24);
		PanelPreguntas.add(VerDinero);
		
		//Quitar visibilidad Interfaz Preguntas//
		
		Opcion_A.setVisible(false);
		Opcion_B.setVisible(false);
		Opcion_C.setVisible(false);
		Opcion_D.setVisible(false);
		VerDinero.setVisible(false);
		Salir.setVisible(false);
		ComodinDescartarOpcion.setVisible(false);
		ComodinLlamada.setVisible(false);
		ComodinProteccion.setVisible(false);
		Pregunta.setVisible(false);
		ImagenConcursillo.setVisible(false);
		
		////////////////
		setResizable(false);
		
		//Quitar visibilidad Interfaz Inicio//
		NuevaPartida.setVisible(false);
		Ranking.setVisible(false);
		InformacionJuego.setVisible(false);
		
		//Quitar visibilidad Interfaz Informacion//

		Premio1.setVisible(false);
		Premio2.setVisible(false);
		Premio3.setVisible(false);
		Premio4.setVisible(false);
		Premio5.setVisible(false);
		Premio6.setVisible(false);
		Premio7.setVisible(false);
		Premio8.setVisible(false);
		Premio9.setVisible(false);
		Premio10.setVisible(false);
		Comodin1.setVisible(false);
		Comodin2.setVisible(false);
		Comodin3.setVisible(false);
		Salir1.setVisible(false);
		NombreDelJugador.setVisible(false);
		
		//Quitar visibilidad Interfaz Inicio de sesion//
		
		IntroducirNombre.setVisible(false);
		CuadrotextoNombre.setVisible(false);
		CuadrotextoApellidos.setVisible(false);
		CuadrotextoDNI.setVisible(false);
		NombreUsuario.setVisible(false);
		ApellidosUsuario.setVisible(false);
		DNIusuario.setVisible(false);
		FotoPanelUsuario.setVisible(false);
		top1.setVisible(false);
		top2.setVisible(false);
		top3.setVisible(false);
		top4.setVisible(false);
		top5.setVisible(false);
		salir.setVisible(false);

	}
}
