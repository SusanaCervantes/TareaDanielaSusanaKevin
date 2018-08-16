/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author tvkev
 */
public class Cancha extends Usuario {
    private int teléfono;
    private int costoDía;
    private int costoNoche;
    private int cantJugadoresPorEjemplo;
    private float Coordenadas;
	private String nombreCancha;
    private List<Fecha> Horario;
	private List<Partido> partidos; 

	public Cancha(int teléfono, int costoDía, int costoNoche, int cantJugadoresPorEjemplo, float Coordenadas, String nombreCancha, List<Fecha> Horario, List<Partido> partidos) {
		this.teléfono = teléfono;
		this.costoDía = costoDía;
		this.costoNoche = costoNoche;
		this.cantJugadoresPorEjemplo = cantJugadoresPorEjemplo;
		this.Coordenadas = Coordenadas;
		this.nombreCancha = nombreCancha;
		this.Horario = Horario;
		this.partidos = partidos;
	}
	
	public Cancha(int teléfono, int costoDía, int costoNoche, int cantJugadoresPorEjemplo, float Coordenadas, String nombreCancha, List<Fecha> Horario) {
		this.teléfono = teléfono;
		this.costoDía = costoDía;
		this.costoNoche = costoNoche;
		this.cantJugadoresPorEjemplo = cantJugadoresPorEjemplo;
		this.Coordenadas = Coordenadas;
		this.nombreCancha = nombreCancha;
		this.Horario = Horario;
	}

    public Cancha() {
    }

    public int getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(int teléfono) {
        this.teléfono = teléfono;
    }

    public int getCostoDía() {
        return costoDía;
    }

    public void setCostoDía(int costoDía) {
        this.costoDía = costoDía;
    }

    public int getCostoNoche() {
        return costoNoche;
    }

    public void setCostoNoche(int costoNoche) {
        this.costoNoche = costoNoche;
    }

    public int getCantJugadoresPorEjemplo() {
        return cantJugadoresPorEjemplo;
    }

    public void setCantJugadoresPorEjemplo(int cantJugadoresPorEjemplo) {
        this.cantJugadoresPorEjemplo = cantJugadoresPorEjemplo;
    }

    public float getCoordenadas() {
        return Coordenadas;
    }

    public void setCoordenadas(float Coordenadas) {
        this.Coordenadas = Coordenadas;
    }

    public List<Fecha> getHorario() {
        return Horario;
    }

    public void setHorario(List<Fecha> Horario) {
        this.Horario = Horario;
    }

	public String getNombreCancha() {
		return nombreCancha;
	}

	public void setNombreCancha(String nombreCancha) {
		this.nombreCancha = nombreCancha;
	}

	public List<Partido> getPartidos() {
		return partidos;
	}

	public void setPartidos(List<Partido> partidos) {
		this.partidos = partidos;
	}
    
    
}
