/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;

/**
 *
 * @author Susy03
 */
public class Partido {
	private int hora;
	private Fecha fecha; 
	private Cancha chancha;
	private Equipo equipo; 
	private Equipo oponente; 
	private Boolean AceptaReto;
	private Equipo ganador;
	private String marcador;

	public Partido(int hora, Fecha fecha, Cancha chancha, Equipo equipo, Equipo oponente, Boolean AceptaReto, Equipo ganador, String marcador) {
		this.hora = hora;
		this.fecha = fecha;
		this.chancha = chancha;
		this.equipo = equipo;
		this.oponente = oponente;
		this.AceptaReto = AceptaReto;
		this.ganador = ganador;
		this.marcador = marcador;
	}

	Partido() {
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public Fecha getFecha() {
		return fecha;
	}

	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}

	public Cancha getChancha() {
		return chancha;
	}

	public void setChancha(Cancha chancha) {
		this.chancha = chancha;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	public Equipo getOponente() {
		return oponente;
	}

	public void setOponente(Equipo oponente) {
		this.oponente = oponente;
	}

	public Boolean getAceptaReto() {
		return AceptaReto;
	}

	public void setAceptaReto(Boolean AceptaReto) {
		this.AceptaReto = AceptaReto;
	}

	public Equipo getGanador() {
		return ganador;
	}

	public void setGanador(Equipo ganador) {
		this.ganador = ganador;
	}

	public String getMarcador() {
		return marcador;
	}

	public void setMarcador(String marcador) {
		this.marcador = marcador;
	}
	
}
