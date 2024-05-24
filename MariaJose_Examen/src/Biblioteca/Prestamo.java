package Biblioteca;

public class Prestamo {

		private Material material;
		private Persona prestatario;
		private String fechadesalida;
		private String fechaderegreso;
		
		public Prestamo(Material material, Persona prestatario, String fechadesalida, String fechaderegreso) {
			super();
			this.material = material;
			this.prestatario = prestatario;
			this.fechadesalida = fechadesalida;
			this.fechaderegreso = fechaderegreso;
		
		
	}	
}