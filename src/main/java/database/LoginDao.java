package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.UsuarioBean;

public class LoginDao {

	private String dbUrl = "jdbc:mysql://localhost:3306/clinica";
	private String dbName = "root";
	private String dbPassword = "";
	private String dbDriver = "com.mysql.jdbc.Driver";
	
	public void loadDriver(String dbDriver) {
		try {
			Class.forName(dbDriver);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(dbUrl,dbName,dbPassword);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return con;
	}
	
	public boolean validate(UsuarioBean UsuarioBean) {
		loadDriver(dbDriver);
		Connection con = getConnection();
		boolean status = false;
		
		String sql = "select * from usuario where nombreUsuario = ? and password = ?";
		
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, UsuarioBean.getNombreUsuario());
			ps.setString(2, UsuarioBean.getPassword());
			
			ResultSet rs = ps.executeQuery();
			status = rs.next();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
			
		return status;
	}
}

