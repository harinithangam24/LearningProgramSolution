package Week1;

import java.util.*;
import java.util.Map;

class Product
{
	int productId;
	String productName;
	int quantity;
	int price;
	
	public Product(int id,String name,int q,int p)
	{
		this.price = p;
		this.productId = id;
		this.quantity = q;
		this.productName = name;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
}

class Inventory
{
	Map<Integer, Product> inventory;
	
	public Inventory() {
        inventory = new HashMap<>();
    }
	public void add(Product p)
	{
		inventory.put(p.getProductId(), p);
		System.out.println("Successfully added");
	}
	public void update(Product p,int new_q,int new_p)
	{
		 p.setPrice(new_p);
		 p.setQuantity(new_q);
		 System.out.println("Successfully updated");
	}
	public void delete(Product p)
	{
		int pid=p.getProductId();
		if (inventory.containsKey(pid)){
			inventory.remove(pid);
			System.out.println("Successfully deleted");
		}
	}
}
public class Inventory_Management_system {
	public static void main(String[] args) {
        Inventory i = new Inventory();
        
        Product p1 = new Product(1, "Product 1", 150, 4);
        i.add(p1);
        Product p2 = new Product(2, "Product 2", 900, 7);
        i.add(p2);
        
        i.update(p2, 900 ,10);
        
        i.delete(p2);
	}
}