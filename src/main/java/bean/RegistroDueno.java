package bean;

import java.util.ArrayList;

public class RegistroDueno {
	private ArrayList<DuenoBean> lstDueno;

	public RegistroDueno() {
		
		lstDueno = new ArrayList<DuenoBean>();
	}
	
	public void agregarDuenoBean(DuenoBean dueno) {
		lstDueno.add(dueno);
	}

	public ArrayList<DuenoBean> getLstDueno() {
		return lstDueno;
	}

	
	
	
	
}
