package Com.view;

import java.util.List;
import java.util.Scanner;

import Com.model.Employee;
import Com.service.EmployeeService;
import Com.service.EmployeeServiceImpl;


public class Test1 {
	public static void main(String[] args) {
		addbtn();
		getAll();
		deletebtn();
		
		
	}
	//add product
	 static void addbtn() {
		 EmployeeService service=new EmployeeServiceImpl();
		 char flag='y';
		 Scanner s=new Scanner(System.in);
		 do {
		Employee e= new Employee();
		
//		System.out.println("Enter id");
//		e.setEid(s.nextInt());
		
		System.out.println("Enter Employee Name");
		e.setName(s.nextLine());
		
		System.out.println("Enter Company Name");
		e.setCompanyName(s.nextLine());
		
		System.out.println("Enter Post");
		e.setPost(s.nextLine());
		
		System.out.println("Enter Department");
		e.setDepartment(s.next());
		
		System.out.println("Enter Salary");
		e.setSalary(s.nextInt());
		
		service.addEmployee(e);
		System.out.println("Do you want to add more[yes/no]?");
		flag=s.next().charAt(0);
		 }
		 while(flag=='y');
	
		
	}
	 //get all product
	 static void getAll() {
		 EmployeeService service=new EmployeeServiceImpl();
		List<Employee> elist= service.getAllEmployee();
		System.out.println(elist);
		
	 }
	 //delete product
	static void deletebtn() {
		 EmployeeService service=new EmployeeServiceImpl();
		service.deleteEmployee(0);
		//show product after delete
		getAll();
		
		
	}

}
