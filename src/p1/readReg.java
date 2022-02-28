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

import com.mysql.jdbc.Driver;

@WebServlet("/read")
public class readReg extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static String url = "jdbc:mysql://localhost:3306/amol";
	static String user = "root";
	static String pass = "Amol@9331";
    public readReg() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url ,user, pass);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from student");
			 PrintWriter wr5 = res.getWriter();
			while(rs.next()) {
				String s1 = rs.getString(1);
				System.out.println(s1);
				wr5.print(s1);
				wr5.print("\n");
				String s2 = rs.getString(2);
				System.out.println(s2);
				wr5.print(s2);
				wr5.print("\n");
				String s3 = rs.getString(3);
				System.out.println(s3);
				wr5.print(s3);
				wr5.print("\n");
				String s4 = rs.getString(4);
				System.out.println(s4);
				wr5.print(s4);
				wr5.print("\n");
			}
			System.out.println("done baby");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("no done baby");
			 PrintWriter wr6 = res.getWriter();
				wr6.println("no done baby");
		}
		
		
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		
		doGet(req, res);
	}

}
