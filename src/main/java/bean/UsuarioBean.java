package bean;

public class UsuarioBean {	
	
	private String nombreUsuario;
	private String password;
	
	
	public UsuarioBean( String nombreUsuario, String password) {
		super();		
		this.nombreUsuario = nombreUsuario;
		this.password = password;
	}
	
	public UsuarioBean() {
		// TODO Auto-generated constructor stub
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}


	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "UsuarioBean [ nombreUsuario=" + nombreUsuario + ", password=" + password + "]";
	}
	
	
}
