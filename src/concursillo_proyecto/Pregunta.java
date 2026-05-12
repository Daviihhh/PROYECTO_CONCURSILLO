package concursillo_proyecto;

import java.util.*;
public class Pregunta {

    private String enunciado;
    private ArrayList <String> respuestas = new ArrayList <String>();
    private String correcta;
    private String tematica;
    private int dificultad;

    public Pregunta ( String enunciado,ArrayList <String> respuestas,String correcta, String tematica, int dificultad) {

        this.enunciado=enunciado;
        this.respuestas=respuestas;
        this.correcta=correcta;
        this.tematica=tematica;
        this.dificultad=dificultad;
    }


	public String getEnunciado() {
		return enunciado;
	}


	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}


	public ArrayList<String> getRespuestas() {
		return respuestas;
	}


	public void setRespuestas(ArrayList<String> respuestas) {
		this.respuestas = respuestas;
	}


	public String getCorrecta() {
		return correcta;
	}


	public void setCorrecta(String correcta) {
		this.correcta = correcta;
	}


	public String getTematica() {
		return tematica;
	}


	public void setTematica(String tematica) {
		this.tematica = tematica;
	}


	public int getDificultad() {
		return dificultad;
	}


	public void setDificultad(int dificultad) {
		this.dificultad = dificultad;
	}


	@Override
	public String toString() {
		return "Enunciado:" + enunciado + "| Respuestas:" + respuestas + "| Respuesta correcta:" + correcta
				+ "| Teáatica:" + tematica + "| Dificultad:" + dificultad + "";
	}




}
