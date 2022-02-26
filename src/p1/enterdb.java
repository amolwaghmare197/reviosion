package p1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import com.mysql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/data")
public class enterdb extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static String url = "jdbc:mysql://localhost:3306/amol";
	static String user = "root";
	static String pass = "Amol@9331";
    public enterdb() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("hi");
		int id =Integer.parseInt(req.getParameter("id"));
		System.out.println(id);
		String fname =req.getParameter("fname");
		System.out.println(fname);
		String lname =req.getParameter("lname");
		System.out.println(lname);
		String Address =req.getParameter("Address");
		System.out.println(Address);
		int no =Integer.parseInt(req.getParameter("no"));
		System.out.println(no);
		//=---------------------------------
		
	
		try {

			// -----------------
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement st = con.createStatement();
			st.executeUpdate("insert into basedata values('" + id + "','" + fname + "','" + lname + "','" + Address
					+ "','" + no + "')");
			System.out.println("done baby");
			con.close();
			st.close();
			 
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
