package flujoTrabajo;

public class Tarea {

	private String nombre;
	private fases fase;
	private FlujoTrabajo flujoTrabajo;
	private Actividades actividad;

	public Tarea(String nombre, fases fase, FlujoTrabajo flujoTrabajo, Actividades actividad) {
		this.nombre = nombre;
		this.fase = fase;
		this.flujoTrabajo = flujoTrabajo;
		this.actividad = actividad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public fases getFase() {
		return fase;
	}

	public void setFase(fases fase) {
		this.fase = fase;
	}

	public FlujoTrabajo getFlujoTrabajo() {
		return flujoTrabajo;
	}

	public void setFlujoTrabajo(FlujoTrabajo flujoTrabajo) {
		this.flujoTrabajo = flujoTrabajo;
	}

	public Actividades getActividad() {
		return actividad;
	}

	public void setActividad(Actividades actividad) {
		this.actividad = actividad;
	}

	@Override
	public String toString() {
		return "Tarea{" +
				"nombre='" + nombre + '\'' +
				'}';
	}
}