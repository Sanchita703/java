package Com.service;

import java.util.List;

import Com.model.Student;



public interface StudentService {
	void addStudent(Student st);
	void deleteStudent(int index);
	
	List<Student> getAllStudent();
		

}
