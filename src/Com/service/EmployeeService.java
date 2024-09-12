package Com.service;

import java.util.List;

import Com.model.Employee;

public interface EmployeeService {
	void addEmployee(Employee Em);
	void deleteEmployee(int index);
	void updateEmployeeInfo(Employee Em);
	
	List<Employee> getAllEmployee();

}
