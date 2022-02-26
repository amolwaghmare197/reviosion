package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logOutCont")
public class logoutcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public logoutcontroller() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		HttpSession ses1 = req.getSession(false);
		ses1.invalidate();
		RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
		rd.forward(req, res);
	}

}
