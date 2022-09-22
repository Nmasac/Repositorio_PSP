package ejer3;

public class Asignatura {

	private int id;
	private double calificacion;
	
	public Asignatura() {}
	
	public Asignatura(int id) {
		this.id=id;
	}

	//setter
	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}
	
	//getters
	public int getId() {
		return id;
	}

	public double getCalificacion() {
		return calificacion;
	}
	
	
	
	

	
	
	
}
