package Biblioteca;

public class Biblioteca {
	String nombre,horario;
	int numero_prestamo = 0;
	Material [] material = null;
	Persona [] persona = null;
	Prestamo []prestamo = null;
	
	public Biblioteca() {
		nombre= "Superbiblio";
		horario = " LUNES A VIERNES de 8 a 15 horas;";
		material[0] = new Libro(123,"julio Vernne","Viaje al interior de la tierra",1970,"disponible",96325);
		persona [0] = new Alumno(462,"moises","0961","moises@snpp.edu.py",1000)	;
		
		prestarMaterial(material [0], persona [0]);
		verMaterialesPrestados();		
	}
	private void verMaterialesPrestados() {
		System.out.println(prestamo [0].toString());			
	}
	private void prestarMaterial(Material m, Persona p) {
		prestamo[numero_prestamos] = new Prestamo(m,p "24/05/24","");
		numero_prestamos++;
	}
	public static void main(String []args) {
		new Biblioteca ();
	}
} 
    