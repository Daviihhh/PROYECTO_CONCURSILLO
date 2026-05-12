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
    

    public PanelPreguntas(CardLayout cardLayout, JPanel contenedor) {
        setBackground(new Color(253, 247, 130));
        setLayout(null);
        
        tema = "Futbol";
     // ✅ Al crear la instancia ya se conecta y carga las preguntas
        GestionMongoDB gestion = new GestionMongoDB();
        gestion.guardarTema("Electromedicina"); // el tema que corresponda

        ArrayList<Pregunta> preguntas = GestionMongoDB.obtenerPreguntaAleatoria(gestion.getTema());

        if (preguntas.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                "No hay preguntas disponibles para esta temática.",
                "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Opcion_A = new JButton("");
        Opcion_A.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		comprobarRespuesta(Opcion_A);
        	}
        });
        Opcion_A.setBackground(new Color(160, 254, 219));
        Opcion_A.setBounds(41, 247, 175, 23);
        add(Opcion_A);
        

        Opcion_B = new JButton("");
        Opcion_B.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		comprobarRespuesta(Opcion_B);
        	}
        });
        Opcion_B.setBackground(new Color(160, 254, 219));
        Opcion_B.setBounds(290, 247, 175, 23);
        add(Opcion_B);

        Opcion_C = new JButton("");
        Opcion_C.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		comprobarRespuesta(Opcion_C);
        	}
        });
        Opcion_C.setBackground(new Color(160, 254, 219));
        Opcion_C.setBounds(41, 281, 175, 23);
        add(Opcion_C);

        Opcion_D = new JButton("");
        Opcion_D.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		comprobarRespuesta(Opcion_D);
        	}
        });
        Opcion_D.setBackground(new Color(160, 254, 219));
        Opcion_D.setBounds(290, 281, 175, 23);
        add(Opcion_D);

        Pregunta = new JTextField();
        Pregunta.setEditable(false);
        Pregunta.setBackground(new Color(160, 254, 219));
        Pregunta.setText("");
        Pregunta.setBounds(85, 205, 337, 31);
        Pregunta.setColumns(10);
        add(Pregunta);

        ImagenConcursillo = new JLabel("");
        ImagenConcursillo.setIcon(new ImageIcon(getClass().getResource("/resource/ConcursilloLogo.png")));
        ImagenConcursillo.setBounds(208, 97, 85, 80);
        add(ImagenConcursillo);

        ComodinProteccion = new JButton("");
        ComodinProteccion.setIcon(new ImageIcon(getClass().getResource("/resource/escudo.png")));
        ComodinProteccion.setBounds(372, 11, 25, 24);
        add(ComodinProteccion);

        ComodinLlamada = new JButton("");
        ComodinLlamada.setIcon(new ImageIcon(getClass().getResource("/resource/llamada.png")));
        ComodinLlamada.setBounds(422, 11, 25, 24);
        add(ComodinLlamada);

        ComodinDescartarOpcion = new JButton("");
        ComodinDescartarOpcion.setIcon(new ImageIcon(getClass().getResource("/resource/Eliminar.png")));
        ComodinDescartarOpcion.setBounds(471, 11, 25, 24);
        add(ComodinDescartarOpcion);

        Salir = new JButton("");
        Salir.setIcon(new ImageIcon(getClass().getResource("/resource/salir.png")));
        Salir.setBounds(10, 11, 25, 24);
        Salir.addActionListener(e -> cardLayout.show(contenedor, Interfaz.INICIO));
        add(Salir);

        VerDinero = new JButton("");
        VerDinero.setIcon(new ImageIcon(getClass().getResource("/resource/verDinero.png")));
        VerDinero.setBounds(56, 11, 25, 24);
        VerDinero.addActionListener(e -> cardLayout.show(contenedor, Interfaz.DINERO));
        add(VerDinero);
            
    }
    
    
    private void comodinEscudo() {
		//tengo que hacer que si pinchas en una opcion incorrecta, el escudo te proteja de algún modo
		
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
	private void comodinLlamada() {
		System.out.println("COMIENZA LA LLAMADA");
		Timer timer = new Timer();
        
        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                segundos++; // Incrementamos el contador
                System.out.println("Segundos transcurridos: " + segundos);
                if (segundos >= 60) {
                    System.out.println("¡Tiempo cumplido! Deteniendo...");
                    timer.cancel(); // Esto apaga el timer por completo
                }
            }
        };
        
        // 1000 --> ms (1 segundo = 1000 ms) | 0 --> retraso en iniciar la acción
        timer.scheduleAtFixedRate(tarea, 0, 1000);
	}
	
	private void cargarPregunta(int numero) {
		 	
		preguntas = GestionMongoDB.obtenerPreguntaAleatoria(tema); //preguntas en el arrayli
	    
	    preguntaActual = preguntas.get(numero); //este numero me lo tiene que pasar el metodo del concursillo

		Pregunta.setText(preguntaActual.getEnunciado());

	    Opcion_A.setText(preguntaActual.getRespuestas().get(0));
	    Opcion_B.setText(preguntaActual.getRespuestas().get(1));
	    Opcion_C.setText(preguntaActual.getRespuestas().get(2));
	    Opcion_D.setText(preguntaActual.getRespuestas().get(3)); //tengo que pedirle que si el que pincha coincide con el correcto,
	    														 //limpie las opciones, la pregunta, y que sume uno (metodo aparte)
	}
	
	private void presionarCuandoEscudo(JButton botonPulsado) {

	    String respuestaUsuario = botonPulsado.getText();

	    if(!respuestaUsuario.equals(preguntaActual.getCorrecta())) {
	    	botonPulsado.setText("[RESPUESTA INCORRECTA DESTRUIDA]");
	    }
	}
	
	private void presionarRespuesta(JButton botonPulsado) {

	    String respuestaUsuario = botonPulsado.getText();

	    if(respuestaUsuario.equals(preguntaActual.getCorrecta())) {
	        
	    	
	    } else {

	        System.out.println("Incorrecto");
	    }
	}
	
	public void Concursillo() {
		
		ActionListener listenerOpciones = e -> {
			JButton boton = (JButton) e.getSource(); //e.getSource devuelve el botón pulsado
		};
		
		Opcion_A.addActionListener(listenerOpciones);
		Opcion_B.addActionListener(listenerOpciones);
		Opcion_C.addActionListener(listenerOpciones);
		Opcion_D.addActionListener(listenerOpciones);
		
		//COMODIN ESCUDO
		/*ActionListener listenerEscudo  = e -> {
			JButton comodinEscudo
			presionarCuandoEscudo(boton);
		}*/
	}
	
	private void comprobarRespuesta(JButton boton) {

	    String texto = boton.getText();

	    if(texto.equals(preguntaActual.getCorrecta())) {

	        System.out.println("Correcto");

	    } else {

	        System.out.println("Incorrecto");
	    }
	}

}