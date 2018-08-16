
package tarea;

import javafx.beans.property.SimpleStringProperty;


public class Equipo extends Usuario{
    private int promedioDeRendimientol;
    private int posiciónEnElRanking;
    private String nombreEquipo;
	private int puntos;

    public Equipo() {
    }

	public Equipo(int promedioDeRendimiento1,int puntos,String nombreEquipo)
	{
		this.promedioDeRendimientol=promedioDeRendimiento1;
		this.puntos=puntos;
		this.nombreEquipo=nombreEquipo;
	}

	public Equipo(int promedioDeRendimientol, int posiciónEnElRanking, String nombreEquipo, int puntos) {
		this.promedioDeRendimientol = promedioDeRendimientol;
		this.posiciónEnElRanking = posiciónEnElRanking;
		this.nombreEquipo = nombreEquipo;
		this.puntos = puntos;
	}
	
	
    public int getPromedioDeRendimientol() {
        return promedioDeRendimientol;
    }

    public void setPromedioDeRendimientol(int promedioDeRendimientol) {
        this.promedioDeRendimientol = promedioDeRendimientol;
    }

    public int getPosiciónEnElRanking() {
        return posiciónEnElRanking;
    }

    public void setPosiciónEnElRanking(int posiciónEnElRanking) {
        this.posiciónEnElRanking = posiciónEnElRanking;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }
	public int getPuntos()
	{
		return this.puntos;
	}
	public void setPuntos(int puntos)
	{
		this.puntos=puntos;
	}
    
}
