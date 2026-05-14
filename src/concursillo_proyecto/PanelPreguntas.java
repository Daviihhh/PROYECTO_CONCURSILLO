
package concursillo_proyecto;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;


public class PanelPreguntas extends JPanel {

    private static final long serialVersionUID = 1L;

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

    public Pregunta preguntaActual;
    public ArrayList<Pregunta> preguntas;
    public String tema;
    private GestionMongoDB gestion;
    private JPanel contenedor;
    private CardLayout cardLayout;

    public JButton VerInfo;
    public JLabel lblNewLabel;

    public JLabel lblNewLabel_1;
    
    private boolean escudoActivado = false;


    private JLabel fondo_chill;
    public JTextField NombrePreguntas;
    public JTextField NivelPreguntas;
    
    private PanelDinero panelDinero;
    
    private PanelFallar panelFallar;
    

    public PanelPreguntas(CardLayout cardLayout, JPanel contenedor, PanelDinero panelDinero, GestionMongoDB gestion, PanelFallar panelFallar) {
        setBackground(new Color(253, 247, 130));
        setBounds(0, 0, 506, 361);
        setLayout(null);
        
        this.panelFallar = panelFallar;
        this.cardLayout = cardLayout;
        this.contenedor = contenedor;
        this.panelDinero = panelDinero;
        this.gestion = gestion;      

        Opcion_A = new JButton("");
        Opcion_A.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		comprobarRespuesta(Opcion_A);
        	}
        });
        
        NivelPreguntas = new JTextField();
        NivelPreguntas.setBounds(244, 15, 86, 20);
        add(NivelPreguntas);
        NivelPreguntas.setColumns(10);
        
        NombrePreguntas = new JTextField();
        NombrePreguntas.setBounds(116, 15, 86, 20);
        add(NombrePreguntas);
        NombrePreguntas.setColumns(10);
        Opcion_A.setBackground(new Color(160, 254, 219));
        Opcion_A.setBounds(56, 247, 175, 23);
        add(Opcion_A);
        

        Opcion_B = new JButton("");
        Opcion_B.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		comprobarRespuesta(Opcion_B);
        	}
        });
        Opcion_B.setBackground(new Color(160, 254, 219));
        Opcion_B.setBounds(271, 247, 175, 23);
        add(Opcion_B);

        Opcion_C = new JButton("");
        Opcion_C.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		comprobarRespuesta(Opcion_C);
        	}
        });
        Opcion_C.setBackground(new Color(160, 254, 219));
        Opcion_C.setBounds(56, 281, 175, 23);
        add(Opcion_C);

        Opcion_D = new JButton("");
        Opcion_D.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		comprobarRespuesta(Opcion_D);
        	}
        });
        Opcion_D.setBackground(new Color(160, 254, 219));
        Opcion_D.setBounds(271, 281, 175, 23);
        add(Opcion_D);

        Pregunta = new JTextField();
        Pregunta.setEditable(false);
        Pregunta.setBackground(new Color(160, 254, 219));

        Pregunta.setText("");

        Pregunta.setBounds(85, 185, 337, 31);
        Pregunta.setColumns(10);
        add(Pregunta);

        ImagenConcursillo = new JLabel("");
        ImagenConcursillo.setIcon(new ImageIcon(getClass().getResource("/resource/ConcursilloLogo.png")));
        ImagenConcursillo.setBounds(208, 83, 85, 80);
        add(ImagenConcursillo);

        ComodinProteccion = new JButton("");
        ComodinProteccion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                escudoActivado = true;
                ComodinProteccion.setEnabled(false);
                System.out.println("Escudo activado");
            }
        });
        ComodinProteccion.setIcon(new ImageIcon(getClass().getResource("/resource/escudo.png")));
        ComodinProteccion.setBounds(368, 11, 25, 24);
        add(ComodinProteccion);

        ComodinLlamada = new JButton("");
        ComodinLlamada.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		comodinLlamada();
        		ComodinLlamada.setEnabled(false); //setEnabled lo pone en gris y desactiva su función como evento
        	}
        });
        ComodinLlamada.setIcon(new ImageIcon(getClass().getResource("/resource/llamada.png")));
        ComodinLlamada.setBounds(417, 11, 25, 24);
        add(ComodinLlamada);
        
        ComodinDescartarOpcion = new JButton("");
        ComodinDescartarOpcion.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		comodinIncorrecta();
        		ComodinDescartarOpcion.setEnabled(false);
        	}
        });
        ComodinDescartarOpcion.setIcon(new ImageIcon(getClass().getResource("/resource/Eliminar.png")));
        ComodinDescartarOpcion.setBounds(467, 11, 25, 24);
        add(ComodinDescartarOpcion);

        //Salir = new JButton("");
        //Salir.setIcon(new ImageIcon(getClass().getResource("/resource/salir.png")));
        //Salir.setBounds(10, 11, 25, 24);
        // Salir.addActionListener(e -> cardLayout.show(contenedor, Interfaz.INICIO));
        //add(Salir);

        VerDinero = new JButton("");
        VerDinero.setIcon(new ImageIcon(getClass().getResource("/resource/verDinero.png")));
        VerDinero.setBounds(56, 11, 25, 24);
        VerDinero.addActionListener(e -> cardLayout.show(contenedor, Interfaz.DINERO));
        add(VerDinero);

        
        VerInfo = new JButton("");
        VerInfo.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		//metodoverdinero??
        	}
        });
        VerInfo.setIcon(new ImageIcon(PanelPreguntas.class.getResource("/resource/informacion_pequeno.png")));
        VerInfo.setBounds(10, 11, 25, 24);
        add(VerInfo);
        
        lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(PanelPreguntas.class.getResource("/resource/azuloscuronébula.jpg")));
        lblNewLabel.setBounds(0, 0, 506, 41);
        add(lblNewLabel);
       
        fondo_chill = new JLabel("");
        fondo_chill.setIcon(new ImageIcon(PanelPreguntas.class.getResource("/resource/background-chills.png")));
        fondo_chill.setBounds(0, 39, 506, 322);
        add(fondo_chill);
        
    }
    
    
    
    
    private void comodinEscudo(JButton boton) {
        String texto = boton.getText();

        if (texto.equals(preguntaActual.getCorrecta())) {
            System.out.println("Correcto");
            gestion.siguientePregunta();
            cargarPregunta();
        } else {
            System.out.println("Incorrecto pero protegido por el escudo");
            JOptionPane.showMessageDialog(this, "¡El escudo te ha protegido!");
            escudoActivado = false;
            boton.setVisible(false);
        }
    }
	
	private void comodinIncorrecta() {
		ArrayList<JButton> candidatos = new ArrayList<>();
		
		if (Opcion_A.isVisible() && !Opcion_A.getText().equals(preguntaActual.getCorrecta())) candidatos.add(Opcion_A);
		if (Opcion_B.isVisible() && !Opcion_B.getText().equals(preguntaActual.getCorrecta())) candidatos.add(Opcion_B);
	    if (Opcion_C.isVisible() && !Opcion_C.getText().equals(preguntaActual.getCorrecta())) candidatos.add(Opcion_C);
        if (Opcion_D.isVisible() && !Opcion_D.getText().equals(preguntaActual.getCorrecta())) candidatos.add(Opcion_D);
		
		if (candidatos.isEmpty()) {
	        System.out.println("No hay opciones incorrectas visibles para eliminar");
	        return;
	    }

	    // Elige uno aleatorio de los candidatos válidos
	    int random = (int)(Math.random() * candidatos.size());
	    candidatos.get(random).setVisible(false);
	}
	
	
	private void cargarPregunta() {
		visiblesOpciones();
	    preguntaActual = gestion.getPreguntaActual();
	    if (preguntaActual == null) {
	        Usuario usuario = new Usuario(
	            gestion.getNombreUsuarioActual(),
	            gestion.getDniUsuarioActual(),
	            gestion.getContrasenaUsuarioActual(),
	            gestion.getPuntuacion()
	        );
	        gestion.guardarUsuario(usuario);
	        panelFallar.mostrarResultado(true, gestion.getPuntuacion());
	        cardLayout.show(contenedor, Interfaz.FALLAR);
	        return;
	    }
	    
	    ArrayList<String> respuestas = new ArrayList<>(preguntaActual.getRespuestas());
	    Collections.shuffle(respuestas);

	    Pregunta.setText(preguntaActual.getEnunciado());
	    Opcion_A.setText(respuestas.get(0));
	    Opcion_B.setText(respuestas.get(1));
	    Opcion_C.setText(respuestas.get(2));
	    Opcion_D.setText(respuestas.get(3));
	    
	    panelDinero.actualizarPremio(gestion.getNumPreguntaActual());
	    NivelPreguntas.setText("Pregunta " + gestion.getNumPreguntaActual());
	}
	
	public void actualizarNombre() {
	    NombrePreguntas.setText(gestion.getNombreUsuarioActual());
	}

	
	
	
	public void Concursillo() {
		
		ActionListener listenerOpciones = e -> {
			JButton boton = (JButton) e.getSource(); //e.getSource devuelve el botón pulsado
		};
		
		Opcion_A.addActionListener(listenerOpciones);
		Opcion_B.addActionListener(listenerOpciones);
		Opcion_C.addActionListener(listenerOpciones);
		Opcion_D.addActionListener(listenerOpciones);
	}
	
	private void comprobarRespuesta(JButton boton) {
	    if (escudoActivado) {
	        comodinEscudo(boton);
	        return;
	    }

	    String texto = boton.getText();
	    if (texto.equals(preguntaActual.getCorrecta())) {
	        System.out.println("Correcto");
	        gestion.siguientePregunta();
	        gestion.sumarPunto();
	        cargarPregunta();
	    } else {
	    	panelFallar.mostrarResultado(false, gestion.getPuntuacion());
	        cardLayout.show(contenedor, Interfaz.FALLAR); // añade esta línea
	    }
	}
	
	
	int segundos = 0;
	private Timer timerLlamada = null;

	private void comodinLlamada() {
	    if (timerLlamada != null) {
	        timerLlamada.cancel();
	    }

	    segundos = 0;
	    timerLlamada = new Timer();

	    // Crea el diálogo
	    JDialog dialog = new JDialog();
	    dialog.setTitle("Llamada");
	    dialog.setSize(300, 150);
	    dialog.setLayout(new BorderLayout());
	    dialog.setLocationRelativeTo(this);
	    dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE); // no se puede cerrar con la X

	    JLabel lblSegundos = new JLabel("Segundos restantes: 60", SwingConstants.CENTER);
	    JButton btnCerrar = new JButton("Colgar");
	    btnCerrar.setEnabled(false); // desactivado hasta que acaben los 60 segundos

	    dialog.add(lblSegundos, BorderLayout.CENTER);
	    dialog.add(btnCerrar, BorderLayout.SOUTH);

	    btnCerrar.addActionListener(e -> dialog.dispose());

	    TimerTask tarea = new TimerTask() {
	        @Override
	        public void run() {
	            segundos++;
	            int restantes = 60 - segundos;
	            SwingUtilities.invokeLater(() -> {
	                lblSegundos.setText("Segundos restantes: " + restantes);
	            });
	            if (segundos >= 60) {
	                SwingUtilities.invokeLater(() -> {
	                    btnCerrar.setEnabled(true); // activa el botón al acabar
	                    lblSegundos.setText("¡Tiempo cumplido!");
	                });
	                timerLlamada.cancel();
	                timerLlamada = null;
	            }
	        }
	    };

	    timerLlamada.scheduleAtFixedRate(tarea, 0, 1000);
	    dialog.setVisible(true);
	}
	
	public void iniciar() {
	    cargarPregunta();
	}
	
	private void visiblesOpciones() {
		Opcion_A.setVisible(true);
		Opcion_B.setVisible(true);
		Opcion_C.setVisible(true);
		Opcion_D.setVisible(true);
	}
}


