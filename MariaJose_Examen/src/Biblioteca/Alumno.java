package Biblioteca;

public class Alumno extends Persona {
	private int matricula;

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Alumno [matricula=" + matricula + "]";
	}
	

}
