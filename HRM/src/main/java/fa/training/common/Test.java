package fa.training.common;


import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

import fa.training.entities.Account;

public class Test {
	public static void main(String[] args) {
		Session session = HibernateUtils.getFactory().openSession();
		
		//List
		Query a = session.createQuery("FROM Account");
		List<Account> list = a.getResultList();
		for (Account account : list) {
			System.out.println(account.getAccount());
		}
		
		//Add
//		Account account = new Account();
//		account.setAccount("name2");
//		
//		//update
//		account = session.get(Account.class, 4);
//		account.setAccount("update");
//		
//		session.getTransaction().begin();
//		session.save(account);
//		session.getTransaction().commit();
		session.close();
	}
}
