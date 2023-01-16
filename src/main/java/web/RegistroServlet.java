package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.DuenoBean;
import bean.MascotaBean;

/**
 * Servlet implementation class registroServlet
 */
@WebServlet("/registroServlet")
public class RegistroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistroServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int rutDueno = Integer.parseInt(request.getParameter("intRut"));
		String nombreDueno = request.getParameter("txtNombre");
		String apellidoDueno = request.getParameter("txtApellido");
		String direccionDueno = request.getParameter("txtDireccion");
		String correoDueno = request.getParameter("txtCorreo");
		int telefonoDueno = Integer.parseInt(request.getParameter("intTelefono"));
		String nombreMascota = request.getParameter("txtNombreMascota");
		String tipoMascota = request.getParameter("txtTipoMascota");
		int edadMascota = Integer.parseInt(request.getParameter("intEdad"));
		
		
		DuenoBean duenoBean = new DuenoBean();
		duenoBean.setRut(rutDueno);
		duenoBean.setNombre(nombreDueno);
		duenoBean.setApellido(apellidoDueno);
		duenoBean.setDireccion(direccionDueno);
		duenoBean.setTelefono(telefonoDueno);
		duenoBean.setCorreo(correoDueno);
		duenoBean.setNombreMascota(nombreMascota);
		
		MascotaBean mascotaBean = new MascotaBean();
		mascotaBean.setNombreMascota(nombreMascota);
		mascotaBean.setRutDueno(rutDueno);
		mascotaBean.setTipoMascota(tipoMascota);
		mascotaBean.setEdad(edadMascota);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
