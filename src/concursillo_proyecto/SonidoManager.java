package concursillo_proyecto;

import javax.sound.sampled.*;
import java.io.IOException;
import java.net.URL;

public class SonidoManager {

    private static Clip musicaFondo;

    // Reproduce en bucle
    public static void reproducirMusica(String ruta) {
        try {
            detenerMusica(); 
            URL url = SonidoManager.class.getResource(ruta);
            AudioInputStream audio = AudioSystem.getAudioInputStream(url);
            musicaFondo = AudioSystem.getClip();
            musicaFondo.open(audio);
            musicaFondo.loop(Clip.LOOP_CONTINUOUSLY); // el bucle
            musicaFondo.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    // Para la música
    public static void detenerMusica() {
        if (musicaFondo != null && musicaFondo.isRunning()) {
            musicaFondo.stop();
            musicaFondo.close();
        }
    }

    // Efecto de sonido puntual (botones)
    public static void reproducirEfecto(String ruta) {
        try {
            URL url = SonidoManager.class.getResource(ruta);
            AudioInputStream audio = AudioSystem.getAudioInputStream(url);
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
    
    public static void reproducirMusicaSiNoSuena(String ruta) {
        if (musicaFondo == null || !musicaFondo.isRunning()) {
            reproducirMusica(ruta);
        }
    }
}