/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Susy03
 */
public abstract class Administrador {
	private static final List<Cancha> canchas = new ArrayList<Cancha>(); 
	private static final List<Equipo> equipos = new ArrayList<Equipo>(); 
	private static final Fecha fecha = new Fecha(); 
	private static final Hora hora = new Hora(); 
	private static final Partido Partido = new Partido(); 

	public static List<Cancha> getCanchas() {
		return canchas;
	}

	public static List<Equipo> getEquipos() {
		return equipos;
	}

	public static Fecha getFecha() {
		return fecha;
	}

	public static Hora getHora() {
		return hora;
	}

	public static Partido getPartido() {
		return Partido;
	}
	
	
	
}
