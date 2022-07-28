package fa.training.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fa.training.dao.EmployeeDAO;
import fa.training.dao.impl.EmployeeDAOimpl;
import fa.training.entities.Employee;


@WebServlet(name = "HomeController", value = "/home")
public class HomeController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EmployeeDAO empDAO = new EmployeeDAOimpl();
		List<Employee> list = empDAO.listEmployee();
		req.setAttribute("listEmp", list);
		req.getRequestDispatcher("/WEB-INF/Source/ViewContent.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String search = req.getParameter("search");
		String filter = req.getParameter("filter");
		EmployeeDAO empDAO = new EmployeeDAOimpl();
		List<Employee> list = empDAO.listEmployee();
		List<Employee> listFilter = empDAO.searchEmployee(search, filter);
		if(search.equals("")) {
			req.setAttribute("listEmp", list);
			req.getRequestDispatcher("/WEB-INF/Source/ViewContent.jsp").forward(req, resp);
		} else {
			req.setAttribute("listEmp", listFilter);
			req.getRequestDispatcher("/WEB-INF/Source/ViewContent.jsp").forward(req, resp);
		}
	}
}
