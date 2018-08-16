/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;

/**
 *
 * @author tvkev
 */
public class Hora {
    private int horaApartada;//para apartar una hora
    private boolean disponible;
    private int horaAperturaEntreSemana;
    private int horaCierreEntreSemana;
    private int horaAperturaSábado;
    private int horaCierreSábado;
    private int horaAperturaDomingo;
    private int horaCierreDomingo;

	public Hora(int horaApartada, boolean disponible, int horaAperturaEntreSemana, int horaCierreEntreSemana, int horaAperturaSábado, int horaCierreSábado, int horaAperturaDomingo, int horaCierreDomingo) {
		this.horaApartada = horaApartada;
		this.disponible = disponible;
		this.horaAperturaEntreSemana = horaAperturaEntreSemana;
		this.horaCierreEntreSemana = horaCierreEntreSemana;
		this.horaAperturaSábado = horaAperturaSábado;
		this.horaCierreSábado = horaCierreSábado;
		this.horaAperturaDomingo = horaAperturaDomingo;
		this.horaCierreDomingo = horaCierreDomingo;
	}
	
    public Hora() {
    }

    public int getHoraApartada() {
        return horaApartada;
    }

    public void setHoraApartada(int horaApartada) {
        this.horaApartada = horaApartada;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getHoraAperturaEntreSemana() {
        return horaAperturaEntreSemana;
    }

    public void setHoraAperturaEntreSemana(int horaAperturaEntreSemana) {
        this.horaAperturaEntreSemana = horaAperturaEntreSemana;
    }

    public int getHoraCierreEntreSemana() {
        return horaCierreEntreSemana;
    }

    public void setHoraCierreEntreSemana(int horaCierreEntreSemana) {
        this.horaCierreEntreSemana = horaCierreEntreSemana;
    }

    public int getHoraAperturaSábado() {
        return horaAperturaSábado;
    }

    public void setHoraAperturaSábado(int horaAperturaSábado) {
        this.horaAperturaSábado = horaAperturaSábado;
    }

    public int getHoraCierreSábado() {
        return horaCierreSábado;
    }

    public void setHoraCierreSábado(int horaCierreSábado) {
        this.horaCierreSábado = horaCierreSábado;
    }

    public int getHoraAperturaDomingo() {
        return horaAperturaDomingo;
    }

    public void setHoraAperturaDomingo(int horaAperturaDomingo) {
        this.horaAperturaDomingo = horaAperturaDomingo;
    }

    public int getHoraCierreDomingo() {
        return horaCierreDomingo;
    }

    public void setHoraCierreDomingo(int horaCierreDomingo) {
        this.horaCierreDomingo = horaCierreDomingo;
    }
    
}
