package controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelLayer.DAO;
import modelLayer.DAOImp;

@WebServlet("/deleteCont")
public class deleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public deleteController() {
		super();
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String Email = req.getParameter("email");
		System.out.println(Email);
		DAO d1 = new DAOImp();
		d1.conDB();
		d1.deleteByEmail(Email);
		ResultSet rs = d1.getAllReg();
		req.setAttribute("result", rs);
		RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/views/SearchResult.jsp");
		rd.forward(req, res);
		System.out.println("finished");
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

	}

}
