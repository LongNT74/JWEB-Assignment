package fa.training.dao.impl;



import javax.persistence.Query;


import org.hibernate.Session;

import fa.training.common.HibernateUtils;
import fa.training.dao.AccountDAO;
import fa.training.entities.Account;

public class AccountDAOimpl implements AccountDAO {

	@Override
	public Account getAccounts(String user, String pass) {
		Session session = HibernateUtils.getFactory().openSession();
		Query q = session.createQuery("FROM Account "
				+ "WHERE account = :acc and pass = :pass");
		q.setParameter("acc",user);
		q.setParameter("pass",pass);
		Account account = (Account) q.getSingleResult();
		session.close();
		return account;
	}
	
}
