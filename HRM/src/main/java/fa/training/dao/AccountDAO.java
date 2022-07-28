package fa.training.dao;


import fa.training.entities.Account;

public interface AccountDAO {
	Account getAccounts(String user, String pass);
	
}
