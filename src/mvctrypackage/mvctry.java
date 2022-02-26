package mvctrypackage;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mvctry")
public class mvctry extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public mvctry() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int s1 =Integer.parseInt(req.getParameter("n1"));
		int s2 =Integer.parseInt(req.getParameter("n2"));
		se s3 = new se();
		int s4=s3.add(s1,s2);
		req.setAttribute("result", s4);
		RequestDispatcher rd = req.getRequestDispatcher("mvcArchtectTry.jsp");
		rd.forward(req, res);
	}

}
