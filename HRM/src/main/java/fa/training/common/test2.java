package fa.training.common;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.apache.taglibs.standard.lang.jstl.Literal;
import org.hibernate.Session;

import fa.training.entities.Account;
import fa.training.entities.Employee;

public class test2 {
	public static void main(String[] args) {
		boolean a = addAccount("thanh123", "thanh123@gmail.com", "thanh123", 1,
				"thanh", "nguyen", "0987654321", "2000-07-04", 1, "Ha Noi", "AI", "10");
		System.out.println(a);
	}
	
	public static boolean addAccount(String account, String email, String password, int status, String fname, String lname,
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
			a.setStatus(status);
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
