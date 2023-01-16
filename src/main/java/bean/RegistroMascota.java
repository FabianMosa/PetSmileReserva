package bean;

import java.util.ArrayList;

public class RegistroMascota {
	private ArrayList<MascotaBean> lstMascota;
	
public RegistroMascota() {
		
		lstMascota = new ArrayList<MascotaBean>();
	}
	
	public void agregarMascotaBean(MascotaBean mascota) {
		lstMascota.add(mascota);
	}

	public ArrayList<MascotaBean> getLstMascota() {
		return lstMascota;
	}

}
