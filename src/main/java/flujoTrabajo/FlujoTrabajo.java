package flujoTrabajo;

import java.util.*;

public class FlujoTrabajo {

	private String nombre;
	private ArrayList<fases> fases;
	private ArrayList<Actividades> actividades;
	private ArrayList<Tarea> tareas;

	public FlujoTrabajo(String nombre, ArrayList<flujoTrabajo.fases> fases, ArrayList<Actividades> actividades, ArrayList<Tarea> tareas) {
		this.nombre = nombre;
		this.fases = fases;
		this.actividades = actividades;
		this.tareas = tareas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<flujoTrabajo.fases> getFases() {
		return fases;
	}

	public void setFases(ArrayList<flujoTrabajo.fases> fases) {
		this.fases = fases;
	}

	public ArrayList<Actividades> getActividades() {
		return actividades;
	}

	public void setActividades(ArrayList<Actividades> actividades) {
		this.actividades = actividades;
	}

	public ArrayList<Tarea> getTareas() {
		return tareas;
	}

	public void setTareas(ArrayList<Tarea> tareas) {
		this.tareas = tareas;
	}

	@Override
	public String toString() {
		return "FlujoTrabajo{" +
				"nombre='" + nombre + '\'' +
				", fases=" + fases +
				", actividades=" + actividades +
				", tareas=" + tareas +
				'}';
	}
}