package bean;

public class DuenoBean {
	
	private int rut, telefono;
	private String nombre, apellido, direccion, correo, nombreMascota;
	
	public DuenoBean() {		
	}
	
	public DuenoBean(int rut, int telefono, String nombre, String apellido, String direccion, String correo,
			String nombreMascota) {
		super();
		this.rut = rut;
		this.telefono = telefono;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.correo = correo;
		this.nombreMascota = nombreMascota;
	}


	public int getRut() {
		return rut;
	}


	public void setRut(int rut) {
		this.rut = rut;
	}


	public int getTelefono() {
		return telefono;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getNombreMascota() {
		return nombreMascota;
	}


	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
	}


	@Override
	public String toString() {
		return "DuenoBean [rut=" + rut + ", telefono=" + telefono + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", direccion=" + direccion + ", correo=" + correo + ", nombreMascota=" + nombreMascota + "]";
	}
	
	
}
