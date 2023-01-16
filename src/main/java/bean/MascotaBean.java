package bean;

public class MascotaBean {
	
	private int rutDueno, edad;
	private String tipoMascota,nombreMascota;
	
	public MascotaBean() {
		
	}
	public MascotaBean(int rutDueno, int edad, String tipoMascota, String nombreMascota) {
		super();
		this.rutDueno = rutDueno;
		this.edad = edad;
		this.tipoMascota = tipoMascota;
		this.nombreMascota = nombreMascota;
	}
	public int getRutDueno() {
		return rutDueno;
	}
	public void setRutDueno(int rutDueño) {
		this.rutDueno = rutDueño;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getTipoMascota() {
		return tipoMascota;
	}
	public void setTipoMascota(String tipoMascota) {
		this.tipoMascota = tipoMascota;
	}
	public String getNombreMascota() {
		return nombreMascota;
	}
	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
	}
	@Override
	public String toString() {
		return "MascotaBean [rutDueno=" + rutDueno + ", edad=" + edad + ", tipoMascota=" + tipoMascota
				+ ", nombreMascota=" + nombreMascota + "]";
	}
	
	
}
