package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/excel")
public class excel_web extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static String url = "jdbc:mysql://localhost:3306/amol";
	static String user = "root";
	static String pass = "Amol@9331";

	public excel_web() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {

			// -----------------
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from basedata");
			PrintWriter out = res.getWriter();
			out.println("<table border='1'>");
			out.println("<tr>");
			out.println("<th>");
			out.println("personId");
			out.println("</th>");
			out.println("<th>");
			out.println("fname");
			out.println("</th>");
			out.println("<th>");
			out.println("lname");
			out.println("</th>");
			out.println("<th>");
			out.println("Address");
			out.println("</th>");
			out.println("<th>");
			out.println("no");
			out.println("</th>");
			out.println("</tr>");
			while (rs.next()) {
				out.println("<tr>");
				out.println("<td>");
				out.println(rs.getString(1));
				out.println("</td>");
				out.println("<td>");
				out.println(rs.getString(2));
				out.println("</td>");
				out.println("<td>");
				out.println(rs.getString(3));
				out.println("</td>");
				out.println("<td>");
				out.println(rs.getString(4));
				out.println("</td>");
				out.println("<td>");
				out.println(rs.getString(5));
				out.println("</td>");
				out.println("</tr>");
			}
			out.print("</table>");

			System.out.println("done baby");
			out.println("done baby");
			con.close();
			st.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
