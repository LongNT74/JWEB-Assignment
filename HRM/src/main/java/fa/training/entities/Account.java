package fa.training.entities;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name = "Account")
public class Account implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "account_id")
	private int accId;
	
	@Column(name = "account")
	private String account;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String pass;
	
	@Column(name = "status")
	private int status;
	
	@OneToOne
	@JoinColumn(name = "employee_id")
	private Employee employee_id;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(int accId, String account, String email, String pass, int status, Employee employee_id) {
		super();
		this.accId = accId;
		this.account = account;
		this.email = email;
		this.pass = pass;
		this.status = status;
		this.employee_id = employee_id;
	}

	public int getAccId() {
		return accId;
	}

	public void setAccId(int accId) {
		this.accId = accId;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Employee getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(Employee employee_id) {
		this.employee_id = employee_id;
	}

	@Override
	public String toString() {
		return "Account [accId=" + accId + ", account=" + account + ", email=" + email + ", pass=" + pass + ", status="
				+ status + ", employee_id=" + employee_id + "]";
	}

	
	
	
	
	
}
