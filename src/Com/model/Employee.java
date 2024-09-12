package Com.model;

public class Employee {
	private int eid;
	private String Name;
	private String Post;
	private String CompanyName;
	private String Department;
	private int salary;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPost() {
		return Post;
	}
	public void setPost(String post) {
		Post = post;
	}
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", Name=" + Name + ", Post=" + Post + ", CompanyName=" + CompanyName
				+ ", Department=" + Department + ", salary=" + salary + "]";
	}
	
	
	

}
