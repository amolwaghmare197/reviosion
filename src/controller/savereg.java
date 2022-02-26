package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelLayer.DAOImp;

@WebServlet("/savereg")
public class savereg extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public savereg() {
		super();
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/views/NewRegistration.jsp");
		rd.forward(req, res);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		HttpSession ses2 = req.getSession(false);
		if (ses2.getAttribute("email") != null) {
			int id = Integer.parseInt(req.getParameter("PersonId"));
			System.out.println(id);
			String fname = req.getParameter("fname");
			System.out.println(fname);
			String lname = req.getParameter("lname");
			System.out.println(lname);
			String Address = req.getParameter("Address");
			System.out.println(Address);
			int no = Integer.parseInt(req.getParameter("no"));
			System.out.println(no);

			DAOImp d1 = new DAOImp();
			d1.conDB();
			d1.saverege(id, fname, lname, Address, no);
			req.setAttribute("msg", "you successfully implemented the process");
			RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/views/NewRegistration.jsp");
			rd.include(req, res);
		} else {
			RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
			rd.forward(req, res);
		}
	}
}
