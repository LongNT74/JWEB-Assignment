package fa.training.dao;

import java.util.List;

import fa.training.entities.Account;
import fa.training.entities.Employee;

public interface EmployeeDAO {
	List<Employee> listEmployee();
	List<Employee> searchEmployee(String search, String filter);
	boolean addAccount(String account, String email, String password, String status,
			String fname, String lname, String phone, String date, int gender, String address, String dept, String remark);
	
	}
