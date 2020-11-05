package flujoTrabajo;

import java.util.*;

public class Fases {

	private String nombre;
	private ArrayList<Tarea> tareas;

	public Fases(String nombre, ArrayList<Tarea> tareas) {
		this.nombre = nombre;
		this.tareas = new ArrayList<Tarea>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Tarea> getTareas() {
		return tareas;
	}

	public void setTareas(ArrayList<Tarea> tareas) {
		this.tareas = tareas;
	}

	@Override
	public String toString() {
		return nombre;

	}
}