package ejer3;

import java.util.ArrayList;

public class Alumno {

	private ArrayList<Asignatura> asignaturas;
	
	public Alumno() {}
	
	public Alumno (ArrayList<Asignatura> asig) {
		this.asignaturas=asig;
	}
	
	
	public Alumno(Asignatura a1, Asignatura a2, Asignatura a3) {
		this.asignaturas.add(a1);
		this.asignaturas.add(a2);
		this.asignaturas.add(a3);
	}
	
	public Alumno(int a1, int a2, int a3) {
		
		this.asignaturas.add(new Asignatura(a1));
		this.asignaturas.add(new Asignatura(a2));
		this.asignaturas.add(new Asignatura(a3));
		
	}
	
	
	//getters
	public ArrayList<Asignatura> getAsignaturas() {
		return asignaturas;
	}
	
	
	
	
	
	
	
}
