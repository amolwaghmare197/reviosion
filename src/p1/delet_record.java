package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/delet_record")
public class delet_record extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static String url = "jdbc:mysql://localhost:3306/amol";
	static String user = "root";
	static String pass = "Amol@9331";
	//============================================
    public delet_record() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int no =Integer.parseInt(req.getParameter("no"));
		System.out.println(no);
		//=---------------------------------
		
	
		try {

			// -----------------
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement st = con.createStatement();
			st.executeUpdate("DELETE FROM BASEDATA WHERE NO='"+no+"'");
			PrintWriter out = res.getWriter();
			out.print("done babby");
			System.out.println("done baby");
			con.close();
			st.close();
			 
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
