package fa.training.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name = "Employee")
public class Employee implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee_id")
	private int empId;
	
	@Column(name = "first_name")
	private String fName;
	
	@Column(name = "last_name")
	private String lName;
	
	@Column(name = "gender")
	private int gender;
	
	@Column(name = "date_of_birth")
	private LocalDate dob;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "department_name")
	private String deptName;
	
	@Column(name = "remark")
	private String remark;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}


	public Employee(int empId, String fName, String lName, int gender, LocalDate dob, String phone, String address,
			String deptName, String remark) {
		super();
		this.empId = empId;
		this.fName = fName;
		this.lName = lName;
		this.gender = gender;
		this.dob = dob;
		this.phone = phone;
		this.address = address;
		this.deptName = deptName;
		this.remark = remark;
	}

	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getfName() {
		return fName;
	}


	public void setfName(String fName) {
		this.fName = fName;
	}


	public String getlName() {
		return lName;
	}


	public void setlName(String lName) {
		this.lName = lName;
	}


	public int getGender() {
		return gender;
	}


	public void setGender(int gender) {
		this.gender = gender;
	}


	public LocalDate getDob() {
		return dob;
	}


	public void setDob(LocalDate dob) {
		this.dob = dob;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getDeptName() {
		return deptName;
	}


	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}


	public String getRemark() {
		return remark;
	}


	public void setRemark(String remark) {
		this.remark = remark;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", fName=" + fName + ", lName=" + lName + ", gender=" + gender + ", dob="
				+ dob + ", phone=" + phone + ", address=" + address + ", deptName=" + deptName + ", remark=" + remark
				+ "]";
	}
	
}
