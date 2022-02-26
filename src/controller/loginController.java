package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelLayer.DAOImp;

@WebServlet("/loginController")
public class loginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public loginController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = res.getWriter();
		System.out.println("you can start here");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		//------------------------------
		DAOImp d1 = new DAOImp();
		d1.conDB();
		boolean s3 = d1.verifyLogin(email, password);
		if(s3==true) {
			System.out.println("welcome dear");
			out.print("welcome dear");
			HttpSession ses = req.getSession(true);
			ses.setAttribute("email", email);
			RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/views/NewRegistration.jsp");
			rd.forward(req, res);
		}
		else {
			System.out.println("invalid credential");
			req.setAttribute("msg", "invalid credential");
			RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
			rd.include(req, res);
		}
	}

}
