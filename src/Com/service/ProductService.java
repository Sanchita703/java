package Com.service;

import java.util.List;

import Com.model.Product;

public interface ProductService {
	void addProduct(Product prod);
	void deleteProduct(int index);
	void updateProduct(Product prod);
	
	List<Product> getAllProducts();
	
	Product getProductById(int id);
	
		
	

}
