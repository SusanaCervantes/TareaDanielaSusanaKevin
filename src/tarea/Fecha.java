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
public class Fecha {
    private LocalDate fecha;
    private List<Hora> hora;

    public Fecha() {
    }

	public Fecha(LocalDate fecha, List<Hora> hora) {
		this.fecha = fecha;
		this.hora = hora;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
    public List<Hora> getHora() {
        return hora;
    }

    public void setHora(List<Hora> hora) {
        this.hora = hora;
    }
    
}
