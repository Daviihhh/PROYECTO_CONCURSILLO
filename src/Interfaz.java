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
	public JButton SalirPreguntas;
	public JButton DineroPreguntas;
	public JPanel PanelInicio;
	public JButton NuevaPartida;
	public JButton InformacionJuego;
	public JButton SalirJuego;
	public JLabel FotoPanelUsuario;
	public JPanel PanelRegistrarse;
	public JTextField RegistrarseUsuario;
	public JFormattedTextField CuadrotextoNombre;
	public JLabel ImagenRegistrar;
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
	public JButton SalirInformacion;
	public JTextField CuadrotextoContraseña;
	public JTextField CuadrotextoDNI;
	public JTextPane NombreUsuario;
	public JTextPane DniUsuario;
	public JTextPane ContraseñaUsuario;
	public JTextField UsuarioInformacion;
	public JTextArea NombreInformacion;
	public JLabel ImagenRanking;
	public JLabel RectanguloRanking;
	public JTextArea textoUsuario;
	public JLabel FondoAzul1;
	public JLabel FondoAzul2;
	public JLabel FotoRanking;
	public JLabel FondoUsuario;
	public JButton SalirUsuario;
	public JButton EntrarUsuario;
	public JLabel FondoInicio;
	public JLabel PreguntaPng;
	public JButton ExplicacionUsuario;
	public JLabel FotoMenuPrincipal;
	public JLabel RectanguloPreguntas2;
	public JTextField usuarioText;
	public JButton InformacionPreguntas;
	public JLabel RectanguloPreguntas;
	public JTextField NivelPreguntas;
	public JTextField txtyaTieneUna;
	public JButton btnNewButton;
	public JPanel PanelIniciarSesion;
	public JLabel lblNewLabel;
	public JTextField IniciarSesion;
	public JTextField NombreIniciarSesion;
	public JTextField ContraseñaIniciarSesion;
	public JTextField NombreRellenar;
	public JTextField ContraseñaRellenar;
	public JLabel FotoInicioSesion;
	public JPanel Panelinfo;
	public JLabel InfoFoto;
	public JLabel fondoInfo;
	public JPanel PanelElegir;
	public JTextField IniciarSesionCuenta;
	public JTextField RegistrarUnaCuenta;
	public JLabel FondoCrearCuenta;
	public JButton BotonElegir;
	public JButton BotonInfo;
	public JButton BotonInicioSesion;
	
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
		PanelPreguntas = 
				new JPanel();
		PanelPreguntas.setBackground(new Color(253, 247, 130));
		PanelPreguntas.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 64), new Color(0, 0, 64), new Color(0, 0, 64), new Color(0, 0, 64)));
		setContentPane(PanelPreguntas);
		PanelPreguntas.setLayout(null);
		
		Opcion_A = new JButton("A) Honkai");
		Opcion_A.setBackground(new Color(160, 254, 219));
		Opcion_A.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		PanelInicio = new JPanel();
		PanelInicio.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 64), new Color(0, 0, 64), new Color(0, 0, 64), new Color(0, 0, 64)));
		PanelInicio.setBackground(new Color(253, 247, 130));
		PanelInicio.setBounds(0, -1, 506, 361);
		PanelPreguntas.add(PanelInicio);
		PanelInicio.setLayout(null);
		
		NuevaPartida = new JButton("Crear Nueva Partida");
		NuevaPartida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		PanelRegistrarse = new JPanel();
		PanelRegistrarse.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 64), new Color(0, 0, 64), new Color(0, 0, 64), new Color(0, 0, 64)));
		PanelRegistrarse.setBounds(0, 0, 506, 361);
		PanelInicio.add(PanelRegistrarse);
		PanelRegistrarse.setBackground(new Color(253, 247, 130));
		PanelRegistrarse.setLayout(null);
		
		PanelInformacion = new JPanel();
		PanelInformacion.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 64), new Color(0, 0, 64), new Color(0, 0, 64), new Color(0, 0, 64)));
		PanelInformacion.setBounds(0, 0, 506, 361);
		PanelRegistrarse.add(PanelInformacion);
		PanelInformacion.setBackground(new Color(253, 247, 130));
		PanelInformacion.setLayout(null);
		
		PanelRanking = new JPanel();
		PanelRanking.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 64), new Color(0, 0, 64), new Color(0, 0, 64), new Color(0, 0, 64)));
		PanelRanking.setForeground(new Color(253, 247, 130));
		PanelRanking.setBackground(new Color(253, 247, 130));
		PanelRanking.setBounds(0, 0, 506, 361);
		PanelInformacion.add(PanelRanking);
		PanelRanking.setLayout(null);
		
		PanelIniciarSesion = new JPanel();
		PanelIniciarSesion.setBackground(new Color(253, 247, 130));
		PanelIniciarSesion.setBounds(0, 0, 506, 361);
		PanelRanking.add(PanelIniciarSesion);
		PanelIniciarSesion.setLayout(null);
		
		Panelinfo = new JPanel();
		Panelinfo.setBackground(new Color(253, 247, 130));
		Panelinfo.setBounds(0, 0, 506, 361);
		PanelIniciarSesion.add(Panelinfo);
		Panelinfo.setLayout(null);
		
		PanelElegir = new JPanel();
		PanelElegir.setBackground(new Color(253, 247, 130));
		PanelElegir.setBounds(0, 0, 506, 361);
		Panelinfo.add(PanelElegir);
		PanelElegir.setLayout(null);
		
		BotonElegir = new JButton("");
		BotonElegir.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/salir.png")));
		BotonElegir.setBounds(10, 327, 25, 24);
		PanelElegir.add(BotonElegir);
		
		IniciarSesionCuenta = new JTextField();
		IniciarSesionCuenta.setHorizontalAlignment(SwingConstants.CENTER);
		IniciarSesionCuenta.setText("Iniciar sesion en una cuenta");
		IniciarSesionCuenta.setBounds(143, 89, 190, 55);
		PanelElegir.add(IniciarSesionCuenta);
		IniciarSesionCuenta.setColumns(10);
		
		RegistrarUnaCuenta = new JTextField();
		RegistrarUnaCuenta.setHorizontalAlignment(SwingConstants.CENTER);
		RegistrarUnaCuenta.setText("Registrar una cuenta nueva");
		RegistrarUnaCuenta.setColumns(10);
		RegistrarUnaCuenta.setBounds(143, 208, 190, 55);
		PanelElegir.add(RegistrarUnaCuenta);
		
		FondoCrearCuenta = new JLabel("");
		FondoCrearCuenta.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/FondoAzul.png")));
		FondoCrearCuenta.setBounds(0, 177, 506, 184);
		PanelElegir.add(FondoCrearCuenta);
		
		InfoFoto = new JLabel("");
		InfoFoto.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/info (1).png")));
		InfoFoto.setBounds(298, 65, 147, 219);
		Panelinfo.add(InfoFoto);
		
		fondoInfo = new JLabel("New label");
		fondoInfo.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/Otrofondo.png")));
		fondoInfo.setBounds(0, 0, 160, 361);
		Panelinfo.add(fondoInfo);
		
		BotonInfo = new JButton("");
		BotonInfo.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/salir.png")));
		BotonInfo.setBounds(456, 11, 25, 24);
		Panelinfo.add(BotonInfo);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/iniciarsesion (1).png")));
		lblNewLabel.setBounds(154, 13, 180, 143);
		PanelIniciarSesion.add(lblNewLabel);
		
		IniciarSesion = new JTextField();
		IniciarSesion.setHorizontalAlignment(SwingConstants.CENTER);
		IniciarSesion.setText("Iniciar Sesion");
		IniciarSesion.setEditable(false);
		IniciarSesion.setBounds(180, 191, 129, 37);
		PanelIniciarSesion.add(IniciarSesion);
		IniciarSesion.setColumns(10);
		
		NombreIniciarSesion = new JTextField();
		NombreIniciarSesion.setText("Nombre");
		NombreIniciarSesion.setBounds(141, 249, 86, 20);
		PanelIniciarSesion.add(NombreIniciarSesion);
		NombreIniciarSesion.setColumns(10);
		
		ContraseñaIniciarSesion = new JTextField();
		ContraseñaIniciarSesion.setText("Contraseña");
		ContraseñaIniciarSesion.setBounds(141, 296, 86, 20);
		PanelIniciarSesion.add(ContraseñaIniciarSesion);
		ContraseñaIniciarSesion.setColumns(10);
		
		NombreRellenar = new JTextField();
		NombreRellenar.setBounds(260, 249, 86, 20);
		PanelIniciarSesion.add(NombreRellenar);
		NombreRellenar.setColumns(10);
		
		ContraseñaRellenar = new JTextField();
		ContraseñaRellenar.setBounds(260, 296, 86, 20);
		PanelIniciarSesion.add(ContraseñaRellenar);
		ContraseñaRellenar.setColumns(10);
		
		BotonInicioSesion = new JButton("");
		BotonInicioSesion.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/salir.png")));
		BotonInicioSesion.setBounds(10, 327, 25, 23);
		PanelIniciarSesion.add(BotonInicioSesion);
		
		FotoInicioSesion = new JLabel("");
		FotoInicioSesion.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/FondoAzul.png")));
		FotoInicioSesion.setBounds(0, 167, 506, 204);
		PanelIniciarSesion.add(FotoInicioSesion);
		
		top1 = new JTextField();
		top1.setBackground(new Color(255, 255, 255));
		top1.setBounds(93, 117, 219, 20);
		PanelRanking.add(top1);
		top1.setColumns(10);
		top1.setVisible(false);
		
		top2 = new JTextField();
		top2.setColumns(10);
		top2.setBounds(93, 155, 219, 20);
		PanelRanking.add(top2);
		top2.setVisible(false);
		
		top3 = new JTextField();
		top3.setColumns(10);
		top3.setBounds(93, 193, 219, 20);
		PanelRanking.add(top3);
		top3.setVisible(false);
		
		top4 = new JTextField();
		top4.setColumns(10);
		top4.setBounds(93, 233, 219, 20);
		PanelRanking.add(top4);
		top4.setVisible(false);
		
		top5 = new JTextField();
		top5.setColumns(10);
		top5.setBounds(93, 272, 219, 20);
		PanelRanking.add(top5);
		top5.setVisible(false);
		
		SalirInformacion = new JButton("");
		SalirInformacion.setBackground(new Color(0, 0, 64));
		SalirInformacion.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/salir.png")));
		SalirInformacion.setBounds(10, 8, 35, 27);
		PanelRanking.add(SalirInformacion);
		SalirInformacion.setVisible(false);
		
		UsuarioInformacion = new JTextField();
		UsuarioInformacion.setBounds(410, 11, 86, 20);
		PanelRanking.add(UsuarioInformacion);
		UsuarioInformacion.setColumns(10);
		
		NombreInformacion = new JTextArea();
		NombreInformacion.setText("Usuario:");
		NombreInformacion.setEditable(false);
		NombreInformacion.setBounds(327, 11, 73, 19);
		PanelRanking.add(NombreInformacion);
		
		ImagenRanking = new JLabel("");
		ImagenRanking.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/clasificacion_redimensionado.png")));
		ImagenRanking.setBounds(0, 34, 329, 316);
		PanelRanking.add(ImagenRanking);
		
		RectanguloRanking = new JLabel("");
		RectanguloRanking.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/AzulMarino.png")));
		RectanguloRanking.setBounds(0, 0, 506, 41);
		PanelRanking.add(RectanguloRanking);
		
		FotoRanking = new JLabel("");
		FotoRanking.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/clasificacion_banner.png")));
		FotoRanking.setBounds(339, 86, 140, 235);
		PanelRanking.add(FotoRanking);
		
		
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
		Comodin1.setBounds(308, 10, 25, 24);
		PanelInformacion.add(Comodin1);
		
		Comodin2 = new JButton("");
		Comodin2.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/llamada.png")));
		Comodin2.setBounds(353, 10, 25, 24);
		PanelInformacion.add(Comodin2);
		
		Comodin3 = new JButton("");
		Comodin3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Comodin3.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/Eliminar.png")));
		Comodin3.setBounds(399, 10, 25, 24);
		PanelInformacion.add(Comodin3);
		
		Salir1 = new JButton("");
		Salir1.setForeground(new Color(0, 0, 64));
		Salir1.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/salir.png")));
		Salir1.setBounds(444, 10, 25, 24);
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
		
		textoUsuario = new JTextArea();
		textoUsuario.setText("Usuario:");
		textoUsuario.setBounds(10, 10, 75, 20);
		PanelInformacion.add(textoUsuario);
		
		FondoAzul1 = new JLabel("");
		FondoAzul1.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/AzulMarino2.png")));
		FondoAzul1.setBounds(0, 0, 506, 37);
		PanelInformacion.add(FondoAzul1);
		
		FondoAzul2 = new JLabel("");
		FondoAzul2.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/DINERO.png")));
		FondoAzul2.setBounds(189, 136, 202, 214);
		PanelInformacion.add(FondoAzul2);
		
		RegistrarseUsuario = new JTextField();
		RegistrarseUsuario.setEditable(false);
		RegistrarseUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		RegistrarseUsuario.setText("Registrar una cuenta ");
		RegistrarseUsuario.setBounds(138, 170, 225, 35);
		PanelRegistrarse.add(RegistrarseUsuario);
		RegistrarseUsuario.setColumns(10);
		
		CuadrotextoNombre =new JFormattedTextField();
		CuadrotextoNombre.setBounds(251, 261, 98, 20);
		PanelRegistrarse.add(CuadrotextoNombre);
		
		ImagenRegistrar = new JLabel("New label");
		ImagenRegistrar.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/concursillo_logogrande.png")));
		ImagenRegistrar.setBounds(160, 21, 157, 95);
		PanelRegistrarse.add(ImagenRegistrar);
		
		CuadrotextoContraseña = new JTextField();
		CuadrotextoContraseña.setBounds(251, 292, 96, 20);
		PanelRegistrarse.add(CuadrotextoContraseña);
		CuadrotextoContraseña.setColumns(10);
		
		CuadrotextoDNI = new JTextField();
		CuadrotextoDNI.setColumns(10);
		CuadrotextoDNI.setBounds(251, 230, 96, 20);
		PanelRegistrarse.add(CuadrotextoDNI);
		
		NombreUsuario = new JTextPane();
		NombreUsuario.setText("Nombre");
		NombreUsuario.setBounds(138, 261, 74, 20);
		PanelRegistrarse.add(NombreUsuario);
		
		DniUsuario = new JTextPane();
		DniUsuario.setText("DNI");
		DniUsuario.setBounds(138, 230, 74, 20);
		PanelRegistrarse.add(DniUsuario);
		
		ContraseñaUsuario = new JTextPane();
		ContraseñaUsuario.setText("Contraseña");
		ContraseñaUsuario.setBounds(138, 292, 74, 20);
		PanelRegistrarse.add(ContraseñaUsuario);
		
		SalirUsuario = new JButton("");
		SalirUsuario.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/salir.png")));
		SalirUsuario.setBounds(10, 327, 25, 24);
		PanelRegistrarse.add(SalirUsuario);
		
		EntrarUsuario = new JButton("Entrar");
		EntrarUsuario.setBounds(198, 328, 89, 23);
		PanelRegistrarse.add(EntrarUsuario);
		
		ExplicacionUsuario = new JButton("");
		ExplicacionUsuario.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/informacion_pequeno.png")));
		ExplicacionUsuario.setBounds(471, 327, 25, 24);
		PanelRegistrarse.add(ExplicacionUsuario);
		
		FondoUsuario = new JLabel("");
		FondoUsuario.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/FondoAzul.png")));
		FondoUsuario.setBounds(0, 148, 506, 213);
		PanelRegistrarse.add(FondoUsuario);
		
		txtyaTieneUna = new JTextField();
		txtyaTieneUna.setText("¿Ya tiene una cuenta?");
		txtyaTieneUna.setBounds(367, 11, 129, 20);
		PanelRegistrarse.add(txtyaTieneUna);
		txtyaTieneUna.setColumns(10);
		
		btnNewButton = new JButton("Iniciar Sesión");
		btnNewButton.setBounds(367, 42, 108, 23);
		PanelRegistrarse.add(btnNewButton);
		

		CuadrotextoNombre.setVisible(false);
		RegistrarseUsuario.setVisible(false);
		NuevaPartida.setBounds(5, 108, 150, 23);
		PanelInicio.add(NuevaPartida);
		
		InformacionJuego = new JButton("Informacion Del Juego");
		InformacionJuego.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		InformacionJuego.setBounds(5, 168, 150, 23);
		PanelInicio.add(InformacionJuego);
		
		SalirJuego = new JButton("Salir");
		SalirJuego.setBounds(5, 228, 150, 23);
		PanelInicio.add(SalirJuego);
		
		FotoPanelUsuario = new JLabel("");
		FotoPanelUsuario.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/LOGO_PANTALLA_INICIO.png")));
		FotoPanelUsuario.setBounds(221, 108, 237, 144);
		PanelInicio.add(FotoPanelUsuario);
		
		PreguntaPng = new JLabel("New label");
		PreguntaPng.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/Interrogaciones.png")));
		PreguntaPng.setBounds(25, 291, 102, 63);
		PanelInicio.add(PreguntaPng);
		
		FotoMenuPrincipal = new JLabel("");
		FotoMenuPrincipal.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/MenuPrincipal.png")));
		FotoMenuPrincipal.setBounds(10, 11, 131, 86);
		PanelInicio.add(FotoMenuPrincipal);
		
		FondoInicio = new JLabel("");
		FondoInicio.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/Otrofondo.png")));
		FondoInicio.setBounds(0, 0, 159, 361);
		PanelInicio.add(FondoInicio);
		Opcion_A.setBounds(41, 247, 175, 23);
		PanelPreguntas.add(Opcion_A);
		
		
		Opcion_B = new JButton("B) Un gacha de nintendo");
		Opcion_B.setBackground(new Color(160, 254, 219));
		Opcion_B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Opcion_B.setBounds(247, 247, 175, 23);
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
		Opcion_D.setBounds(247, 281, 175, 23);
		PanelPreguntas.add(Opcion_D);
		
		Pregunta = new JTextField();
		Pregunta.setHorizontalAlignment(SwingConstants.CENTER);
		Pregunta.setEditable(false);
		Pregunta.setBackground(new Color(160, 254, 219));
		Pregunta.setText("Si dabbido jugara un gacha por lo que sea cual jugaria");
		Pregunta.setBounds(60, 205, 337, 31);
		PanelPreguntas.add(Pregunta);
		Pregunta.setColumns(10);
		
		ImagenConcursillo = new JLabel("New label");
		ImagenConcursillo.setBackground(new Color(0, 255, 0));
		ImagenConcursillo.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/ConcursilloLogo.png")));
		ImagenConcursillo.setBounds(180, 101, 85, 80);
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
		
		SalirPreguntas = new JButton("");
		SalirPreguntas.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/salir.png")));
		SalirPreguntas.setBounds(10, 11, 25, 24);
		PanelPreguntas.add(SalirPreguntas);
		
		DineroPreguntas = new JButton("");
		DineroPreguntas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		DineroPreguntas.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/verDinero.png")));
		DineroPreguntas.setBounds(50, 11, 25, 24);
		PanelPreguntas.add(DineroPreguntas);
		
		usuarioText = new JTextField();
		usuarioText.setBounds(120, 15, 86, 20);
		PanelPreguntas.add(usuarioText);
		usuarioText.setColumns(10);
		
		InformacionPreguntas = new JButton("");
		InformacionPreguntas.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/informacion_pequeno.png")));
		InformacionPreguntas.setBounds(471, 56, 25, 24);
		PanelPreguntas.add(InformacionPreguntas);
		
		NivelPreguntas = new JTextField();
		NivelPreguntas.setBounds(233, 15, 86, 20);
		PanelPreguntas.add(NivelPreguntas);
		NivelPreguntas.setColumns(10);
		
		RectanguloPreguntas2 = new JLabel("");
		RectanguloPreguntas2.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/AzulMarino2.png")));
		RectanguloPreguntas2.setBounds(0, 0, 506, 45);
		PanelPreguntas.add(RectanguloPreguntas2);
		
		RectanguloPreguntas = new JLabel("");
		RectanguloPreguntas.setIcon(new ImageIcon(Interfaz.class.getResource("/resource/AzulMarino3.png")));
		RectanguloPreguntas.setBounds(460, 44, 46, 316);
		PanelPreguntas.add(RectanguloPreguntas);
		
		//Quitar visibilidad Interfaz Preguntas//
		
		Opcion_A.setVisible(false);
		Opcion_B.setVisible(false);
		Opcion_C.setVisible(false);
		Opcion_D.setVisible(false);
		DineroPreguntas.setVisible(false);
		SalirPreguntas.setVisible(false);
		ComodinDescartarOpcion.setVisible(false);
		ComodinLlamada.setVisible(false);
		ComodinProteccion.setVisible(false);
		Pregunta.setVisible(false);
		ImagenConcursillo.setVisible(false);
		
		////////////////
		setResizable(false);
		
		//Quitar visibilidad Interfaz Inicio//
		NuevaPartida.setVisible(false);
		InformacionJuego.setVisible(false);
		SalirJuego.setVisible(false);
		
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
		
		RegistrarseUsuario.setVisible(false);
		CuadrotextoNombre.setVisible(false);
		CuadrotextoContraseña.setVisible(false);
		CuadrotextoDNI.setVisible(false);
		NombreUsuario.setVisible(false);
		DniUsuario.setVisible(false);
		ContraseñaUsuario.setVisible(false);
		FotoPanelUsuario.setVisible(false);

	}
}
