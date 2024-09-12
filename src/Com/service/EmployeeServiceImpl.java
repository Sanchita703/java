package Com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Com.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	static List<Employee> elist=new ArrayList<>();

	@Override
	public void addEmployee(Employee Em) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","user@123");
			String sql="Insert into Employee (Name,Post,Company_Name,Department,Salary)values('"+Em.getName()+"','"+Em.getPost()+"','"+Em.getCompanyName()+"','"+Em.getDepartment()+"','"+Em.getSalary()+"')";
			Statement stm=con.createStatement();
			stm.execute(sql);
			con.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteEmployee(int index) {
		elist.remove(index);
		
		
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return elist;
	}

	@Override
	public void updateEmployeeInfo(Employee Em) {
		// TODO Auto-generated method stub
		
	}

	
	

}
