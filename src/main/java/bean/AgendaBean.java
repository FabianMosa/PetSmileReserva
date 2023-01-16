package bean;

import java.util.Date;
import java.util.Timer;

public class AgendaBean {
	private int idMascota, rutDueno;
	private String nombreMascota;
	private Date fecha;
	private Timer hora;
	
	public AgendaBean() {		
	}
	
	public AgendaBean(int idMascota, int rutDueno, String nombreMascota, Date fecha, Timer hora) {
		super();
		this.idMascota = idMascota;
		this.rutDueno = rutDueno;
		this.nombreMascota = nombreMascota;
		this.fecha = fecha;
		this.hora = hora;
	}
	public int getIdMascota() {
		return idMascota;
	}
	public void setIdMascota(int idMascota) {
		this.idMascota = idMascota;
	}
	public int getRutDueno() {
		return rutDueno;
	}
	public void setRutDueno(int rutDueno) {
		this.rutDueno = rutDueno;
	}
	public String getNombreMascota() {
		return nombreMascota;
	}
	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Timer getHora() {
		return hora;
	}
	public void setHora(Timer hora) {
		this.hora = hora;
	}
	@Override
	public String toString() {
		return "AgendaBean [idMascota=" + idMascota + ", rutDueno=" + rutDueno + ", nombreMascota=" + nombreMascota
				+ ", fecha=" + fecha + ", hora=" + hora + "]";
	}
	
	
}
