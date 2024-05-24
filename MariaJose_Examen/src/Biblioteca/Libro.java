package Biblioteca;

public class Libro extends Material {
	private String editorial;
	
	public String getEditorial () {
		return editorial;
	
	}
	public void setEditorial(String Editorial ) {
		this.editorial = editorial;
	}
	@Override
	public String toString() {
		return "Libro [editorial=" + editorial + "]";
	}
	

}
