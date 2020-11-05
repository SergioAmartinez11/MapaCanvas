package flujoTrabajo;

import javax.swing.plaf.basic.BasicComboBoxUI;

public class Tarea {

	private String nombre;
	private String fase;

	public Tarea(String nombre, String fase) {
		this.nombre = nombre;
		this.fase = fase;

	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() { return nombre; }

	public String getFase() {
		return fase;
	}

	public void setFase(String fase) {
		this.fase = fase;
	}


	@Override
	public String toString() {
		return nombre;
	}
}