package modelLayer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class DAOImp implements DAO {
	public Connection con;
	public Statement stmt;
	static String url = "jdbc:mysql://localhost:3306/amol";
	static String user = "root";
	static String pass = "Amol@9331";
	@Override
	public void conDB() {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, pass);
			stmt = con.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public boolean verifyLogin(String email, String password) {
		// TODO Auto-generated method stub
		try {
			ResultSet rs = stmt
					.executeQuery("select * from login where email='" + email + "' AND password='" + password + "'");
			return rs.next();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}
	@Override
	public void saverege(int id, String fname, String lname, String Address, int no) {
		try {
			stmt.executeUpdate("insert into basedata values('" + id + "','" + fname + "','" + lname + "','" + Address
					+ "','" + no + "')");
			System.out.println("Done baby");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	@Override
	public ResultSet getAllReg() {
		try {
			ResultSet rs = stmt.executeQuery("select * from login");
			return rs;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public void deleteByEmail(String Email) {
		try {
			stmt.executeUpdate("delete from login where email='"+Email+"'");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
