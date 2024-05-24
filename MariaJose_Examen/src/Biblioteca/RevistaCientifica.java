package Biblioteca;

public class RevistaCientifica extends Material {
	
private String areacientifica;

	
	public RevistaCientifica() {
	super();
}
	
	public RevistaCientifica(int codigo, String autor, String titulo, int anio, String estado, String areacientifica) {
		super(codigo, autor, titulo, anio, estado);
		this.areacientifica = areacientifica;
	}

	public String RevistaCientifica (){
		return areacientifica;
	
	}
	public void setAreaCientifica(String areacientifica ) {
		this.areacientifica = areacientifica;
	}
	@Override
	public String toString() {
		return "RevistaCientifica [areacientifica=" + areacientifica + "]";
	}
	

}


