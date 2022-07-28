package fa.training.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fa.training.dao.AccountDAO;
import fa.training.dao.impl.AccountDAOimpl;
import fa.training.entities.Account;

@WebServlet(name = "loginController", value = "/login")
public class LoginController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/Source/Login.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uName = req.getParameter("username");
		String pass = req.getParameter("pass");
		String mess = "";
		try {
			AccountDAO accDAO = new AccountDAOimpl();
			accDAO.getAccounts(uName, pass);
			req.getSession().setAttribute("loginUser", uName);
			resp.sendRedirect(req.getContextPath()+"/home");
		} catch (Exception e) {
			mess = "Invalid user or password";
			req.setAttribute("message", mess);
			req.getRequestDispatcher("/WEB-INF/Source/Login.jsp").forward(req, resp);
		}
	}
}
