package modelLayer;

import java.sql.ResultSet;

public interface DAO {
	public void conDB();
	public boolean verifyLogin(String email, String password);
	public void saverege(int id, String fname, String lname, String Address, int no);
	public ResultSet getAllReg();
	void deleteByEmail(String Email);
}
