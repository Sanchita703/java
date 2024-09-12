package Com.view;

import java.util.List;
import java.util.Scanner;

import Com.model.Product;
import Com.service.ProductService;
import Com.service.ProductServiceImpl;


public class Test {
	public static void main(String[] args) {
		//addbtn();
		updatebtn();
		//deletebtn();
		//getAll();
		
		
	}
	//add product
	 static void addbtn() {
		 ProductService service=new ProductServiceImpl();
		 char flag='y';
		 Scanner s=new Scanner(System.in);
		 do {
		Product pd= new Product();
		
//		System.out.println("Enter id");
//		pd.setId(s.nextInt());
		
		System.out.println("Enter Product Name");
		pd.setName(s.next());
		
		System.out.println("Enter Company Name");
		pd.setCompany(s.next());
		
		System.out.println("Enter Price of Product");
		pd.setPrice(s.nextInt());
		
		service.addProduct(pd);
		System.out.println("Do you want to add more[yes/no]?");
		flag=s.next().charAt(0);
		 }
		 while(flag=='y');
	
		
	}
	 
	 //get all product
	 static void getAll() {
		 ProductService service=new ProductServiceImpl();
		List<Product> plist= service.getAllProducts();
		System.out.println(plist);
		
	 }
	 static void updatebtn() {
		 ProductService service=new ProductServiceImpl();
		 Scanner sc=new Scanner(System.in);
		   Product p = service.getProductById(5);
		   
		   
		   System.out.println("Update product name");
		   p.setName(sc.next());
		   System.out.println("Update company name");
		   p.setCompany(sc.next());
		   System.out.println("Update Price");
		   p.setPrice(sc.nextInt());
		   System.out.println("Updated sucessfully");
		 
		service.updateProduct(p);
		
	 }
	 //delete product
	static void deletebtn() {
		ProductService service=new ProductServiceImpl();
		service.deleteProduct(0);
		//show product after delete
		//getAll();
		
		
	}

}
