package login.database;

import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import login.bean.Loginbean;

public class LoginDao {
	
	private String dbUrl = "jdbc:mysql://localhost:3306/gnote";
	private String dbUname = "root";
	private String dbPassword = "";
	private String dbDriver = "com.mysql.jdbc.Driver";
	
	public void loadDriver(String dbDriver)
	{
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Connection getConnection()
	{
		Connection con = null;
		try {
			con = DriverManager.getConnection(dbUrl, dbUname, dbPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	public boolean validate(Loginbean loginbean) {
		boolean status = false;		
		loadDriver(dbDriver);
		Connection con = getConnection();
		
       String sql = "select username,password from users where username = ? and password =?";
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, loginbean.getUsername());
			ps.setString(2, loginbean.getPassword());
			ResultSet rs = ps.executeQuery();
			status = rs.next();
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return status;
		
	}
	
	public String insert(Loginbean loginbean)
	{
		loadDriver(dbDriver);
		Connection con = getConnection();
		String result = "Data entered successfully";
		String sql = "insert into users(username,password,email,phone) values(?,?,?,?)";
		
		PreparedStatement ps;

		try {
		ps = con.prepareStatement(sql);
		ps.setString(1, loginbean.getUsername());
		ps.setString(2, loginbean.getPassword());
		ps.setString(3, loginbean.getEmail());
		ps.setString(4, loginbean.getPhone());
		ps.executeUpdate();
		} catch (SQLException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return result;
	}
	
	
	public String listetudiant(Loginbean loginbean) {
	
		loadDriver(dbDriver);
		Connection con = getConnection();
		String result = "Data entered successfully";
       String sql = "select * from etudiant";
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
		    ps.executeQuery();
		    while(((ResultSet) ps).next()) {
		    	
		    	ps.setString(1, loginbean.getId());
				ps.setString(2, loginbean.getnom());
				ps.setString(3, loginbean.getDate_ins());
				ps.setString(4, loginbean.getSex());
		
		    }
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return result;
		
	}
	
	
	public String insertetudiant(Loginbean loginbean)
	{
		loadDriver(dbDriver);
		Connection con = getConnection();
		String result = "Data entered successfully";
		String sql = "insert into etudiant(id,nom,date_ins,sex) values(?,?,?,?)";
		
		PreparedStatement ps;

		try {
		ps = con.prepareStatement(sql);
		ps.setString(1, loginbean.getId());
		ps.setString(2, loginbean.getnom());
		ps.setString(3, loginbean.getDate_ins());
		ps.setString(4, loginbean.getSex());
		ps.executeUpdate();
		} catch (SQLException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return result;
	}

}
