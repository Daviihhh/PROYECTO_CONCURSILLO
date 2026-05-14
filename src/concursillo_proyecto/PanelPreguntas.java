package concursillo_proyecto;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.FindIterable;
import org.bson.Document;

import java.awt.event.ActionEvent;


public class PanelPreguntas extends JPanel {

    private static final long serialVersionUID = 1L;

    public JButton Opcion_A;
    public JButton Opcion_B;
    public JButton Opcion_C;
    public JButton Opcion_D;
    public JTextArea Pregunta;
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

    public JButton VerInfo;
    public JLabel banner_nebula;

    public JLabel lblNewLabel_1;
    
    private boolean escudoActivado = false;


    private JLabel fondoAmarilloPreguntas;
    public JTextField NombrePreguntas;
    public JTextField NivelPreguntas;
    

    private boolean comodinLlamadaUsado = false;
    private javax.swing.Timer timerLlamada;
    public JLabel bloqueTimer;
    
    public PanelPreguntas(CardLayout cardLayout, JPanel contenedor) {
        setBackground(new Color(253, 247, 130));
        setBounds(0, 0, 506, 361);
        setLayout(null);
       
        // El label del timer
        bloqueTimer = new JLabel("");
        bloqueTimer.setBounds(412, 40, 100, 20);
        bloqueTimer.setFont(new Font("Arial", Font.BOLD, 14));
        bloqueTimer.setForeground(new Color(0, 0, 64));
        add(bloqueTimer);
        
        
        gestion = new GestionMongoDB();
        gestion.guardarTema("Juegos");
        gestion.iniciarConcursillo(gestion.getTema());

        Opcion_A = new JButton("");
        Opcion_A.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		comprobarRespuesta(Opcion_A);

       
        	

        	}
        });
        

        
        NivelPreguntas = new JTextField();
        NivelPreguntas.setEditable(false);
        NivelPreguntas.setBounds(244, 15, 86, 20);
        add(NivelPreguntas);
        NivelPreguntas.setColumns(10);
        
        NombrePreguntas = new JTextField();
        NombrePreguntas.setEditable(false);
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

        
        
        Pregunta = new JTextArea();
        Pregunta.setEditable(false);
        Pregunta.setBackground(new Color(160, 254, 219));

        Pregunta.setText("");
        Pregunta.setLineWrap(true);
        Pregunta.setWrapStyleWord(true); //Para que corte las palabras no las letras

        Pregunta.setBounds(100, 167, 300, 49);
        add(Pregunta);

        ImagenConcursillo = new JLabel("");
        ImagenConcursillo.setIcon(new ImageIcon(getClass().getResource("/resource/ConcursilloLogo.png")));
        ImagenConcursillo.setBounds(207, 66, 85, 80);
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

        
        VerInfo = new JButton("") {
            @Override
            public JToolTip createToolTip() {
                JToolTip tooltip = super.createToolTip();
                tooltip.setBackground(new Color(255, 255, 204));
                tooltip.setForeground(Color.BLACK);
                tooltip.setFont(new Font("Tahoma", Font.PLAIN, 11));
                tooltip.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 64), 1));
                return tooltip;
            }
        };
       

        VerInfo.setToolTipText(
            "<html>" +
            "<b>Reglas del Concursillo:</b><br>" +
            "- Escudo: te protege de una respuesta incorrecta.<br>" +
            "- Llamada: tienes 60 segundos de ayuda.<br>" +
            "- Descartar: elimina una opción incorrecta.<br>" +
            "- Cada comodín solo se puede usar una vez." +
            "</html>"
        );
   

        
        
        VerInfo.setIcon(new ImageIcon(PanelPreguntas.class.getResource("/resource/informacion_pequeno.png")));
        VerInfo.setBounds(10, 11, 25, 24);
        add(VerInfo);
        
        Retirarse = new JButton("¿Retirarse?") {
            @Override
            public JToolTip createToolTip() {
                JToolTip tooltip = super.createToolTip();
                tooltip.setBackground(new Color(255, 255, 204));
                tooltip.setForeground(Color.BLACK);
                tooltip.setFont(new Font("Tahoma", Font.PLAIN, 11));
                tooltip.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 64), 1));
                return tooltip;
            }
        };

        Retirarse.setBounds(10, 60, 106, 23);
        Retirarse.setToolTipText(
            "<html>" +
            "<b>Retirate con las preguntas respondidas hasta ahora</b><br>" +
            "- Conseguiras el dinero de las preguntas respondidas.<br>" +
            "- Se te eliminará de la partida actual.<br>" +
            "</html>"
        );
        Retirarse.addActionListener(e -> cardLayout.show(contenedor, Interfaz.FALLAR));
        add(Retirarse);
        
 
        
        banner_nebula = new JLabel("");
        banner_nebula.setIcon(new ImageIcon(PanelPreguntas.class.getResource("/resource/azuloscuronébula.jpg")));
        banner_nebula.setBounds(0, 0, 506, 41);
        add(banner_nebula);
        


        cargarPregunta();
        fondoAmarilloPreguntas = new JLabel("");
        fondoAmarilloPreguntas.setIcon(new ImageIcon(PanelPreguntas.class.getResource("/resource/background-chills.png")));
        fondoAmarilloPreguntas.setBounds(0, 39, 506, 322);
        add(fondoAmarilloPreguntas);
    }
    
    
    private void comodinEscudo(JButton boton) {
        String texto = boton.getText();

        if (texto.equals(preguntaActual.getCorrecta())) {
            System.out.println("Correcto");
            ocultarTimer(); // <-- añadir aquí
            gestion.siguientePregunta();
            cargarPregunta();
        } else {
            System.out.println("Incorrecto pero protegido por el escudo");
            ocultarTimer(); // <-- añadir aquí
            JOptionPane.showMessageDialog(this, "¡El escudo te ha protegido!");
            escudoActivado = false;
            boton.setVisible(false);
        }
    }
	
	private void comodinIncorrecta() {
		boolean seguir = true;
		do {
			int random = (int)(Math.random() * 3);
			if(!preguntaActual.getRespuestas().get(random).equals(preguntaActual.getCorrecta())) {
				seguir = false;
				if(Opcion_A.getText().equals(preguntaActual.getRespuestas().get(random))) {
					Opcion_A.setText("");
				}else if(Opcion_B.getText().equals(preguntaActual.getRespuestas().get(random))) {
					Opcion_B.setText("");
				}else if(Opcion_C.getText().equals(preguntaActual.getRespuestas().get(random))) {
					Opcion_C.setText("");
				}else if(Opcion_D.getText().equals(preguntaActual.getRespuestas().get(random))) {
					Opcion_D.setText("");
				}
			}
		}while(seguir);
	}
	
	int segundos = 0;
	public JButton Retirarse;
	
	private void comodinLlamada() {
	    if (comodinLlamadaUsado) return;
	    comodinLlamadaUsado = true;
	    ComodinLlamada.setEnabled(false);

	    JOptionPane.showMessageDialog(this,
	        "¡Tienes 1 minuto para realizar tu llamada!\nEl temporizador empieza ahora.",
	        "Comodín Llamada",
	        JOptionPane.INFORMATION_MESSAGE);

	    final int[] segundosRestantes = {60};

	    timerLlamada = new javax.swing.Timer(1000, null);
	    timerLlamada.addActionListener(e -> {
	        segundosRestantes[0]--;
	        bloqueTimer.setText("Llamada: " + segundosRestantes[0] + "s");

	        if (segundosRestantes[0] <= 10) {
	            bloqueTimer.setForeground(Color.RED);
	        }

	        if (segundosRestantes[0] <= 0) {
	            timerLlamada.stop();
	            bloqueTimer.setText("¡Tiempo!");
	            JOptionPane.showMessageDialog(null,
	                "¡Se acabó el tiempo de llamada!",
	                "Comodín Llamada",
	                JOptionPane.WARNING_MESSAGE);
	        }
	    });
	    timerLlamada.start();
	}
	
	
	// La llamada deja de funcionar cuando respondes una respuesta
	private void ocultarTimer() {
	    if (timerLlamada != null) {
	        timerLlamada.stop();
	        timerLlamada = null;
	    }
	    bloqueTimer.setText("");
	    bloqueTimer.setForeground(new Color(0, 0, 64)); // resetea el color rojo si estaba
	}
	
	// PON esto:
	private void cargarPregunta() {
		
		//al cambiar pregunta eltimer desaparece
		ocultarTimer();
	    preguntaActual = gestion.getPreguntaActual();
	    if (preguntaActual == null) {
	        JOptionPane.showMessageDialog(this, "¡Has terminado el concursillo!");
	        return;
	    }
	    Pregunta.setText(preguntaActual.getEnunciado());
	    Opcion_A.setText(preguntaActual.getRespuestas().get(0));
	    Opcion_B.setText(preguntaActual.getRespuestas().get(1));
	    Opcion_C.setText(preguntaActual.getRespuestas().get(2));
	    Opcion_D.setText(preguntaActual.getRespuestas().get(3));
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
	
	
	// Cambio este metodo para que el escudo se desactive cuando clickes cualquier respuesta
	private void comprobarRespuesta(JButton boton) {
	    if (escudoActivado) {
	        comodinEscudo(boton);
	        ocultarTimer(); // añadir aqui
	        return;
	    }

	    String texto = boton.getText();
	    if (texto.equals(preguntaActual.getCorrecta())) {
	        System.out.println("Correcto");
	        gestion.siguientePregunta();
	        cargarPregunta();
	        cajasRespuestaVisibles();
	        ocultarTimer(); // añadir aqui
	    } else {
	        System.out.println("Incorrecto");
	        ocultarTimer(); // añadir aqui
	    }
	}
	
	private void cajasRespuestaVisibles() {
		Opcion_A.setVisible(true);
        Opcion_B.setVisible(true);
        Opcion_C.setVisible(true);
        Opcion_D.setVisible(true);
	}
}