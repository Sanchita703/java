package Com.service;

import java.util.ArrayList;
import java.util.List;


import Com.model.Student;


public class StudentServiceimpl implements StudentService {
	static List<Student> slist=new ArrayList<>();

	public void addStudent(Student st) {
		slist.add(st);
		System.out.println("----------added success-----------size="+slist.size());
		
		 
		
	}

	@Override
	public void deleteStudent(int index) {
		slist.remove(index);
	
		
	}

	@Override
	public List<Student> getAllStudent() {
		
		return slist;
	}

}
