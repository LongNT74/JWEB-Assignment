package fa.training.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.dialect.function.VarArgsSQLFunction;

import fa.training.dao.EmployeeDAO;
import fa.training.dao.impl.EmployeeDAOimpl;

@WebServlet(name = "AddEmployeeController", value = "/add")
public class AddEmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			req.getRequestDispatcher("/WEB-INF/Source/HomePage.jsp").forward(req, resp);
		}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String phone = req.getParameter("phone");
		String date = req.getParameter("date");
		int gender = Integer.parseInt(req.getParameter("gender"));
		String account = req.getParameter("account");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String address = req.getParameter("address");
		String status = req.getParameter("status");
		String dept = req.getParameter("dept");
		String remark = req.getParameter("remark");
		
		if (status == null) {
			status = "0";
		}
		EmployeeDAO empDAO = new EmployeeDAOimpl();
		boolean a = empDAO.addAccount(account, email, password, status, fname, lname, phone, date, gender, address, dept, remark);
		if (a = true) {
			req.setAttribute("alert", "Add success !!!");
			req.getRequestDispatcher("/WEB-INF/Source/HomePage.jsp").forward(req, resp);
		}
		
		
	}
}
