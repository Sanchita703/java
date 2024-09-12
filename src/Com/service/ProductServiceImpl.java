package Com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Com.model.Product;

public class ProductServiceImpl implements ProductService {
	static List<Product> plist=new ArrayList<>();

	@Override
	public void addProduct(Product prod) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","user@123");
			String sql="Insert into Product (Name,Company,Price)values('"+prod.getName()+"','"+prod.getCompany()+"','"+prod.getPrice()+"')";
			Statement stm=con.createStatement();
			stm.execute(sql);
			con.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
//		plist.add(prod);
//		System.out.println("----------added success-----------size="+plist.size());
//		
//		
//	
	}

	@Override
	public void deleteProduct(int index) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","user@123");
			String sql="Delete from Product where id=1";
			Statement stm=con.createStatement();
			stm.execute(sql);
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	

	@Override
	public List<Product> getAllProducts() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","user@123");
			String sql="Select * from Product";
			Statement stm=con.createStatement();
			ResultSet rs=stm.executeQuery(sql);
			while(rs.next()) {
				System.out.println("Id="+rs.getInt("id"));
				System.out.println("Product Name="+rs.getString("Name"));
				System.out.println("Company name="+rs.getString("Company"));
				System.out.println("Price="+rs.getInt("Price"));
			}
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return plist;
	}

	@Override
	public void updateProduct(Product prod) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","user@123");
			String sql="Update  Product set name = '"+prod.getName()+"', company = '"+prod.getCompany()+"', price='"+prod.getPrice()+"'  where id= '"+prod.getId()+"' ";
			Statement stm=con.createStatement();
			stm.execute(sql);
			con.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public Product getProductById(int id) {
		Product p = new Product();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","user@123");
			String sql="Select * from product where id='"+id+"'";
			Statement stm=con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			if(rs.next()) {
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("Name"));
				p.setCompany(rs.getNString("Company"));
				p.setPrice(rs.getInt("Price"));
				
			}
			con.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}
	

}
