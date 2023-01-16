package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import bean.UsuarioBean;
import database.LoginDao;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombreUsuario = request.getParameter("nombreUsuario");
		String password = request.getParameter("password");
		
		UsuarioBean UsuarioBean = new UsuarioBean();
		UsuarioBean.setNombreUsuario(nombreUsuario);
		UsuarioBean.setPassword(password);
		
		
		LoginDao loginDao = new LoginDao();
		if(loginDao.validate(UsuarioBean)) {
			response.sendRedirect("registro.jsp");
		}else {
			response.sendRedirect("login.jsp");
		}
	}

}
