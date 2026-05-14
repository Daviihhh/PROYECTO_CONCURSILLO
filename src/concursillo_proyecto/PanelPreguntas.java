package concursillo_proyecto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TimerTask;
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
    public JButton Retirarse;

    public Pregunta preguntaActual;
    public ArrayList<Pregunta> preguntas;
    public String tema;
    private GestionMongoDB gestion;
    private JPanel contenedor;
    private CardLayout cardLayout;

    public JButton VerInfo;
    public JLabel banner_nebula;
    public JLabel lblNewLabel_1;

    private boolean escudoActivado = false;
    private boolean comodinLlamadaUsado = false;

    private JLabel fondoAmarilloPreguntas;
    public JTextField NombrePreguntas;
    public JTextField NivelPreguntas;
    public JLabel bloqueTimer;

    private PanelDinero panelDinero;
    private PanelFallar panelFallar;

    private javax.swing.Timer timerLlamada = null;

    public PanelPreguntas(CardLayout cardLayout, JPanel contenedor, PanelDinero panelDinero, GestionMongoDB gestion, PanelFallar panelFallar) {

        setBackground(new Color(253, 247, 130));
        setBounds(0, 0, 506, 361);
        setLayout(null);

        this.panelFallar = panelFallar;
        this.cardLayout = cardLayout;
        this.contenedor = contenedor;
        this.panelDinero = panelDinero;
        this.gestion = gestion;

        // Label del timer
        bloqueTimer = new JLabel("");
        bloqueTimer.setBounds(412, 40, 100, 20);
        bloqueTimer.setFont(new Font("Arial", Font.BOLD, 14));
        bloqueTimer.setForeground(new Color(0, 0, 64));
        add(bloqueTimer);

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

        Opcion_A = new JButton("");
        Opcion_A.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                comprobarRespuesta(Opcion_A);
            }
        });
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
        Pregunta.setWrapStyleWord(true);
        Pregunta.setBounds(100, 167, 300, 49);
        add(Pregunta);

        ImagenConcursillo = new JLabel("");
        ImagenConcursillo.setIcon(new ImageIcon(getClass().getResource("/resource/ConcursilloLogo.png")));
        ImagenConcursillo.setBounds(207, 66, 85, 80);
        add(ImagenConcursillo);

        ComodinProteccion = new JButton("");
        ComodinProteccion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SonidoManager.reproducirEfecto("/resource/click_cortao.wav");
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
                ComodinLlamada.setEnabled(false);
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

        VerDinero = new JButton("");
        VerDinero.setIcon(new ImageIcon(getClass().getResource("/resource/verDinero.png")));
        VerDinero.setBounds(56, 11, 25, 24);
        VerDinero.addActionListener(e -> {
            SonidoManager.reproducirEfecto("/resource/click_cortao.wav");
            cardLayout.show(contenedor, Interfaz.DINERO);
        });
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
        Retirarse.addActionListener(e -> {
            SonidoManager.reproducirEfecto("/resource/click_cortao.wav");
            Usuario usuario = new Usuario(
                gestion.getNombreUsuarioActual(),
                gestion.getDniUsuarioActual(),
                gestion.getContrasenaUsuarioActual(),
                gestion.getPuntuacion()
            );
            gestion.guardarUsuario(usuario);
            panelFallar.mostrarResultado("retirar", gestion.getPuntuacion());
            cardLayout.show(contenedor, Interfaz.FALLAR);
        });
        add(Retirarse);

        banner_nebula = new JLabel("");
        banner_nebula.setIcon(new ImageIcon(PanelPreguntas.class.getResource("/resource/azuloscuronébula.jpg")));
        banner_nebula.setBounds(0, 0, 506, 41);
        add(banner_nebula);

        fondoAmarilloPreguntas = new JLabel("");
        fondoAmarilloPreguntas.setIcon(new ImageIcon(PanelPreguntas.class.getResource("/resource/background-chills.png")));
        fondoAmarilloPreguntas.setBounds(0, 39, 506, 322);
        add(fondoAmarilloPreguntas);

        addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentShown(java.awt.event.ComponentEvent e) {
              
                SonidoManager.reproducirMusicaSiNoSuena("/resource/malenia_lofi.wav");
            }

            @Override
            public void componentHidden(java.awt.event.ComponentEvent e) {
                SonidoManager.reproducirMusica("/resource/DoG_lofi.wav");
            }
        });
    }

    // --- COMODINES ---

    private void comodinEscudo(JButton boton) {
        String texto = boton.getText();
        if (texto.equals(preguntaActual.getCorrecta())) {
            System.out.println("Correcto");
            ocultarTimer();
            gestion.siguientePregunta();
            gestion.sumarPunto();
            System.out.println("Puntuacion actual: " + gestion.getPuntuacion()); // añade aquí
            cargarPregunta();
        } else {
            System.out.println("Incorrecto pero protegido por el escudo");
            ocultarTimer();
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

        int random = (int)(Math.random() * candidatos.size());
        candidatos.get(random).setVisible(false);
    }

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

    private void ocultarTimer() {
        if (timerLlamada != null) {
            timerLlamada.stop();
            timerLlamada = null;
        }
        bloqueTimer.setText("");
        bloqueTimer.setForeground(new Color(0, 0, 64));
    }

    // --- CARGA DE PREGUNTAS ---

    private void cargarPregunta() {
        ocultarTimer();
        visiblesOpciones();
        preguntaActual = gestion.getPreguntaActual();
        if (preguntaActual == null) {
        	int puntuacionFinal = gestion.getPuntuacion();
        	
            Usuario usuario = new Usuario(
                gestion.getNombreUsuarioActual(),
                gestion.getDniUsuarioActual(),
                gestion.getContrasenaUsuarioActual(),
                puntuacionFinal
            );
            gestion.guardarUsuario(usuario);
            panelFallar.mostrarResultado("ganar", gestion.getPuntuacion());
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

    private void visiblesOpciones() {
        Opcion_A.setVisible(true);
        Opcion_B.setVisible(true);
        Opcion_C.setVisible(true);
        Opcion_D.setVisible(true);
    }

    // --- RESPUESTA ---

    private void comprobarRespuesta(JButton boton) {
        if (escudoActivado) {
            comodinEscudo(boton);
            return;
        }

        String texto = boton.getText();
        if (texto.equals(preguntaActual.getCorrecta())) {
            System.out.println("Correcto");
            ocultarTimer();
            gestion.siguientePregunta();
            gestion.sumarPunto();
            cargarPregunta();
        } else { //HAS PERDIDO. NO SE GUARDA NADA
            System.out.println("Incorrecto");
            ocultarTimer();
            int puntuacionFinal = gestion.getPuntuacion();
            System.out.println("Puntuacion antes de mostrar: " + gestion.getPuntuacion());
            panelFallar.mostrarResultado("perder", puntuacionFinal);
            cardLayout.show(contenedor, Interfaz.FALLAR);
        }
    }

    // --- PUBLICOS ---

    public void actualizarNombre() {
        NombrePreguntas.setText(gestion.getNombreUsuarioActual());
    }

    public void iniciar() {
    	SonidoManager.reproducirMusica("/resource/malenia_lofi.wav");
        cargarPregunta();
    }
}