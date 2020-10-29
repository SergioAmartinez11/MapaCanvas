package flujoTrabajo;

import java.util.*;

public class Actividades {

	private String nombre;
	private FlujoTrabajo flujoTrabajo;
	private ArrayList<Tarea> tareas;

	public Actividades(String nombre, FlujoTrabajo flujoTrabajo, ArrayList<Tarea> tareas) {
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

	public FlujoTrabajo getFlujoTrabajo() {
		return flujoTrabajo;
	}

	public void setFlujoTrabajo(FlujoTrabajo flujoTrabajo) {
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
		return "Actividades{" +
				"nombre='" + nombre + '\'' +
				'}';
	}
}