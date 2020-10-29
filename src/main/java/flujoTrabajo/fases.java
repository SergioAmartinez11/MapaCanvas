package flujoTrabajo;

import java.util.*;

public class fases {

	private String nombre;
	private ArrayList<FlujoTrabajo> flujoTrabajo;
	private ArrayList<Tarea> tareas;

	public fases(String nombre, ArrayList<FlujoTrabajo> flujoTrabajo, ArrayList<Tarea> tareas) {
		this.nombre = nombre;
		this.flujoTrabajo = flujoTrabajo;
		this.tareas = new ArrayList<Tarea>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<FlujoTrabajo> getFlujoTrabajo() {
		return flujoTrabajo;
	}

	public void setFlujoTrabajo(ArrayList<FlujoTrabajo> flujoTrabajo) {
		this.flujoTrabajo = flujoTrabajo;
	}

	public ArrayList<Tarea> getTareas() {
		return tareas;
	}

	public void setTareas(ArrayList<Tarea> tareas) {
		this.tareas = tareas;
	}

	@Override
	public String toString() {
		return "fases{" +
				"nombre='" + nombre + '\'' +
				'}';
	}
}