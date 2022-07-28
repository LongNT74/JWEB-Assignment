package fa.training.dao.impl;

import java.util.List;

import javax.persistence.Query;
import java.time.LocalDate;
import org.hibernate.Session;

import fa.training.common.HibernateUtils;
import fa.training.dao.EmployeeDAO;
import fa.training.entities.Account;
import fa.training.entities.Employee;

public class EmployeeDAOimpl implements EmployeeDAO{

	@Override
	public List<Employee> listEmployee() {
		Session session = HibernateUtils.getFactory().openSession();
		Query q = session.createQuery("FROM Employee ");
		List<Employee> list = q.getResultList();
		session.close();
		return list;
	}

	@Override
	public List<Employee> searchEmployee(String search, String filter) {
		if (filter.equals("")) {
			return null;
		}
		Session session = HibernateUtils.getFactory().openSession();
		Query q = session.createQuery("FROM Employee WHERE "+filter+" = :search");
		q.setParameter("search", search);
		List<Employee> list = q.getResultList();
		session.close();
		return list;
	}

	

	

	@Override
	public boolean addAccount(String account, String email, String password, String status, String fname, String lname,
			String phone, String date, int gender, String address, String dept, String remark) {
		
		try {
			Session session = HibernateUtils.getFactory().openSession();
			//add employee
			Employee e = new Employee();
			e.setfName(fname);
			e.setlName(lname);
			e.setDob(LocalDate.parse(date));
			e.setPhone(phone);
			e.setGender(gender);
			e.setAddress(address);
			e.setDeptName(dept);
			e.setRemark(remark);
			
			session.getTransaction().begin();
			session.save(e);
			session.getTransaction().commit();
			
			//add account
			Account a = new Account();
			a.setAccount(account);
			a.setEmail(email);
			a.setPass(password);
			a.setStatus(Integer.parseInt(status));
			a.setEmployee_id(e);
			
			session.getTransaction().begin();
			session.save(a);
			session.getTransaction().commit();
			
			session.close();
			return true;
		} catch (Exception e2) {
			return false;
		}
	}
	
}
