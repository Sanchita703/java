package Com.view;

import java.util.List;
import java.util.Scanner;

import Com.model.Student;
import Com.service.StudentService;
import Com.service.StudentServiceimpl;

public class Test2 {
	public static void main(String[] args) {
		addbtn();
		getAll();
		deletebtn();
		
		
	}
	//add product
	 static void addbtn() {
		 StudentService service=new StudentServiceimpl();
		 char flag='y';
		 Scanner s=new Scanner(System.in);
		 do {
		Student s1= new Student();
		
		System.out.println("Enter id");
		s1.setSid(s.nextInt());
		
		System.out.println("Enter collage Name");
		s1.setCollageName(s.next());
		
		System.out.println("Enter Faculty");
		s1.setFaculty(s.next());
		
		System.out.println("Enter Course");
		s1.setCourse(s.next());
		
		
		
		System.out.println("Enter Fee");
		s1.setFee(s.nextInt());
		
		service.addStudent(s1);
		System.out.println("Do you want to add more[yes/no]?");
		flag=s.next().charAt(0);
		 }
		 while(flag=='y');
	
		
	}
	 //get all product
	 static void getAll() {
		 StudentService service=new StudentServiceimpl();
		List<Student> slist= service.getAllStudent();
		System.out.println(slist);
		
	 }
	 //delete product
	static void deletebtn() {
		 StudentService service=new StudentServiceimpl();
		service.deleteStudent(0);
		//show product after delete
		getAll();
		
		
	}

}
