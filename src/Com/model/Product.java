package Com.model;

public class Product {
	private int id;
	private String Name;
	private String Company;
	private int price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", Name=" + Name + ", Company=" + Company + ", price=" + price + "]";
	}
	
	
	
	
	

}
