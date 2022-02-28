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

import com.mysql.jdbc.Driver;

@WebServlet("/reg")
public class revision extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static String url = "jdbc:mysql://localhost:3306/amol";
	static String user = "root";
	static String pass = "Amol@9331";
    public revision() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String att1 = req.getParameter("id");
		String att2 = req.getParameter("name");
		String att3 = req.getParameter("course");
		String att4 = req.getParameter("fee");
		//
		System.out.println(att1);
		PrintWriter wr1 = res.getWriter();
		wr1.println(att1);
		
		System.out.println(att2);
		PrintWriter wr2 = res.getWriter();
		wr2.println(att2);
		
		System.out.println(att3);
		PrintWriter wr3 = res.getWriter();
		wr3.println(att3);
		
		System.out.println(att4);
		PrintWriter wr4 = res.getWriter();
		wr4.println(att4);
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url ,user, pass);
			Statement st = con.createStatement();
			 st.executeUpdate("insert into student values('"+att1+"' ,'"+att2+"' , '"+att3+"' , '"+att4+"')");
			 System.out.println("done baby");
			 PrintWriter wr5 = res.getWriter();
				wr5.println("done baby");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("no done baby");
			 PrintWriter wr6 = res.getWriter();
				wr6.println("no done baby");
		}
		
		doGet(req, res);
	}

}
