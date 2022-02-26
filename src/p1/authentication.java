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

@WebServlet("/authent")
public class authentication extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static String url = "jdbc:mysql://localhost:3306/amol";
	static String user = "root";
	static String pass = "Amol@9331";

	public authentication() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = req.getParameter("id");
		String no = req.getParameter("no");
		System.out.println(id);
		System.out.println(no);
		PrintWriter out = res.getWriter();
		// ==============================
		try {

			// -----------------
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from basedata where PersonID='" + id + "' AND no='" + no + "'");

			if (rs.next()) {
				out.print("welcome my lord");
				out.print("<table border = '1'>");
				out.print("<tr>");
				//==
				out.print("<th>");
				out.print("id");
				out.print("</th>");
				//==
				//==
				out.print("<th>");
				out.print("fname");
				out.print("</th>");
				//==
				//==
				out.print("<th>");
				out.print("lname");
				out.print("</th>");
				//==
				//==
				out.print("<th>");
				out.print("Address");
				out.print("</th>");
				//==
				//==
				out.print("<th>");
				out.print("no");
				out.print("</th>");
				//==
				out.print("</tr>");
				//====================header decleration ends here
				out.print("<tr>");
				//==
				out.print("<td>");
				out.print(rs.getString(1));
				out.print("</th>");
				//==
				//==
				out.print("<th>");
				out.print(rs.getString(2));
				out.print("</th>");
				//==
				//==
				out.print("<th>");
				out.print(rs.getString(3));
				out.print("</th>");
				//==
				//==
				out.print("<th>");
				out.print(rs.getString(4));
				out.print("</th>");
				//==
				//==
				out.print("<th>");
				out.print(rs.getString(5));
				out.print("</th>");
				//==
				out.print("</tr>");
				//===
				out.print("</table>");
				out.print("you beautifully done it baby");
//				System.out.println("welcome user");
//				String id1 = rs.getString(1);
//				System.out.println(id1);
//				String fname = rs.getString(2);
//				System.out.println(fname);
//				String lname = rs.getString(3);
//				System.out.println(lname);
//				String Address = rs.getString(4);
//				System.out.println(Address);
//				String no1 = rs.getString(5);
//				System.out.println(no1);
			} else {
				out.print("invalid credential");
				System.out.println("invalid credential");
			}
			System.out.println("done baby");
			con.close();
			st.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
