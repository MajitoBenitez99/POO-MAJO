package Biblioteca;

public class Profesor extends Alumno {
	
	private int especialidad;

	public int getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(int especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return "Profesor [especialidad=" + especialidad + "]";
	}
	

}
