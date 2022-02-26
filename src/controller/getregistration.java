package controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelLayer.DAO;
import modelLayer.DAOImp;

@WebServlet("/getreg")
public class getregistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public getregistration() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		HttpSession ses2 = req.getSession(false);
		if (ses2.getAttribute("email") != null) {
		DAO d1 = new DAOImp();
		d1.conDB();
		ResultSet rs = d1.getAllReg();
		req.setAttribute("result", rs);
		RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/views/SearchResult.jsp");
		rd.forward(req, res);
		}
		else {
			RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
			rd.forward(req, res);
		}
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	}

}
