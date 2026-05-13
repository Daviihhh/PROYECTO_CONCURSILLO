package concursillo_proyecto;

import java.util.*;

public class Usuario {

    private String nombre, DNI, password;
    private int puntuacion;
  


    public Usuario ( String nombre, String DNI, String password,int puntuacion) {

        this.nombre=nombre;
        this.DNI=DNI;
        this.puntuacion=puntuacion;
        this.password=password;
    }


    public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getDNI() {
        return DNI;
    }


    public void setDNI(String dNI) {
        DNI = dNI;
    }


    public int getPuntuacion() {
        return puntuacion;
    }


    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }


	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", DNI=" + DNI + ", password=" + password + ", puntuacion=" + puntuacion
				+ "]";
	}


   
}
