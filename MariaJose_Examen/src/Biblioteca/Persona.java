package Biblioteca;
 	public abstract class Persona{
 		private int cedula; 
 		private String correo;
 		private String telefono;
		public Persona() {
			super();
		}
		public Persona(int cedula, String correo, String telefono) {
			super();
			this.cedula = cedula;
			this.correo = correo;
			this.telefono = telefono;
		}
		public int getCedula() {
			return cedula;
		}
		public void setCedula(int cedula) {
			this.cedula = cedula;
		}
		public String getCorreo() {
			return correo;
		}
		public void setCorreo(String correo) {
			this.correo = correo;
		}
		public String getTelefono() {
			return telefono;
		}
		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}
		@Override
		public String toString() {
			return "Persona [cedula=" + cedula + ", correo=" + correo + ", telefono=" + telefono + "]";
		} 


}

    